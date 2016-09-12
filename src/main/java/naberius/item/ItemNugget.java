package naberius.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemNugget extends ItemBase{

	public static final int NUGGET_TITANIUM = 0;
	public static final int NUGGET_VIBRANIUM = 1;
	public static final int NUGGET_ADAMANTIUM = 2;
	public static final int NUGGET_SIRIUM = 3;
	public static final int NUGGET_DEMON = 4;
	public static final int NUGGET_SILVER = 5;
	public static final int NUGGET_STEEL = 6;
	public static final int NUGGET_BRONZE = 7;
	public static final int NUGGET_COPPER = 8;
	public static final int NUGGET_TIN = 9;
	
	public ItemNugget() {
		super("nugget");
		
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
