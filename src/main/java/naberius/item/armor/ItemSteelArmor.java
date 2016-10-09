package naberius.item.armor;

import naberius.NaberiusCore;
import naberius.handler.MaterialHandler;
import naberius.init.ItemRegistry;
import naberius.item.material.ItemIngot;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSteelArmor {

	public static Item steel_helmet;
	public static Item steel_chest;
	public static Item steel_leggs;
	public static Item steel_boots;
	
	public ItemSteelArmor() {
		
		steel_helmet.setCreativeTab(NaberiusCore.INSTANCE.tab);
		steel_chest.setCreativeTab(NaberiusCore.INSTANCE.tab);
		steel_leggs.setCreativeTab(NaberiusCore.INSTANCE.tab);
		steel_boots.setCreativeTab(NaberiusCore.INSTANCE.tab);
		
	}

	public void registerRenderers() {}
	
	static
	{
	
		ItemArmor.ArmorMaterial STEEL = MaterialHandler.Armor.Steel;
		
		int armorPrefix = 0;
		
		steel_helmet = (Item)new ItemArmor(STEEL, armorPrefix, EntityEquipmentSlot.HEAD){
			
			@SideOnly(Side.CLIENT)
			public void addInformation(net.minecraft.item.ItemStack stack, net.minecraft.entity.player.EntityPlayer playerIn, java.util.List<String> tooltip, boolean advanced)
			{
				
				int dmg = stack.getMaxDamage() - stack.getItemDamage();
				tooltip.add("Durability: §c" + dmg);
				
			}
			
			/*public void onArmorTick(World world, EntityPlayer entity, ItemStack stack){
				
				ItemStack head = entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
				ItemStack chest = entity.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
				ItemStack leggs = entity.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
				ItemStack boots = entity.getItemStackFromSlot(EntityEquipmentSlot.FEET);
				
			}*/
			
			public boolean getIsRepairable(ItemStack stack, ItemStack stack2){
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_STEEL).getItem();
			}
		}.setUnlocalizedName("steel_helmet").setRegistryName(NaberiusCore.ModID, "steel_helmet");
		steel_helmet.setMaxStackSize(1);
		
		steel_chest = (Item)new ItemArmor(STEEL, armorPrefix, EntityEquipmentSlot.CHEST){
			
			@SideOnly(Side.CLIENT)
			public void addInformation(ItemStack stack, net.minecraft.entity.player.EntityPlayer playerIn, java.util.List<String> tooltip, boolean advanced)
			{
			
				int dmg = stack.getMaxDamage() - stack.getItemDamage();
				tooltip.add("Durability: §c" + dmg);
				
			}
			
			public boolean getIsRepairable(ItemStack stack, ItemStack stack2){
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_STEEL).getItem();
			}
			
		}.setUnlocalizedName("steel_chest").setRegistryName(NaberiusCore.ModID, "steel_chest");
		steel_chest.setMaxStackSize(1);
		
		steel_leggs = (Item)new ItemArmor(STEEL, armorPrefix, EntityEquipmentSlot.LEGS){
			
			@SideOnly(Side.CLIENT)
			public void addInformation(ItemStack stack, net.minecraft.entity.player.EntityPlayer playerIn, java.util.List<String> tooltip, boolean advanced)
			{
			
				int dmg = stack.getMaxDamage() - stack.getItemDamage();
				tooltip.add("Durability: §c" + dmg);
				
			}
			
			public boolean getIsRepairable(ItemStack stack, ItemStack stack2){
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_STEEL).getItem();
			}
			
		}.setUnlocalizedName("steel_leggs").setRegistryName(NaberiusCore.ModID, "steel_leggs");
		steel_leggs.setMaxStackSize(1);
		
		steel_boots = (Item)new ItemArmor(STEEL, armorPrefix, EntityEquipmentSlot.FEET){
			
			@SideOnly(Side.CLIENT)
			public void addInformation(ItemStack stack, net.minecraft.entity.player.EntityPlayer playerIn, java.util.List<String> tooltip, boolean advanced)
			{
			
				int dmg = stack.getMaxDamage() - stack.getItemDamage();
				tooltip.add("Durability: §c" + dmg);
				
			}
			
			public boolean getIsRepairable(ItemStack stack, ItemStack stack2){
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_STEEL).getItem();
			}
			
		}.setUnlocalizedName("steel_boots").setRegistryName(NaberiusCore.ModID, "steel_boots");
		steel_boots.setMaxStackSize(1);
	}
	
}
