package naberius.item;

import java.util.List;

import naberius.NaberiusCore;
import naberius.config.NaberiusConfig;
import naberius.container.inventory.InventoryBackpack;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemBackpack extends ItemBase{

	public static final int WHITE_BACKPACK = 0;
	public static final int GREEN_BACKPACK = 1;
	public static final int BLUE_BACKPACK = 2;
	public static final int LIME_BACKPACK = 3;
	public static final int BROWN_BACKPACK = 4;
	public static final int BLACK_BACKPACK = 5;
	public static final int RED_BACKPACK = 6;
	public static final int YELLOW_BACKPACK = 7;
	public static final int PINK_BACKPACK = 8;
	public static final int GRAY_BACKPACK = 9;
	public static final int LIGHT_BLUE_BACKPACK = 10;
	public static final int LIGHT_GRAY_BACKPACK = 11;
	public static final int PURPLE_BACKPACK = 12;
	public static final int CYAN_BACKPACK = 13;
	public static final int MAGENTA_BACKPACK = 14;
	
	
	public ItemBackpack() {
		super("backpack");
		setHasSubtypes(true);
		setMaxDamage(0);
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> list) {
		for (int i = 0; i<=14; i++){
			list.add(new ItemStack(item, 1, i));
		}
	}
	
	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		super.onCreated(stack, worldIn, playerIn);
		
		new InventoryBackpack(stack);
		
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		if(!worldIn.isRemote){
			playerIn.openGui(NaberiusCore.INSTANCE, NaberiusConfig.GUI_BACKPACK, worldIn, 0, 0, 0);
		}
		
		return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
		
	}
	
}
