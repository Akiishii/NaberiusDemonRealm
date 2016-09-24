package naberius.enchantment;

import naberius.NaberiusCore;
import naberius.init.EntityRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentDamage;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class EnchantmentHoly extends EnchantmentDamage{

	public EnchantmentHoly() {
		super(Rarity.RARE, 5, new EntityEquipmentSlot[]{EntityEquipmentSlot.MAINHAND});
		setRegistryName(NaberiusCore.ModID, "holy");
	}	
	
	@Override
	public int getMinEnchantability(int enchantmentLevel) {
		return 5 + (enchantmentLevel - 1) * 8;
	}
	
	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
		return getMinEnchantability(enchantmentLevel) + 20;
	}
	
	@Override
	public int getMaxLevel() {
		return 5;
	}
	
	@Override
	public float calcDamageByCreature(int level, EnumCreatureAttribute creatureType) {
		return creatureType == EntityRegister.DEMON ? level * 2F : 0.0F;
	}
	
	@Override
	public boolean canApply(ItemStack stack) {
		return stack.getItem() instanceof ItemSword ? true : super.canApply(stack);
	}
	
	@Override
	public boolean canApplyTogether(Enchantment ench) {
		return !(ench instanceof EnchantmentDamage);
	}
	
	@Override
	public String getName() {
		return "enchantment.holy";
	}
	
}
