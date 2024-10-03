package net.flowerbreeding.botanytable;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.flowerbreeding.FBBlockEntities;
import net.flowerbreeding.FBItems;
import net.flowerbreeding.FBRecipes;
import net.flowerbreeding.screen.BotanyTableScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class BotanyTableBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory<BlockPos>, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(4, ItemStack.EMPTY);

    private static final int VIAL_SLOT_1 = 0;
    private static final int VIAL_SLOT_2 = 1;
    private static final int JAR_SLOT = 3;
    private static final int OUTPUT = 4;

    public BotanyTableBlockEntity(BlockPos pos, BlockState state) {
        super(FBBlockEntities.BOTANY_TABLE_ENTITY, pos, state);
    }

    @Override
    public BlockPos getScreenOpeningData(ServerPlayerEntity player) {
        return this.pos;
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("gui.flowerbreeding.botany_table");
    }

    @Override
    public @Nullable ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new BotanyTableScreenHandler(syncId, playerInventory, this);
    }

    @Override
    protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.writeNbt(nbt, registryLookup);
        Inventories.writeNbt(nbt, inventory, registryLookup);
    }

    @Override
    protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        Inventories.readNbt(nbt, inventory, registryLookup);
    }

    public void tick(World world, BlockPos pos, BlockState state) {
        if(world.isClient()) {
            return;
        }

        if(hasRecipe() && canInsertIntoOutputSlot()) {
                craftItem();
        } else
            return;
        }
    private void craftItem() {
        Optional<RecipeEntry<BotanyTableRecipe>> recipe = getCurrentRecipe();

        this.setStack(VIAL_SLOT_1, new ItemStack(FBItems.EMPTY_POLLEN_VIAL));
        this.setStack(VIAL_SLOT_2, new ItemStack(FBItems.EMPTY_POLLEN_VIAL));
        this.setStack(JAR_SLOT, new ItemStack(FBItems.EMPTY_PIGMENT_JAR));
        this.setStack(OUTPUT, new ItemStack(recipe.get().value().output().getItem(),
                this.getStack(OUTPUT).getCount() + recipe.get().value().output().getCount()));
    }
    private boolean canInsertIntoOutputSlot() {
        return this.getStack(OUTPUT).isEmpty() ||
                this.getStack(OUTPUT).getCount() < this.getStack(OUTPUT).getMaxCount();
    }

    private boolean hasRecipe() {
        Optional<RecipeEntry<BotanyTableRecipe>> recipe = getCurrentRecipe();
        if(recipe.isEmpty()) {
            return false;
        }

        ItemStack output = recipe.get().value().getResult(null);
        return canInsertAmountIntoOutputSlot(output.getCount()) && canInsertItemIntoOutputSlot(output);
    }

    private Optional<RecipeEntry<BotanyTableRecipe>> getCurrentRecipe() {
        return this.getWorld().getRecipeManager()
                .getFirstMatch(FBRecipes.BOTANY_TABLE_TYPE, new BotanyTableRecipeInput(inventory.get(VIAL_SLOT_1), inventory.get(VIAL_SLOT_2), inventory.get(JAR_SLOT)), this.getWorld());
    }

    private boolean canInsertItemIntoOutputSlot(ItemStack output) {
        return this.getStack(OUTPUT).isEmpty() || this.getStack(OUTPUT).getItem() == output.getItem();
    }

    private boolean canInsertAmountIntoOutputSlot(int count) {
        int maxCount = this.getStack(OUTPUT).isEmpty() ? 64 : this.getStack(OUTPUT).getMaxCount();
        int currentCount = this.getStack(OUTPUT).getCount();

        return maxCount >= currentCount + count;
    }

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }
}
