package naberius.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemCore extends ItemBase{

	public static final int CORE_TITANIUM = 0;
	public static final int CORE_VIBRANIUM = 1;
	public static final int CORE_ADAMANTIUM = 2;
	public static final int CORE_SIRIUM = 3;
	public static final int CORE_DEMONIC = 4;
	public static final int CORE_STEEL = 5;
	public static final int CORE_BRONZE = 6;
	public static final int CORE_SILVER = 7;
	
	public ItemCore() {
		super("core");
		setHasSubtypes(true);
		setMaxDamage(0);
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> list) {
		for (int i = 0; i<=7; i++){
			list.add(new ItemStack(item, 1, i));
		}
	}
	
}
