package naberius.init;

import naberius.item.material.ItemIngot;
import naberius.item.material.ItemNugget;
import naberius.item.material.ItemPlate;
import naberius.utils.NaberiusUtils;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class RecipeRegistryHardcore {

	public static void init() {
		
		hardcoreCrafting();
		hardcoreSmelting();
		hardcoreHellForge();
		hardcoreEnchanting();
		hardcoreHammer();

	}

	private static void hardcoreCrafting() {

		// Titanium
		ItemStack titanium_axe = new ItemStack(ItemRegistry.TITANIUM_AXE);
		GameRegistry.addRecipe(titanium_axe, "SS ", "SD ", " D ", 'S', new ItemStack(BlockRegistry.METAL_TITANIUM), 'D', Items.STICK);
		ItemStack titanium_hoe = new ItemStack(ItemRegistry.TITANIUM_HOE);
		GameRegistry.addRecipe(titanium_hoe, "SS ", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_TITANIUM), 'D', Items.STICK);
		ItemStack titanium_pick = new ItemStack(ItemRegistry.TITANIUM_PICKAXE);
		GameRegistry.addRecipe(titanium_pick, "SSS", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_TITANIUM),'D', Items.STICK);
		ItemStack titanium_shovel = new ItemStack(ItemRegistry.TITANIUM_SHOVEL);
		GameRegistry.addRecipe(titanium_shovel, " S ", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_TITANIUM),'D', Items.STICK);
		ItemStack titanium_sword = new ItemStack(ItemRegistry.TITANIUM_SWORD);
		GameRegistry.addRecipe(titanium_sword, " S ", " S ", " D ", 'S', new ItemStack(BlockRegistry.METAL_TITANIUM),'D', Items.STICK);

		// Vibranium
		ItemStack vibranium_axe = new ItemStack(ItemRegistry.VIBRANIUM_AXE);
		GameRegistry.addRecipe(vibranium_axe, "SS ", "SD ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM),'D', Items.STICK);
		ItemStack vibranium_hoe = new ItemStack(ItemRegistry.VIBRANIUM_HOE);
		GameRegistry.addRecipe(vibranium_hoe, "SS ", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM),'D', Items.STICK);
		ItemStack vibranium_pick = new ItemStack(ItemRegistry.VIBRANIUM_PICKAXE);
		GameRegistry.addRecipe(vibranium_pick, "SSS", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM),'D', Items.STICK);
		ItemStack vibranium_shovel = new ItemStack(ItemRegistry.VIBRANIUM_SHOVEL);
		GameRegistry.addRecipe(vibranium_shovel, " S ", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM),'D', Items.STICK);
		ItemStack vibranium_sword = new ItemStack(ItemRegistry.VIBRANIUM_SWORD);
		GameRegistry.addRecipe(vibranium_sword, " S ", " S ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM),'D', Items.STICK);

		// Adamantium
		ItemStack adamantium_axe = new ItemStack(ItemRegistry.ADAMANTIUM_AXE);
		GameRegistry.addRecipe(adamantium_axe, "SS ", "SD ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM),'D', Items.STICK);
		ItemStack adamantium_hoe = new ItemStack(ItemRegistry.ADAMANTIUM_HOE);
		GameRegistry.addRecipe(adamantium_hoe, "SS ", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM),'D', Items.STICK);
		ItemStack adamantium_pick = new ItemStack(ItemRegistry.ADAMANTIUM_PICKAXE);
		GameRegistry.addRecipe(adamantium_pick, "SSS", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM),'D', Items.STICK);
		ItemStack adamantium_shovel = new ItemStack(ItemRegistry.ADAMANTIUM_SHOVEL);
		GameRegistry.addRecipe(adamantium_shovel, " S ", " D ", " D ", 'S',	new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D', Items.STICK);
		ItemStack adamantium_sword = new ItemStack(ItemRegistry.ADAMANTIUM_SWORD);
		GameRegistry.addRecipe(adamantium_sword, " S ", " S ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM),'D', Items.STICK);

		// Sirium
		ItemStack sirium_axe = new ItemStack(ItemRegistry.SIRIUM_AXE);
		GameRegistry.addRecipe(sirium_axe, "SS ", "SD ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D',	Items.STICK);
		ItemStack sirium_hoe = new ItemStack(ItemRegistry.SIRIUM_HOE);
		GameRegistry.addRecipe(sirium_hoe, "SS ", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D',	Items.STICK);
		ItemStack sirium_pick = new ItemStack(ItemRegistry.SIRIUM_PICKAXE);
		GameRegistry.addRecipe(sirium_pick, "SSS", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D', Items.STICK);
		ItemStack sirium_shovel = new ItemStack(ItemRegistry.SIRIUM_SHOVEL);
		GameRegistry.addRecipe(sirium_shovel, " S ", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D', Items.STICK);
		ItemStack sirium_sword = new ItemStack(ItemRegistry.SIRIUM_SWORD);
		GameRegistry.addRecipe(sirium_sword, " S ", " S ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D', Items.STICK);

		// Demonic
		ItemStack demonic_axe = new ItemStack(ItemRegistry.DEMONIC_AXE);
		GameRegistry.addRecipe(demonic_axe, "SS ", "SD ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D', Items.STICK);
		ItemStack demonic_hoe = new ItemStack(ItemRegistry.DEMONIC_HOE);
		GameRegistry.addRecipe(demonic_hoe, "SS ", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D', Items.STICK);
		ItemStack demonic_pick = new ItemStack(ItemRegistry.DEMONIC_PICKAXE);
		GameRegistry.addRecipe(demonic_pick, "SSS", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D', Items.STICK);
		ItemStack demonic_shovel = new ItemStack(ItemRegistry.DEMONIC_SHOVEL);
		GameRegistry.addRecipe(demonic_shovel, " S ", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D', Items.STICK);
		ItemStack demonic_sword = new ItemStack(ItemRegistry.DEMONIC_SWORD);
		demonic_sword.addEnchantment(EnchantmentRegistry.DEVOURER, 5);
		GameRegistry.addRecipe(demonic_sword, " S ", " S ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D', Items.STICK);

		// Steel
		ItemStack steel_axe = new ItemStack(ItemRegistry.STEEL_AXE);
		GameRegistry.addRecipe(steel_axe, "SS ", "SD ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D', Items.STICK);
		ItemStack steel_hoe = new ItemStack(ItemRegistry.STEEL_HOE);
		GameRegistry.addRecipe(steel_hoe, "SS ", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D', Items.STICK);
		ItemStack steel_pick = new ItemStack(ItemRegistry.STEEL_PICKAXE);
		GameRegistry.addRecipe(steel_pick, "SSS", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D',	Items.STICK);
		ItemStack steel_shovel = new ItemStack(ItemRegistry.STEEL_SHOVEL);
		GameRegistry.addRecipe(steel_shovel, " S ", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D', Items.STICK);
		ItemStack steel_sword = new ItemStack(ItemRegistry.STEEL_SWORD);
		GameRegistry.addRecipe(steel_sword, " S ", " S ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D', Items.STICK);

		// Bronze
		ItemStack bronze_axe = new ItemStack(ItemRegistry.BRONZE_AXE);
		GameRegistry.addRecipe(bronze_axe, "SS ", "SD ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D',	Items.STICK);
		ItemStack bronze_hoe = new ItemStack(ItemRegistry.BRONZE_HOE);
		GameRegistry.addRecipe(bronze_hoe, "SS ", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D',	Items.STICK);
		ItemStack bronze_pick = new ItemStack(ItemRegistry.BRONZE_PICKAXE);
		GameRegistry.addRecipe(bronze_pick, "SSS", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D', Items.STICK);
		ItemStack bronze_shovel = new ItemStack(ItemRegistry.BRONZE_SHOVEL);
		GameRegistry.addRecipe(bronze_shovel, " S ", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D', Items.STICK);
		ItemStack bronze_sword = new ItemStack(ItemRegistry.BRONZE_SWORD);
		GameRegistry.addRecipe(bronze_sword, " S ", " S ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D', Items.STICK);

		// Silver
		ItemStack silver_axe = new ItemStack(ItemRegistry.SILVER_AXE);
		GameRegistry.addRecipe(silver_axe, "SS ", "SD ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D', Items.STICK);
		ItemStack silver_hoe = new ItemStack(ItemRegistry.SILVER_HOE);
		GameRegistry.addRecipe(silver_hoe, "SS ", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D',	Items.STICK);
		ItemStack silver_pick = new ItemStack(ItemRegistry.SILVER_PICKAXE);
		GameRegistry.addRecipe(silver_pick, "SSS", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'D', Items.STICK);
		ItemStack silver_shovel = new ItemStack(ItemRegistry.SILVER_SHOVEL);
		GameRegistry.addRecipe(silver_shovel, " S ", " D ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM),'D', Items.STICK);
		ItemStack silver_sword = new ItemStack(ItemRegistry.SILVER_SWORD);
		GameRegistry.addRecipe(silver_sword, " S ", " S ", " D ", 'S', new ItemStack(BlockRegistry.METAL_VIBRANIUM),'D', Items.STICK);

		GameRegistry.addRecipe(new ItemStack(BlockRegistry.METAL_TITANIUM), "III", "III", "III", 'I', new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_TITANIUM));
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.METAL_VIBRANIUM), "III", "III", "III", 'I', new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_VIBRANIUM));
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.METAL_ADAMANTIUM), "III", "III", "III", 'I', new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_ADAMANTIUM));
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.METAL_SIRIUM), "III", "III", "III", 'I', new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SIRIUM));
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.METAL_DEMON), "III", "III", "III", 'I', new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_DEMONIC));
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.METAL_SILVER), "III", "III", "III", 'I', new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SILVER));
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.METAL_STEEL), "III", "III", "III", 'I', new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_STEEL));
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.METAL_BRONZE), "III", "III", "III", 'I', new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_BRONZE));
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.METAL_COPPER), "III", "III", "III", 'I', new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_COPPER));
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.METAL_TIN), "III", "III", "III", 'I', new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_TIN));

		GameRegistry.addRecipe(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_TITANIUM), "III", "III", "III", 'I', new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_TITANIUM));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_VIBRANIUM), "III", "III", "III", 'I', new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_VIBRANIUM));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_ADAMANTIUM), "III", "III", "III", 'I', new ItemStack(ItemRegistry.NUGGET, 1, ItemIngot.INGOT_ADAMANTIUM));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SIRIUM), "III", "III", "III", 'I', new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_SIRIUM));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_DEMONIC), "III", "III", "III", 'I', new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_DEMON));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SILVER), "III", "III", "III", 'I', new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_SILVER));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_STEEL), "III", "III", "III", 'I', new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_STEEL));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_BRONZE), "III", "III", "III", 'I', new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_BRONZE));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_COPPER), "III", "III", "III", 'I', new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_COPPER));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_TIN), "III", "III", "III", 'I',	new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_TIN));

		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.INGOT, 9, ItemIngot.INGOT_TITANIUM),	new ItemStack(BlockRegistry.METAL_TITANIUM));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.INGOT, 9, ItemIngot.INGOT_VIBRANIUM),new ItemStack(BlockRegistry.METAL_VIBRANIUM));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.INGOT, 9, ItemIngot.INGOT_ADAMANTIUM),new ItemStack(BlockRegistry.METAL_ADAMANTIUM));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.INGOT, 9, ItemIngot.INGOT_SIRIUM), new ItemStack(BlockRegistry.METAL_SIRIUM));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.INGOT, 9, ItemIngot.INGOT_DEMONIC), new ItemStack(BlockRegistry.METAL_DEMON));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.INGOT, 9, ItemIngot.INGOT_SILVER), new ItemStack(BlockRegistry.METAL_SILVER));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.INGOT, 9, ItemIngot.INGOT_STEEL), new ItemStack(BlockRegistry.METAL_STEEL));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.INGOT, 9, ItemIngot.INGOT_BRONZE), new ItemStack(BlockRegistry.METAL_BRONZE));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.INGOT, 9, ItemIngot.INGOT_COPPER), new ItemStack(BlockRegistry.METAL_COPPER));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.INGOT, 9, ItemIngot.INGOT_TIN), new ItemStack(BlockRegistry.METAL_TIN));

		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.INGOT, 4, ItemIngot.INGOT_BRONZE), new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_COPPER), new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_COPPER), new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_COPPER), new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_TIN));

		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.NUGGET, 9, ItemNugget.NUGGET_TITANIUM),new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_TITANIUM));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.NUGGET, 9, ItemNugget.NUGGET_VIBRANIUM),new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_VIBRANIUM));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.NUGGET, 9, ItemNugget.NUGGET_ADAMANTIUM),new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_ADAMANTIUM));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.NUGGET, 9, ItemNugget.NUGGET_SIRIUM),new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SIRIUM));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.NUGGET, 9, ItemNugget.NUGGET_DEMON),new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_DEMONIC));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.NUGGET, 9, ItemNugget.NUGGET_SILVER),new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SILVER));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.NUGGET, 9, ItemNugget.NUGGET_STEEL),new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_STEEL));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.NUGGET, 9, ItemNugget.NUGGET_BRONZE),new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_BRONZE));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.NUGGET, 9, ItemNugget.NUGGET_COPPER),new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_COPPER));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.NUGGET, 9, ItemNugget.NUGGET_TIN),new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_TIN));

		GameRegistry.addRecipe(new ItemStack(ItemRegistry.HOLY_WATER), "XDX", "DWD", "XDX", 'X', Blocks.GLOWSTONE, 'D', new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SILVER), 'W', Items.POTIONITEM);
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.CLEANSED_DEMON_PORTER), "DXD", "XSX", "DXD", 'D', new ItemStack(ItemRegistry.HOLY_WATER), 'X', new ItemStack(BlockRegistry.METAL_SILVER), 'S', new ItemStack(ItemRegistry.CORRUPTED_DEMON_PORTER));

	}

	private static void hardcoreSmelting() {
		
		GameRegistry.addSmelting(BlockRegistry.ORE_TITANIUM, new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_TITANIUM), 0.1F);
		GameRegistry.addSmelting(BlockRegistry.ORE_VIBRANIUM, new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_VIBRANIUM), 0.1F);
		GameRegistry.addSmelting(BlockRegistry.ORE_ADAMANTIUM, new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_ADAMANTIUM), 0.1F);
		GameRegistry.addSmelting(BlockRegistry.ORE_SIRIUM, new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_SIRIUM), 0.1F);
		GameRegistry.addSmelting(BlockRegistry.ORE_SILVER, new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_SILVER), 0.1F);
		GameRegistry.addSmelting(BlockRegistry.ORE_COPPER, new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_COPPER), 0.1F);
		GameRegistry.addSmelting(BlockRegistry.ORE_TIN, new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_TIN), 0.1F);
	
	}

	private static void hardcoreHellForge() {

		NaberiusUtils.addHellForgeRecipe("Demon-Steel", new ItemStack(ItemRegistry.INGOT, 2, ItemIngot.INGOT_DEMONIC), 1, 1600, 0.5F, "foodDemonFlesh*1", "blockVibranium*1", "blockAdamantium*1", "blockSirium*1");
		NaberiusUtils.addHellForgeRecipe("Demon-Eye", new ItemStack(ItemRegistry.DEMON_EYE), 1, 800, 0.1F, "materialDemonPearl*1", "ingotDemon*1", "ingotDemon*1", "ingotDemon*1");
		
		
	}

	private static void normalDemonCrafting(){
	
		
		
	}
	
	private static void hardcoreEnchanting() {

	}

	private static void hardcoreHammer() {

		GameRegistry.addRecipe(new ItemStack(ItemRegistry.PLATE, 4, ItemPlate.PLATE_TITANIUM), " X ", "XHX", " X ", 'X', new ItemStack(BlockRegistry.METAL_TITANIUM), 'H', new ItemStack(ItemRegistry.HAMMER, 0, 32767));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.PLATE, 4, ItemPlate.PLATE_VIBRANIUM), " X ", "XHX", " X ", 'X', new ItemStack(BlockRegistry.METAL_VIBRANIUM), 'H', new ItemStack(ItemRegistry.HAMMER, 0, 32767));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.PLATE, 4, ItemPlate.PLATE_ADAMANTIUM), " X ", "XHX", " X ", 'X', new ItemStack(BlockRegistry.METAL_ADAMANTIUM), 'H', new ItemStack(ItemRegistry.HAMMER, 0, 32767));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.PLATE, 4, ItemPlate.PLATE_SIRIUM), " X ", "XHX", " X ", 'X', new ItemStack(BlockRegistry.METAL_SIRIUM), 'H', new ItemStack(ItemRegistry.HAMMER, 0, 32767));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.PLATE, 4, ItemPlate.PLATE_DEMONIC), " X ", "XHX", " X ", 'X', new ItemStack(BlockRegistry.METAL_DEMON), 'H', new ItemStack(ItemRegistry.HAMMER, 0, 32767));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.PLATE, 4, ItemPlate.PLATE_SILVER), " X ", "XHX", " X ", 'X', new ItemStack(BlockRegistry.METAL_SILVER), 'H', new ItemStack(ItemRegistry.HAMMER, 0, 32767));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.PLATE, 4, ItemPlate.PLATE_STEEL), " X ", "XHX", " X ", 'X', new ItemStack(BlockRegistry.METAL_STEEL), 'H', new ItemStack(ItemRegistry.HAMMER, 0, 32767));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.PLATE, 4, ItemPlate.PLATE_BRONZE), " X ", "XHX", " X ", 'X', new ItemStack(BlockRegistry.METAL_BRONZE), 'H', new ItemStack(ItemRegistry.HAMMER, 0, 32767));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.PLATE, 4, ItemPlate.PLATE_COPPER), " X ", "XHX", " X ", 'X', new ItemStack(BlockRegistry.METAL_COPPER), 'H', new ItemStack(ItemRegistry.HAMMER, 0, 32767));
		GameRegistry.addRecipe(new ItemStack(ItemRegistry.PLATE, 4, ItemPlate.PLATE_TIN), " X ", "XHX", " X ", 'X', new ItemStack(BlockRegistry.METAL_TIN), 'H', new ItemStack(ItemRegistry.HAMMER, 0, 32767));
		
	}

}
