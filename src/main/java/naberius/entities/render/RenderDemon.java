package naberius.entities.render;

import javax.annotation.Nonnull;

import naberius.entities.EntityDemon;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderDemon extends RenderLiving<EntityDemon>{

	
	private ResourceLocation mobTexture = new ResourceLocation("nta:textures/entity/demon.png");
	
	public static final Factory FACTORY = new Factory();

	public RenderDemon(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelZombie(), 0.5F);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	@Nonnull
	protected ResourceLocation getEntityTexture(@Nonnull EntityDemon entity){
		return mobTexture;
	}
	
	public static class Factory implements IRenderFactory<EntityDemon>{
		
		@Override
		public Render<? super EntityDemon> createRenderFor(RenderManager manager){
			return new RenderDemon(manager);
		}
		
	}
	
}
