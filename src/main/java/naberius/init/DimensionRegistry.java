package naberius.init;

import naberius.NaberiusCore;
import naberius.config.NaberiusConfig;
import naberius.dimension.demon.DemonWorldProvider;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry {

	public static DimensionType demonDimension;

	public static void init(){
		
		registerDimensionTypes();
		registerDimensions();
		
	}
	
	private static void registerDimensionTypes(){
		
		demonDimension = DimensionType.register("Demon Realm", "_test", NaberiusConfig.DIMENSIONID, DemonWorldProvider.class, false);
		
	}
	
	private static void registerDimensions(){
		
		DimensionManager.registerDimension(NaberiusConfig.DIMENSIONID, demonDimension);
		
	}
	
}
