package naberius.init;

import java.util.Optional;

import naberius.enchantment.*;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EnchantmentRegistry {

	public static EnchantmentDevourer DEVOURER;
	public static EnchantmentAutoSmelt AUTO_SMELT;
	public static EnchantmentHoly HOLY;

	public static void init(){
	
		DEVOURER = new EnchantmentDevourer();
		AUTO_SMELT = new EnchantmentAutoSmelt();
		HOLY = new EnchantmentHoly();
		
		register();
	}
	
	private static void register(){
		
		registerEnchantment(EnchantmentRegistry.DEVOURER);
		registerEnchantment(EnchantmentRegistry.AUTO_SMELT);
		registerEnchantment(EnchantmentRegistry.HOLY);
		
	}
	
	
	private static void registerEnchantment(Enchantment ench){
		GameRegistry.register(ench);
	}
	
	public static void performAction(String enchantmentName, Entity entity, Event baseEvent) {
		Optional<EnchantmentBase> naberiusEnchantment = getByName(enchantmentName);
		if (naberiusEnchantment.isPresent())
			naberiusEnchantment.get().performAction(entity, baseEvent);
	}

	private static Optional<EnchantmentBase> getByName(String enchantmentName) {
		return EnchantmentBase.naberiusEnchantments.stream().filter(enchantment -> enchantment.getName().replaceFirst("enchantment\\.","").equals(enchantmentName)).findFirst();
	}
	
}
