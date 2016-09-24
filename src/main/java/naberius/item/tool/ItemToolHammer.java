package naberius.item.tool;

import java.util.List;

import naberius.item.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemToolHammer extends ItemBase{

	public ItemToolHammer(int i) {
		super("tool_hammer");
		setMaxDamage(i);
		setMaxStackSize(1);
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		
		ItemStack stack = itemStack.copy();
		
		stack.setItemDamage(stack.getItemDamage() + 1);
		stack.stackSize = 1;
		
		return stack;
	}
	
	@Override
	public boolean hasContainerItem() {
		return true;
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		
		int damage = stack.getMaxDamage() - stack.getItemDamage() + 1;
		tooltip.add("Durability: §c" + damage);
		super.addInformation(stack, playerIn, tooltip, advanced);
	}
}
