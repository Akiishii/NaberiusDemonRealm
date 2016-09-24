package naberius.proxy;

import naberius.config.NaberiusConfig;
import naberius.container.ContainerBackpack;
import naberius.container.ContainerHellForge;
import naberius.container.inventory.InventoryBackpack;
import naberius.gui.GuiBackpack;
import naberius.gui.GuiHellForge;
import naberius.gui.GuiItemManual;
import naberius.tiles.TileHellForge;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GUIProxy implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

		BlockPos pos = new BlockPos(x, y, z);
		TileEntity tile = world.getTileEntity(pos);

		if (ID == NaberiusConfig.GUI_MANUAL) {
			return null;
		} else if (ID == NaberiusConfig.GUI_HELLFORGE) {
			if (tile instanceof TileHellForge) {
				TileHellForge tileForge = (TileHellForge) tile;
				return new ContainerHellForge(player.inventory, tileForge);
			}

		} else if (ID == NaberiusConfig.GUI_BACKPACK) {
			return new ContainerBackpack(player.inventory, new InventoryBackpack(player.inventory.getCurrentItem()),
					player);
		}

		return null;

	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

		BlockPos pos = new BlockPos(x, y, z);
		TileEntity tile = world.getTileEntity(pos);

		if (ID == NaberiusConfig.GUI_MANUAL) {

			return new GuiItemManual(GuiItemManual.MANUAL_MAIN);

		} else if (ID == NaberiusConfig.GUI_HELLFORGE) {

			if (tile instanceof TileHellForge) {

				TileHellForge tileForge = (TileHellForge) tile;
				return new GuiHellForge(player.inventory, tileForge);

			}

		} else if (ID == NaberiusConfig.GUI_BACKPACK) {

			return new GuiBackpack(new InventoryBackpack(player.inventory.getCurrentItem()));

		}

		return null;
	}

}
