package naberius.biome;

import naberius.NaberiusCore;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager.BiomeType;

public abstract class BaseBiome extends Biome{

	public BaseBiome(BiomeProperties properties, String name) {
		super(properties);
		setRegistryName(NaberiusCore.ModID, name);
	}

	public BaseBiome(String name){
		this(new BiomeProperties(name), name);
	}
	
	public BiomeType getBiomeType(){
		return BiomeType.WARM;
	}
	
}
