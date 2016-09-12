package naberius.registry;

import naberius.block.BlockBase;
import naberius.block.BlockDemon;
import naberius.block.BlockOre;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

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

		register();
	}

	private static void register() {

		registerBlock(ModBlocks.ORE_TITANIUM);
		registerBlock(ModBlocks.ORE_VIBRANIUM);
		registerBlock(ModBlocks.ORE_ADAMANTIUM);
		registerBlock(ModBlocks.ORE_SIRIUM);
		registerBlock(ModBlocks.ORE_SILVER);
		registerBlock(ModBlocks.ORE_COPPER);
		registerBlock(ModBlocks.ORE_TIN);

		registerBlock(ModBlocks.METAL_TITANIUM);
		registerBlock(ModBlocks.METAL_VIBRANIUM);
		registerBlock(ModBlocks.METAL_ADAMANTIUM);
		registerBlock(ModBlocks.METAL_SIRIUM);
		registerBlock(ModBlocks.METAL_DEMON);
		registerBlock(ModBlocks.METAL_SILVER);
		registerBlock(ModBlocks.METAL_STEEL);
		registerBlock(ModBlocks.METAL_BRONZE);
		registerBlock(ModBlocks.METAL_TIN);
		registerBlock(ModBlocks.METAL_COPPER);
		
		registerBlock(ModBlocks.BLOCK_DEMON_DIRT);
		registerBlock(ModBlocks.BLOCK_DEMON_STONE);

	}

	private static void registerBlock(BlockBase block) {
		GameRegistry.<Block> register(block);
		GameRegistry.register(block.createItem());
	}

}
