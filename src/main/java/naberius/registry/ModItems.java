package naberius.registry;

import naberius.handler.MaterialHandler;
import naberius.item.ItemBackpack;
import naberius.item.ItemCore;
import naberius.item.ItemDemonFlesh;
import naberius.item.ItemIngot;
import naberius.item.ItemNugget;
import naberius.item.manual.ItemManual;
import naberius.item.tool.ItemToolAoE;
import naberius.item.tool.ItemToolAxe;
import naberius.item.tool.ItemToolHoe;
import naberius.item.tool.ItemToolPickaxe;
import naberius.item.tool.ItemToolShovel;
import naberius.item.tool.ItemToolSword;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static ItemIngot INGOT;
	public static ItemCore CORE;
	public static ItemNugget NUGGET;
	public static ItemDemonFlesh DEMON_FLESH;
	public static ItemManual MANUAL;
	
	public static ItemBackpack BACKPACK;
	
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
	
	public static void init(){
		
		INGOT = new ItemIngot();
		CORE = new ItemCore();
		NUGGET = new ItemNugget();
		DEMON_FLESH = new ItemDemonFlesh();
		MANUAL = new ItemManual();
		BACKPACK = new ItemBackpack();
		
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
		DEMONIC_PICKAXE = new ItemToolPickaxe(MaterialHandler.Tools.Demonic, "demonic_pickaxe", ModEnchants.AUTO_SMELT, 1);
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
		DEMONIC_SWORD = new ItemToolSword(MaterialHandler.Tools.Demonic, "demonic_sword", ModEnchants.DEVOURER, 5);
		STEEL_SWORD = new ItemToolSword(MaterialHandler.Tools.Steel, "steel_sword", null, -1);
		BRONZE_SWORD = new ItemToolSword(MaterialHandler.Tools.Bronze, "bronze_sword", null, -1);
		SILVER_SWORD = new ItemToolSword(MaterialHandler.Tools.Silver, "silver_sword", Enchantment.getEnchantmentByID(17), 5);
				
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
		
		register();
		
	}
	
	private static void register(){
		
		registerItem(ModItems.INGOT);
		registerItem(ModItems.CORE);
		registerItem(ModItems.NUGGET);
		registerItem(ModItems.DEMON_FLESH);
		registerItem(MANUAL);
		
		registerItem(BACKPACK);
		
		registerItem(ModItems.TITANIUM_AXE);
		registerItem(ModItems.VIBRANIUM_AXE);
		registerItem(ModItems.ADAMANTIUM_AXE);
		registerItem(ModItems.SIRIUM_AXE);
		registerItem(ModItems.DEMONIC_AXE);
		registerItem(ModItems.STEEL_AXE);
		registerItem(ModItems.BRONZE_AXE);
		registerItem(ModItems.SILVER_AXE);
		
		registerItem(ModItems.TITANIUM_HOE);
		registerItem(ModItems.VIBRANIUM_HOE);
		registerItem(ModItems.ADAMANTIUM_HOE);
		registerItem(ModItems.SIRIUM_HOE);
		registerItem(ModItems.DEMONIC_HOE);
		registerItem(ModItems.STEEL_HOE);
		registerItem(ModItems.BRONZE_HOE);
		registerItem(ModItems.SILVER_HOE);
		
		registerItem(ModItems.TITANIUM_PICKAXE);
		registerItem(ModItems.VIBRANIUM_PICKAXE);
		registerItem(ModItems.ADAMANTIUM_PICKAXE);
		registerItem(ModItems.SIRIUM_PICKAXE);
		registerItem(ModItems.DEMONIC_PICKAXE);
		registerItem(ModItems.STEEL_PICKAXE);
		registerItem(ModItems.BRONZE_PICKAXE);
		registerItem(ModItems.SILVER_PICKAXE);
		
		registerItem(ModItems.TITANIUM_SHOVEL);
		registerItem(ModItems.VIBRANIUM_SHOVEL);
		registerItem(ModItems.ADAMANTIUM_SHOVEL);
		registerItem(ModItems.SIRIUM_SHOVEL);
		registerItem(ModItems.DEMONIC_SHOVEL);
		registerItem(ModItems.STEEL_SHOVEL);
		registerItem(ModItems.BRONZE_SHOVEL);
		registerItem(ModItems.SILVER_SHOVEL);
		
		registerItem(ModItems.TITANIUM_SWORD);
		registerItem(ModItems.VIBRANIUM_SWORD);
		registerItem(ModItems.ADAMANTIUM_SWORD);
		registerItem(ModItems.SIRIUM_SWORD);
		registerItem(ModItems.DEMONIC_SWORD);
		registerItem(ModItems.STEEL_SWORD);
		registerItem(ModItems.BRONZE_SWORD);
		registerItem(ModItems.SILVER_SWORD);
		
		registerItem(ModItems.TITANIUM_HAMMER);
		registerItem(ModItems.VIBRANIUM_HAMMER);
		registerItem(ModItems.ADAMANTIUM_HAMMER);
		registerItem(ModItems.SIRIUM_HAMMER);
		registerItem(ModItems.DEMONIC_HAMMER);
		registerItem(ModItems.STEEL_HAMMER);
		registerItem(ModItems.BRONZE_HAMMER);
		registerItem(ModItems.SILVER_HAMMER);
		
		registerItem(ModItems.TITANIUM_EXCAVATOR);
		registerItem(ModItems.VIBRANIUM_EXCAVATOR);
		registerItem(ModItems.ADAMANTIUM_EXCAVATOR);
		registerItem(ModItems.SIRIUM_EXCAVATOR);
		registerItem(ModItems.DEMONIC_EXCAVATOR);
		registerItem(ModItems.STEEL_EXCAVATOR);
		registerItem(ModItems.BRONZE_EXCAVATOR);
		registerItem(ModItems.SILVER_EXCAVATOR);
		
	}
	
	private static void registerItem(Item item) {
        GameRegistry.register(item);
    }
	
}
