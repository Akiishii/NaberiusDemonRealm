package naberius.init;

import naberius.item.material.ItemIngot;
import naberius.item.material.ItemNugget;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictRegistry {

	public static void init() {

		addItemOreDict();
		addBlockOreDict();
		
	}

	private static void addItemOreDict() {

		OreDictionary.registerOre("ingotTitanium", new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_TITANIUM));
		OreDictionary.registerOre("ingotVibranium", new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_VIBRANIUM));
		OreDictionary.registerOre("ingotAdamantium", new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_ADAMANTIUM));
		OreDictionary.registerOre("ingotSirium", new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SIRIUM));
		OreDictionary.registerOre("ingotDemon", new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_DEMONIC));
		OreDictionary.registerOre("ingotSteel", new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_STEEL));
		OreDictionary.registerOre("ingotBronze", new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_BRONZE));
		OreDictionary.registerOre("ingotSilver", new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SILVER));
		OreDictionary.registerOre("ingotCopper", new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_COPPER));
		OreDictionary.registerOre("ingotTin", new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_TIN));
		
		OreDictionary.registerOre("nuggetTitanium", new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_TITANIUM));
		OreDictionary.registerOre("nuggetVibranium", new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_VIBRANIUM));
		OreDictionary.registerOre("nuggetAdamantium", new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_ADAMANTIUM));
		OreDictionary.registerOre("nuggetSirium", new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_SIRIUM));
		OreDictionary.registerOre("nuggetDemon", new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_DEMON));
		OreDictionary.registerOre("nuggetSteel", new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_STEEL));
		OreDictionary.registerOre("nuggetBronze", new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_BRONZE));
		OreDictionary.registerOre("nuggetSilver", new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_SILVER));
		OreDictionary.registerOre("nuggetCopper", new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_COPPER));
		OreDictionary.registerOre("nuggetTin", new ItemStack(ItemRegistry.NUGGET, 1, ItemNugget.NUGGET_TIN));
		
		OreDictionary.registerOre("foodDemonFlesh", ItemRegistry.DEMON_FLESH);
		
		OreDictionary.registerOre("materialHolyWater", new ItemStack(ItemRegistry.HOLY_WATER));
		OreDictionary.registerOre("materialDemonPearl", new ItemStack(ItemRegistry.DEMON_PEARL));
		OreDictionary.registerOre("materialDemonEye", new ItemStack(ItemRegistry.DEMON_EYE));

		
	}

	private static void addBlockOreDict() {
		
		OreDictionary.registerOre("oreTitanium", BlockRegistry.ORE_TITANIUM);
		OreDictionary.registerOre("oreVibranium", BlockRegistry.ORE_VIBRANIUM);
		OreDictionary.registerOre("oreAdamantium", BlockRegistry.ORE_ADAMANTIUM);
		OreDictionary.registerOre("oreSirium", BlockRegistry.ORE_SIRIUM);
		OreDictionary.registerOre("oreSilver", BlockRegistry.ORE_SILVER);
		OreDictionary.registerOre("oreCopper", BlockRegistry.ORE_COPPER);
		OreDictionary.registerOre("oreTin", BlockRegistry.ORE_TIN);
		
		OreDictionary.registerOre("blockTitanium", new ItemStack(BlockRegistry.METAL_TITANIUM));
		OreDictionary.registerOre("blockVibranium", new ItemStack(BlockRegistry.METAL_VIBRANIUM));
		OreDictionary.registerOre("blockAdamantium", new ItemStack(BlockRegistry.METAL_ADAMANTIUM));
		OreDictionary.registerOre("blockSirium", new ItemStack(BlockRegistry.METAL_SIRIUM));
		OreDictionary.registerOre("blockDemon", new ItemStack(BlockRegistry.METAL_DEMON));
		OreDictionary.registerOre("blockSilver", new ItemStack(BlockRegistry.METAL_SILVER));
		OreDictionary.registerOre("blockSteel", new ItemStack(BlockRegistry.METAL_STEEL));
		OreDictionary.registerOre("blockBronze", new ItemStack(BlockRegistry.METAL_BRONZE));
		OreDictionary.registerOre("blockCopper", new ItemStack(BlockRegistry.METAL_COPPER));
		OreDictionary.registerOre("blockTin", new ItemStack(BlockRegistry.METAL_TIN));
		
	}

}
