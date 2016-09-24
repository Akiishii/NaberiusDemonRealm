package naberius.init;

import naberius.config.NaberiusConfig;
import naberius.handler.MaterialHandler;
import naberius.item.*;
import naberius.item.drops.*;
import naberius.item.manual.ItemManual;
import naberius.item.material.ItemIngot;
import naberius.item.material.ItemNugget;
import naberius.item.material.ItemPlate;
import naberius.item.porter.ItemCleansedPorter;
import naberius.item.porter.ItemCorruptedPorter;
import naberius.item.tool.*;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemRegistry {

	public static ItemIngot INGOT;
	public static ItemCore CORE;
	public static ItemNugget NUGGET;
	public static ItemPlate PLATE;
	public static ItemDemonFlesh DEMON_FLESH;
	public static ItemManual MANUAL;
	
	public static ItemDemonicStone DEMONIC_STONE;
	
	public static ItemCleansedPorter CLEANSED_DEMON_PORTER;
	public static ItemCorruptedPorter CORRUPTED_DEMON_PORTER;
	
	public static ItemBackpack BACKPACK;
	
	//Crafting
	
	public static ItemHolyWater HOLY_WATER;
	public static ItemDemonPearl DEMON_PEARL;
	public static ItemDemonEye DEMON_EYE;
	
	//Tools
	public static ItemToolAxe TITANIUM_AXE;
	public static ItemToolAxe VIBRANIUM_AXE;
	public static ItemToolAxe ADAMANTIUM_AXE;
	public static ItemToolAxe SIRIUM_AXE;
	public static ItemToolAxe DEMONIC_AXE;
	public static ItemToolAxe STEEL_AXE;
	public static ItemToolAxe BRONZE_AXE;
	public static ItemToolAxe SILVER_AXE;
	
	public static ItemToolHoe TITANIUM_HOE;
	public static ItemToolHoe VIBRANIUM_HOE;
	public static ItemToolHoe ADAMANTIUM_HOE;
	public static ItemToolHoe SIRIUM_HOE;
	public static ItemToolHoe DEMONIC_HOE;
	public static ItemToolHoe STEEL_HOE;
	public static ItemToolHoe BRONZE_HOE;
	public static ItemToolHoe SILVER_HOE;
	
	public static ItemToolPickaxe TITANIUM_PICKAXE;
	public static ItemToolPickaxe VIBRANIUM_PICKAXE;
	public static ItemToolPickaxe ADAMANTIUM_PICKAXE;
	public static ItemToolPickaxe SIRIUM_PICKAXE;
	public static ItemToolPickaxe DEMONIC_PICKAXE;
	public static ItemToolPickaxe STEEL_PICKAXE;
	public static ItemToolPickaxe BRONZE_PICKAXE;
	public static ItemToolPickaxe SILVER_PICKAXE;
	
	public static ItemToolShovel TITANIUM_SHOVEL;
	public static ItemToolShovel VIBRANIUM_SHOVEL;
	public static ItemToolShovel ADAMANTIUM_SHOVEL;
	public static ItemToolShovel SIRIUM_SHOVEL;
	public static ItemToolShovel DEMONIC_SHOVEL;
	public static ItemToolShovel STEEL_SHOVEL;
	public static ItemToolShovel BRONZE_SHOVEL;
	public static ItemToolShovel SILVER_SHOVEL;
	
	public static ItemToolSword TITANIUM_SWORD;
	public static ItemToolSword VIBRANIUM_SWORD;
	public static ItemToolSword ADAMANTIUM_SWORD;
	public static ItemToolSword SIRIUM_SWORD;
	public static ItemToolSword DEMONIC_SWORD;
	public static ItemToolSword STEEL_SWORD ;
	public static ItemToolSword BRONZE_SWORD;
	public static ItemToolSword SILVER_SWORD;
	
	public static ItemToolAoE TITANIUM_HAMMER;
	public static ItemToolAoE VIBRANIUM_HAMMER;
	public static ItemToolAoE ADAMANTIUM_HAMMER;
	public static ItemToolAoE SIRIUM_HAMMER;
	public static ItemToolAoE DEMONIC_HAMMER;
	public static ItemToolAoE STEEL_HAMMER;
	public static ItemToolAoE BRONZE_HAMMER;
	public static ItemToolAoE SILVER_HAMMER;
	
	public static ItemToolAoE TITANIUM_EXCAVATOR;
	public static ItemToolAoE VIBRANIUM_EXCAVATOR;
	public static ItemToolAoE ADAMANTIUM_EXCAVATOR;
	public static ItemToolAoE SIRIUM_EXCAVATOR;
	public static ItemToolAoE DEMONIC_EXCAVATOR;
	public static ItemToolAoE STEEL_EXCAVATOR;
	public static ItemToolAoE BRONZE_EXCAVATOR;
	public static ItemToolAoE SILVER_EXCAVATOR;
	
	public static ItemToolHammer HAMMER;
	
	
	public static void init(){
		
		INGOT = new ItemIngot();
		CORE = new ItemCore();
		NUGGET = new ItemNugget();
		PLATE = new ItemPlate();
		
		MANUAL = new ItemManual();
		
		DEMONIC_STONE = new ItemDemonicStone();
		
		CORRUPTED_DEMON_PORTER = new ItemCorruptedPorter();
		CLEANSED_DEMON_PORTER = new ItemCleansedPorter();
		
		BACKPACK = new ItemBackpack();
		
		DEMON_FLESH = new ItemDemonFlesh();
		HOLY_WATER = new ItemHolyWater();
		DEMON_PEARL = new ItemDemonPearl();
		DEMON_EYE = new ItemDemonEye();
		
		TITANIUM_AXE = new ItemToolAxe(MaterialHandler.Tools.Titanium, "titanium_axe", null, -1);
		VIBRANIUM_AXE = new ItemToolAxe(MaterialHandler.Tools.Vibranium, "vibranium_axe", null, -1);
		ADAMANTIUM_AXE = new ItemToolAxe(MaterialHandler.Tools.Adamantium, "adamantium_axe", null, -1);
		SIRIUM_AXE = new ItemToolAxe(MaterialHandler.Tools.Sirium, "sirium_axe", null, -1);
		DEMONIC_AXE = new ItemToolAxe(MaterialHandler.Tools.Demonic, "demonic_axe", null, -1);
		STEEL_AXE = new ItemToolAxe(MaterialHandler.Tools.Steel, "steel_axe", null, -1);
		BRONZE_AXE = new ItemToolAxe(MaterialHandler.Tools.Bronze, "bronze_axe", null, -1);
		SILVER_AXE = new ItemToolAxe(MaterialHandler.Tools.Silver, "silver_axe", null, -1);
		
		TITANIUM_HOE = new ItemToolHoe(MaterialHandler.Tools.Titanium, "titanium_hoe");
		VIBRANIUM_HOE = new ItemToolHoe(MaterialHandler.Tools.Vibranium, "vibranium_hoe");
		ADAMANTIUM_HOE = new ItemToolHoe(MaterialHandler.Tools.Adamantium, "adamantium_hoe");
		SIRIUM_HOE = new ItemToolHoe(MaterialHandler.Tools.Sirium, "sirium_hoe");
		DEMONIC_HOE = new ItemToolHoe(MaterialHandler.Tools.Demonic, "demonic_hoe");
		STEEL_HOE = new ItemToolHoe(MaterialHandler.Tools.Steel, "steel_hoe");
		BRONZE_HOE = new ItemToolHoe(MaterialHandler.Tools.Bronze, "bronze_hoe");
		SILVER_HOE = new ItemToolHoe(MaterialHandler.Tools.Silver, "silver_hoe");
		
		TITANIUM_PICKAXE = new ItemToolPickaxe(MaterialHandler.Tools.Titanium, "titanium_pickaxe", null, -1);
		VIBRANIUM_PICKAXE = new ItemToolPickaxe(MaterialHandler.Tools.Vibranium, "vibranium_pickaxe", null, -1);
		ADAMANTIUM_PICKAXE = new ItemToolPickaxe(MaterialHandler.Tools.Adamantium, "adamantium_pickaxe", null, -1);
		SIRIUM_PICKAXE = new ItemToolPickaxe(MaterialHandler.Tools.Sirium, "sirium_pickaxe", null, -1);
		DEMONIC_PICKAXE = new ItemToolPickaxe(MaterialHandler.Tools.Demonic, "demonic_pickaxe", EnchantmentRegistry.AUTO_SMELT, 1);
		STEEL_PICKAXE = new ItemToolPickaxe(MaterialHandler.Tools.Steel, "steel_pickaxe", null, -1);
		BRONZE_PICKAXE = new ItemToolPickaxe(MaterialHandler.Tools.Bronze, "bronze_pickaxe", null, -1);
		SILVER_PICKAXE = new ItemToolPickaxe(MaterialHandler.Tools.Silver, "silver_pickaxe", Enchantment.getEnchantmentByID(35), 2);
		
		TITANIUM_SHOVEL = new ItemToolShovel(MaterialHandler.Tools.Titanium, "titanium_shovel", null, -1);
		VIBRANIUM_SHOVEL = new ItemToolShovel(MaterialHandler.Tools.Vibranium, "vibranium_shovel", null, -1);
		ADAMANTIUM_SHOVEL = new ItemToolShovel(MaterialHandler.Tools.Adamantium, "adamantium_shovel", null, -1);
		SIRIUM_SHOVEL = new ItemToolShovel(MaterialHandler.Tools.Sirium, "sirium_shovel", null, -1);
		DEMONIC_SHOVEL = new ItemToolShovel(MaterialHandler.Tools.Demonic, "demonic_shovel", null, -1);
		STEEL_SHOVEL = new ItemToolShovel(MaterialHandler.Tools.Steel, "steel_shovel", null, -1);
		BRONZE_SHOVEL = new ItemToolShovel(MaterialHandler.Tools.Bronze, "bronze_shovel", null, -1);
		SILVER_SHOVEL = new ItemToolShovel(MaterialHandler.Tools.Silver, "silver_shovel", null, -1);
		
		TITANIUM_SWORD = new ItemToolSword(MaterialHandler.Tools.Titanium, "titanium_sword", null, -1);
		VIBRANIUM_SWORD = new ItemToolSword(MaterialHandler.Tools.Vibranium, "vibranium_sword", null, -1);
		ADAMANTIUM_SWORD = new ItemToolSword(MaterialHandler.Tools.Adamantium, "adamantium_sword", null, -1);
		SIRIUM_SWORD = new ItemToolSword(MaterialHandler.Tools.Sirium, "sirium_sword", null, -1);
		DEMONIC_SWORD = new ItemToolSword(MaterialHandler.Tools.Demonic, "demonic_sword", EnchantmentRegistry.DEVOURER, 5);
		STEEL_SWORD = new ItemToolSword(MaterialHandler.Tools.Steel, "steel_sword", null, -1);
		BRONZE_SWORD = new ItemToolSword(MaterialHandler.Tools.Bronze, "bronze_sword", null, -1);
		SILVER_SWORD = new ItemToolSword(MaterialHandler.Tools.Silver, "silver_sword", EnchantmentRegistry.HOLY, 5);
				
		TITANIUM_HAMMER = new ItemToolAoE("titanium_hammer", MaterialHandler.Tools.Titanium_AoE);
		VIBRANIUM_HAMMER = new ItemToolAoE("vibranium_hammer", MaterialHandler.Tools.Vibranium_AoE);
		ADAMANTIUM_HAMMER = new ItemToolAoE("adamantium_hammer", MaterialHandler.Tools.Adamantium_AoE);
		SIRIUM_HAMMER = new ItemToolAoE("sirium_hammer", MaterialHandler.Tools.Sirium_AoE);
		DEMONIC_HAMMER = new ItemToolAoE("demonic_hammer", MaterialHandler.Tools.Demonic_AoE);
		STEEL_HAMMER = new ItemToolAoE("steel_hammer", MaterialHandler.Tools.Steel_AoE);
		BRONZE_HAMMER = new ItemToolAoE("bronze_hammer", MaterialHandler.Tools.Bronze_AoE);
		SILVER_HAMMER = new ItemToolAoE("silver_hammer", MaterialHandler.Tools.Silver_AoE);
		
		TITANIUM_EXCAVATOR = new ItemToolAoE("titanium_excavator", MaterialHandler.Tools.Titanium_AoE, true);
		VIBRANIUM_EXCAVATOR = new ItemToolAoE("vibranium_excavator", MaterialHandler.Tools.Vibranium_AoE, true);
		ADAMANTIUM_EXCAVATOR = new ItemToolAoE("adamantium_excavator", MaterialHandler.Tools.Adamantium_AoE, true);
		SIRIUM_EXCAVATOR = new ItemToolAoE("sirium_excavator", MaterialHandler.Tools.Sirium_AoE, true);
		DEMONIC_EXCAVATOR = new ItemToolAoE("demonic_excavator", MaterialHandler.Tools.Demonic_AoE, true);
		STEEL_EXCAVATOR = new ItemToolAoE("steel_excavator", MaterialHandler.Tools.Steel_AoE, true);
		BRONZE_EXCAVATOR = new ItemToolAoE("bronze_excavator", MaterialHandler.Tools.Bronze_AoE, true);
		SILVER_EXCAVATOR = new ItemToolAoE("silver_excavator", MaterialHandler.Tools.Silver_AoE, true);
		
		HAMMER = new ItemToolHammer(NaberiusConfig.HAMMER_DURABILITY);
		
		register();
		
	}
	
	private static void register(){
		
		registerItem(ItemRegistry.INGOT);
		registerItem(ItemRegistry.CORE);
		registerItem(ItemRegistry.NUGGET);
		registerItem(ItemRegistry.PLATE);
		
		registerItem(ItemRegistry.DEMONIC_STONE);
		
		registerItem(ItemRegistry.CORRUPTED_DEMON_PORTER);
		registerItem(ItemRegistry.CLEANSED_DEMON_PORTER);
		
		registerItem(ItemRegistry.MANUAL);
		
		registerItem(ItemRegistry.BACKPACK);
		
		registerItem(ItemRegistry.DEMON_FLESH);
		registerItem(ItemRegistry.HOLY_WATER);
		registerItem(ItemRegistry.DEMON_PEARL);
		registerItem(ItemRegistry.DEMON_EYE);
		
		registerItem(ItemRegistry.TITANIUM_AXE);
		registerItem(ItemRegistry.VIBRANIUM_AXE);
		registerItem(ItemRegistry.ADAMANTIUM_AXE);
		registerItem(ItemRegistry.SIRIUM_AXE);
		registerItem(ItemRegistry.DEMONIC_AXE);
		registerItem(ItemRegistry.STEEL_AXE);
		registerItem(ItemRegistry.BRONZE_AXE);
		registerItem(ItemRegistry.SILVER_AXE);
		
		registerItem(ItemRegistry.TITANIUM_HOE);
		registerItem(ItemRegistry.VIBRANIUM_HOE);
		registerItem(ItemRegistry.ADAMANTIUM_HOE);
		registerItem(ItemRegistry.SIRIUM_HOE);
		registerItem(ItemRegistry.DEMONIC_HOE);
		registerItem(ItemRegistry.STEEL_HOE);
		registerItem(ItemRegistry.BRONZE_HOE);
		registerItem(ItemRegistry.SILVER_HOE);
		
		registerItem(ItemRegistry.TITANIUM_PICKAXE);
		registerItem(ItemRegistry.VIBRANIUM_PICKAXE);
		registerItem(ItemRegistry.ADAMANTIUM_PICKAXE);
		registerItem(ItemRegistry.SIRIUM_PICKAXE);
		registerItem(ItemRegistry.DEMONIC_PICKAXE);
		registerItem(ItemRegistry.STEEL_PICKAXE);
		registerItem(ItemRegistry.BRONZE_PICKAXE);
		registerItem(ItemRegistry.SILVER_PICKAXE);
		
		registerItem(ItemRegistry.TITANIUM_SHOVEL);
		registerItem(ItemRegistry.VIBRANIUM_SHOVEL);
		registerItem(ItemRegistry.ADAMANTIUM_SHOVEL);
		registerItem(ItemRegistry.SIRIUM_SHOVEL);
		registerItem(ItemRegistry.DEMONIC_SHOVEL);
		registerItem(ItemRegistry.STEEL_SHOVEL);
		registerItem(ItemRegistry.BRONZE_SHOVEL);
		registerItem(ItemRegistry.SILVER_SHOVEL);
		
		registerItem(ItemRegistry.TITANIUM_SWORD);
		registerItem(ItemRegistry.VIBRANIUM_SWORD);
		registerItem(ItemRegistry.ADAMANTIUM_SWORD);
		registerItem(ItemRegistry.SIRIUM_SWORD);
		registerItem(ItemRegistry.DEMONIC_SWORD);
		registerItem(ItemRegistry.STEEL_SWORD);
		registerItem(ItemRegistry.BRONZE_SWORD);
		registerItem(ItemRegistry.SILVER_SWORD);
		
		registerItem(ItemRegistry.TITANIUM_HAMMER);
		registerItem(ItemRegistry.VIBRANIUM_HAMMER);
		registerItem(ItemRegistry.ADAMANTIUM_HAMMER);
		registerItem(ItemRegistry.SIRIUM_HAMMER);
		registerItem(ItemRegistry.DEMONIC_HAMMER);
		registerItem(ItemRegistry.STEEL_HAMMER);
		registerItem(ItemRegistry.BRONZE_HAMMER);
		registerItem(ItemRegistry.SILVER_HAMMER);
		
		registerItem(ItemRegistry.TITANIUM_EXCAVATOR);
		registerItem(ItemRegistry.VIBRANIUM_EXCAVATOR);
		registerItem(ItemRegistry.ADAMANTIUM_EXCAVATOR);
		registerItem(ItemRegistry.SIRIUM_EXCAVATOR);
		registerItem(ItemRegistry.DEMONIC_EXCAVATOR);
		registerItem(ItemRegistry.STEEL_EXCAVATOR);
		registerItem(ItemRegistry.BRONZE_EXCAVATOR);
		registerItem(ItemRegistry.SILVER_EXCAVATOR);
	
		registerItem(ItemRegistry.HAMMER);
	
	}
	
	private static void registerItem(Item item) {
        GameRegistry.register(item);
    }
	
}
