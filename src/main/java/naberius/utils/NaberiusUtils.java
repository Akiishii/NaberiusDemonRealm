package naberius.utils;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import naberius.api.NaberiusAPI;
import naberius.item.tool.ItemToolAoE;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NaberiusUtils {

	public static void addHellForgeRecipe(String recipeName, ItemStack output, int outputCount, int cookTime, float experience, Object... inputs) {

		NaberiusAPI.addHellForgeRecipe(output, outputCount, cookTime, experience, inputs);

	}
	
	public static <T> List<T> copyList(List<T> list) {
		try {
			Constructor constructor = list.getClass().getConstructor(Collection.class);
			return (List<T>) constructor.newInstance(list);
		} catch (Exception exception) {
			return new ArrayList<>(list);
		}
	}

	public static int log2(int chunkHeight) {
		return chunkHeight == 256 ? 8 : 7;
	}

	public static void primeChunk(ChunkPrimer primer, IBlockState[] state) {
		int i = 0;
		for (int x = 0; x < 16; x++) {
			for (int z = 0; z < 16; z++) {
				for (int y = 0; y < 256; y++) {
					if (i < state.length)
						primer.setBlockState(x, y, z, state[i++]);
				}
			}
		}
	}

	public static String capitaliseFirstLetter(String text) {
		if (text == null || text.length() <= 0)
			return text;
		return text.substring(0, 1).toUpperCase() + text.substring(1);
	}

	public static BlockPos[] getBreakArea(ItemToolAoE hammerItem, BlockPos pos, EnumFacing sideHit,
			EntityPlayer player) {
		if (hammerItem.getShiftRotating() && player.isSneaking()) {
			int tempW = hammerItem.getMineWidth();
			hammerItem.setMineWidth(hammerItem.getMineHeight());
			hammerItem.setMineHeight(tempW);
		}

		int mineWidth = hammerItem.getMineWidth();
		int mineHeight = hammerItem.getMineHeight();

		BlockPos start = pos.offset(sideHit, hammerItem.getMineDepth());
		BlockPos end = pos.offset(sideHit, hammerItem.getMineDepth());

		if (!player.capabilities.isFlying && sideHit != EnumFacing.UP && sideHit != EnumFacing.DOWN && mineHeight > 1) {
			start = start.up(mineHeight - 1);
			end = end.up(mineHeight - 1);
		}

		// Block destroyed, now for AOE
		switch (sideHit) {
		case DOWN:
		case UP:
			EnumFacing facing = EnumFacing.fromAngle(player.getRotationYawHead());
			switch (facing) {
			case WEST:
			case EAST:
				start = start.add(-mineHeight, 0, -mineWidth);
				end = end.add(mineHeight, 0, mineWidth);
				break;
			case NORTH:
			case SOUTH:
			default:
				start = start.add(-mineWidth, 0, -mineHeight);
				end = end.add(mineWidth, 0, mineHeight);
				break;
			}
			break;
		case NORTH:
		case SOUTH:
			// Z axis
			start = start.add(-mineWidth, -mineHeight, 0);
			end = end.add(mineWidth, mineHeight, 0);
			break;
		case WEST:
		case EAST:
			// X axis
			start = start.add(0, -mineHeight, -mineWidth);
			end = end.add(0, mineHeight, mineWidth);
			break;
		}

		if (hammerItem.getShiftRotating() && player.isSneaking()) {
			int tempW = hammerItem.getMineWidth();
			hammerItem.setMineWidth(hammerItem.getMineHeight());
			hammerItem.setMineHeight(tempW);
		}

		return new BlockPos[] { start, end };
	}

	public static void breakArea(ItemStack stack, World world, EntityPlayer player, float blockStrength,
			BlockPos posStart, BlockPos center, BlockPos posEnd) {
		boolean brokeSomething = false;
		for (int xPos = posStart.getX(); xPos <= posEnd.getX(); xPos++)
			for (int yPos = posStart.getY(); yPos <= posEnd.getY(); yPos++)
				for (int zPos = posStart.getZ(); zPos <= posEnd.getZ(); zPos++) {
					BlockPos pos = new BlockPos(xPos, yPos, zPos);
					if (breakBlock(stack, world, player, pos, blockStrength) && !brokeSomething) {
						brokeSomething = true;
						world.playEvent(2001, center, Block.getStateId(Blocks.STONE.getDefaultState()));
					}
				}
	}

	public static void breakArea(ItemStack stack, EntityPlayer player, BlockPos posHit, BlockPos posStart,
			BlockPos posEnd) {
		for (int xPos = posStart.getX(); xPos <= posEnd.getX(); xPos++)
			for (int yPos = posStart.getY(); yPos <= posEnd.getY(); yPos++)
				for (int zPos = posStart.getZ(); zPos <= posEnd.getZ(); zPos++)
					if (!stack.getItem().onBlockStartBreak(stack, new BlockPos(xPos, yPos, zPos), player))
						breakBlock(stack, player.worldObj, player, new BlockPos(xPos, yPos, zPos), posHit);
	}

	public static boolean breakBlock(ItemStack stack, World world, EntityPlayer player, BlockPos blockPos,
			float refBlockStrength) {
		IBlockState blockState = world.getBlockState(blockPos);
		Block block = blockState.getBlock();

		if (!breakBlockChecks(stack, world, blockPos, blockState))
			return false;

		float strength = ForgeHooks.blockStrength(blockState, player, world, blockPos);

		if (!ForgeHooks.canHarvestBlock(block, player, world, blockPos) || refBlockStrength / strength > 10f)
			return false;

		breakBlockAction(stack, world, player, blockPos, block, blockState);
		return true;
	}

	public static void breakBlock(ItemStack stack, World world, EntityPlayer player, BlockPos blockPos,
			BlockPos refBlockPos) {
		IBlockState blockState = world.getBlockState(blockPos);
		Block block = blockState.getBlock();

		if (!breakBlockChecks(stack, world, blockPos, blockState))
			return;

		IBlockState refBlockState = world.getBlockState(refBlockPos);
		float refStrength = ForgeHooks.blockStrength(refBlockState, player, world, refBlockPos);
		float strength = ForgeHooks.blockStrength(blockState, player, world, blockPos);

		if (!ForgeHooks.canHarvestBlock(block, player, world, blockPos) || refStrength / strength > 10f)
			return;

		breakBlockAction(stack, world, player, blockPos, block, blockState);
	}

	private static boolean breakBlockChecks(ItemStack stack, World world, BlockPos blockPos, IBlockState block) {
		if (world.isAirBlock(blockPos))
			return false;

		if (!((ItemToolAoE) stack.getItem()).isEffective(block))
			return false;

		return true;
	}

	private static void breakBlockAction(ItemStack stack, World world, EntityPlayer player, BlockPos blockPos,
			Block block, IBlockState blockState) {

		if (player.capabilities.isCreativeMode) {
			block.onBlockHarvested(world, blockPos, blockState, player);
			if (block.removedByPlayer(blockState, world, blockPos, player, false))
				block.onBlockDestroyedByPlayer(world, blockPos, blockState);

			// send update to client
			if (!world.isRemote)
				((EntityPlayerMP) player).connection.sendPacket(new SPacketBlockChange(world, blockPos));
			return;
		}

		stack.onBlockDestroyed(world, blockState, blockPos, player);

		if (!world.isRemote) {
			int xp = ForgeHooks.onBlockBreakEvent(world, ((EntityPlayerMP) player).interactionManager.getGameType(),
					(EntityPlayerMP) player, blockPos);
			if (xp == -1) {
				return;
			}

			block.onBlockHarvested(world, blockPos, blockState, player);

			if (block.removedByPlayer(blockState, world, blockPos, player, true)) // boolean
																					// is
																					// if
																					// block
																					// can
																					// be
																					// harvested,
																					// checked
																					// above
			{
				block.onBlockDestroyedByPlayer(world, blockPos, blockState);
				block.harvestBlock(world, player, blockPos, blockState, world.getTileEntity(blockPos), stack);
				block.dropXpOnBlockBreak(world, blockPos, xp);
			}

			((EntityPlayerMP) player).connection.sendPacket(new SPacketBlockChange(world, blockPos));
		} else {

			world.playEvent(2001, blockPos, Block.getStateId(blockState));
			if (block.removedByPlayer(blockState, world, blockPos, player, true))
				block.onBlockDestroyedByPlayer(world, blockPos, blockState);
			// callback to the tool
			stack.onBlockDestroyed(world, blockState, blockPos, player);

			if (stack.stackSize == 0 && stack == player.getHeldItemMainhand())
				player.setHeldItem(EnumHand.MAIN_HAND, null);

			// send an update to the server, so we get an update back
			Minecraft.getMinecraft().getConnection()
					.sendPacket(new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, blockPos,
							Minecraft.getMinecraft().objectMouseOver.sideHit));
		}
	}
	

    public static void registerBlockWithItem(Block block) {
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }


    public static void registerFluid(Fluid fluid) {
        FluidRegistry.registerFluid(fluid);
        FluidRegistry.addBucketForFluid(fluid);
    }

}
