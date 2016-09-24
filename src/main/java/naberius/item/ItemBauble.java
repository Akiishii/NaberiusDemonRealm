package naberius.item;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.Optional.Interface;
import net.minecraftforge.fml.common.Optional.Method;

@Interface(iface = "baubles.api.IBauble", modid = "baubles", striprefs = true)
public abstract class ItemBauble extends ItemBase implements IBauble{

	public ItemBauble(String name) {
		super(name);
	}

	@Override
	@Method(modid = "baubles")
	public abstract BaubleType getBaubleType(ItemStack itemstack);

	@Override
	@Method(modid = "baubles")
	public abstract void onWornTick(ItemStack itemstack, EntityLivingBase player);

	@Override
	@Method(modid = "baubles")
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		if(!player.worldObj.isRemote){
			player.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_TOUCH, 0.1F, 0.5F * ((player.worldObj.rand.nextFloat() - player.worldObj.rand.nextFloat()) * 0.7F + 2.2F));
		}
	}

	@Override
	@Method(modid = "baubles")
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {}

	@Override
	@Method(modid = "baubles")
	public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

	@Override
	@Method(modid = "baubles")
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

}
