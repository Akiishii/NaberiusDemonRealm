package naberius.enchantment;

import naberius.NaberiusCore;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.fml.common.eventhandler.Event;

public class EnchantmentDevourer extends EnchantmentBase{

	public EnchantmentDevourer() {
		super("devourer", Rarity.VERY_RARE, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[]{EntityEquipmentSlot.MAINHAND});
		setRegistryName(NaberiusCore.ModID, "devourer");
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	public void performAction(Entity entity, Event baseEvent) {
	
		
		
	}

	@Override
	public int getMinimumEnchantability(int enchantmentLevel) {
		return 15;
	}

	@Override
	public int getMaximumEnchantability(int enchantmentLevel) {
		// TODO Auto-generated method stub
		return 61;
	}
	
}
