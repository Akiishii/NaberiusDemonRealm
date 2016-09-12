package naberius.registry;

import naberius.item.ItemIngot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreDict {

	public static void init() {

		addItemOreDict();
		addBlockOreDict();
		
	}

	private static void addItemOreDict() {

		OreDictionary.registerOre("ingotTitanium", new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_TITANIUM));
		OreDictionary.registerOre("ingotVibranium", new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_VIBRANIUM));
		OreDictionary.registerOre("ingotAdamantium", new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_ADAMANTIUM));
		OreDictionary.registerOre("ingotSirium", new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SIRIUM));
		OreDictionary.registerOre("ingotDemonic", new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_DEMONIC));
		OreDictionary.registerOre("ingotSteel", new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_STEEL));
		OreDictionary.registerOre("ingotBronze", new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_BRONZE));
		OreDictionary.registerOre("ingotSilver", new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_SILVER));
		OreDictionary.registerOre("ingotCopper", new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_COPPER));
		OreDictionary.registerOre("ingotTin", new ItemStack(ModItems.INGOT, 1, ItemIngot.INGOT_TIN));
		
		OreDictionary.registerOre("foodDemonFlesh", ModItems.DEMON_FLESH);
		
	}

	private static void addBlockOreDict() {
		
		OreDictionary.registerOre("oreTitanium", ModBlocks.ORE_TITANIUM);
		OreDictionary.registerOre("oreVibranium", ModBlocks.ORE_VIBRANIUM);
		OreDictionary.registerOre("oreAdamantium", ModBlocks.ORE_ADAMANTIUM);
		OreDictionary.registerOre("oreSirium", ModBlocks.ORE_SIRIUM);
		OreDictionary.registerOre("oreSilver", ModBlocks.ORE_SILVER);
		OreDictionary.registerOre("oreCopper", ModBlocks.ORE_COPPER);
		OreDictionary.registerOre("oreTin", ModBlocks.ORE_TIN);
		
	}

}
