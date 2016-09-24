package naberius.block;

import naberius.NaberiusCore;
import naberius.config.NaberiusConfig;
import naberius.tiles.TileHellForge;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockHellforge extends BlockMachineBase{

	public BlockHellforge() {
		
		super(Material.ROCK, "HellForge");
		setRegistryName(NaberiusCore.ModID, "HellForge");
		
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		
		return new TileHellForge();
		
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {

		if(worldIn.isRemote){
			return true;
		} else {
			TileEntity tile = worldIn.getTileEntity(pos);
			if(tile instanceof TileHellForge){
				playerIn.openGui(NaberiusCore.INSTANCE, NaberiusConfig.GUI_HELLFORGE, worldIn, pos.getX(), pos.getY(), pos.getZ());
			}
			
			return true;
		}
		
	}
	
}
