package naberius.registry;

import naberius.item.ItemIngot;
import naberius.item.ItemNugget;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void init(){
		
		crafting();
		smelting();
		
	}
	
	private static void crafting() {

		// Titanium
		ItemStack titanium_axe = new ItemStack(ModItems.TITANIUM_AXE);
		GameRegistry.addRecipe(titanium_axe, "SS ", "SD ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_TITANIUM), 'D', Items.STICK);
		ItemStack titanium_hoe = new ItemStack(ModItems.TITANIUM_HOE);
		GameRegistry.addRecipe(titanium_hoe, "SS ", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_TITANIUM), 'D', Items.STICK);
		ItemStack titanium_pick = new ItemStack(ModItems.TITANIUM_PICKAXE);
		GameRegistry.addRecipe(titanium_pick, "SSS", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_TITANIUM), 'D', Items.STICK);
		ItemStack titanium_shovel = new ItemStack(ModItems.TITANIUM_SHOVEL);
		GameRegistry.addRecipe(titanium_shovel, " S ", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_TITANIUM), 'D', Items.STICK);
		ItemStack titanium_sword = new ItemStack(ModItems.TITANIUM_SWORD);
		GameRegistry.addRecipe(titanium_sword, " S ", " S ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_TITANIUM), 'D', Items.STICK);

		// Vibranium
		ItemStack vibranium_axe = new ItemStack(ModItems.VIBRANIUM_AXE);
		GameRegistry.addRecipe(vibranium_axe, "SS ", "SD ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_VIBRANIUM), 'D', Items.STICK);
		ItemStack vibranium_hoe = new ItemStack(ModItems.VIBRANIUM_HOE);
		GameRegistry.addRecipe(vibranium_hoe, "SS ", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_VIBRANIUM), 'D', Items.STICK);
		ItemStack vibranium_pick = new ItemStack(ModItems.VIBRANIUM_PICKAXE);
		GameRegistry.addRecipe(vibranium_pick, "SSS", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_VIBRANIUM), 'D', Items.STICK);
		ItemStack vibranium_shovel = new ItemStack(ModItems.VIBRANIUM_SHOVEL);
		GameRegistry.addRecipe(vibranium_shovel, " S ", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_VIBRANIUM), 'D', Items.STICK);
		ItemStack vibranium_sword = new ItemStack(ModItems.VIBRANIUM_SWORD);
		GameRegistry.addRecipe(vibranium_sword, " S ", " S ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_VIBRANIUM), 'D', Items.STICK);

		// Adamantium
		ItemStack adamantium_axe = new ItemStack(ModItems.ADAMANTIUM_AXE);
		GameRegistry.addRecipe(adamantium_axe, "SS ", "SD ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_ADAMANTIUM), 'D', Items.STICK);
		ItemStack adamantium_hoe = new ItemStack(ModItems.ADAMANTIUM_HOE);
		GameRegistry.addRecipe(adamantium_hoe, "SS ", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_ADAMANTIUM), 'D', Items.STICK);
		ItemStack adamantium_pick = new ItemStack(ModItems.ADAMANTIUM_PICKAXE);
		GameRegistry.addRecipe(adamantium_pick, "SSS", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_ADAMANTIUM), 'D', Items.STICK);
		ItemStack adamantium_shovel = new ItemStack(ModItems.ADAMANTIUM_SHOVEL);
		GameRegistry.addRecipe(adamantium_shovel, " S ", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_ADAMANTIUM), 'D', Items.STICK);
		ItemStack adamantium_sword = new ItemStack(ModItems.ADAMANTIUM_SWORD);
		GameRegistry.addRecipe(adamantium_sword, " S ", " S ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_ADAMANTIUM), 'D', Items.STICK);

		// Sirium
		ItemStack sirium_axe = new ItemStack(ModItems.SIRIUM_AXE);
		GameRegistry.addRecipe(sirium_axe, "SS ", "SD ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SIRIUM), 'D', Items.STICK);
		ItemStack sirium_hoe = new ItemStack(ModItems.SIRIUM_HOE);
		GameRegistry.addRecipe(sirium_hoe, "SS ", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SIRIUM), 'D', Items.STICK);
		ItemStack sirium_pick = new ItemStack(ModItems.SIRIUM_PICKAXE);
		GameRegistry.addRecipe(sirium_pick, "SSS", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SIRIUM), 'D', Items.STICK);
		ItemStack sirium_shovel = new ItemStack(ModItems.SIRIUM_SHOVEL);
		GameRegistry.addRecipe(sirium_shovel, " S ", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SIRIUM), 'D', Items.STICK);
		ItemStack sirium_sword = new ItemStack(ModItems.SIRIUM_SWORD);
		GameRegistry.addRecipe(sirium_sword, " S ", " S ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SIRIUM), 'D', Items.STICK);

		// Demonic
		ItemStack demonic_axe = new ItemStack(ModItems.DEMONIC_AXE);
		GameRegistry.addRecipe(demonic_axe, "SS ", "SD ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_DEMONIC), 'D', Items.STICK);
		ItemStack demonic_hoe = new ItemStack(ModItems.DEMONIC_HOE);
		GameRegistry.addRecipe(demonic_hoe, "SS ", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_DEMONIC), 'D', Items.STICK);
		ItemStack demonic_pick = new ItemStack(ModItems.DEMONIC_PICKAXE);
		GameRegistry.addRecipe(demonic_pick, "SSS", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_DEMONIC), 'D', Items.STICK);
		ItemStack demonic_shovel = new ItemStack(ModItems.DEMONIC_SHOVEL);
		GameRegistry.addRecipe(demonic_shovel, " S ", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_DEMONIC), 'D', Items.STICK);
		ItemStack demonic_sword = new ItemStack(ModItems.DEMONIC_SWORD);
		demonic_sword.addEnchantment(ModEnchants.DEVOURER, 5);
		GameRegistry.addRecipe(demonic_sword, " S ", " S ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_DEMONIC), 'D', Items.STICK);

		// Steel
		ItemStack steel_axe = new ItemStack(ModItems.STEEL_AXE);
		GameRegistry.addRecipe(steel_axe, "SS ", "SD ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_STEEL), 'D', Items.STICK);
		ItemStack steel_hoe = new ItemStack(ModItems.STEEL_HOE);
		GameRegistry.addRecipe(steel_hoe, "SS ", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_STEEL), 'D', Items.STICK);
		ItemStack steel_pick = new ItemStack(ModItems.STEEL_PICKAXE);
		GameRegistry.addRecipe(steel_pick, "SSS", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_STEEL), 'D', Items.STICK);
		ItemStack steel_shovel = new ItemStack(ModItems.STEEL_SHOVEL);
		GameRegistry.addRecipe(steel_shovel, " S ", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_STEEL), 'D', Items.STICK);
		ItemStack steel_sword = new ItemStack(ModItems.STEEL_SWORD);
		GameRegistry.addRecipe(steel_sword, " S ", " S ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_STEEL), 'D', Items.STICK);

		// Bronze
		ItemStack bronze_axe = new ItemStack(ModItems.BRONZE_AXE);
		GameRegistry.addRecipe(bronze_axe, "SS ", "SD ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_BRONZE), 'D', Items.STICK);
		ItemStack bronze_hoe = new ItemStack(ModItems.BRONZE_HOE);
		GameRegistry.addRecipe(bronze_hoe, "SS ", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_BRONZE), 'D', Items.STICK);
		ItemStack bronze_pick = new ItemStack(ModItems.BRONZE_PICKAXE);
		GameRegistry.addRecipe(bronze_pick, "SSS", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_BRONZE), 'D', Items.STICK);
		ItemStack bronze_shovel = new ItemStack(ModItems.BRONZE_SHOVEL);
		GameRegistry.addRecipe(bronze_shovel, " S ", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_BRONZE), 'D', Items.STICK);
		ItemStack bronze_sword = new ItemStack(ModItems.BRONZE_SWORD);
		GameRegistry.addRecipe(bronze_sword, " S ", " S ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_BRONZE), 'D', Items.STICK);

		// Silver
		ItemStack silver_axe = new ItemStack(ModItems.SILVER_AXE);
		GameRegistry.addRecipe(silver_axe, "SS ", "SD ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SILVER), 'D', Items.STICK);
		ItemStack silver_hoe = new ItemStack(ModItems.SILVER_HOE);
		GameRegistry.addRecipe(silver_hoe, "SS ", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SILVER), 'D', Items.STICK);
		ItemStack silver_pick = new ItemStack(ModItems.SILVER_PICKAXE);
		GameRegistry.addRecipe(silver_pick, "SSS", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SILVER), 'D', Items.STICK);
		ItemStack silver_shovel = new ItemStack(ModItems.SILVER_SHOVEL);
		GameRegistry.addRecipe(silver_shovel, " S ", " D ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SILVER), 'D', Items.STICK);
		ItemStack silver_sword = new ItemStack(ModItems.SILVER_SWORD);
		silver_sword.addEnchantment(Enchantments.SMITE, 5);
		GameRegistry.addRecipe(silver_sword, " S ", " S ", " D ", 'S',
				new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SILVER), 'D', Items.STICK);

		GameRegistry.addRecipe(new ItemStack(ModBlocks.METAL_TITANIUM), "III", "III", "III", 'I', new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_TITANIUM));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.METAL_VIBRANIUM), "III", "III", "III", 'I', new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_VIBRANIUM));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.METAL_ADAMANTIUM), "III", "III", "III", 'I', new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_ADAMANTIUM));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.METAL_SIRIUM), "III", "III", "III", 'I', new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SIRIUM));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.METAL_DEMON), "III", "III", "III", 'I', new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_DEMONIC));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.METAL_SILVER), "III", "III", "III", 'I', new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SILVER));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.METAL_STEEL), "III", "III", "III", 'I', new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_STEEL));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.METAL_BRONZE), "III", "III", "III", 'I', new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_BRONZE));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.METAL_COPPER), "III", "III", "III", 'I', new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_COPPER));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.METAL_TIN), "III", "III", "III", 'I', new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_TIN));
		
		GameRegistry.addRecipe(new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_TITANIUM), "III", "III", "III", 'I', new ItemStack(ModItems.NUGGET, 1, ItemNugget.NUGGET_TITANIUM));
		GameRegistry.addRecipe(new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_VIBRANIUM), "III", "III", "III", 'I', new ItemStack(ModItems.NUGGET, 1, ItemNugget.NUGGET_VIBRANIUM));
		GameRegistry.addRecipe(new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_ADAMANTIUM), "III", "III", "III", 'I', new ItemStack(ModItems.NUGGET, 1, ItemIngot.INGOT_ADAMANTIUM));
		GameRegistry.addRecipe(new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SIRIUM), "III", "III", "III", 'I', new ItemStack(ModItems.NUGGET, 1, ItemNugget.NUGGET_SIRIUM));
		GameRegistry.addRecipe(new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_DEMONIC), "III", "III", "III", 'I', new ItemStack(ModItems.NUGGET, 1, ItemNugget.NUGGET_DEMON));
		GameRegistry.addRecipe(new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SILVER), "III", "III", "III", 'I', new ItemStack(ModItems.NUGGET, 1, ItemNugget.NUGGET_SILVER));
		GameRegistry.addRecipe(new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_STEEL), "III", "III", "III", 'I', new ItemStack(ModItems.NUGGET, 1, ItemNugget.NUGGET_STEEL));
		GameRegistry.addRecipe(new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_BRONZE), "III", "III", "III", 'I', new ItemStack(ModItems.NUGGET, 1, ItemNugget.NUGGET_BRONZE));
		GameRegistry.addRecipe(new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_COPPER), "III", "III", "III", 'I', new ItemStack(ModItems.NUGGET, 1, ItemNugget.NUGGET_COPPER));
		GameRegistry.addRecipe(new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_TIN), "III", "III", "III", 'I', new ItemStack(ModItems.NUGGET, 1, ItemNugget.NUGGET_TIN));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.INGOT, 9, ItemIngot.INGOT_TITANIUM), new ItemStack(ModBlocks.METAL_TITANIUM));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.INGOT, 9, ItemIngot.INGOT_VIBRANIUM), new ItemStack(ModBlocks.METAL_VIBRANIUM));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.INGOT, 9, ItemIngot.INGOT_ADAMANTIUM), new ItemStack(ModBlocks.METAL_ADAMANTIUM));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.INGOT, 9, ItemIngot.INGOT_SIRIUM), new ItemStack(ModBlocks.METAL_SIRIUM));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.INGOT, 9, ItemIngot.INGOT_DEMONIC), new ItemStack(ModBlocks.METAL_DEMON));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.INGOT, 9, ItemIngot.INGOT_SILVER), new ItemStack(ModBlocks.METAL_SILVER));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.INGOT, 9, ItemIngot.INGOT_STEEL), new ItemStack(ModBlocks.METAL_STEEL));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.INGOT, 9, ItemIngot.INGOT_BRONZE), new ItemStack(ModBlocks.METAL_BRONZE));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.INGOT, 9, ItemIngot.INGOT_COPPER), new ItemStack(ModBlocks.METAL_COPPER));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.INGOT, 9, ItemIngot.INGOT_TIN), new ItemStack(ModBlocks.METAL_TIN));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.INGOT, 4, ItemIngot.INGOT_BRONZE), new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_COPPER), new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_COPPER), new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_COPPER), new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_TIN));
	
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.NUGGET, 9, ItemNugget.NUGGET_TITANIUM), new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_TITANIUM));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.NUGGET, 9, ItemNugget.NUGGET_VIBRANIUM), new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_VIBRANIUM));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.NUGGET, 9, ItemNugget.NUGGET_ADAMANTIUM), new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_ADAMANTIUM));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.NUGGET, 9, ItemNugget.NUGGET_SIRIUM), new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SIRIUM));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.NUGGET, 9, ItemNugget.NUGGET_DEMON), new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_DEMONIC));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.NUGGET, 9, ItemNugget.NUGGET_SILVER), new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SILVER));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.NUGGET, 9, ItemNugget.NUGGET_STEEL), new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_STEEL));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.NUGGET, 9, ItemNugget.NUGGET_BRONZE), new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_BRONZE));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.NUGGET, 9, ItemNugget.NUGGET_COPPER), new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_COPPER));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.NUGGET, 9, ItemNugget.NUGGET_TIN), new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_TIN));
	}

	private static void smelting(){
		
		GameRegistry.addSmelting(ModBlocks.ORE_TITANIUM, new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_TITANIUM), 0.1F);
		GameRegistry.addSmelting(ModBlocks.ORE_VIBRANIUM, new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_VIBRANIUM), 0.1F);
		GameRegistry.addSmelting(ModBlocks.ORE_ADAMANTIUM, new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_ADAMANTIUM), 0.1F);
		GameRegistry.addSmelting(ModBlocks.ORE_SIRIUM, new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SIRIUM), 0.1F);
		GameRegistry.addSmelting(ModBlocks.ORE_SILVER, new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SILVER), 0.1F);
		GameRegistry.addSmelting(ModBlocks.ORE_COPPER, new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_COPPER), 0.1F);
		GameRegistry.addSmelting(ModBlocks.ORE_TIN, new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_TIN), 0.1F);
		
	}
	
}
