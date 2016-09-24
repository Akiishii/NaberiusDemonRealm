package naberius.init;

import naberius.NaberiusCore;
import naberius.entities.EntityDemon;
import naberius.entities.EntityDemonKing;
import naberius.entities.EntityGDemon;
import naberius.entities.EntityImp;
import naberius.entities.render.EntityDemonKingRender;
import naberius.entities.render.EntityDemonRender;
import naberius.entities.render.EntityGDemonRender;
import naberius.entities.render.EntityImpRender;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry.EntityRegistration;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityRegister {

	public static EnumCreatureAttribute DEMON = EnumHelper.addCreatureAttribute("DEMON");
	
	public static void init() {
        // Every entity in our mod has an ID (local to this mod)
        int id = 1;
        EntityRegistry.registerModEntity(EntityDemon.class, "Demon", id++, NaberiusCore.INSTANCE, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(EntityGDemon.class, "GDemon", id++, NaberiusCore.INSTANCE, 64, 3, true, 0xFFFFFF, 0x00ff00);
        EntityRegistry.registerModEntity(EntityImp.class, "Imp", id++, NaberiusCore.INSTANCE, 64, 3, true, 0x000000, 0x00ff00);
        EntityRegistry.registerModEntity(EntityDemonKing.class, "DemonKing", id++, NaberiusCore.INSTANCE, 64, 3, true, 0x123578, 0x00ff00);

        // We want our mob to spawn in Plains and ice plains biomes. If you don't add this then it will not spawn automatically
        // but you can of course still make it spawn manually
        EntityRegistry.addSpawn(EntityDemon.class, 10, 1, 2, EnumCreatureType.MONSTER, Biomes.PLAINS, Biomes.ICE_PLAINS);
        EntityRegistry.addSpawn(EntityGDemon.class, 10, 1, 2, EnumCreatureType.MONSTER, Biomes.PLAINS, Biomes.ICE_PLAINS);
        EntityRegistry.addSpawn(EntityImp.class, 10, 1, 2, EnumCreatureType.MONSTER, Biomes.PLAINS, Biomes.ICE_PLAINS);

        // This is the loot table for our mob
        LootTableList.register(EntityDemon.LOOT);
        LootTableList.register(EntityGDemon.LOOT);
        LootTableList.register(EntityImp.LOOT);
        LootTableList.register(EntityDemonKing.LOOT);
        
    }
	
    @SideOnly(Side.CLIENT)
    public static void initModels() {
    	RenderingRegistry.registerEntityRenderingHandler(EntityDemon.class, EntityDemonRender.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityGDemon.class, EntityGDemonRender.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityImp.class, EntityImpRender.FACTORY);
    	RenderingRegistry.registerEntityRenderingHandler(EntityDemonKing.class, EntityDemonKingRender.FACTORY);
    }
	
}
