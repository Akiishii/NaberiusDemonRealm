package naberius.init;

import naberius.tiles.TileHellForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityRegistry {

	public static void init(){
		
		GameRegistry.registerTileEntity(TileHellForge.class, "tileHellForge");
		
	}
	
}
