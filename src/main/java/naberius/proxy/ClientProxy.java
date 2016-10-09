package naberius.proxy;

import naberius.init.BlockRegistry;
import naberius.init.EntityRegister;
import naberius.init.ItemRegistry;
import naberius.item.ItemBackpack;
import naberius.item.ItemCore;
import naberius.item.armor.ItemAdamantiumArmor;
import naberius.item.armor.ItemBronzeArmor;
import naberius.item.armor.ItemDemonicArmor;
import naberius.item.armor.ItemSiriumArmor;
import naberius.item.armor.ItemSteelArmor;
import naberius.item.material.ItemIngot;
import naberius.item.material.ItemNugget;
import naberius.item.material.ItemPlate;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	@Override
	public void preInit(FMLPreInitializationEvent e){
		super.preInit(e);
		
		ModelBakery.registerItemVariants(ItemRegistry.INGOT, 
			new ResourceLocation("naberius:ingot_titanium"),
			new ResourceLocation("naberius:ingot_vibranium"),
			new ResourceLocation("naberius:ingot_adamantium"),
			new ResourceLocation("naberius:ingot_sirium"),
			new ResourceLocation("naberius:ingot_demonic"),
			new ResourceLocation("naberius:ingot_steel"),
			new ResourceLocation("naberius:ingot_bronze"),
			new ResourceLocation("naberius:ingot_silver"),
			new ResourceLocation("naberius:ingot_tin"),
			new ResourceLocation("naberius:ingot_copper")
		);
		
		ModelBakery.registerItemVariants(ItemRegistry.CORE, 
				new ResourceLocation("naberius:core_titanium"),
				new ResourceLocation("naberius:core_vibranium"),
				new ResourceLocation("naberius:core_adamantium"),
				new ResourceLocation("naberius:core_sirium"),
				new ResourceLocation("naberius:core_demonic"),
				new ResourceLocation("naberius:core_steel"),
				new ResourceLocation("naberius:core_bronze"),
				new ResourceLocation("naberius:core_silver")
		);
		
		ModelBakery.registerItemVariants(ItemRegistry.NUGGET,
				new ResourceLocation("naberius:nugget_titanium"),
				new ResourceLocation("naberius:nugget_vibranium"),
				new ResourceLocation("naberius:nugget_adamantium"),
				new ResourceLocation("naberius:nugget_sirium"),
				new ResourceLocation("naberius:nugget_demon"),
				new ResourceLocation("naberius:nugget_silver"),
				new ResourceLocation("naberius:nugget_steel"),
				new ResourceLocation("naberius:nugget_bronze"),
				new ResourceLocation("naberius:nugget_copper"),
				new ResourceLocation("naberius:nugget_tin")
		);
		
		ModelBakery.registerItemVariants(ItemRegistry.PLATE,
				new ResourceLocation("naberius:plate_titanium"),
				new ResourceLocation("naberius:plate_vibranium"),
				new ResourceLocation("naberius:plate_adamantium"),
				new ResourceLocation("naberius:plate_sirium"),
				new ResourceLocation("naberius:plate_demon"),
				new ResourceLocation("naberius:plate_silver"),
				new ResourceLocation("naberius:plate_steel"),
				new ResourceLocation("naberius:plate_bronze"),
				new ResourceLocation("naberius:plate_copper"),
				new ResourceLocation("naberius:plate_tin")
		);
		
		ModelBakery.registerItemVariants(ItemRegistry.BACKPACK, 
				new ResourceLocation("naberius:backpack_white"),
				new ResourceLocation("naberius:backpack_green"),
				new ResourceLocation("naberius:backpack_blue"),
				new ResourceLocation("naberius:backpack_lime"),
				new ResourceLocation("naberius:backpack_brown"),
				new ResourceLocation("naberius:backpack_black"),
				new ResourceLocation("naberius:backpack_red"),
				new ResourceLocation("naberius:backpack_yellow"),
				new ResourceLocation("naberius:backpack_pink"),
				new ResourceLocation("naberius:backpack_gray"),
				new ResourceLocation("naberius:backpack_light_blue"),
				new ResourceLocation("naberius:backpack_light_gray"),
				new ResourceLocation("naberius:backpack_purple"),
				new ResourceLocation("naberius:backpack_cyan"),
				new ResourceLocation("naberius:backpack_magenta")
		);
	
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.INGOT, ItemIngot.INGOT_TITANIUM, new ModelResourceLocation("naberius:ingot_titanium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.INGOT, ItemIngot.INGOT_VIBRANIUM, new ModelResourceLocation("naberius:ingot_vibranium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.INGOT, ItemIngot.INGOT_ADAMANTIUM, new ModelResourceLocation("naberius:ingot_adamantium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.INGOT, ItemIngot.INGOT_SIRIUM, new ModelResourceLocation("naberius:ingot_sirium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.INGOT, ItemIngot.INGOT_DEMONIC, new ModelResourceLocation("naberius:ingot_demonic", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.INGOT, ItemIngot.INGOT_STEEL, new ModelResourceLocation("naberius:ingot_steel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.INGOT, ItemIngot.INGOT_BRONZE, new ModelResourceLocation("naberius:ingot_bronze", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.INGOT, ItemIngot.INGOT_SILVER, new ModelResourceLocation("naberius:ingot_silver", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.INGOT, ItemIngot.INGOT_TIN, new ModelResourceLocation("naberius:ingot_tin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.INGOT, ItemIngot.INGOT_COPPER, new ModelResourceLocation("naberius:ingot_copper", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.CORE, ItemCore.CORE_TITANIUM, new ModelResourceLocation("naberius:core_titanium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.CORE, ItemCore.CORE_VIBRANIUM, new ModelResourceLocation("naberius:core_vibranium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.CORE, ItemCore.CORE_ADAMANTIUM, new ModelResourceLocation("naberius:core_adamantium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.CORE, ItemCore.CORE_SIRIUM, new ModelResourceLocation("naberius:core_sirium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.CORE, ItemCore.CORE_DEMONIC, new ModelResourceLocation("naberius:core_demonic", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.CORE, ItemCore.CORE_STEEL, new ModelResourceLocation("naberius:core_steel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.CORE, ItemCore.CORE_BRONZE, new ModelResourceLocation("naberius:core_bronze", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.CORE, ItemCore.CORE_SILVER, new ModelResourceLocation("naberius:core_silver", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.NUGGET, ItemNugget.NUGGET_TITANIUM, new ModelResourceLocation("naberius:nugget_titanium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.NUGGET, ItemNugget.NUGGET_VIBRANIUM, new ModelResourceLocation("naberius:nugget_vibranium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.NUGGET, ItemNugget.NUGGET_ADAMANTIUM, new ModelResourceLocation("naberius:nugget_adamantium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.NUGGET, ItemNugget.NUGGET_SIRIUM, new ModelResourceLocation("naberius:nugget_sirium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.NUGGET, ItemNugget.NUGGET_DEMON, new ModelResourceLocation("naberius:nugget_demon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.NUGGET, ItemNugget.NUGGET_SILVER, new ModelResourceLocation("naberius:nugget_silver", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.NUGGET, ItemNugget.NUGGET_STEEL, new ModelResourceLocation("naberius:nugget_steel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.NUGGET, ItemNugget.NUGGET_BRONZE, new ModelResourceLocation("naberius:nugget_bronze", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.NUGGET, ItemNugget.NUGGET_COPPER, new ModelResourceLocation("naberius:nugget_copper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.NUGGET, ItemNugget.NUGGET_TIN, new ModelResourceLocation("naberius:nugget_tin", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.PLATE, ItemPlate.PLATE_TITANIUM, new ModelResourceLocation("naberius:plate_titanium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.PLATE, ItemPlate.PLATE_VIBRANIUM, new ModelResourceLocation("naberius:plate_vibranium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.PLATE, ItemPlate.PLATE_ADAMANTIUM, new ModelResourceLocation("naberius:plate_adamantium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.PLATE, ItemPlate.PLATE_SIRIUM, new ModelResourceLocation("naberius:plate_sirium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.PLATE, ItemPlate.PLATE_DEMONIC, new ModelResourceLocation("naberius:plate_demon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.PLATE, ItemPlate.PLATE_SILVER, new ModelResourceLocation("naberius:plate_silver", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.PLATE, ItemPlate.PLATE_STEEL, new ModelResourceLocation("naberius:plate_steel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.PLATE, ItemPlate.PLATE_BRONZE, new ModelResourceLocation("naberius:plate_bronze", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.PLATE, ItemPlate.PLATE_COPPER, new ModelResourceLocation("naberius:plate_copper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.PLATE, ItemPlate.PLATE_TIN, new ModelResourceLocation("naberius:plate_tin", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BACKPACK, ItemBackpack.WHITE_BACKPACK, new ModelResourceLocation("naberius:backpack_white", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BACKPACK, ItemBackpack.GREEN_BACKPACK, new ModelResourceLocation("naberius:backpack_green", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BACKPACK, ItemBackpack.BLUE_BACKPACK, new ModelResourceLocation("naberius:backpack_blue", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BACKPACK, ItemBackpack.LIME_BACKPACK, new ModelResourceLocation("naberius:backpack_lime", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BACKPACK, ItemBackpack.BROWN_BACKPACK, new ModelResourceLocation("naberius:backpack_brown", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BACKPACK, ItemBackpack.BLACK_BACKPACK, new ModelResourceLocation("naberius:backpack_black", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BACKPACK, ItemBackpack.RED_BACKPACK, new ModelResourceLocation("naberius:backpack_red", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BACKPACK, ItemBackpack.YELLOW_BACKPACK, new ModelResourceLocation("naberius:backpack_yellow", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BACKPACK, ItemBackpack.PINK_BACKPACK, new ModelResourceLocation("naberius:backpack_pink", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BACKPACK, ItemBackpack.GRAY_BACKPACK, new ModelResourceLocation("naberius:backpack_gray", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BACKPACK, ItemBackpack.LIGHT_BLUE_BACKPACK, new ModelResourceLocation("naberius:backpack_light_blue", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BACKPACK, ItemBackpack.LIGHT_GRAY_BACKPACK, new ModelResourceLocation("naberius:backpack_light_gray", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BACKPACK, ItemBackpack.PURPLE_BACKPACK, new ModelResourceLocation("naberius:backpack_purple", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BACKPACK, ItemBackpack.CYAN_BACKPACK, new ModelResourceLocation("naberius:backpack_cyan", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BACKPACK, ItemBackpack.MAGENTA_BACKPACK, new ModelResourceLocation("naberius:backpack_magenta", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.HOLY_WATER, 0, new ModelResourceLocation("naberius:holy_water", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.DEMON_FLESH, 0, new ModelResourceLocation("naberius:demon_flesh", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.DEMON_PEARL, 0, new ModelResourceLocation("naberius:demon_pearl", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.DEMON_EYE, 0, new ModelResourceLocation("naberius:demon_eye", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.MANUAL, 0, new ModelResourceLocation("naberius:naberius_manual", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.DEMONIC_STONE, 0, new ModelResourceLocation("naberius:demonic_stone", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.CORRUPTED_DEMON_PORTER, 0, new ModelResourceLocation("naberius:corrupted_demon_porter", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.CLEANSED_DEMON_PORTER, 0, new ModelResourceLocation("naberius:cleansed_demon_porter", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.TITANIUM_AXE, 0, new ModelResourceLocation("naberius:titanium_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.VIBRANIUM_AXE, 0, new ModelResourceLocation("naberius:vibranium_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.ADAMANTIUM_AXE, 0, new ModelResourceLocation("naberius:adamantium_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.SIRIUM_AXE, 0, new ModelResourceLocation("naberius:sirium_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.DEMONIC_AXE, 0, new ModelResourceLocation("naberius:demonic_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.STEEL_AXE, 0, new ModelResourceLocation("naberius:steel_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BRONZE_AXE, 0, new ModelResourceLocation("naberius:bronze_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.SILVER_AXE, 0, new ModelResourceLocation("naberius:silver_axe", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.TITANIUM_HOE, 0, new ModelResourceLocation("naberius:titanium_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.VIBRANIUM_HOE, 0, new ModelResourceLocation("naberius:vibranium_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.ADAMANTIUM_HOE, 0, new ModelResourceLocation("naberius:adamantium_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.SIRIUM_HOE, 0, new ModelResourceLocation("naberius:sirium_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.DEMONIC_HOE, 0, new ModelResourceLocation("naberius:demonic_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.STEEL_HOE, 0, new ModelResourceLocation("naberius:steel_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BRONZE_HOE, 0, new ModelResourceLocation("naberius:bronze_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.SILVER_HOE, 0, new ModelResourceLocation("naberius:silver_hoe", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.TITANIUM_PICKAXE, 0, new ModelResourceLocation("naberius:titanium_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.VIBRANIUM_PICKAXE, 0, new ModelResourceLocation("naberius:vibranium_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.ADAMANTIUM_PICKAXE, 0, new ModelResourceLocation("naberius:adamantium_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.SIRIUM_PICKAXE, 0, new ModelResourceLocation("naberius:sirium_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.DEMONIC_PICKAXE, 0, new ModelResourceLocation("naberius:demonic_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.STEEL_PICKAXE, 0, new ModelResourceLocation("naberius:steel_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BRONZE_PICKAXE, 0, new ModelResourceLocation("naberius:bronze_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.SILVER_PICKAXE, 0, new ModelResourceLocation("naberius:silver_pickaxe", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.TITANIUM_SHOVEL, 0, new ModelResourceLocation("naberius:titanium_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.VIBRANIUM_SHOVEL, 0, new ModelResourceLocation("naberius:vibranium_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.ADAMANTIUM_SHOVEL, 0, new ModelResourceLocation("naberius:adamantium_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.SIRIUM_SHOVEL, 0, new ModelResourceLocation("naberius:sirium_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.DEMONIC_SHOVEL, 0, new ModelResourceLocation("naberius:demonic_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.STEEL_SHOVEL, 0, new ModelResourceLocation("naberius:steel_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BRONZE_SHOVEL, 0, new ModelResourceLocation("naberius:bronze_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.SILVER_SHOVEL, 0, new ModelResourceLocation("naberius:silver_shovel", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.TITANIUM_SWORD, 0, new ModelResourceLocation("naberius:titanium_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.VIBRANIUM_SWORD, 0, new ModelResourceLocation("naberius:vibranium_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.ADAMANTIUM_SWORD, 0, new ModelResourceLocation("naberius:adamantium_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.SIRIUM_SWORD, 0, new ModelResourceLocation("naberius:sirium_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.DEMONIC_SWORD, 0, new ModelResourceLocation("naberius:demonic_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.STEEL_SWORD, 0, new ModelResourceLocation("naberius:steel_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BRONZE_SWORD, 0, new ModelResourceLocation("naberius:bronze_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.SILVER_SWORD, 0, new ModelResourceLocation("naberius:silver_sword", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.TITANIUM_HAMMER, 0, new ModelResourceLocation("naberius:titanium_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.VIBRANIUM_HAMMER, 0, new ModelResourceLocation("naberius:vibranium_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.ADAMANTIUM_HAMMER, 0, new ModelResourceLocation("naberius:adamantium_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.SIRIUM_HAMMER, 0, new ModelResourceLocation("naberius:sirium_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.DEMONIC_HAMMER, 0, new ModelResourceLocation("naberius:demonic_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.STEEL_HAMMER, 0, new ModelResourceLocation("naberius:steel_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BRONZE_HAMMER, 0, new ModelResourceLocation("naberius:bronze_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.SILVER_HAMMER, 0, new ModelResourceLocation("naberius:silver_hammer", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.TITANIUM_EXCAVATOR, 0, new ModelResourceLocation("naberius:titanium_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.VIBRANIUM_EXCAVATOR, 0, new ModelResourceLocation("naberius:vibranium_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.ADAMANTIUM_EXCAVATOR, 0, new ModelResourceLocation("naberius:adamantium_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.SIRIUM_EXCAVATOR, 0, new ModelResourceLocation("naberius:sirium_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.DEMONIC_EXCAVATOR, 0, new ModelResourceLocation("naberius:demonic_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.STEEL_EXCAVATOR, 0, new ModelResourceLocation("naberius:steel_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.BRONZE_EXCAVATOR, 0, new ModelResourceLocation("naberius:bronze_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.SILVER_EXCAVATOR, 0, new ModelResourceLocation("naberius:silver_excavator", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemRegistry.HAMMER, 0, new ModelResourceLocation("naberius:hammer", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemBronzeArmor.bronze_helmet, 0, new ModelResourceLocation("naberius:bronze_helmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemBronzeArmor.bronze_chest, 0, new ModelResourceLocation("naberius:bronze_chest", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemBronzeArmor.bronze_leggs, 0, new ModelResourceLocation("naberius:bronze_leggs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemBronzeArmor.bronze_boots, 0, new ModelResourceLocation("naberius:bronze_boots", "inventory"));

		ModelLoader.setCustomModelResourceLocation(ItemSteelArmor.steel_helmet, 0, new ModelResourceLocation("naberius:steel_helmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemSteelArmor.steel_chest, 0, new ModelResourceLocation("naberius:steel_chest", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemSteelArmor.steel_leggs, 0, new ModelResourceLocation("naberius:steel_leggs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemSteelArmor.steel_boots, 0, new ModelResourceLocation("naberius:steel_boots", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemAdamantiumArmor.adamantium_helmet, 0, new ModelResourceLocation("naberius:adamantium_helmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemAdamantiumArmor.adamantium_chest, 0, new ModelResourceLocation("naberius:adamantium_chest", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemAdamantiumArmor.adamantium_leggs, 0, new ModelResourceLocation("naberius:adamantium_leggs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemAdamantiumArmor.adamantium_boots, 0, new ModelResourceLocation("naberius:adamantium_boots", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemSiriumArmor.sirium_helmet, 0, new ModelResourceLocation("naberius:sirium_helmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemSiriumArmor.sirium_chest, 0, new ModelResourceLocation("naberius:sirium_chest", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemSiriumArmor.sirium_leggs, 0, new ModelResourceLocation("naberius:sirium_leggs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemSiriumArmor.sirium_boots, 0, new ModelResourceLocation("naberius:sirium_boots", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ItemDemonicArmor.demonic_helmet, 0, new ModelResourceLocation("naberius:demonic_helmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemDemonicArmor.demonic_chest, 0, new ModelResourceLocation("naberius:demonic_chest", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemDemonicArmor.demonic_leggs, 0, new ModelResourceLocation("naberius:demonic_leggs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ItemDemonicArmor.demonic_boots, 0, new ModelResourceLocation("naberius:demonic_boots", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.BLOCK_DEMON_DIRT), 0, new ModelResourceLocation("naberius:block_demon_dirt", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.BLOCK_DEMON_STONE), 0, new ModelResourceLocation("naberius:block_demon_stone", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.HELL_FORGE), 0, new ModelResourceLocation("naberius:HellForge", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.ORE_TITANIUM), 0, new ModelResourceLocation("naberius:ore_titanium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.ORE_VIBRANIUM), 0, new ModelResourceLocation("naberius:ore_vibranium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.ORE_ADAMANTIUM), 0, new ModelResourceLocation("naberius:ore_adamantium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.ORE_SIRIUM), 0, new ModelResourceLocation("naberius:ore_sirium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.ORE_SILVER), 0, new ModelResourceLocation("naberius:ore_silver", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.ORE_COPPER), 0, new ModelResourceLocation("naberius:ore_copper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.ORE_TIN), 0, new ModelResourceLocation("naberius:ore_tin", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.METAL_TITANIUM), 0, new ModelResourceLocation("naberius:metal_titanium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.METAL_VIBRANIUM), 0, new ModelResourceLocation("naberius:metal_vibranium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.METAL_ADAMANTIUM), 0, new ModelResourceLocation("naberius:metal_adamantium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.METAL_SIRIUM), 0, new ModelResourceLocation("naberius:metal_sirium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.METAL_DEMON), 0, new ModelResourceLocation("naberius:metal_demon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.METAL_SILVER), 0, new ModelResourceLocation("naberius:metal_silver", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.METAL_STEEL), 0, new ModelResourceLocation("naberius:metal_steel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.METAL_BRONZE), 0, new ModelResourceLocation("naberius:metal_bronze", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.METAL_COPPER), 0, new ModelResourceLocation("naberius:metal_copper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockRegistry.METAL_TIN), 0, new ModelResourceLocation("naberius:metal_tin", "inventory"));
		
		EntityRegister.initModels();
		
	}
	
	@Override
	public void init(FMLInitializationEvent e){
		super.init(e);
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent e){
		super.postInit(e);
	}
	
}
