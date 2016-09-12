package naberius.world;


import java.util.ArrayDeque;
import java.util.Random;

import naberius.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.world.ChunkDataEvent;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class NTAWorldGenerator implements IWorldGenerator {
	
	public NTAWorldGenerator() {
							
	}

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

		switch (world.provider.getDimension()) {
		case 0: 
			addOreSpawn(ModBlocks.ORE_TITANIUM.getDefaultState(), Blocks.STONE.getDefaultState(), world, rand, chunkX * 16, chunkZ * 16, 2, 3, 4, 1, 20);
			addOreSpawn(ModBlocks.ORE_VIBRANIUM.getDefaultState(), Blocks.STONE.getDefaultState(), world, rand, chunkX * 16, chunkZ * 16, 2, 3, 8, 1, 20);
			addOreSpawn(ModBlocks.ORE_SILVER.getDefaultState(), Blocks.STONE.getDefaultState(), world, rand, chunkX * 16, chunkZ * 16, 3, 5, 10, 20, 40);
			addOreSpawn(ModBlocks.ORE_COPPER.getDefaultState(), Blocks.STONE.getDefaultState(), world, rand, chunkX * 16, chunkZ * 16, 4, 6, 20, 30, 64);
			addOreSpawn(ModBlocks.ORE_TIN.getDefaultState(), Blocks.STONE.getDefaultState(), world, rand, chunkX * 16, chunkZ * 16, 4, 6, 20, 30, 64);
		break;
	
		case 1:
			int actualX = chunkX * 16;
			int actualZ = chunkZ * 16;
			int x1 = actualX + rand.nextInt(16);
			int y = 20 + rand.nextInt(170);
			int z1 = actualZ + rand.nextInt(16);
			
			addOreSpawn(ModBlocks.ORE_SIRIUM.getDefaultState(), Blocks.END_STONE.getDefaultState(), world, rand, actualX, actualZ, 4, 5, 10, 1, 70);
		break;
		
		case -1:
			// Nothing to see here.
		break;
		
		case 100:
			addOreSpawn(ModBlocks.ORE_ADAMANTIUM.getDefaultState(), ModBlocks.BLOCK_DEMON_STONE.getDefaultState(), world, rand, chunkX * 16, chunkZ * 16, 2, 4, 50, 5, 256);
		break;
		}
	}
	
	public void addOreSpawn(IBlockState block, IBlockState baseBlock, World world, Random random, int chunkXPos, int chunkZPos, int minVainSize, int maxVainSize, int chancesToSpawn, int minY, int maxY) {
		for (int i = 0; i < chancesToSpawn; i++) {
			int posX = chunkXPos + random.nextInt(16);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = chunkZPos + random.nextInt(16);

			new WorldGenMinable(block, (minVainSize + random.nextInt(maxVainSize - minVainSize)), BlockMatcher.forBlock(baseBlock.getBlock())).generate(world, random, new BlockPos(posX, posY, posZ));
		}
	}
	
}
