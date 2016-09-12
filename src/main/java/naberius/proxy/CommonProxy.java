package naberius.proxy;

import java.io.File;

import naberius.NaberiusCore;
import naberius.config.NaberiusConfig;
import naberius.events.EventHandler;
import naberius.integration.MainCompatHandler;
import naberius.registry.ModBiomes;
import naberius.registry.ModBlocks;
import naberius.registry.ModCrafting;
import naberius.registry.ModDimensions;
import naberius.registry.ModEnchants;
import naberius.registry.ModEntities;
import naberius.registry.ModItems;
import naberius.registry.ModOreDict;
import naberius.world.NTAWorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public static Configuration config;
	
	public void preInit(FMLPreInitializationEvent e){
		
		File directory = e.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(), "nta.cfg"));
		NaberiusConfig.readConfig();
				
		ModItems.init();
		ModBlocks.init();
		ModEnchants.init();
		ModEntities.init();
		ModDimensions.init();
		MainCompatHandler.registerTOP();
		ModBiomes.init();
		ModOreDict.init();
				
	}
	
	public void init(FMLInitializationEvent e){
		
		NetworkRegistry.INSTANCE.registerGuiHandler(NaberiusCore.INSTANCE, new GUIProxy());
		MinecraftForge.EVENT_BUS.register(new EventHandler());
		registerWorldGenerator(new NTAWorldGenerator(), 0);
		
	}
	
	public void postInit(FMLPostInitializationEvent e){
		
		if (config.hasChanged()) {
            config.save();
        }
		
		ModCrafting.init();
		
	}

	private void registerWorldGenerator(IWorldGenerator gen, int weight){
		GameRegistry.registerWorldGenerator(gen, weight);
	}
	
	
}
