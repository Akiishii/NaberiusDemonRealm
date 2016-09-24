package naberius.block;

import java.util.List;
import java.util.Random;

import com.google.common.collect.Lists;

import naberius.NaberiusCore;
import naberius.item.ItemBlockBase;
import naberius.lib.enums.EnumMachineryState;
import naberius.utils.IRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockMachineBase extends BlockContainer implements IRegistry{

	public static final PropertyEnum FACING = PropertyEnum.create("facing", EnumMachineryState.class);
	protected String blockName;

	protected BlockMachineBase(Material materialIn, String name) {
		super(materialIn);
		this.blockName = name;
		setDefaultState(blockState.getBaseState().withProperty(FACING, EnumMachineryState.NORTH_OFF));

		setCreativeTab(NaberiusCore.INSTANCE.tab);
		setResistance(100F);
		setHardness(5.0F);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 1);

		setUnlocalizedName(name);
	}

	public Item createItem() {
		return new ItemBlockBase(this, false);
	}
	
	public EnumMachineryState getMachineState(World world, BlockPos pos) {

		return getMachineState(world.getBlockState(pos));
		
	}

	public EnumMachineryState getMachineState(IBlockState state) {

		return (EnumMachineryState) state.getValue(FACING);
		
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		
		return null;
		
	}

	@Override
	public int getLightValue(IBlockState state) {
		
		return getMachineState(state).isActivated ? 15 : 0;
		
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		
		return Item.getItemFromBlock(this);
		
	}
	
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {

		this.setDefaultState(worldIn, pos, state);
		
	}

	private void setDefaultState(World worldIn, BlockPos pos, IBlockState state) {

		if(!worldIn.isRemote){
			Block block = worldIn.getBlockState(pos.north()).getBlock();
			Block block1 = worldIn.getBlockState(pos.south()).getBlock();
			Block block2 = worldIn.getBlockState(pos.west()).getBlock();
			Block block3 = worldIn.getBlockState(pos.east()).getBlock();
			
			EnumMachineryState machineryState = (EnumMachineryState) state.getValue(FACING);
			
			if(machineryState == EnumMachineryState.NORTH_OFF && block.isFullBlock(state) && !block1.isFullBlock(state)){
				machineryState = EnumMachineryState.SOUTH_OFF;
			}else if(machineryState == EnumMachineryState.SOUTH_OFF && block1.isFullBlock(state) && !block.isFullBlock(state)){
				machineryState = EnumMachineryState.NORTH_OFF;
			}else if(machineryState == EnumMachineryState.WEST_OFF && block2.isFullBlock(state) && !block3.isFullBlock(state)){
				machineryState = EnumMachineryState.EAST_OFF;
			}else if(machineryState == EnumMachineryState.EAST_OFF && block3.isFullBlock(state) && !block2.isFullBlock(state)){
				machineryState = EnumMachineryState.WEST_OFF;
			}
			
			worldIn.setBlockState(pos, state.withProperty(FACING, machineryState), 2);
			
		}
		
	}
	
	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
		
		EnumMachineryState machineryState = EnumMachineryState.fromEnumFacing(placer.getHorizontalFacing().getOpposite());
		
		return this.getDefaultState().withProperty(FACING, machineryState);
		
	}

	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
		super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
		
		EnumMachineryState machineryState = EnumMachineryState.fromEnumFacing(placer.getHorizontalFacing().getOpposite());
		worldIn.setBlockState(pos, state.withProperty(FACING, machineryState), 2);
	}
	
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {

		TileEntity tile = worldIn.getTileEntity(pos);
		
		if(tile instanceof IInventory){
			
			InventoryHelper.dropInventoryItems(worldIn, pos, (IInventory) tile);
			worldIn.updateComparatorOutputLevel(pos, this);
			
		}
		
	}
	
	@Override
	public boolean hasComparatorInputOverride(IBlockState state) {
		
		return true;
		
	}
	
	@Override
	public int getComparatorInputOverride(IBlockState blockState, World worldIn, BlockPos pos) {
		
		return Container.calcRedstone(worldIn.getTileEntity(pos));
		
	}

	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		
		return new ItemStack(Item.getItemFromBlock(this));
		
	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		
		return EnumBlockRenderType.MODEL;
		
	}
	
	public IBlockState getStateFromMeta(int meta){
		
		EnumMachineryState machineryState = EnumMachineryState.fromMetadata(meta);
		return getDefaultState().withProperty(FACING, machineryState);
		
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		
		return ((EnumMachineryState) state.getValue(FACING)).meta;
		
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		
		return new BlockStateContainer(this, new IProperty[]{FACING});

	}

	@Override
	public void addRecipes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addOreDict() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		return blockName;
	}

	@Override
	public String getFullName() {
		return getModId() + ":" + blockName;
	}

	@Override
	public String getModId() {
		return NaberiusCore.ModID;
	}

	@Override
	public List<ModelResourceLocation> getVariants() {
		return Lists.newArrayList(new ModelResourceLocation(getFullName()));
	}

	@Override
	public boolean registerModels() {
		return false;
	}
	
}
