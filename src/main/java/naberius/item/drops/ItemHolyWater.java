package naberius.item.drops;

import naberius.item.ItemBase;
import net.minecraft.item.ItemStack;

public class ItemHolyWater extends ItemBase{

	public ItemHolyWater() {
		super("holy_water");
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}
	
	
}
