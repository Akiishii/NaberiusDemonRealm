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

public class ItemSiriumArmor {

	public static Item sirium_helmet;
	public static Item sirium_chest;
	public static Item sirium_leggs;
	public static Item sirium_boots;
	
	public ItemSiriumArmor() {
		
		sirium_helmet.setCreativeTab(NaberiusCore.INSTANCE.tab);
		sirium_chest.setCreativeTab(NaberiusCore.INSTANCE.tab);
		sirium_leggs.setCreativeTab(NaberiusCore.INSTANCE.tab);
		sirium_boots.setCreativeTab(NaberiusCore.INSTANCE.tab);
		
	}

	public void registerRenderers() {}
	
	static
	{
	
		ItemArmor.ArmorMaterial SIRIUM = MaterialHandler.Armor.Sirium;
		
		int armorPrefix = 0;
		
		sirium_helmet = (Item)new ItemArmor(SIRIUM, armorPrefix, EntityEquipmentSlot.HEAD){
			
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
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SIRIUM).getItem();
			}
		}.setUnlocalizedName("sirium_helmet").setRegistryName(NaberiusCore.ModID, "sirium_helmet");
		sirium_helmet.setMaxStackSize(1);
		
		sirium_chest = (Item)new ItemArmor(SIRIUM, armorPrefix, EntityEquipmentSlot.CHEST){
			
			@SideOnly(Side.CLIENT)
			public void addInformation(ItemStack stack, net.minecraft.entity.player.EntityPlayer playerIn, java.util.List<String> tooltip, boolean advanced)
			{
			
				int dmg = stack.getMaxDamage() - stack.getItemDamage();
				tooltip.add("Durability: §c" + dmg);
				
			}
			
			public boolean getIsRepairable(ItemStack stack, ItemStack stack2){
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SIRIUM).getItem();
			}
			
		}.setUnlocalizedName("sirium_chest").setRegistryName(NaberiusCore.ModID, "sirium_chest");
		sirium_chest.setMaxStackSize(1);
		
		sirium_leggs = (Item)new ItemArmor(SIRIUM, armorPrefix, EntityEquipmentSlot.LEGS){
			
			@SideOnly(Side.CLIENT)
			public void addInformation(ItemStack stack, net.minecraft.entity.player.EntityPlayer playerIn, java.util.List<String> tooltip, boolean advanced)
			{
			
				int dmg = stack.getMaxDamage() - stack.getItemDamage();
				tooltip.add("Durability: §c" + dmg);
				
			}
			
			public boolean getIsRepairable(ItemStack stack, ItemStack stack2){
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SIRIUM).getItem();
			}
			
		}.setUnlocalizedName("sirium_leggs").setRegistryName(NaberiusCore.ModID, "sirium_leggs");
		sirium_leggs.setMaxStackSize(1);
		
		sirium_boots = (Item)new ItemArmor(SIRIUM, armorPrefix, EntityEquipmentSlot.FEET){
			
			@SideOnly(Side.CLIENT)
			public void addInformation(ItemStack stack, net.minecraft.entity.player.EntityPlayer playerIn, java.util.List<String> tooltip, boolean advanced)
			{
			
				int dmg = stack.getMaxDamage() - stack.getItemDamage();
				tooltip.add("Durability: §c" + dmg);
				
			}
			
			public boolean getIsRepairable(ItemStack stack, ItemStack stack2){
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_SIRIUM).getItem();
			}
			
		}.setUnlocalizedName("sirium_boots").setRegistryName(NaberiusCore.ModID, "sirium_boots");
		sirium_boots.setMaxStackSize(1);
	}
	
}
