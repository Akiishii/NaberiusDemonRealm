package naberius.registry;

import naberius.NaberiusCore;
import naberius.config.NaberiusConfig;
import naberius.dimension.demon.DemonWorldProvider;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class ModDimensions {

	public static DimensionType demonDimension;

	public static void init(){
		
		registerDimensionTypes();
		registerDimensions();
		
	}
	
	private static void registerDimensionTypes(){
		
		demonDimension = DimensionType.register(NaberiusCore.ModID, "_test", NaberiusConfig.dimensionID, DemonWorldProvider.class, false);
		
	}
	
	private static void registerDimensions(){
		
		DimensionManager.registerDimension(NaberiusConfig.dimensionID, demonDimension);
		
	}
	
}
