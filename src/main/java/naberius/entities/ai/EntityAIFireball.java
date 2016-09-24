package naberius.entities.ai;

import naberius.entities.EntityImp;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class EntityAIFireball extends EntityAIBase{

    private final EntityImp blaze;
    private int attackStep;
    private int attackTime;

    public EntityAIFireball(EntityImp entityImp)
    {
        this.blaze = entityImp;
        this.setMutexBits(3);
    }

    public boolean shouldExecute()
    {
        EntityLivingBase entitylivingbase = this.blaze.getAttackTarget();
        return entitylivingbase != null && entitylivingbase.isEntityAlive();
    }

    public void startExecuting()
    {
        this.attackStep = 0;
    }

    public void updateTask()
    {
        --this.attackTime;
        EntityLivingBase entitylivingbase = this.blaze.getAttackTarget();
        double d0 = this.blaze.getDistanceSqToEntity(entitylivingbase);

        if (d0 < 4.0D)
        {
            if (this.attackTime <= 0)
            {
                this.attackTime = 20;
                this.blaze.attackEntityAsMob(entitylivingbase);
            }

            this.blaze.getMoveHelper().setMoveTo(entitylivingbase.posX, entitylivingbase.posY, entitylivingbase.posZ, 1.0D);
        }
        else if (d0 < 256.0D)
        {
            double d1 = entitylivingbase.posX - this.blaze.posX;
            double d2 = entitylivingbase.getEntityBoundingBox().minY + (double)(entitylivingbase.height / 2.0F) - (this.blaze.posY + (double)(this.blaze.height / 2.0F));
            double d3 = entitylivingbase.posZ - this.blaze.posZ;

            if (this.attackTime <= 0)
            {
                ++this.attackStep;

                if (this.attackStep == 1)
                {
                    this.attackTime = 60;
                }
                else if (this.attackStep <= 4)
                {
                    this.attackTime = 6;
                }
                else
                {
                    this.attackTime = 100;
                    this.attackStep = 0;
                }

                if (this.attackStep > 1)
                {
                    float f = MathHelper.sqrt_float(MathHelper.sqrt_double(d0)) * 0.5F;
                    this.blaze.worldObj.playEvent((EntityPlayer)null, 1018, new BlockPos((int)this.blaze.posX, (int)this.blaze.posY, (int)this.blaze.posZ), 0);

                    for (int i = 0; i < 1; ++i)
                    {
                        EntitySmallFireball entitysmallfireball = new EntitySmallFireball(this.blaze.worldObj, this.blaze, d1 + this.blaze.getRNG().nextGaussian() * (double)f, d2, d3 + this.blaze.getRNG().nextGaussian() * (double)f);
                        entitysmallfireball.posY = this.blaze.posY + (double)(this.blaze.height / 2.0F) + 0.5D;
                        this.blaze.worldObj.spawnEntityInWorld(entitysmallfireball);
                    }
                }
            }

            this.blaze.getLookHelper().setLookPositionWithEntity(entitylivingbase, 10.0F, 10.0F);
        }
        else
        {
            this.blaze.getNavigator().clearPathEntity();
            this.blaze.getMoveHelper().setMoveTo(entitylivingbase.posX, entitylivingbase.posY, entitylivingbase.posZ, 1.0D);
        }

        super.updateTask();
    }
}
