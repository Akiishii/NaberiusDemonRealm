package naberius.item.armor;

import naberius.NaberiusCore;
import naberius.handler.MaterialHandler;
import naberius.init.ItemRegistry;
import naberius.item.material.ItemIngot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemDemonicArmor {

	public static Item demonic_helmet;
	public static Item demonic_chest;
	public static Item demonic_leggs;
	public static Item demonic_boots;
	
	public ItemDemonicArmor() {
		
		demonic_helmet.setCreativeTab(NaberiusCore.INSTANCE.tab);
		demonic_chest.setCreativeTab(NaberiusCore.INSTANCE.tab);
		demonic_leggs.setCreativeTab(NaberiusCore.INSTANCE.tab);
		demonic_boots.setCreativeTab(NaberiusCore.INSTANCE.tab);
		
	}

	public void registerRenderers() {}
	
	static
	{
	
		ItemArmor.ArmorMaterial DEMONIC = MaterialHandler.Armor.Demonic;
		
		int armorPrefix = 0;
		
		demonic_helmet = (Item)new ItemArmor(DEMONIC, armorPrefix, EntityEquipmentSlot.HEAD){
			
			@SideOnly(Side.CLIENT)
			public void addInformation(net.minecraft.item.ItemStack stack, net.minecraft.entity.player.EntityPlayer playerIn, java.util.List<String> tooltip, boolean advanced)
			{
				
				int dmg = stack.getMaxDamage() - stack.getItemDamage();
				tooltip.add("Durability: §c" + dmg);
				
			}
			
			public void onArmorTick(World world, EntityPlayer entity, ItemStack stack){
				
				ItemStack head = entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
				ItemStack chest = entity.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
				ItemStack leggs = entity.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
				ItemStack boots = entity.getItemStackFromSlot(EntityEquipmentSlot.FEET);
				
				if (((head != null) && (head.getItem() == ItemDemonicArmor.demonic_helmet) && (chest != null) && (chest.getItem() == ItemDemonicArmor.demonic_chest) && (leggs != null) && (leggs.getItem() == ItemDemonicArmor.demonic_leggs) && (boots != null) && (boots.getItem() == ItemDemonicArmor.demonic_boots)) || (entity.capabilities.isCreativeMode) || (entity.isSpectator()))
		          {
		            entity.capabilities.allowFlying = true;
		          }
		          else
		          {
		            entity.capabilities.isFlying = false;
		            entity.capabilities.allowFlying = false;
		          }
				
			}
			
			public boolean getIsRepairable(ItemStack stack, ItemStack stack2){
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_DEMONIC).getItem();
			}
		}.setUnlocalizedName("demonic_helmet").setRegistryName(NaberiusCore.ModID, "demonic_helmet");
		demonic_helmet.setMaxStackSize(1);
		
		demonic_chest = (Item)new ItemArmor(DEMONIC, armorPrefix, EntityEquipmentSlot.CHEST){
			
			@SideOnly(Side.CLIENT)
			public void addInformation(ItemStack stack, net.minecraft.entity.player.EntityPlayer playerIn, java.util.List<String> tooltip, boolean advanced)
			{
			
				int dmg = stack.getMaxDamage() - stack.getItemDamage();
				tooltip.add("Durability: §c" + dmg);
				
			}
			
			public boolean getIsRepairable(ItemStack stack, ItemStack stack2){
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_DEMONIC).getItem();
			}
			
		}.setUnlocalizedName("demonic_chest").setRegistryName(NaberiusCore.ModID, "demonic_chest");
		demonic_chest.setMaxStackSize(1);
		
		demonic_leggs = (Item)new ItemArmor(DEMONIC, armorPrefix, EntityEquipmentSlot.LEGS){
			
			@SideOnly(Side.CLIENT)
			public void addInformation(ItemStack stack, net.minecraft.entity.player.EntityPlayer playerIn, java.util.List<String> tooltip, boolean advanced)
			{
			
				int dmg = stack.getMaxDamage() - stack.getItemDamage();
				tooltip.add("Durability: §c" + dmg);
				
			}
			
			public boolean getIsRepairable(ItemStack stack, ItemStack stack2){
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_DEMONIC).getItem();
			}
			
		}.setUnlocalizedName("demonic_leggs").setRegistryName(NaberiusCore.ModID, "demonic_leggs");
		demonic_leggs.setMaxStackSize(1);
		
		demonic_boots = (Item)new ItemArmor(DEMONIC, armorPrefix, EntityEquipmentSlot.FEET){
			
			@SideOnly(Side.CLIENT)
			public void addInformation(ItemStack stack, net.minecraft.entity.player.EntityPlayer playerIn, java.util.List<String> tooltip, boolean advanced)
			{
			
				int dmg = stack.getMaxDamage() - stack.getItemDamage();
				tooltip.add("Durability: §c" + dmg);
				
			}
			
			public boolean getIsRepairable(ItemStack stack, ItemStack stack2){
				return stack2.getItem() == new ItemStack(ItemRegistry.INGOT, 1, ItemIngot.INGOT_DEMONIC).getItem();
			}
			
		}.setUnlocalizedName("demonic_boots").setRegistryName(NaberiusCore.ModID, "demonic_boots");
		demonic_boots.setMaxStackSize(1);
	}
	
}
