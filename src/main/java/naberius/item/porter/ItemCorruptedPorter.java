package naberius.item.porter;

import java.util.List;

import naberius.item.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ItemCorruptedPorter extends ItemBase{

	public ItemCorruptedPorter() {
		super("corrupted_porter");
		this.setMaxStackSize(1);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		tooltip.add("This Item is corrupted by something");
		tooltip.add("You will need to find a way to cleanse the corruption to use it.");
	}
	
}
