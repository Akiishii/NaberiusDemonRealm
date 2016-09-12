package naberius.registry;

import naberius.biome.BaseBiome;
import naberius.biome.BiomeDemon;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBiomes {

	public static BiomeDemon demonBiome;
	
	public static void init(){
		
		demonBiome = new BiomeDemon();
		
		register();
		
	}
	
	private static void register(){
		registerBiome(demonBiome, false);
	}
	
	private static void registerBiome(BaseBiome biome, boolean spawn){
		GameRegistry.register(biome);
		BiomeManager.addBiome(biome.getBiomeType(), new BiomeEntry(biome, 1000));
		if(spawn){
			BiomeManager.addSpawnBiome(biome);
		}
	}
	
}
