package naberius.item.material;

import java.util.List;

import naberius.item.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemPlate extends ItemBase{

	public static final int PLATE_TITANIUM = 0;
	public static final int PLATE_VIBRANIUM = 1;
	public static final int PLATE_ADAMANTIUM = 2;
	public static final int PLATE_SIRIUM = 3;
	public static final int PLATE_DEMONIC = 4;
	public static final int PLATE_STEEL = 5;
	public static final int PLATE_BRONZE = 6;
	public static final int PLATE_SILVER = 7;
	public static final int PLATE_COPPER = 8;
	public static final int PLATE_TIN = 9;
	
	public ItemPlate() {
		super("plate");
		
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
