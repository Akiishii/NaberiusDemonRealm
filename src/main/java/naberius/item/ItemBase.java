package naberius.item;

import naberius.NaberiusCore;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item{

	private String name;

	public ItemBase(String name) {
		
		this.name = name;
		
		setRegistryName(NaberiusCore.ModID, name);
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
