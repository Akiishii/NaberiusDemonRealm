package naberius.handler;

import naberius.init.ItemRegistry;
import naberius.item.material.ItemIngot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialHandler {

	public static final class Tools{
	
		public static final Item.ToolMaterial Titanium = EnumHelper.addToolMaterial("titanium", 3, 2029, 10.4F, 3.9F, 35).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_TITANIUM));
		public static final Item.ToolMaterial Vibranium = EnumHelper.addToolMaterial("vibranium", 3, 2498, 12.8F, 4.8F, 40).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_VIBRANIUM));
		public static final Item.ToolMaterial Adamantium = EnumHelper.addToolMaterial("adamantium", 3, 2810, 14.4F, 5.4F, 45).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_ADAMANTIUM));
		public static final Item.ToolMaterial Sirium = EnumHelper.addToolMaterial("sirium", 3, 1873, 9.6F, 3.6F, 50).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SIRIUM));
		public static final Item.ToolMaterial Demonic = EnumHelper.addToolMaterial("demonic", 3, -1, 18F, 16F, 200).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_DEMONIC));
		public static final Item.ToolMaterial Steel = EnumHelper.addToolMaterial("steel", 2, 974, 7.2F, 1.8F, 20).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_STEEL));
		public static final Item.ToolMaterial Bronze = EnumHelper.addToolMaterial("bronze", 2, 715, 6.4F, 1.5F, 15).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_BRONZE));
		public static final Item.ToolMaterial Silver = EnumHelper.addToolMaterial("silver", 2, 184, 5.6F, 2.5F, 10).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SILVER));
		
		public static final Item.ToolMaterial Titanium_AoE = EnumHelper.addToolMaterial("titanium_aoe", 3, 2029*6, 10.4F, 3.9F, 35).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_TITANIUM));
		public static final Item.ToolMaterial Vibranium_AoE = EnumHelper.addToolMaterial("vibranium_aoe", 3, 2498*6, 12.8F, 4.8F, 40).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_VIBRANIUM));
		public static final Item.ToolMaterial Adamantium_AoE = EnumHelper.addToolMaterial("adamantium_aoe", 3, 2810*6, 14.4F, 5.4F, 45).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_ADAMANTIUM));
		public static final Item.ToolMaterial Sirium_AoE = EnumHelper.addToolMaterial("sirium_aoe", 3, 1873*6, 9.6F, 3.6F, 50).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SIRIUM));
		public static final Item.ToolMaterial Demonic_AoE = EnumHelper.addToolMaterial("demonic_aoe", 3, -1, 18F, 16F, 200).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_DEMONIC));
		public static final Item.ToolMaterial Steel_AoE = EnumHelper.addToolMaterial("steel_aoe", 2, 974*6, 7.2F, 1.8F, 20).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_STEEL));
		public static final Item.ToolMaterial Bronze_AoE = EnumHelper.addToolMaterial("bronze_aoe", 2, 715*6, 6.4F, 1.5F, 15).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_BRONZE));
		public static final Item.ToolMaterial Silver_AoE = EnumHelper.addToolMaterial("silver_aoe", 2, 184*6, 5.6F, 2.5F, 10).setRepairItem(new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SILVER));
		
		
	}
	
}
