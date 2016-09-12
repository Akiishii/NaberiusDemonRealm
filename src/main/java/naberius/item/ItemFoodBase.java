package naberius.item;

import naberius.NaberiusCore;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemFoodBase extends ItemFood{

	private String name;
	
	public ItemFoodBase(int amount, float saturation, boolean isWolfFood, String name) {
		super(amount, saturation, isWolfFood);
		
		this.name = name;
		setRegistryName(name);
		setCreativeTab(NaberiusCore.INSTANCE.tab);
	}

	@Override
	public String getUnlocalizedName(){
		return "item." + NaberiusCore.ModID + ":" + name;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		if (getHasSubtypes()) {
			return getUnlocalizedName() + "." + stack.getItemDamage();
		}

		return getUnlocalizedName();
	}
	
}
