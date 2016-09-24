package naberius.entities.render;

import javax.annotation.Nonnull;

import naberius.entities.EntityDemonKing;
import net.minecraft.client.model.ModelSkeleton;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class EntityDemonKingRender extends RenderLiving<EntityDemonKing>{

    private ResourceLocation mobTexture = new ResourceLocation("naberius:textures/entity/demonKing.png");

    public static final Factory FACTORY = new Factory();

    public EntityDemonKingRender(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelZombie(), 1.0F);
    }

    @Override
    protected void preRenderCallback(EntityDemonKing entitylivingbaseIn, float partialTickTime) {
        GlStateManager.scale(4, 4, 4);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityDemonKing entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityDemonKing> {

        @Override
        public Render<? super EntityDemonKing> createRenderFor(RenderManager manager) {
            return new EntityDemonKingRender(manager);
        }

    }
	
}
