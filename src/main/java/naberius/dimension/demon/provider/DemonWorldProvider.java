package naberius.dimension.demon.provider;

import naberius.config.NaberiusConfig;
import naberius.init.BiomeRegistry;
import naberius.init.DimensionRegistry;
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

public class DemonWorldProvider extends WorldProvider {

	@Override
	public void createBiomeProvider() {
		this.biomeProvider = new BiomeProviderSingle(BiomeRegistry.demonBiome);
		this.setDimension(NaberiusConfig.DIMENSIONID);
	}
	
	@Override
	public String getSaveFolder() {
		return "DIM-" + NaberiusConfig.DIMENSIONID;
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
		return DimensionRegistry.demonDimension;
	}
	
}
