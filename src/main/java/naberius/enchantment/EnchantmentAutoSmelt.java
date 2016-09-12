package naberius.enchantment;

import java.util.List;
import java.util.Random;

import naberius.NaberiusCore;
import naberius.utils.NaberiusUtils;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.Event;

public class EnchantmentAutoSmelt extends EnchantmentBase {

	private Random random = new Random();
	private World world;

	public EnchantmentAutoSmelt() {
		super("autosmelt", Rarity.VERY_RARE, EnumEnchantmentType.DIGGER,
				new EntityEquipmentSlot[] { EntityEquipmentSlot.MAINHAND });
		setRegistryName(NaberiusCore.ModID, "autosmelt");
	}

	@Override
	public int getMaxLevel() {
		return 1;
	}

	@Override
	public void performAction(Entity entity, Event baseEvent) {
		if (entity != null && this.getEnchantmentLevel(((EntityLivingBase) entity).getHeldItemMainhand()) > 0) {
			HarvestDropsEvent e = (HarvestDropsEvent) baseEvent;
			List<ItemStack> drops = e.getDrops();
			List<ItemStack> dropsCopy = NaberiusUtils.copyList(drops);
			drops.clear();
			for (ItemStack drop : dropsCopy) {
				if (drop != null) {
					ItemStack smeltingResult = FurnaceRecipes.instance().getSmeltingResult(drop);
					if (smeltingResult != null) {
						smeltingResult = smeltingResult.copy();
						smeltingResult.stackSize *= drop.stackSize;
						int fortuneLvl = e.getFortuneLevel();
						if (!(smeltingResult.getItem() instanceof ItemBlock)) {
							smeltingResult.stackSize *= random.nextInt(fortuneLvl + 1) + 1;
						}
						drops.add(smeltingResult);
					} else {
						drops.add(drop);
					}
				}
			}
		}
	}

	@Override
	public boolean canApplyTogether(Enchantment ench) {
		return ench != Enchantments.SILK_TOUCH && super.canApplyTogether(ench);
	}

	@Override
	public int getMinimumEnchantability(int enchantmentLevel) {
		return 15;
	}

	@Override
	public int getMaximumEnchantability(int enchantmentLevel) {
		return 61;
	}
}
