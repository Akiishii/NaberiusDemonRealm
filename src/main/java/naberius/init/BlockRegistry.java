package naberius.init;

import java.util.ArrayList;
import java.util.List;

import naberius.block.BlockDemon;
import naberius.block.BlockOre;
import naberius.block.machine.BlockHellforge;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRegistry {

	public static List<Block> BLOCKS = new ArrayList();
	public static BlockOre ORE_TITANIUM = new BlockOre(3, "ore_titanium");
	public static BlockOre ORE_VIBRANIUM = new BlockOre(3, "ore_vibranium");
	public static BlockOre ORE_ADAMANTIUM = new BlockOre(3, "ore_adamantium");
	public static BlockOre ORE_SIRIUM = new BlockOre(3, "ore_sirium");
	public static BlockOre ORE_SILVER = new BlockOre(1, "ore_silver");
	public static BlockOre ORE_COPPER = new BlockOre(1, "ore_copper");
	public static BlockOre ORE_TIN = new BlockOre(1, "ore_tin");

	public static BlockDemon METAL_TITANIUM = new BlockDemon("metal_titanium");
	public static BlockDemon METAL_VIBRANIUM = new BlockDemon("metal_vibranium");
	public static BlockDemon METAL_ADAMANTIUM = new BlockDemon("metal_adamantium");
	public static BlockDemon METAL_SIRIUM = new BlockDemon("metal_sirium");
	public static BlockDemon METAL_DEMON = new BlockDemon("metal_demon");
	public static BlockDemon METAL_SILVER = new BlockDemon("metal_silver");
	public static BlockDemon METAL_STEEL = new BlockDemon("metal_steel");
	public static BlockDemon METAL_BRONZE = new BlockDemon("metal_bronze");
	public static BlockDemon METAL_TIN = new BlockDemon("metal_tin");
	public static BlockDemon METAL_COPPER = new BlockDemon("metal_copper");
	
	public static BlockDemon BLOCK_DEMON_STONE = new BlockDemon("block_demon_stone");
	public static BlockDemon BLOCK_DEMON_DIRT = new BlockDemon("block_demon_dirt");

	public static BlockHellforge HELL_FORGE = new BlockHellforge();
	
	public static void init() {
	
		BLOCKS.add(ORE_TITANIUM);
		BLOCKS.add(ORE_VIBRANIUM);
		BLOCKS.add(ORE_ADAMANTIUM);
		BLOCKS.add(ORE_SIRIUM);
		BLOCKS.add(ORE_SILVER);
		BLOCKS.add(ORE_COPPER);
		BLOCKS.add(ORE_TIN);
		BLOCKS.add(METAL_TITANIUM);
		BLOCKS.add(METAL_VIBRANIUM);
		BLOCKS.add(METAL_ADAMANTIUM);
		BLOCKS.add(METAL_SIRIUM);
		BLOCKS.add(METAL_DEMON);
		BLOCKS.add(METAL_SILVER);
		BLOCKS.add(METAL_STEEL);
		BLOCKS.add(METAL_BRONZE);
		BLOCKS.add(METAL_TIN);
		BLOCKS.add(METAL_COPPER);
		BLOCKS.add(BLOCK_DEMON_STONE);
		BLOCKS.add(BLOCK_DEMON_DIRT);
		BLOCKS.add(HELL_FORGE);
		
		for(Block block : BLOCKS){
			GameRegistry.register(block);
			GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		}
		
	}


}
