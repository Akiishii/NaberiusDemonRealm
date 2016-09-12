package naberius.entities.render;

import javax.annotation.Nonnull;

import naberius.entities.EntityDemon;
import naberius.entities.EntityGDemon;
import naberius.entities.render.EntityDemonRender.Factory;
import net.minecraft.client.model.ModelEnderman;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class EntityGDemonRender extends RenderLiving<EntityGDemon>{

private ResourceLocation mobTexture = new ResourceLocation("naberius:textures/entity/gDemon.png");
	
	public static final Factory FACTORY = new Factory();

	public EntityGDemonRender(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelEnderman(1.0F), 0.5F);
	}
	
	@Override
	@Nonnull
	protected ResourceLocation getEntityTexture(@Nonnull EntityGDemon entity){
		return mobTexture;
	}
	
	public static class Factory implements IRenderFactory<EntityGDemon>{
		
		@Override
		public Render<? super EntityGDemon> createRenderFor(RenderManager manager){
			return new EntityGDemonRender(manager);
		}
		
	}
	
}
