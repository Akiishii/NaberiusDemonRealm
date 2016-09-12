package naberius.dimension.demon;

import naberius.config.NaberiusConfig;
import naberius.registry.*;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldProviderHell;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DemonWorldProvider extends WorldProviderHell {

	@Override
	public void createBiomeProvider() {
		this.biomeProvider = new BiomeProviderSingle(ModBiomes.demonBiome);
		this.setDimension(NaberiusConfig.dimensionID);
	}
	
	@Override
	public String getSaveFolder() {
		return "DIM-" + NaberiusConfig.dimensionID;
	}
		
	@Override
	public IChunkGenerator createChunkGenerator() {
		return new DemonChunkProvider(worldObj);
	}
	
	@Override
	public boolean isSurfaceWorld() {
		return false;
	}

	@Override
	public boolean canRespawnHere() {
		return false;
	}
	
	@Override
	public int getRespawnDimension(EntityPlayerMP player) {
		return 0;
	}
	
	@Override
	public boolean canDoRainSnowIce(Chunk chunk) {
		return false;
	}
	
	@Override
	public String getWelcomeMessage() {
		return "DOOM";
	}

	@Override
	public DimensionType getDimensionType() {
		return ModDimensions.demonDimension;
	}
	
}
