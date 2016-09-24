package naberius.dimension;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class TeleporterNormal extends Teleporter {

	private BlockPos coords;
	private final WorldServer world;

	public TeleporterNormal(WorldServer world, BlockPos coords) {
		this(world);
		this.coords = coords;
	}

	public TeleporterNormal(WorldServer world) {
		super(world);
		this.world = world;
	}

	public void placeInPortal(Entity entity, float p_180266_2_) {
		entity.noClip = true;
		if (this.coords != null) {
			entity.setPositionAndRotation(this.coords.getX() + 0.5F, this.coords.getY() + 0.1F,
					this.coords.getZ() + 0.5F, entity.rotationYaw, 0.0F);
		}
		while (!this.world.getCollisionBoxes(entity.getEntityBoundingBox()).isEmpty()) {
			entity.setPosition(entity.posX, entity.posY + 0.5D, entity.posZ);
		}
	}

}
