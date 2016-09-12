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
		
		ModelBakery.registerItemVariants(ModItems.CORE, 
				new ResourceLocation("naberius:core_titanium"),
				new ResourceLocation("naberius:core_vibranium"),
				new ResourceLocation("naberius:core_adamantium"),
				new ResourceLocation("naberius:core_sirium"),
				new ResourceLocation("naberius:core_demonic"),
				new ResourceLocation("naberius:core_steel"),
				new ResourceLocation("naberius:core_bronze"),
				new ResourceLocation("naberius:core_silver")
		);
		
		ModelBakery.registerItemVariants(ModItems.BACKPACK, 
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
		
		ModelBakery.registerItemVariants(ModItems.NUGGET,
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
		
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_TITANIUM, new ModelResourceLocation("naberius:ingot_titanium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_VIBRANIUM, new ModelResourceLocation("naberius:ingot_vibranium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_ADAMANTIUM, new ModelResourceLocation("naberius:ingot_adamantium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_SIRIUM, new ModelResourceLocation("naberius:ingot_sirium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_DEMONIC, new ModelResourceLocation("naberius:ingot_demonic", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_STEEL, new ModelResourceLocation("naberius:ingot_steel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_BRONZE, new ModelResourceLocation("naberius:ingot_bronze", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_SILVER, new ModelResourceLocation("naberius:ingot_silver", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_TIN, new ModelResourceLocation("naberius:ingot_tin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.INGOT, ItemIngot.INGOT_COPPER, new ModelResourceLocation("naberius:ingot_copper", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.CORE, ItemCore.CORE_TITANIUM, new ModelResourceLocation("naberius:core_titanium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.CORE, ItemCore.CORE_VIBRANIUM, new ModelResourceLocation("naberius:core_vibranium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.CORE, ItemCore.CORE_ADAMANTIUM, new ModelResourceLocation("naberius:core_adamantium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.CORE, ItemCore.CORE_SIRIUM, new ModelResourceLocation("naberius:core_sirium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.CORE, ItemCore.CORE_DEMONIC, new ModelResourceLocation("naberius:core_demonic", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.CORE, ItemCore.CORE_STEEL, new ModelResourceLocation("naberius:core_steel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.CORE, ItemCore.CORE_BRONZE, new ModelResourceLocation("naberius:core_bronze", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.CORE, ItemCore.CORE_SILVER, new ModelResourceLocation("naberius:core_silver", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_TITANIUM, new ModelResourceLocation("naberius:nugget_titanium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_VIBRANIUM, new ModelResourceLocation("naberius:nugget_vibranium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_ADAMANTIUM, new ModelResourceLocation("naberius:nugget_adamantium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_SIRIUM, new ModelResourceLocation("naberius:nugget_sirium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_DEMON, new ModelResourceLocation("naberius:nugget_demon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_SILVER, new ModelResourceLocation("naberius:nugget_silver", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_STEEL, new ModelResourceLocation("naberius:nugget_steel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_BRONZE, new ModelResourceLocation("naberius:nugget_bronze", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_COPPER, new ModelResourceLocation("naberius:nugget_copper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.NUGGET, ItemNugget.NUGGET_TIN, new ModelResourceLocation("naberius:nugget_tin", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.WHITE_BACKPACK, new ModelResourceLocation("naberius:backpack_white", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.GREEN_BACKPACK, new ModelResourceLocation("naberius:backpack_green", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.BLUE_BACKPACK, new ModelResourceLocation("naberius:backpack_blue", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.LIME_BACKPACK, new ModelResourceLocation("naberius:backpack_lime", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.BROWN_BACKPACK, new ModelResourceLocation("naberius:backpack_brown", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.BLACK_BACKPACK, new ModelResourceLocation("naberius:backpack_black", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.RED_BACKPACK, new ModelResourceLocation("naberius:backpack_red", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.YELLOW_BACKPACK, new ModelResourceLocation("naberius:backpack_yellow", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.PINK_BACKPACK, new ModelResourceLocation("naberius:backpack_pink", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.GRAY_BACKPACK, new ModelResourceLocation("naberius:backpack_gray", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.LIGHT_BLUE_BACKPACK, new ModelResourceLocation("naberius:backpack_light_blue", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.LIGHT_GRAY_BACKPACK, new ModelResourceLocation("naberius:backpack_light_gray", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.PURPLE_BACKPACK, new ModelResourceLocation("naberius:backpack_purple", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.CYAN_BACKPACK, new ModelResourceLocation("naberius:backpack_cyan", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BACKPACK, ItemBackpack.MAGENTA_BACKPACK, new ModelResourceLocation("naberius:backpack_magenta", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.DEMON_FLESH, 0, new ModelResourceLocation("naberius:demon_flesh", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.MANUAL, 0, new ModelResourceLocation("naberius:naberius_manual", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.TITANIUM_AXE, 0, new ModelResourceLocation("naberius:titanium_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.VIBRANIUM_AXE, 0, new ModelResourceLocation("naberius:vibranium_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.ADAMANTIUM_AXE, 0, new ModelResourceLocation("naberius:adamantium_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SIRIUM_AXE, 0, new ModelResourceLocation("naberius:sirium_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.DEMONIC_AXE, 0, new ModelResourceLocation("naberius:demonic_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.STEEL_AXE, 0, new ModelResourceLocation("naberius:steel_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BRONZE_AXE, 0, new ModelResourceLocation("naberius:bronze_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SILVER_AXE, 0, new ModelResourceLocation("naberius:silver_axe", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.TITANIUM_HOE, 0, new ModelResourceLocation("naberius:titanium_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.VIBRANIUM_HOE, 0, new ModelResourceLocation("naberius:vibranium_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.ADAMANTIUM_HOE, 0, new ModelResourceLocation("naberius:adamantium_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SIRIUM_HOE, 0, new ModelResourceLocation("naberius:sirium_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.DEMONIC_HOE, 0, new ModelResourceLocation("naberius:demonic_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.STEEL_HOE, 0, new ModelResourceLocation("naberius:steel_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BRONZE_HOE, 0, new ModelResourceLocation("naberius:bronze_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SILVER_HOE, 0, new ModelResourceLocation("naberius:silver_hoe", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.TITANIUM_PICKAXE, 0, new ModelResourceLocation("naberius:titanium_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.VIBRANIUM_PICKAXE, 0, new ModelResourceLocation("naberius:vibranium_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.ADAMANTIUM_PICKAXE, 0, new ModelResourceLocation("naberius:adamantium_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SIRIUM_PICKAXE, 0, new ModelResourceLocation("naberius:sirium_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.DEMONIC_PICKAXE, 0, new ModelResourceLocation("naberius:demonic_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.STEEL_PICKAXE, 0, new ModelResourceLocation("naberius:steel_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BRONZE_PICKAXE, 0, new ModelResourceLocation("naberius:bronze_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SILVER_PICKAXE, 0, new ModelResourceLocation("naberius:silver_pickaxe", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.TITANIUM_SHOVEL, 0, new ModelResourceLocation("naberius:titanium_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.VIBRANIUM_SHOVEL, 0, new ModelResourceLocation("naberius:vibranium_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.ADAMANTIUM_SHOVEL, 0, new ModelResourceLocation("naberius:adamantium_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SIRIUM_SHOVEL, 0, new ModelResourceLocation("naberius:sirium_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.DEMONIC_SHOVEL, 0, new ModelResourceLocation("naberius:demonic_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.STEEL_SHOVEL, 0, new ModelResourceLocation("naberius:steel_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BRONZE_SHOVEL, 0, new ModelResourceLocation("naberius:bronze_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SILVER_SHOVEL, 0, new ModelResourceLocation("naberius:silver_shovel", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.TITANIUM_SWORD, 0, new ModelResourceLocation("naberius:titanium_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.VIBRANIUM_SWORD, 0, new ModelResourceLocation("naberius:vibranium_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.ADAMANTIUM_SWORD, 0, new ModelResourceLocation("naberius:adamantium_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SIRIUM_SWORD, 0, new ModelResourceLocation("naberius:sirium_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.DEMONIC_SWORD, 0, new ModelResourceLocation("naberius:demonic_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.STEEL_SWORD, 0, new ModelResourceLocation("naberius:steel_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BRONZE_SWORD, 0, new ModelResourceLocation("naberius:bronze_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SILVER_SWORD, 0, new ModelResourceLocation("naberius:silver_sword", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.TITANIUM_HAMMER, 0, new ModelResourceLocation("naberius:titanium_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.VIBRANIUM_HAMMER, 0, new ModelResourceLocation("naberius:vibranium_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.ADAMANTIUM_HAMMER, 0, new ModelResourceLocation("naberius:adamantium_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SIRIUM_HAMMER, 0, new ModelResourceLocation("naberius:sirium_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.DEMONIC_HAMMER, 0, new ModelResourceLocation("naberius:demonic_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.STEEL_HAMMER, 0, new ModelResourceLocation("naberius:steel_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BRONZE_HAMMER, 0, new ModelResourceLocation("naberius:bronze_hammer", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SILVER_HAMMER, 0, new ModelResourceLocation("naberius:silver_hammer", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(ModItems.TITANIUM_EXCAVATOR, 0, new ModelResourceLocation("naberius:titanium_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.VIBRANIUM_EXCAVATOR, 0, new ModelResourceLocation("naberius:vibranium_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.ADAMANTIUM_EXCAVATOR, 0, new ModelResourceLocation("naberius:adamantium_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SIRIUM_EXCAVATOR, 0, new ModelResourceLocation("naberius:sirium_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.DEMONIC_EXCAVATOR, 0, new ModelResourceLocation("naberius:demonic_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.STEEL_EXCAVATOR, 0, new ModelResourceLocation("naberius:steel_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.BRONZE_EXCAVATOR, 0, new ModelResourceLocation("naberius:bronze_excavator", "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModItems.SILVER_EXCAVATOR, 0, new ModelResourceLocation("naberius:silver_excavator", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.BLOCK_DEMON_DIRT), 0, new ModelResourceLocation("naberius:block_demon_dirt", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.BLOCK_DEMON_STONE), 0, new ModelResourceLocation("naberius:block_demon_stone", "inventory"));

		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.ORE_TITANIUM), 0, new ModelResourceLocation("naberius:ore_titanium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.ORE_VIBRANIUM), 0, new ModelResourceLocation("naberius:ore_vibranium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.ORE_ADAMANTIUM), 0, new ModelResourceLocation("naberius:ore_adamantium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.ORE_SIRIUM), 0, new ModelResourceLocation("naberius:ore_sirium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.ORE_SILVER), 0, new ModelResourceLocation("naberius:ore_silver", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.ORE_COPPER), 0, new ModelResourceLocation("naberius:ore_copper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.ORE_TIN), 0, new ModelResourceLocation("naberius:ore_tin", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_TITANIUM), 0, new ModelResourceLocation("naberius:metal_titanium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_VIBRANIUM), 0, new ModelResourceLocation("naberius:metal_vibranium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_ADAMANTIUM), 0, new ModelResourceLocation("naberius:metal_adamantium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_SIRIUM), 0, new ModelResourceLocation("naberius:metal_sirium", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_DEMON), 0, new ModelResourceLocation("naberius:metal_demon", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_SILVER), 0, new ModelResourceLocation("naberius:metal_silver", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_STEEL), 0, new ModelResourceLocation("naberius:metal_steel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_BRONZE), 0, new ModelResourceLocation("naberius:metal_bronze", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_COPPER), 0, new ModelResourceLocation("naberius:metal_copper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ModBlocks.METAL_TIN), 0, new ModelResourceLocation("naberius:metal_tin", "inventory"));
		
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
