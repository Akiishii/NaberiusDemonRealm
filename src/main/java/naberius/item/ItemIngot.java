package naberius.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemIngot extends ItemBase{

	public static final int INGOT_TITANIUM = 0;
	public static final int INGOT_VIBRANIUM = 1;
	public static final int INGOT_ADAMANTIUM = 2;
	public static final int INGOT_SIRIUM = 3;
	public static final int INGOT_DEMONIC = 4;
	public static final int INGOT_STEEL = 5;
	public static final int INGOT_BRONZE = 6;
	public static final int INGOT_SILVER = 7;
	public static final int INGOT_COPPER = 8;
	public static final int INGOT_TIN = 9;
	
	
	public ItemIngot() {
		super("ingot");
		
		setHasSubtypes(true);
		setMaxDamage(0);
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> list) {
		for (int i = 0; i<=9; i++){
			list.add(new ItemStack(item, 1, i));
		}
	}

}
