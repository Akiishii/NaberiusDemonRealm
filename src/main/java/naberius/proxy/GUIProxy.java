package naberius.proxy;

import mcjty.lib.container.GenericBlock;
import naberius.config.NaberiusConfig;
import naberius.container.ContainerBackpack;
import naberius.container.inventory.InventoryBackpack;
import naberius.gui.GuiBackpack;
import naberius.gui.GuiItemManual;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GUIProxy implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == NaberiusConfig.GUI_MANUAL){
			return null;
		} else if (ID == NaberiusConfig.GUI_BACKPACK){
			return new ContainerBackpack(player.inventory, new InventoryBackpack(player.inventory.getCurrentItem()), player);
		}
		
		BlockPos pos = new BlockPos(x, y, z);
		Block block = world.getBlockState(pos).getBlock();
		if(block instanceof GenericBlock){
			GenericBlock genericBlock = (GenericBlock) block;
			TileEntity te = world.getTileEntity(pos);
			return genericBlock.createServerContainer(player, te);
		}
		
		return null;
		
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

		if(ID == NaberiusConfig.GUI_MANUAL){
			return new GuiItemManual(GuiItemManual.MANUAL_MAIN);
		} else if (ID == NaberiusConfig.GUI_BACKPACK){
			return new GuiBackpack(new InventoryBackpack(player.inventory.getCurrentItem()));
		}
		
		BlockPos pos = new BlockPos(x, y, z);
        Block block = world.getBlockState(pos).getBlock();
        if (block instanceof GenericBlock) {
            GenericBlock genericBlock = (GenericBlock) block;
            TileEntity te = world.getTileEntity(pos);
            return genericBlock.createClientGui(player, te);
        }
		
		return null;
	}

}
