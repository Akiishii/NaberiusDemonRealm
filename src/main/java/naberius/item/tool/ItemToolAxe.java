package naberius.item.tool;

import java.util.List;

import naberius.NaberiusCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemToolAxe extends ItemToolAdvancedAxe{

	private String name;
	private int enchantmentLvl;
	private Enchantment enchantment;
	
	public ItemToolAxe(ToolMaterial material, String name, Enchantment enchantment, int enchantmentLvl) {
		super(material, 4F);
		this.name = name;
		this.enchantment = enchantment;
		this.enchantmentLvl = enchantmentLvl;
		
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
	
	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems) {
		ItemStack result = new ItemStack(itemIn);
	       
		if(enchantment != null && enchantmentLvl != -1) result.addEnchantment(enchantment, enchantmentLvl);
       
        subItems.add(result);
	}

}
