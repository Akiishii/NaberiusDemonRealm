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

public class ItemBronzeArmor{

	public static Item bronze_helmet;
	public static Item bronze_chest;
	public static Item bronze_leggs;
	public static Item bronze_boots;
	
	public ItemBronzeArmor() {
		
		bronze_helmet.setCreativeTab(NaberiusCore.INSTANCE.tab);
		bronze_chest.setCreativeTab(NaberiusCore.INSTANCE.tab);
		bronze_leggs.setCreativeTab(NaberiusCore.INSTANCE.tab);
		bronze_boots.setCreativeTab(NaberiusCore.INSTANCE.tab);
		
	}

	public void registerRenderers() {}
	
	static
	{
	
		ItemArmor.ArmorMaterial Bronze = MaterialHandler.Armor.Bronze;
		
		int armorPrefix = 0;
		
		bronze_helmet = (Item)new ItemArmor(Bronze, armorPrefix, EntityEquipmentSlot.HEAD){
			
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
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_BRONZE).getItem();
			}
		}.setUnlocalizedName("bronze_helmet").setRegistryName(NaberiusCore.ModID, "bronze_helmet");
		bronze_helmet.setMaxStackSize(1);
		
		bronze_chest = (Item)new ItemArmor(Bronze, armorPrefix, EntityEquipmentSlot.CHEST){
			
			@SideOnly(Side.CLIENT)
			public void addInformation(ItemStack stack, net.minecraft.entity.player.EntityPlayer playerIn, java.util.List<String> tooltip, boolean advanced)
			{
			
				int dmg = stack.getMaxDamage() - stack.getItemDamage();
				tooltip.add("Durability: §c" + dmg);
				
			}
			
			public boolean getIsRepairable(ItemStack stack, ItemStack stack2){
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_BRONZE).getItem();
			}
			
		}.setUnlocalizedName("bronze_chest").setRegistryName(NaberiusCore.ModID, "bronze_chest");
		bronze_chest.setMaxStackSize(1);
		
		bronze_leggs = (Item)new ItemArmor(Bronze, armorPrefix, EntityEquipmentSlot.LEGS){
			
			@SideOnly(Side.CLIENT)
			public void addInformation(ItemStack stack, net.minecraft.entity.player.EntityPlayer playerIn, java.util.List<String> tooltip, boolean advanced)
			{
			
				int dmg = stack.getMaxDamage() - stack.getItemDamage();
				tooltip.add("Durability: §c" + dmg);
				
			}
			
			public boolean getIsRepairable(ItemStack stack, ItemStack stack2){
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_BRONZE).getItem();
			}
			
		}.setUnlocalizedName("bronze_leggs").setRegistryName(NaberiusCore.ModID, "bronze_leggs");
		bronze_leggs.setMaxStackSize(1);
		
		bronze_boots = (Item)new ItemArmor(Bronze, armorPrefix, EntityEquipmentSlot.FEET){
			
			@SideOnly(Side.CLIENT)
			public void addInformation(ItemStack stack, net.minecraft.entity.player.EntityPlayer playerIn, java.util.List<String> tooltip, boolean advanced)
			{
			
				int dmg = stack.getMaxDamage() - stack.getItemDamage();
				tooltip.add("Durability: §c" + dmg);
				
			}
			
			public boolean getIsRepairable(ItemStack stack, ItemStack stack2){
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_BRONZE).getItem();
			}
			
		}.setUnlocalizedName("bronze_boots").setRegistryName(NaberiusCore.ModID, "bronze_boots");
		bronze_boots.setMaxStackSize(1);
	}
}
