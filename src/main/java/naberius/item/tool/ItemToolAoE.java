package naberius.item.tool;

import java.util.Set;

import com.google.common.collect.Sets;

import naberius.NaberiusCore;
import naberius.utils.NaberiusUtils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class ItemToolAoE extends ItemTool {

	private static final Set<Block> PickaxeBlocks = Sets.newHashSet(new Block[] { Blocks.ACTIVATOR_RAIL,
			Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE,
			Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE,
			Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE,
			Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE,
			Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON,
			Blocks.STONE_PRESSURE_PLATE });
	private static final Set<Material> PickaxeMats = Sets.newHashSet(new Material[] { Material.ANVIL, Material.GLASS,
			Material.ICE, Material.IRON, Material.PACKED_ICE, Material.PISTON, Material.ROCK });
	private static final Set<Block> ShovelBlocks = Sets.newHashSet(
			new Block[] { Blocks.CLAY, Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, Blocks.MYCELIUM,
					Blocks.SAND, Blocks.SNOW, Blocks.SNOW_LAYER, Blocks.SOUL_SAND, Blocks.GRASS_PATH });
	private static final Set<Material> ShovelMats = Sets.newHashSet(new Material[] { Material.GRASS, Material.GROUND,
			Material.SAND, Material.SNOW, Material.CRAFTED_SNOW, Material.CLAY });

	private boolean isExcavator;
	private int mineWidth = 1;
	private int mineHeight = 1;
	private int mineDepth = 0;
	private boolean infiniteUse;
	private boolean shiftRotating = false;
	private Set<Material> materials;

	protected int textureColour = -1;

	public ItemToolAoE(String name, ToolMaterial material) {

		this(name, material, false, false);

	}

	public ItemToolAoE(String name, ToolMaterial material, boolean isExcavator) {

		this(name, material, isExcavator, false);

	}

	public ItemToolAoE(String name, ToolMaterial material, boolean isExcavator, boolean isInfiniteUse) {
		super(isExcavator ? 1.5F : 2F, isExcavator ? -3F : -3.2F, material, isExcavator ? ShovelBlocks : PickaxeBlocks);
		this.isExcavator = isExcavator;
		infiniteUse = isInfiniteUse;
		setUnlocalizedName(name);
		setRegistryName(NaberiusCore.ModID, name);
		setCreativeTab(NaberiusCore.INSTANCE.tab);
		materials = isExcavator ? ShovelMats : PickaxeMats;
	}

	public boolean canHarvestBlock(IBlockState state) {
		Block block = state.getBlock();

		if (!isExcavator)
			return block == Blocks.OBSIDIAN ? this.toolMaterial.getHarvestLevel() == 3
					: (block != Blocks.DIAMOND_BLOCK && block != Blocks.DIAMOND_ORE ? (block != Blocks.EMERALD_ORE
							&& block != Blocks.EMERALD_BLOCK
									? (block != Blocks.GOLD_BLOCK && block != Blocks.GOLD_ORE
											? (block != Blocks.IRON_BLOCK && block != Blocks.IRON_ORE
													? (block != Blocks.LAPIS_BLOCK && block != Blocks.LAPIS_ORE
															? (block != Blocks.REDSTONE_ORE
																	&& block != Blocks.LIT_REDSTONE_ORE
																			? (state.getMaterial() == Material.ROCK
																					? true
																					: (state.getMaterial() == Material.IRON
																							? true
																							: state.getMaterial() == Material.ANVIL))
																			: this.toolMaterial.getHarvestLevel() >= 2)
															: this.toolMaterial.getHarvestLevel() >= 1)
													: this.toolMaterial.getHarvestLevel() >= 1)
											: this.toolMaterial.getHarvestLevel() >= 2)
									: this.toolMaterial.getHarvestLevel() >= 2)
							: this.toolMaterial.getHarvestLevel() >= 2);
		else
			return block == Blocks.SNOW_LAYER ? true : block == Blocks.SNOW;
	}

	public float getStrVsBlock(ItemStack stack, IBlockState state) {
		if (!isExcavator)
			return state.getMaterial() != Material.IRON && state.getMaterial() != Material.ANVIL
					&& state.getMaterial() != Material.ROCK ? super.getStrVsBlock(stack, state)
							: this.efficiencyOnProperMaterial;
		else
			return super.getStrVsBlock(stack, state);
	}

	public void setInfinite(boolean isInfinite) {
		infiniteUse = isInfinite;
	}

	public boolean hitEntity(ItemStack stack, EntityLivingBase entityHit, EntityLivingBase player) {
		return !infiniteUse && super.hitEntity(stack, entityHit, player);
	}

	public RayTraceResult rayTrace(World worldIn, EntityPlayer playerIn, boolean useLiquids) {
		return super.rayTrace(worldIn, playerIn, useLiquids);
	}

	public boolean onBlockDestroyed(ItemStack stack, World world, IBlockState state, BlockPos pos,
			EntityLivingBase player) {
		return !infiniteUse && super.onBlockDestroyed(stack, world, state, pos, player);
	}

	public boolean isEffective(IBlockState state) {
		return materials.contains(state.getMaterial());
	}

	private void breakArea(ItemStack stack, EntityPlayer player, BlockPos posHit, BlockPos posStart, BlockPos posEnd) {
		for (int xPos = posStart.getX(); xPos <= posEnd.getX(); xPos++)
			for (int yPos = posStart.getY(); yPos <= posEnd.getY(); yPos++)
				for (int zPos = posStart.getZ(); zPos <= posEnd.getZ(); zPos++) {
					if (xPos == posHit.getX() && yPos == posHit.getY() && zPos == posHit.getZ())
						continue;

					if (!super.onBlockStartBreak(stack, new BlockPos(xPos, yPos, zPos), player))
						NaberiusUtils.breakBlock(stack, player.worldObj, player, new BlockPos(xPos, yPos, zPos), posHit);
				}
	}

	public boolean onBlockStartBreak(ItemStack stack, BlockPos pos, EntityPlayer player) {
		RayTraceResult ray = rayTrace(player.worldObj, player, false);
		if (ray == null)
			return super.onBlockStartBreak(stack, pos, player);

		BlockPos[] positions = NaberiusUtils.getBreakArea((ItemToolAoE) stack.getItem(), pos, ray.sideHit, player);
		BlockPos start = positions[0];
		BlockPos end = positions[1];

		breakArea(stack, player, pos, start, end);

		return super.onBlockStartBreak(stack, pos, player);
	}

	public ItemToolAoE setMineWidth(int width) {
		mineWidth = width;
		return this;
	}

	public ItemToolAoE setMineHeight(int height) {
		mineHeight = height;
		return this;
	}

	public ItemToolAoE setShiftRotating(boolean bool) {
		shiftRotating = bool;
		return this;
	}

	public int getMineWidth() {
		return mineWidth;
	}

	public int getMineHeight() {
		return mineHeight;
	}

	public int getMineDepth() {
		return mineDepth;
	}

	public boolean getShiftRotating() {
		return shiftRotating;
	}

	public ItemToolAoE setItemColour(int colour) {
		textureColour = colour;
		return this;
	}

	public int getTextureColour() {
		return textureColour;
	}

	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
		return true;
	}
	
}
