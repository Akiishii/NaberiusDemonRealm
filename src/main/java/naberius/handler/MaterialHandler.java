package naberius.handler;

import naberius.init.ItemRegistry;
import naberius.item.material.ItemIngot;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.SoundEvent;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialHandler {

	public static final class Tools{
	
		public static final ToolMaterial Titanium = EnumHelper.addToolMaterial("titanium", 3, 2029, 10.4F, 3.9F, 35).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_TITANIUM));
		public static final ToolMaterial Vibranium = EnumHelper.addToolMaterial("vibranium", 3, 2498, 12.8F, 4.8F, 40).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_VIBRANIUM));
		public static final ToolMaterial Adamantium = EnumHelper.addToolMaterial("adamantium", 3, 2810, 14.4F, 5.4F, 45).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_ADAMANTIUM));
		public static final ToolMaterial Sirium = EnumHelper.addToolMaterial("sirium", 3, 1873, 9.6F, 3.6F, 50).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SIRIUM));
		public static final ToolMaterial Demonic = EnumHelper.addToolMaterial("demonic", 3, -1, 18F, 16F, 200).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_DEMONIC));
		public static final ToolMaterial Steel = EnumHelper.addToolMaterial("steel", 2, 974, 7.2F, 1.8F, 20).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_STEEL));
		public static final ToolMaterial Bronze = EnumHelper.addToolMaterial("bronze", 2, 715, 6.4F, 1.5F, 15).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_BRONZE));
		public static final ToolMaterial Silver = EnumHelper.addToolMaterial("silver", 2, 184, 5.6F, 2.5F, 10).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SILVER));
		
		public static final ToolMaterial Titanium_AoE = EnumHelper.addToolMaterial("titanium_aoe", 3, 2029*6, 10.4F, 3.9F, 35).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_TITANIUM));
		public static final ToolMaterial Vibranium_AoE = EnumHelper.addToolMaterial("vibranium_aoe", 3, 2498*6, 12.8F, 4.8F, 40).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_VIBRANIUM));
		public static final ToolMaterial Adamantium_AoE = EnumHelper.addToolMaterial("adamantium_aoe", 3, 2810*6, 14.4F, 5.4F, 45).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_ADAMANTIUM));
		public static final ToolMaterial Sirium_AoE = EnumHelper.addToolMaterial("sirium_aoe", 3, 1873*6, 9.6F, 3.6F, 50).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SIRIUM));
		public static final ToolMaterial Demonic_AoE = EnumHelper.addToolMaterial("demonic_aoe", 3, -1, 18F, 16F, 200).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_DEMONIC));
		public static final ToolMaterial Steel_AoE = EnumHelper.addToolMaterial("steel_aoe", 2, 974*6, 7.2F, 1.8F, 20).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_STEEL));
		public static final ToolMaterial Bronze_AoE = EnumHelper.addToolMaterial("bronze_aoe", 2, 715*6, 6.4F, 1.5F, 15).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_BRONZE));
		public static final ToolMaterial Silver_AoE = EnumHelper.addToolMaterial("silver_aoe", 2, 184*6, 5.6F, 2.5F, 10).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SILVER));
		
	}
	
	public static final class Armor{
		
		public static final ArmorMaterial Adamantium = EnumHelper.addArmorMaterial("Adamantium", "naberius:adamantium_armor", 80, new int[] { 4, 6, 8, 4 }, 40, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
		public static final ArmorMaterial Sirium = EnumHelper.addArmorMaterial("Sirium", "naberius:sirium_armor", 160, new int[] { 5, 9, 10, 5 }, 50, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
		public static final ArmorMaterial Demonic = EnumHelper.addArmorMaterial("Demonic", "naberius:demonic_armor", -1, new int[] { 6, 10, 13, 6 }, 200, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
		public static final ArmorMaterial Steel = EnumHelper.addArmorMaterial("Steel", "naberius:steel_armor", 40, new int[] { 3, 5, 6, 3  }, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
		public static final ArmorMaterial Bronze = EnumHelper.addArmorMaterial("Bronze", "naberius:bronze_armor", 20, new int[] { 2, 5, 6, 2 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F);
		
	}
	
}
