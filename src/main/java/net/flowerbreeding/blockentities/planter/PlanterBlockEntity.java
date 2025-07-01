package net.flowerbreeding.blockentities.planter;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.flowerbreeding.FBBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.storage.ReadView;
import net.minecraft.storage.WriteView;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class PlanterBlockEntity extends BlockEntity implements Inventory {
    private int anInt;
    private String aString;
    private Extra extra;
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(1, ItemStack.EMPTY);

    public PlanterBlockEntity(BlockPos pos, BlockState state) {
        super(FBBlockEntities.PLANTER_BE, pos, state);
    }

    @Override
    public int size() {
        return inventory.size();
    }

    @Override
    public boolean isEmpty() {
        for(int i = 0; i < size(); i++) {
            ItemStack stack = getStack(i);
            if(!stack.isEmpty()) {
                return false;
            }
        }

        return true;
    }
    public DefaultedList<ItemStack> getInventory() {
        return this.inventory;
    }

    @Override
    public ItemStack getStack(int slot) {
        markDirty();
        return inventory.get(slot);
    }

    @Override
    public ItemStack removeStack(int slot, int amount) {
        markDirty();
        return Inventories.removeStack(inventory, slot);
    }

    @Override
    public ItemStack removeStack(int slot) {
        markDirty();
        return Inventories.removeStack(inventory, slot);
    }

    @Override
    public void setStack(int slot, ItemStack stack) {
        markDirty();
        inventory.set(slot, stack.copyWithCount(1));
    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return Inventory.canPlayerUse(this, player);
    }

    @Override
    public void clear() {
        inventory.clear();
    }

    @Override
    protected void writeData(WriteView view) {
        super.writeData(view);
        view.putNullable("extra", Extra.CODEC, this.extra);
        if (aString != null)
            view.putString("aString", aString);
        view.putInt("anInt", anInt);
    }

    @Override
    protected void readData(ReadView view) {
        super.readData(view);
        view.read("extra", Extra.CODEC).ifPresent(extra -> this.extra = extra);
        view.getOptionalString("aString").ifPresent(aString -> this.aString = aString);
        view.getOptionalInt("anInt").ifPresent(anInt -> this.anInt = anInt);
    }

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt(RegistryWrapper.WrapperLookup registryLookup) {
        return createNbt(registryLookup);
    }

    record Extra(int i, int j) {
        public static final Codec<Extra> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.INT.fieldOf("i").forGetter(extra -> extra.i), Codec.INT.fieldOf("j").forGetter(extra -> extra.j)).apply(instance, Extra::new));
    }
}