package naberius.container;

import naberius.api.recipe.hellforge.HellForgeRecipe;
import naberius.lib.gui.widgets.slot.SlotHellForgeOutput;
import naberius.tiles.TileHellForge;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnaceFuel;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;

public class ContainerHellForge extends Container {

	private final IInventory tileHellForge;
	private int cookTime;
	private int totalCookTime;
	private int furnaceBurnTime;
	private int currentItemBurnTime;

	public ContainerHellForge(InventoryPlayer playerInv, IInventory forgeInventory) {

		this.tileHellForge = forgeInventory;

		// Input slots
		addSlotToContainer(new Slot(forgeInventory, 0, 50, 8));
		addSlotToContainer(new Slot(forgeInventory, 1, 50, 26));
		addSlotToContainer(new Slot(forgeInventory, 2, 50, 44));
		addSlotToContainer(new Slot(forgeInventory, 3, 50, 62));

		// Fuel slot
		addSlotToContainer(new SlotFurnaceFuel(forgeInventory, TileHellForge.SLOT_FUEL, 13, 42));

		// Output slot
		addSlotToContainer(
				new SlotHellForgeOutput(playerInv.player, forgeInventory, TileHellForge.SLOT_OUTPUT, 116, 35));

		// Player inventory
		int i;
		for (i = 0; i < 3; ++i) {
			for (int j = 0; j < 9; ++j) {
				this.addSlotToContainer(new Slot(playerInv, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}

		for (i = 0; i < 9; ++i) {
			this.addSlotToContainer(new Slot(playerInv, i, 8 + i * 18, 142));
		}

	}

	@Override
	public void detectAndSendChanges() {

		super.detectAndSendChanges();

		for (int i = 0; i < this.listeners.size(); ++i) {
			IContainerListener icrafting = (IContainerListener) this.listeners.get(i);

			if (this.cookTime != this.tileHellForge.getField(2)) {
				icrafting.sendProgressBarUpdate(this, 2, this.tileHellForge.getField(2));
			}

			if (this.furnaceBurnTime != this.tileHellForge.getField(0)) {
				icrafting.sendProgressBarUpdate(this, 0, this.tileHellForge.getField(0));
			}

			if (this.currentItemBurnTime != this.tileHellForge.getField(1)) {
				icrafting.sendProgressBarUpdate(this, 1, this.tileHellForge.getField(1));
			}

			if (this.totalCookTime != this.tileHellForge.getField(3)) {
				icrafting.sendProgressBarUpdate(this, 3, this.tileHellForge.getField(3));
			}
		}

		this.cookTime = this.tileHellForge.getField(2);
		this.furnaceBurnTime = this.tileHellForge.getField(0);
		this.currentItemBurnTime = this.tileHellForge.getField(1);
		this.totalCookTime = this.tileHellForge.getField(3);
	}

	@Override
	public void addListener(IContainerListener listener) {

		super.addListener(listener);
		listener.updateCraftingInventory(this, this.getInventory());
	}

	public void updateProgressBar(int id, int data) {

		this.tileHellForge.setField(id, data);
	}

	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {

		return this.tileHellForge.isUseableByPlayer(playerIn);

	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {

		ItemStack itemstack = null;
		Slot slot = (Slot) this.inventorySlots.get(index);

		if (slot != null && slot.getHasStack()) {
			final int slotFuel = TileHellForge.SLOT_FUEL; // 4
			final int inputSlotCount = TileHellForge.SLOTS_INPUT.length; // 4
			final int slotCount = TileHellForge.NUMBER_OF_SLOTS; // 6

			final boolean test = true;

			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			if (index == TileHellForge.SLOT_OUTPUT) {
				if (!this.mergeItemStack(itemstack1, slotCount, slotCount + 36, true)) {
					return null;
				}

				slot.onSlotChange(itemstack1, itemstack);
			} else if (index != slotFuel && index >= inputSlotCount) {
				if (TileEntityFurnace.isItemFuel(itemstack1)) {
					// Insert fuel?
					if (!this.mergeItemStack(itemstack1, slotFuel, slotFuel + 1, false)) {
						return null;
					}
				} else if (HellForgeRecipe.isValidIngredient(itemstack1)) {
					// Insert ingredients?
					if (!this.mergeItemStack(itemstack1, 0, inputSlotCount, false)) {
						return null;
					}
				} else if (index >= 4 && index < 31) {
					if (!this.mergeItemStack(itemstack1, 31, 40, false)) {
						return null;
					}
				} else if (index >= 31 && index < 40 && !this.mergeItemStack(itemstack1, 4, 31, false)) {
					return null;
				}
			} else if (!this.mergeItemStack(itemstack1, slotCount, slotCount + 36, false)) {
				return null;
			}

			if (itemstack1.stackSize == 0) {
				slot.putStack((ItemStack) null);
			} else {
				slot.onSlotChanged();
			}

			if (itemstack1.stackSize == itemstack.stackSize) {
				return null;
			}

			slot.onPickupFromSlot(playerIn, itemstack1);
		}

		return itemstack;
	}

}
