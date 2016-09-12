package naberius.entities.ai;

import naberius.entities.EntityDemon;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAttackMelee;

public class EntityAIDemonAttack extends EntityAIAttackMelee{

	private int raiseArmTicks;
	private EntityDemon demon;
	
	public EntityAIDemonAttack(EntityDemon demonIn, double speedIn, boolean longMemoryIn) {
		super(demonIn, speedIn, longMemoryIn);
		this.demon = demonIn;
	}

	@Override
	public void startExecuting(){
		super.startExecuting();
		this.raiseArmTicks = 0;
	}
	
	@Override
	public void resetTask() {
		super.resetTask();
		this.demon.setArmsRaised(false);
	}
	
	@Override
	public void updateTask() {
		super.updateTask();
		++this.raiseArmTicks;
		
		if(raiseArmTicks >= 5 && this.attackTick < 10){
			this.demon.setArmsRaised(true);
		} else {
			this.demon.setArmsRaised(false);
		}
	}
	
}
