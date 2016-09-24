package naberius.proxy;

import java.io.File;

import naberius.NaberiusCore;
import naberius.config.NaberiusConfig;
import naberius.events.EventHandler;
import naberius.init.BiomeRegistry;
import naberius.init.BlockRegistry;
import naberius.init.DimensionRegistry;
import naberius.init.EnchantmentRegistry;
import naberius.init.EntityRegister;
import naberius.init.ItemRegistry;
import naberius.init.OreDictRegistry;
import naberius.init.RecipeRegistry;
import naberius.init.RecipeRegistryHardcore;
import naberius.init.TileEntityRegistry;
import naberius.integration.MainCompatHandler;
import naberius.world.NTAWorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fluids.Fluid;
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
		config = new Configuration(new File(directory.getPath(), "naberius.cfg"));
		NaberiusConfig.readConfig();
		
		EnchantmentRegistry.init();
		ItemRegistry.init();
		BlockRegistry.init();
		EntityRegister.init();
		DimensionRegistry.init();
		TileEntityRegistry.init();
		MainCompatHandler.registerTOP();
		BiomeRegistry.init();
		OreDictRegistry.init();
				
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
		
		if(NaberiusConfig.HARDCORE_RECIPES){
			RecipeRegistryHardcore.init();
		}else{
			RecipeRegistry.init();
		}
	}
	
	private void registerWorldGenerator(IWorldGenerator gen, int weight){
		GameRegistry.registerWorldGenerator(gen, weight);
	}
	
	
	
}
