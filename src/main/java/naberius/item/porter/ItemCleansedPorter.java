package naberius.item.porter;

import java.util.List;

import naberius.config.NaberiusConfig;
import naberius.dimension.TeleporterNormal;
import naberius.item.ItemBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.server.SPacketChangeGameState;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemCleansedPorter extends ItemBase {

	public ItemCleansedPorter() {
		super("cleansed_porter");
		setMaxStackSize(1);
		setMaxDamage(0);
	}

	private int getDimension(EntityPlayer player) {
		if (player.dimension == 0) {
			return NaberiusConfig.DIMENSIONID;
		}
		return 0;
	}

	private void teleport(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if (par2World.isRemote) {
			return;
		}
		EntityPlayerMP thePlayer = (EntityPlayerMP) par3EntityPlayer;
		int dimension = getDimension(par3EntityPlayer);

		BlockPos coords = thePlayer.getBedLocation(dimension);
		if (coords == null) {
			coords = thePlayer.mcServer.worldServerForDimension(dimension).getSpawnPoint();
		}
		BlockPos realcoords = EntityPlayer.getBedSpawnLocation(par2World, coords, dimension == 0);
		if (realcoords == null) {
			thePlayer.connection.sendPacket(new SPacketChangeGameState(0, 0.0F));
		}
		thePlayer.mcServer.getPlayerList().transferPlayerToDimension(thePlayer, dimension,
				new TeleporterNormal(thePlayer.mcServer

						.worldServerForDimension(dimension), realcoords));
		par3EntityPlayer.stopActiveHand();
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("This leads to dimension: " + getDimension(par2EntityPlayer) + ".");
		try {
			String dimensionname = DimensionManager.createProviderFor(getDimension(par2EntityPlayer)).getDimensionType()
					.getName();
			par3List.add("(" + dimensionname + ")");
		} catch (Exception e) {
			throw new IllegalArgumentException("Failed to load information for " + par1ItemStack.toString());
		}
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.UNCOMMON;
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		playerIn.setActiveHand(hand);
		teleport(itemStackIn, worldIn, playerIn);
		return new ActionResult(EnumActionResult.SUCCESS, itemStackIn);
	}

}
