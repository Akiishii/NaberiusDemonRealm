package naberius.proxy;

import naberius.item.ItemBackpack;
import naberius.item.ItemCore;
import naberius.item.ItemIngot;
import naberius.item.ItemNugget;
import naberius.registry.ModBlocks;
import naberius.registry.ModEntities;
import naberius.registry.ModItems;
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
		
		ModelBakery.registerItemVariants(ModItems.INGOT, 
			new ResourceLocation("nta:ingot_titanium"),
			new ResourceLocation("nta:ingot_vibranium"),
			new ResourceLocation("nta:ingot_adamantium"),
			new ResourceLocation("nta:ingot_sirium"),
			new ResourceLocation("nta:ingot_demonic"),
			new ResourceLocation("nta:ingot_steel"),
			new ResourceLocation("nta:ingot_bronze"),
			new ResourceLocation("nta:ingot_silver"),
			new ResourceLocation("nta:ingot_tin"),
			new ResourceLocation("nta:ingot_copper")
		);
		
		ModelBakery.registerItemVariants(ModItems.CORE, 
				new ResourceLocation("nta:core_titanium"),
				new ResourceLocation("nta:core_vibranium"),
				new ResourceLocation("nta:core_adamantium"),
				new ResourceLocation("nta:core_sirium"),
				new ResourceLocation("nta:core_demonic"),
				new ResourceLocation("nta:core_steel"),
				new ResourceLocation("nta:core_bronze"),
				new ResourceLocation("nta:core_silver")
		);
		
		ModelBakery.registerItemVariants(ModItems.BACKPACK, 
				new ResourceLocation("nta:backpack_white"),
				new ResourceLocation("nta:backpack_green"),
				new ResourceLocation("nta:backpack_blue"),
				new ResourceLocation("nta:backpack_lime"),
				new ResourceLocation("nta:backpack_brown"),
				new ResourceLocation("nta:backpack_black"),
				new ResourceLocation("nta:backpack_red"),
				new ResourceLocation("nta:backpack_yellow"),
				new ResourceLocation("nta:backpack_pink"),
				new ResourceLocation("nta:backpack_gray"),
				new ResourceLocation("nta:backpack_light_blue"),
				new ResourceLocation("nta:backpack_light_gray"),
				new ResourceLocation("nta:backpack_purple"),
				new ResourceLocation("nta:backpack_cyan"),
				new ResourceLocation("nta:backpack_magenta")
		);
		
		ModelBakery.registerItemVariants(ModItems.NUGGET,
				new ResourceLocation("nta:nugget_titanium"),
				new ResourceLocation("nta:nugget_vibranium"),
				new ResourceLocation("nta:nugget_adamantium"),
				new ResourceLocation("nta:nugget_sirium"),
				new ResourceLocation("nta:nugget_demon"),
				new ResourceLocation("nta:nugget_silver"),
				new ResourceLocation("nta:nugget_steel"),
				new ResourceLocation("nta:nugget_bronze"),
				new ResourceLocation("nta:nugget_copper"),
				new ResourceLocation("nta:nugget_tin")
		);
		
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_TITANIUM, new ModelResourceLocation("nta:ingot_titanium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_VIBRANIUM, new ModelResourceLocation("nta:ingot_vibranium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_ADAMANTIUM, new ModelResourceLocation("nta:ingot_adamantium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_SIRIUM, new ModelResourceLocation("nta:ingot_sirium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_DEMONIC, new ModelResourceLocation("nta:ingot_demonic", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_STEEL, new ModelResourceLocation("nta:ingot_steel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_BRONZE, new ModelResourceLocation("nta:ingot_bronze", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_SILVER, new ModelResourceLocation("nta:ingot_silver", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_TIN, new ModelResourceLocation("nta:ingot_tin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_COPPER, new ModelResourceLocation("nta:ingot_copper", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.CORE, ItemCore.CORE_TITANIUM, new ModelResourceLocation("nta:core_titanium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.CORE, ItemCore.CORE_VIBRANIUM, new ModelResourceLocation("nta:core_vibranium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.CORE, ItemCore.CORE_ADAMANTIUM, new ModelResourceLocation("nta:core_adamantium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.CORE, ItemCore.CORE_SIRIUM, new ModelResourceLocation("nta:core_sirium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.CORE, ItemCore.CORE_DEMONIC, new ModelResourceLocation("nta:core_demonic", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.CORE, ItemCore.CORE_STEEL, new ModelResourceLocation("nta:core_steel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.CORE, ItemCore.CORE_BRONZE, new ModelResourceLocation("nta:core_bronze", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.CORE, ItemCore.CORE_SILVER, new ModelResourceLocation("nta:core_silver", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_TITANIUM, new ModelResourceLocation("nta:nugget_titanium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_VIBRANIUM, new ModelResourceLocation("nta:nugget_vibranium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_ADAMANTIUM, new ModelResourceLocation("nta:nugget_adamantium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_SIRIUM, new ModelResourceLocation("nta:nugget_sirium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_DEMON, new ModelResourceLocation("nta:nugget_demon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_SILVER, new ModelResourceLocation("nta:nugget_silver", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_STEEL, new ModelResourceLocation("nta:nugget_steel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_BRONZE, new ModelResourceLocation("nta:nugget_bronze", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_COPPER, new ModelResourceLocation("nta:nugget_copper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_TIN, new ModelResourceLocation("nta:nugget_tin", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.WHITE_BACKPACK, new ModelResourceLocation("nta:backpack_white", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.GREEN_BACKPACK, new ModelResourceLocation("nta:backpack_green", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.BLUE_BACKPACK, new ModelResourceLocation("nta:backpack_blue", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.LIME_BACKPACK, new ModelResourceLocation("nta:backpack_lime", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.BROWN_BACKPACK, new ModelResourceLocation("nta:backpack_brown", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.BLACK_BACKPACK, new ModelResourceLocation("nta:backpack_black", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.RED_BACKPACK, new ModelResourceLocation("nta:backpack_red", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.YELLOW_BACKPACK, new ModelResourceLocation("nta:backpack_yellow", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.PINK_BACKPACK, new ModelResourceLocation("nta:backpack_pink", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.GRAY_BACKPACK, new ModelResourceLocation("nta:backpack_gray", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.LIGHT_BLUE_BACKPACK, new ModelResourceLocation("nta:backpack_light_blue", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.LIGHT_GRAY_BACKPACK, new ModelResourceLocation("nta:backpack_light_gray", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.PURPLE_BACKPACK, new ModelResourceLocation("nta:backpack_purple", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.CYAN_BACKPACK, new ModelResourceLocation("nta:backpack_cyan", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.MAGENTA_BACKPACK, new ModelResourceLocation("nta:backpack_magenta", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.DEMON_FLESH, 0, new ModelResourceLocation("nta:demon_flesh", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.MANUAL, 0, new ModelResourceLocation("nta:nta_manual", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.TITANIUM_AXE, 0, new ModelResourceLocation("nta:titanium_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.VIBRANIUM_AXE, 0, new ModelResourceLocation("nta:vibranium_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.ADAMANTIUM_AXE, 0, new ModelResourceLocation("nta:adamantium_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SIRIUM_AXE, 0, new ModelResourceLocation("nta:sirium_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.DEMONIC_AXE, 0, new ModelResourceLocation("nta:demonic_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.STEEL_AXE, 0, new ModelResourceLocation("nta:steel_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BRONZE_AXE, 0, new ModelResourceLocation("nta:bronze_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SILVER_AXE, 0, new ModelResourceLocation("nta:silver_axe", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.TITANIUM_HOE, 0, new ModelResourceLocation("nta:titanium_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.VIBRANIUM_HOE, 0, new ModelResourceLocation("nta:vibranium_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.ADAMANTIUM_HOE, 0, new ModelResourceLocation("nta:adamantium_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SIRIUM_HOE, 0, new ModelResourceLocation("nta:sirium_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.DEMONIC_HOE, 0, new ModelResourceLocation("nta:demonic_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.STEEL_HOE, 0, new ModelResourceLocation("nta:steel_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BRONZE_HOE, 0, new ModelResourceLocation("nta:bronze_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SILVER_HOE, 0, new ModelResourceLocation("nta:silver_hoe", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.TITANIUM_PICKAXE, 0, new ModelResourceLocation("nta:titanium_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.VIBRANIUM_PICKAXE, 0, new ModelResourceLocation("nta:vibranium_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.ADAMANTIUM_PICKAXE, 0, new ModelResourceLocation("nta:adamantium_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SIRIUM_PICKAXE, 0, new ModelResourceLocation("nta:sirium_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.DEMONIC_PICKAXE, 0, new ModelResourceLocation("nta:demonic_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.STEEL_PICKAXE, 0, new ModelResourceLocation("nta:steel_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BRONZE_PICKAXE, 0, new ModelResourceLocation("nta:bronze_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SILVER_PICKAXE, 0, new ModelResourceLocation("nta:silver_pickaxe", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.TITANIUM_SHOVEL, 0, new ModelResourceLocation("nta:titanium_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.VIBRANIUM_SHOVEL, 0, new ModelResourceLocation("nta:vibranium_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.ADAMANTIUM_SHOVEL, 0, new ModelResourceLocation("nta:adamantium_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SIRIUM_SHOVEL, 0, new ModelResourceLocation("nta:sirium_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.DEMONIC_SHOVEL, 0, new ModelResourceLocation("nta:demonic_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.STEEL_SHOVEL, 0, new ModelResourceLocation("nta:steel_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BRONZE_SHOVEL, 0, new ModelResourceLocation("nta:bronze_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SILVER_SHOVEL, 0, new ModelResourceLocation("nta:silver_shovel", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.TITANIUM_SWORD, 0, new ModelResourceLocation("nta:titanium_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.VIBRANIUM_SWORD, 0, new ModelResourceLocation("nta:vibranium_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.ADAMANTIUM_SWORD, 0, new ModelResourceLocation("nta:adamantium_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SIRIUM_SWORD, 0, new ModelResourceLocation("nta:sirium_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.DEMONIC_SWORD, 0, new ModelResourceLocation("nta:demonic_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.STEEL_SWORD, 0, new ModelResourceLocation("nta:steel_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BRONZE_SWORD, 0, new ModelResourceLocation("nta:bronze_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SILVER_SWORD, 0, new ModelResourceLocation("nta:silver_sword", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.TITANIUM_HAMMER, 0, new ModelResourceLocation("nta:titanium_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.VIBRANIUM_HAMMER, 0, new ModelResourceLocation("nta:vibranium_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.ADAMANTIUM_HAMMER, 0, new ModelResourceLocation("nta:adamantium_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SIRIUM_HAMMER, 0, new ModelResourceLocation("nta:sirium_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.DEMONIC_HAMMER, 0, new ModelResourceLocation("nta:demonic_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.STEEL_HAMMER, 0, new ModelResourceLocation("nta:steel_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BRONZE_HAMMER, 0, new ModelResourceLocation("nta:bronze_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SILVER_HAMMER, 0, new ModelResourceLocation("nta:silver_hammer", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.TITANIUM_EXCAVATOR, 0, new ModelResourceLocation("nta:titanium_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.VIBRANIUM_EXCAVATOR, 0, new ModelResourceLocation("nta:vibranium_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.ADAMANTIUM_EXCAVATOR, 0, new ModelResourceLocation("nta:adamantium_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SIRIUM_EXCAVATOR, 0, new ModelResourceLocation("nta:sirium_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.DEMONIC_EXCAVATOR, 0, new ModelResourceLocation("nta:demonic_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.STEEL_EXCAVATOR, 0, new ModelResourceLocation("nta:steel_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BRONZE_EXCAVATOR, 0, new ModelResourceLocation("nta:bronze_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SILVER_EXCAVATOR, 0, new ModelResourceLocation("nta:silver_excavator", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.BLOCK_DEMON_DIRT), 0, new ModelResourceLocation("nta:block_demon_dirt", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.BLOCK_DEMON_STONE), 0, new ModelResourceLocation("nta:block_demon_stone", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.ORE_TITANIUM), 0, new ModelResourceLocation("nta:ore_titanium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.ORE_VIBRANIUM), 0, new ModelResourceLocation("nta:ore_vibranium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.ORE_ADAMANTIUM), 0, new ModelResourceLocation("nta:ore_adamantium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.ORE_SIRIUM), 0, new ModelResourceLocation("nta:ore_sirium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.ORE_SILVER), 0, new ModelResourceLocation("nta:ore_silver", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.ORE_COPPER), 0, new ModelResourceLocation("nta:ore_copper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.ORE_TIN), 0, new ModelResourceLocation("nta:ore_tin", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_TITANIUM), 0, new ModelResourceLocation("nta:metal_titanium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_VIBRANIUM), 0, new ModelResourceLocation("nta:metal_vibranium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_ADAMANTIUM), 0, new ModelResourceLocation("nta:metal_adamantium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_SIRIUM), 0, new ModelResourceLocation("nta:metal_sirium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_DEMON), 0, new ModelResourceLocation("nta:metal_demon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_SILVER), 0, new ModelResourceLocation("nta:metal_silver", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_STEEL), 0, new ModelResourceLocation("nta:metal_steel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_BRONZE), 0, new ModelResourceLocation("nta:metal_bronze", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_COPPER), 0, new ModelResourceLocation("nta:metal_copper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_TIN), 0, new ModelResourceLocation("nta:metal_tin", "inventory"));
		
		ModEntities.initModels();
		
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
