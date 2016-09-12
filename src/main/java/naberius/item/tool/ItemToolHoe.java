package naberius.item.tool;

import naberius.NaberiusCore;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemToolHoe extends ItemHoe{

	private String name;
	
	public ItemToolHoe(ToolMaterial material, String name) {
		super(material);
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
