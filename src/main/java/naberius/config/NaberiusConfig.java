package naberius.config;

import org.apache.logging.log4j.Level;

import naberius.NaberiusCore;
import naberius.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;

public class NaberiusConfig {

	private static final String CATEGORY_GENERAL = "general";
	private static final String CATEGORY_GEN = "gen";
	private static final String CATEGORY_DIMENSIONS = "dimensions";
	private static final String CATEGORY_GUI = "gui";

	public static boolean RETROGEN = false;
	
	private static int modGUIIndex = 0; 
	
	public static int dimensionID = 100;
	
	public static int GUI_MANUAL = modGUIIndex++;
	public static int GUI_HELLFORGE = modGUIIndex++;
	public static int GUI_BACKPACK = modGUIIndex++;
	
	public static void readConfig(){
		Configuration cfg = CommonProxy.config;
		try {
			cfg.load();
			initGeneralConfig(cfg);
			initGenConfig(cfg);
			initDimensionConfig(cfg);
			initGUIConfig(cfg);
		} catch (Exception e1){
			NaberiusCore.logger.log(Level.ERROR, "Problem loading config file!", e1);
		} finally {
			if(cfg.hasChanged()){
				cfg.save();
			}
		}
	}
	
	private static void initGeneralConfig(Configuration cfg) {

		cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");
		
	}
	
	private static void initGenConfig(Configuration cfg){
		
		cfg.addCustomCategoryComment(CATEGORY_GEN, "Generation configuration");
		
	}
	
	private static void initDimensionConfig(Configuration cfg) {

		cfg.addCustomCategoryComment(CATEGORY_DIMENSIONS, "Dimension configuration");
		dimensionID = cfg.getInt("dimensionID", CATEGORY_DIMENSIONS, dimensionID, -1000, 1000, "The ID to use for the Dimension");
	}
	
	private static void initGUIConfig(Configuration cfg){
		cfg.addCustomCategoryComment(CATEGORY_GUI, "General User Interface configuration");
		GUI_MANUAL = cfg.getInt("GUI_MANUAL_ID", CATEGORY_GUI, GUI_MANUAL, 0, 100, "The ID for the Manual GUI");
		GUI_HELLFORGE = cfg.getInt("GUI_HELLFORGE_ID", CATEGORY_GUI, GUI_HELLFORGE, 0, 100, "The ID for the Hell Forge GUI");
		GUI_BACKPACK = cfg.getInt("GUI_BACKPACK_ID", CATEGORY_GUI, GUI_BACKPACK, 0, 100, "The ID for the Backpack GUI");
	}
	
}
