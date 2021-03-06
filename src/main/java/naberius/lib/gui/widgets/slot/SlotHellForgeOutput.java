package naberius.lib.gui.widgets.slot;

import naberius.api.recipe.hellforge.HellForgeRecipe;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.SlotFurnaceOutput;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

public class SlotHellForgeOutput extends SlotFurnaceOutput {

	private EntityPlayer thePlayer;
	private int removeCount;

	public SlotHellForgeOutput(EntityPlayer player, IInventory inventoryIn, int slotIndex,
	      int xPosition, int yPosition) {

	    super(player, inventoryIn, slotIndex, xPosition, yPosition);
	    this.thePlayer = player;
	  }

	public ItemStack decrStackSize(int amount) {

		if (this.getHasStack()) {
			this.removeCount += Math.min(amount, this.getStack().stackSize);
		}

		return super.decrStackSize(amount);
	}

	public void onPickupFromSlot(EntityPlayer playerIn, ItemStack stack) {

		this.onCrafting(stack);
		super.onPickupFromSlot(playerIn, stack);
	}

	/**
	 * the itemStack passed in is the output - ie, iron ingots, and pickaxes,
	 * not ore and wood. Typically increases an internal count then calls
	 * onCrafting(item).
	 */
	protected void onCrafting(ItemStack stack, int amount) {

		this.removeCount += amount;
		this.onCrafting(stack);
	}

	@Override
	protected void onCrafting(ItemStack stack) {

		stack.onCrafting(this.thePlayer.worldObj, this.thePlayer, this.removeCount);

		if (!this.thePlayer.worldObj.isRemote) {
			int i = this.removeCount;

			HellForgeRecipe recipe = HellForgeRecipe.getRecipeByOutput(stack);
			float f = recipe == null ? 0 : recipe.getExperience();

			if (f == 0.0F) {
				i = 0;
			} else if (f < 1.0F) {
				int j = MathHelper.floor_float((float) i * f);

				if (j < MathHelper.ceiling_float_int((float) i * f)
						&& Math.random() < (double) ((float) i * f - (float) j)) {
					++j;
				}

				i = j;
			}

			while (i > 0) {
				int k = EntityXPOrb.getXPSplit(i);
				i -= k;
				this.thePlayer.worldObj.spawnEntityInWorld(new EntityXPOrb(this.thePlayer.worldObj, this.thePlayer.posX,
						this.thePlayer.posY + 0.5D, this.thePlayer.posZ + 0.5D, k));
			}
		}

		this.removeCount = 0;
	}

}
