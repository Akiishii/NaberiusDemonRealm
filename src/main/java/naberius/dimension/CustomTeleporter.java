package naberius.dimension;

import javax.annotation.Nonnull;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class CustomTeleporter extends Teleporter{

	private final WorldServer world;
	private double x;
	private double y;
	private double z;
	
	public CustomTeleporter(WorldServer world, double x, double y, double z) {
		super(world);
		this.world = world;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	    
	@Override
	public void placeInPortal(@Nonnull Entity entity, float rotationYaw) {
		
		this.world.getBlockState(new BlockPos((int) this.x, (int) this.y, (int) this.z));
		
		entity.setPosition(this.x, this.y, this.z);
		entity.motionX = 0.0f;
		entity.motionY = 0.0f;
		entity.motionZ = 0.0f;
		
	}
	
	public static void teleportToDimension(EntityPlayer player, int dim, double x, double y, double z){
		
		int oldDimension = player.worldObj.provider.getDimension();
		EntityPlayerMP playerMP = (EntityPlayerMP) player;
		MinecraftServer server = ((EntityPlayerMP) player).worldObj.getMinecraftServer();
		WorldServer wServer = server.worldServerForDimension(dim);
		player.addExperienceLevel(0);
		
		if(wServer == null || wServer.getMinecraftServer() == null){
			throw new IllegalArgumentException("Dimension: " + dim + "does not exist!");
		}
		
		wServer.getMinecraftServer().getPlayerList().transferPlayerToDimension(playerMP, dim, new CustomTeleporter(wServer, x, y, z));
		player.setPositionAndUpdate(x, y, z);
		
		if(oldDimension == 1){
			player.setPositionAndUpdate(x, y, z);
			wServer.spawnEntityInWorld(player);
			wServer.updateEntityWithOptionalForce(player, false);
		}
		
	}
	
}
