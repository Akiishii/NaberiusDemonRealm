package naberius.biome;

import java.awt.Color;

import naberius.entities.EntityDemon;
import naberius.registry.ModBlocks;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class BiomeDemon extends BaseBiome{
	
	public BiomeDemon() {
		super(new BiomeProperties("Demon Realm").setRainDisabled().setHeightVariation(0.5F).setTemperature(0.4F).setWaterColor(Color.RED.getRGB()),"Demon Realm");
		this.topBlock = ModBlocks.BLOCK_DEMON_DIRT.getDefaultState();
		this.fillerBlock = ModBlocks.BLOCK_DEMON_STONE.getDefaultState();
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableMonsterList.add(new SpawnListEntry(EntityDemon.class, 10, 2, 5));
		
		this.theBiomeDecorator.generateLakes = false;
	}

	@Override
	public BiomeType getBiomeType(){
		return BiomeType.COOL;
	}
		
}
