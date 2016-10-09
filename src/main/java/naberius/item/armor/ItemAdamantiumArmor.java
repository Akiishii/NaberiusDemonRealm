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

public class ItemAdamantiumArmor {

	public static Item adamantium_helmet;
	public static Item adamantium_chest;
	public static Item adamantium_leggs;
	public static Item adamantium_boots;
	
	public ItemAdamantiumArmor() {
		
		adamantium_helmet.setCreativeTab(NaberiusCore.INSTANCE.tab);
		adamantium_chest.setCreativeTab(NaberiusCore.INSTANCE.tab);
		adamantium_leggs.setCreativeTab(NaberiusCore.INSTANCE.tab);
		adamantium_boots.setCreativeTab(NaberiusCore.INSTANCE.tab);
		
	}

	public void registerRenderers() {}
	
	static
	{
	
		ItemArmor.ArmorMaterial ADAMANTIUM = MaterialHandler.Armor.Adamantium;
		
		int armorPrefix = 0;
		
		adamantium_helmet = (Item)new ItemArmor(ADAMANTIUM, armorPrefix, EntityEquipmentSlot.HEAD){
			
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
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_ADAMANTIUM).getItem();
			}
		}.setUnlocalizedName("adamantium_helmet").setRegistryName(NaberiusCore.ModID, "adamantium_helmet");
		adamantium_helmet.setMaxStackSize(1);
		
		adamantium_chest = (Item)new ItemArmor(ADAMANTIUM, armorPrefix, EntityEquipmentSlot.CHEST){
			
			@SideOnly(Side.CLIENT)
			public void addInformation(ItemStack stack, net.minecraft.entity.player.EntityPlayer playerIn, java.util.List<String> tooltip, boolean advanced)
			{
			
				int dmg = stack.getMaxDamage() - stack.getItemDamage();
				tooltip.add("Durability: §c" + dmg);
				
			}
			
			public boolean getIsRepairable(ItemStack stack, ItemStack stack2){
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_BRONZE).getItem();
			}
			
		}.setUnlocalizedName("adamantium_chest").setRegistryName(NaberiusCore.ModID, "adamantium_chest");
		adamantium_chest.setMaxStackSize(1);
		
		adamantium_leggs = (Item)new ItemArmor(ADAMANTIUM, armorPrefix, EntityEquipmentSlot.LEGS){
			
			@SideOnly(Side.CLIENT)
			public void addInformation(ItemStack stack, net.minecraft.entity.player.EntityPlayer playerIn, java.util.List<String> tooltip, boolean advanced)
			{
			
				int dmg = stack.getMaxDamage() - stack.getItemDamage();
				tooltip.add("Durability: §c" + dmg);
				
			}
			
			public boolean getIsRepairable(ItemStack stack, ItemStack stack2){
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_BRONZE).getItem();
			}
			
		}.setUnlocalizedName("adamantium_leggs").setRegistryName(NaberiusCore.ModID, "adamantium_leggs");
		adamantium_leggs.setMaxStackSize(1);
		
		adamantium_boots = (Item)new ItemArmor(ADAMANTIUM, armorPrefix, EntityEquipmentSlot.FEET){
			
			@SideOnly(Side.CLIENT)
			public void addInformation(ItemStack stack, net.minecraft.entity.player.EntityPlayer playerIn, java.util.List<String> tooltip, boolean advanced)
			{
			
				int dmg = stack.getMaxDamage() - stack.getItemDamage();
				tooltip.add("Durability: §c" + dmg);
				
			}
			
			public boolean getIsRepairable(ItemStack stack, ItemStack stack2){
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_BRONZE).getItem();
			}
			
		}.setUnlocalizedName("adamantium_boots").setRegistryName(NaberiusCore.ModID, "adamantium_boots");
		adamantium_boots.setMaxStackSize(1);
	}
	
}
