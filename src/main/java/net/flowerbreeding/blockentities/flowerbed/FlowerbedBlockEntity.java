package net.flowerbreeding.blockentities.flowerbed;

import net.flowerbreeding.FBBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import org.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class FlowerbedBlockEntity extends BlockEntity implements Container {
    private final NonNullList<ItemStack> inventory = NonNullList.withSize(4, ItemStack.EMPTY);

    public FlowerbedBlockEntity(BlockPos pos, BlockState state) {
        super(FBBlockEntities.FLOWERBED_BE, pos, state);
    }


    @Override
    public int getContainerSize() {
        return inventory.size();
    }

    @Override
    public boolean isEmpty() {
        for(int i = 0; i < getContainerSize(); i++) {
            ItemStack stack = getItem(i);
            if(!stack.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public boolean isFull() {
        return !this.getItem(0).isEmpty() && !this.getItem(1).isEmpty() && !this.getItem(2).isEmpty() && !this.getItem(3).isEmpty();
    }

    public NonNullList<ItemStack> getInventory() {
        return this.inventory;
    }

    @Override
    public ItemStack getItem(int slot) {
        setChanged();
        return inventory.get(slot);
    }

    @Override
    public ItemStack removeItem(int slot, int amount) {
        setChanged();
        return ContainerHelper.takeItem(inventory, slot);
    }

    @Override
    public ItemStack removeItemNoUpdate(int slot) {
        setChanged();
        return ContainerHelper.takeItem(inventory, slot);
    }

    @Override
    public void setItem(int slot, ItemStack stack) {
        setChanged();
        inventory.set(slot, stack.copyWithCount(1));
    }

    @Override
    public void clearContent() {
        inventory.clear();
    }

    @Override
    protected void saveAdditional(ValueOutput view) {
        super.saveAdditional(view);
        ContainerHelper.saveAllItems(view, inventory);
    }

    @Override
    protected void loadAdditional(ValueInput view) {
        super.loadAdditional(view);
        this.inventory.clear();
        ContainerHelper.loadAllItems(view, inventory);
    }

    @Override
    public void setChanged() {
        super.setChanged();
        assert level != null;
        if (!level.isClientSide()) {
            level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
        }
    }

    @Override
    public boolean stillValid(Player player) {
        return Container.stillValidBlockEntity(this, player);
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(final HolderLookup.Provider registries) {
        return saveWithoutMetadata(registries);
    }
}