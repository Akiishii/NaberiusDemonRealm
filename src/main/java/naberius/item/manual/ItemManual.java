package naberius.item.manual;

import java.util.List;

import org.lwjgl.input.Keyboard;

import naberius.NaberiusCore;
import naberius.config.NaberiusConfig;
import naberius.item.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class ItemManual extends ItemBase{

	public ItemManual() {
		super("manual");
		setMaxStackSize(1);
	}

	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return 1;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		if(worldIn.isRemote){
			playerIn.openGui(NaberiusCore.ModID, NaberiusConfig.GUI_MANUAL, playerIn.worldObj, (int) playerIn.posX, (int) playerIn.posY, (int) playerIn.posZ);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
		}
		
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
		
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		super.addInformation(stack, playerIn, tooltip, advanced);
		
		if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)){
			tooltip.add("Edition: " + NaberiusCore.Version);
		} else {
			tooltip.add(TextFormatting.RED + "<Press Shift>");
		}
	}
	
}
