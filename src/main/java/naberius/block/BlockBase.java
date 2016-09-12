package naberius.block;

import naberius.NaberiusCore;
import naberius.item.ItemBlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockBase extends Block {

	private String name;

	public BlockBase(String name) {
		super(Material.ROCK);

		this.name = name;

		setHardness(1.9F);
		setRegistryName(NaberiusCore.ModID, name);
		setCreativeTab(NaberiusCore.INSTANCE.tab);

	}

	@Override
	public String getUnlocalizedName() {
		return "block." + NaberiusCore.ModID + ":" + name;
	}

	public Item createItem() {
		return new ItemBlockBase(this, false);
	}

}
