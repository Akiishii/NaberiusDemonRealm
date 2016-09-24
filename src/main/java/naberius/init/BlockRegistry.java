package naberius.init;

import naberius.block.BlockBase;
import naberius.block.BlockDemon;
import naberius.block.BlockHellforge;
import naberius.block.BlockMachineBase;
import naberius.block.BlockOre;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRegistry {

	public static BlockOre ORE_TITANIUM;
	public static BlockOre ORE_VIBRANIUM;
	public static BlockOre ORE_ADAMANTIUM;
	public static BlockOre ORE_SIRIUM;
	public static BlockOre ORE_SILVER;
	public static BlockOre ORE_COPPER;
	public static BlockOre ORE_TIN;

	public static BlockDemon METAL_TITANIUM;
	public static BlockDemon METAL_VIBRANIUM;
	public static BlockDemon METAL_ADAMANTIUM;
	public static BlockDemon METAL_SIRIUM;
	public static BlockDemon METAL_DEMON;
	public static BlockDemon METAL_SILVER;
	public static BlockDemon METAL_STEEL;
	public static BlockDemon METAL_BRONZE;
	public static BlockDemon METAL_TIN;
	public static BlockDemon METAL_COPPER;
	
	public static BlockDemon BLOCK_DEMON_STONE;
	public static BlockDemon BLOCK_DEMON_DIRT;

	public static BlockHellforge HELL_FORGE;
	
	public static void init() {

		ORE_TITANIUM = new BlockOre(3, "ore_titanium");
		ORE_VIBRANIUM = new BlockOre(3, "ore_vibranium");
		ORE_ADAMANTIUM = new BlockOre(3, "ore_adamantium");
		ORE_SIRIUM = new BlockOre(3, "ore_sirium");
		ORE_SILVER = new BlockOre(2, "ore_silver");
		ORE_COPPER = new BlockOre(1, "ore_copper");
		ORE_TIN = new BlockOre(1, "ore_tin");

		METAL_TITANIUM = new BlockDemon("metal_titanium");
		METAL_VIBRANIUM = new BlockDemon("metal_vibranium");
		METAL_ADAMANTIUM = new BlockDemon("metal_adamantium");
		METAL_SIRIUM = new BlockDemon("metal_sirium");
		METAL_DEMON = new BlockDemon("metal_demon");
		METAL_SILVER = new BlockDemon("metal_silver");
		METAL_STEEL = new BlockDemon("metal_steel");
		METAL_BRONZE = new BlockDemon("metal_bronze");
		METAL_TIN = new BlockDemon("metal_tin");
		METAL_COPPER = new BlockDemon("metal_copper");
		
		BLOCK_DEMON_STONE = new BlockDemon("block_demon_stone");
		BLOCK_DEMON_DIRT = new BlockDemon("block_demon_dirt");

		HELL_FORGE = new BlockHellforge();
		
		register();
	}

	private static void register() {

		registerBlock(BlockRegistry.ORE_TITANIUM);
		registerBlock(BlockRegistry.ORE_VIBRANIUM);
		registerBlock(BlockRegistry.ORE_ADAMANTIUM);
		registerBlock(BlockRegistry.ORE_SIRIUM);
		registerBlock(BlockRegistry.ORE_SILVER);
		registerBlock(BlockRegistry.ORE_COPPER);
		registerBlock(BlockRegistry.ORE_TIN);

		registerBlock(BlockRegistry.METAL_TITANIUM);
		registerBlock(BlockRegistry.METAL_VIBRANIUM);
		registerBlock(BlockRegistry.METAL_ADAMANTIUM);
		registerBlock(BlockRegistry.METAL_SIRIUM);
		registerBlock(BlockRegistry.METAL_DEMON);
		registerBlock(BlockRegistry.METAL_SILVER);
		registerBlock(BlockRegistry.METAL_STEEL);
		registerBlock(BlockRegistry.METAL_BRONZE);
		registerBlock(BlockRegistry.METAL_TIN);
		registerBlock(BlockRegistry.METAL_COPPER);
		
		registerBlock(BlockRegistry.BLOCK_DEMON_DIRT);
		registerBlock(BlockRegistry.BLOCK_DEMON_STONE);

		registerBlock(BlockRegistry.HELL_FORGE);
		
	}

	private static void registerBlock(BlockBase block) {
		GameRegistry.<Block> register(block);
		GameRegistry.register(block.createItem());
	}
	
	private static void registerBlock(BlockMachineBase block) {
		GameRegistry.<Block> register(block);
		GameRegistry.register(block.createItem());
	}

}
