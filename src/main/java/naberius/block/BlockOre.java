package naberius.block;

public class BlockOre extends BlockBase{
	
	private String name;
	
	public BlockOre(int i, String name) {
		super(name);
		this.name = name;
		
		setHarvestLevel("pickaxe", i);
	}
	
}
