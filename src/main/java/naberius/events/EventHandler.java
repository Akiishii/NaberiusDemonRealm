package naberius.events;

import naberius.registry.ModEnchants;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {

	@SubscribeEvent(priority = EventPriority.LOWEST)
	public void onHarvestDrops(HarvestDropsEvent e){
		EntityPlayer harvester = e.getHarvester();
		ModEnchants.performAction("autosmelt", harvester, e);
	}
	
}
