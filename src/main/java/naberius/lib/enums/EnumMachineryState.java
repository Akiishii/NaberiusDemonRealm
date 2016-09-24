package naberius.lib.enums;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;

public enum EnumMachineryState implements IStringSerializable{

	NORTH_OFF(2, "north_off", false),
	SOUTH_OFF(3, "south_off", false),
	WEST_OFF(4, "west_off", false),
	EAST_OFF(5, "east_off", false),
	NORTH_ON(10, "north_on", true),
	SOUTH_ON(11, "south_on", true),
	WEST_ON(12, "west_on", true),
	EAST_ON(13, "east_on", true);
	
	public final int meta;
	public final String name;
	public final boolean isActivated;
	
	private EnumMachineryState(int meta, String name, boolean isActivated){
		this.meta = meta;
		this.name = name;
		this.isActivated = isActivated;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public static EnumMachineryState fromEnumFacing(EnumFacing facing){
		
		switch (facing) {
		case EAST:
			return EAST_OFF;
		case NORTH:
			return NORTH_OFF;
		case SOUTH:
			return SOUTH_OFF;
		case WEST:
			return WEST_OFF;

		default:
			return null;
		}
		
	}
	
	public static EnumMachineryState fromMetadata(int meta){
		for(EnumMachineryState state : values()){
			if(state.meta == meta){
				return state;
			}
		}
		return SOUTH_OFF;
	}
	
}
