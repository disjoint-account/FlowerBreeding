package net.flowerbreeding.botanytable;

import net.flowerbreeding.FBItems;
import net.flowerbreeding.FBRecipes;
import net.flowerbreeding.FBScreenHandlers;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftingResultInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.slot.Slot;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class BotanyTableScreenHandler extends ScreenHandler {
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
            FBItems.EYEBLOSSOM_POLLEN_VIAL,
            FBItems.LILAC_POLLEN_VIAL,
            FBItems.PEONY_POLLEN_VIAL,
            FBItems.PITCHER_PLANT_POLLEN_VIAL,
            FBItems.ROSE_BUSH_POLLEN_VIAL,
            FBItems.SUNFLOWER_POLLEN_VIAL,
            FBItems.PETAL_POLLEN_VIAL,
            FBItems.WILDFLOWER_POLLEN_VIAL,
            FBItems.CACTUS_FLOWER_POLLEN_VIAL,
            FBItems.SPORE_BLOSSOM_POLLEN_VIAL,
            FBItems.FLOWERING_AZALEA_POLLEN_VIAL,
            FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL,
            FBItems.BUSH_POLLEN_VIAL,
            FBItems.SWEET_BERRY_POLLEN_VIAL,
            FBItems.GLOW_VINE_POLLEN_VIAL,
            FBItems.VINE_POLLEN_VIAL,
            FBItems.LILY_PAD_POLLEN_VIAL,
            FBItems.MUSHROOM_POLLEN_VIAL,
            FBItems.FROGLIGHT_POLLEN_VIAL);

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

    private final World world;

    @Nullable
    private RecipeEntry<BotanyTableRecipe> currentRecipe;

    protected final CraftingResultInventory output = new CraftingResultInventory();
    protected final Inventory input = new SimpleInventory(3) {

        @Override
        public void markDirty() {
            super.markDirty();
            BotanyTableScreenHandler.this.onContentChanged(this);
        }
    };
    protected final ScreenHandlerContext context;
    protected final PlayerEntity player;

    public BotanyTableScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, ScreenHandlerContext.EMPTY);
    }

    public BotanyTableScreenHandler(int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
        super(FBScreenHandlers.BOTANY_TABLE_SCREEN_HANDLER, syncId);

        this.world = playerInventory.player.getWorld();
        //this.recipes = this.world.getRecipeManager().listAllOfType(FBRecipes.BOTANY_TABLE_TYPE);

        int i;
        this.context = context;
        this.player = playerInventory.player;
        this.addSlot(new BotanyTableSlot(this.input, 0, 36, 24, null, vials));
        this.addSlot(new BotanyTableSlot(this.input, 1, 36, 41, null, vials));
        this.addSlot(new BotanyTableSlot(this.input, 2, 79, 33, null, jars));
        this.addSlot(new Slot(this.output, 3, 131, 33) {

            @Override
            public boolean canInsert(ItemStack stack) {
                return false;
            }

            @Override
            public void onTakeItem(PlayerEntity player, ItemStack stack) {
                BotanyTableScreenHandler.this.onTakeOutput(player, stack);
            }
        });
        for (i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }

    public void onContentChanged(Inventory inventory) {
        super.onContentChanged(inventory);
        if (inventory == this.input) {
            this.updateResult();
        }
    }

    private void onTakeOutput(PlayerEntity player, ItemStack stack) {
        stack.onCraftByPlayer(player, stack.getCount());
        world.playSound(player, player.getBlockPos(), SoundEvents.BLOCK_CAVE_VINES_PICK_BERRIES, SoundCategory.BLOCKS);

        this.output.unlockLastRecipe(player, List.of(this.input.getStack(0), this.input.getStack(1), this.input.getStack(2)));
        for (int i = 0; i < 3; i++) {
            this.decrementStack(i);
        }
        player.getInventory().offerOrDrop(new ItemStack(FBItems.EMPTY_POLLEN_VIAL, 2));
        player.getInventory().offerOrDrop(new ItemStack(FBItems.EMPTY_PIGMENT_JAR, 1));
        // this.context.run((world, pos) -> world.syncWorldEvent(WorldEvents.SMITHING_TABLE_USED, (BlockPos)pos, 0));
    }

    private void decrementStack(int slot) {
        ItemStack itemStack = this.input.getStack(slot);
        itemStack.decrement(1);
        this.input.setStack(slot, itemStack);
    }

    private BotanyTableRecipeInput createRecipeInput() {
        return new BotanyTableRecipeInput(this.input.getStack(0), this.input.getStack(1), this.input.getStack(2));
    }

    public void updateResult() {
        BotanyTableRecipeInput botanyRecipeInput = this.createRecipeInput();
        Optional<RecipeEntry<BotanyTableRecipe>> optional;
        if (this.world instanceof ServerWorld serverWorld) {
            optional = serverWorld.getRecipeManager().getFirstMatch(FBRecipes.BOTANY_TABLE_TYPE, botanyRecipeInput, serverWorld);
        } else {
            optional = Optional.empty();
        }
        optional.ifPresentOrElse((recipe) -> {
            ItemStack itemStack = recipe.value().craft(botanyRecipeInput, this.world.getRegistryManager());
            this.output.setLastRecipe(recipe);
            this.output.setStack(0, itemStack);
        }, () -> {
            this.output.setLastRecipe(null);
            this.output.setStack(0, ItemStack.EMPTY);
        });
    }

    @Override
    public void onClosed(PlayerEntity player) {
        super.onClosed(player);
        this.context.run((world, pos) -> this.dropInventory(player, this.input));
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.context.get((world, pos) -> {

            if (!(this.world.getBlockState(pos).getBlock() instanceof BotanyTableBlock)) {
                return false;
            }
            return player.squaredDistanceTo((double) pos.getX() + 0.5, (double) pos.getY() + 0.5, (double) pos.getZ() + 0.5) <= 64.0;
        }, true);
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int index) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);
        if (slot.hasStack()) {
            ItemStack itemStack2 = slot.getStack();
            itemStack = itemStack2.copy();
            if (index == 3) {
                // output slot
                if (!this.insertItem(itemStack2, 4, 40, true)) {
                    return ItemStack.EMPTY;
                }
                slot.onQuickTransfer(itemStack2, itemStack);
            } else if (index == 0 || index == 1 || index == 2) {
                // input slots
                if (!this.insertItem(itemStack2, 4, 40, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (index >= 4 && index <= 39) {
                // player inv slots
                if (!this.insertItem(itemStack2, 0, 3, false)) {
                    return ItemStack.EMPTY;
                }
            }
            if (itemStack2.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
            if (itemStack2.getCount() == itemStack.getCount()) {
                return ItemStack.EMPTY;
            }
            slot.onTakeItem(player, itemStack2);
        }
        return itemStack;
    }
}