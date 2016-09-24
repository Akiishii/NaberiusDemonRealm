package naberius.item.drops;

import naberius.item.ItemFoodBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemDemonFlesh extends ItemFoodBase{

	public ItemDemonFlesh() {
		super(2, 2.5F, true, "demon_flesh");
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 200));
		player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 200));
		player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 200));
		player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 200));
	}
	
}
