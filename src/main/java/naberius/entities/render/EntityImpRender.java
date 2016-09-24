package naberius.entities.render;

import naberius.entities.EntityImp;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class EntityImpRender extends RenderLiving<EntityImp>{

	private ResourceLocation mobTexture = new ResourceLocation("naberius:textures/entity/imp.png");
	
	public static final Factory FACTORY = new Factory();
	
	public EntityImpRender(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelZombie(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityImp entity) {
		return mobTexture;
	}

	public static class Factory implements IRenderFactory<EntityImp>{
		
		@Override
		public Render<? super EntityImp> createRenderFor(RenderManager manager){
			return new EntityImpRender(manager);
		}
		
	}
	
	
}
