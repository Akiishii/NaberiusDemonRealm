package naberius.enchantment;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import com.google.common.collect.Lists;

import net.minecraft.client.resources.I18n;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.eventhandler.Event;

public abstract class EnchantmentBase extends Enchantment{

	public static List<EnchantmentBase> ntaEnchantments = Lists.newArrayList();
	
	protected EnchantmentBase(String name, Rarity rarityIn, EnumEnchantmentType typeIn, EntityEquipmentSlot... slots) {
		super(rarityIn, typeIn, slots);
		this.setName(name);
		ntaEnchantments.add(this);
		
	}
	
	@Override
	public boolean isAllowedOnBooks() {
		return true;
	}
	
	protected int getEnchantmentLevel(ItemStack itemstack) {
		return EnchantmentHelper.getEnchantmentLevel(this, itemstack);
	}

	@Override
	public int getMinEnchantability(int enchantmentLevel) {
		return getMinimumEnchantability(enchantmentLevel);
	}

	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
		return getMaximumEnchantability(enchantmentLevel);
	}
	
	public abstract void performAction(Entity entity, Event baseEvent);

	public abstract int getMinimumEnchantability(int enchantmentLevel);

	public abstract int getMaximumEnchantability(int enchantmentLevel);
	
}
