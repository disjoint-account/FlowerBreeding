package net.flowerbreeding.screen;

import net.flowerbreeding.FBItems;
import net.flowerbreeding.botanytable.BotanyTableBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.math.BlockPos;

import java.util.Arrays;
import java.util.List;

public class BotanyTableScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    public final BotanyTableBlockEntity blockEntity;
    public static final List<Item> vials = Arrays.asList(
            ItemStack.EMPTY.getItem(),
            FBItems.EMPTY_POLLEN_VIAL,
            FBItems.ALLIUM_POLLEN_VIAL,
            FBItems.CORNFLOWER_POLLEN_VIAL,
            FBItems.DAISY_POLLEN_VIAL,
            FBItems.TORCHFLOWER_POLLEN_VIAL,
            FBItems.TULIP_POLLEN_VIAL,
            FBItems.AZURE_BLUET_POLLEN_VIAL,
            FBItems.DANDELION_POLLEN_VIAL,
            FBItems.ORCHID_POLLEN_VIAL,
            FBItems.LILY_POLLEN_VIAL,
            FBItems.POPPY_POLLEN_VIAL,
            FBItems.WITHER_ROSE_POLLEN_VIAL,
            FBItems.LILAC_POLLEN_VIAL,
            FBItems.PEONY_POLLEN_VIAL,
            FBItems.PITCHER_PLANT_POLLEN_VIAL,
            FBItems.ROSE_BUSH_POLLEN_VIAL,
            FBItems.SUNFLOWER_POLLEN_VIAL,
            FBItems.LILY_PAD_POLLEN_VIAL);

    public static final List<Item> jars = Arrays.asList(
            ItemStack.EMPTY.getItem(),
            FBItems.EMPTY_PIGMENT_JAR,
            FBItems.MAGENTA_PIGMENT_JAR,
            FBItems.BLUE_PIGMENT_JAR,
            FBItems.WHITE_PIGMENT_JAR,
            FBItems.ORANGE_PIGMENT_JAR,
            FBItems.RED_PIGMENT_JAR,
            FBItems.YELLOW_PIGMENT_JAR,
            FBItems.LIGHT_BLUE_PIGMENT_JAR,
            FBItems.PINK_PIGMENT_JAR,
            FBItems.BLACK_PIGMENT_JAR,
            FBItems.CYAN_PIGMENT_JAR);

    public BotanyTableScreenHandler(int syncId, PlayerInventory inventory, BlockPos pos) {
        this(syncId, inventory, inventory.player.getWorld().getBlockEntity(pos));
    }

    public BotanyTableScreenHandler(int syncId, PlayerInventory playerInventory, BlockEntity blockEntity) {
        super(FBScreenHandlers.BOTANY_TABLE_SCREEN_HANDLER, syncId);
        checkSize((Inventory) blockEntity, 4);
        this.inventory = (Inventory) blockEntity;
        this.blockEntity = ((BotanyTableBlockEntity) blockEntity);

        this.addSlot(new BotanyTableSlot(inventory, 0, 28, 15, null, vials));
        this.addSlot(new BotanyTableSlot(inventory, 1, 28, 52, null, vials));
        this.addSlot(new BotanyTableSlot(inventory, 2, 80, 33, null, jars));
        this.addSlot(new Slot(inventory, 3, 132, 33));

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }
        return newStack;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }
}