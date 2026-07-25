package net.flowerbreeding.botanytable;

import net.flowerbreeding.FBItems;
import net.flowerbreeding.FBRecipes;
import net.flowerbreeding.FBScreenHandlers;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.ResultContainer;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.Level;
import org.jspecify.annotations.NullMarked;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
@NullMarked
public class BotanyTableScreenHandler extends AbstractContainerMenu {
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

    private final Level world;

    protected final ResultContainer output = new ResultContainer();
    protected final Container input = new SimpleContainer(3) {

        @Override
        public void setChanged() {
            super.setChanged();
            BotanyTableScreenHandler.this.slotsChanged(this);
        }
    };
    protected final ContainerLevelAccess context;
    protected final Player player;

    public BotanyTableScreenHandler(int syncId, Inventory playerInventory) {
        this(syncId, playerInventory, ContainerLevelAccess.NULL);
    }

    public BotanyTableScreenHandler(int syncId, Inventory playerInventory, ContainerLevelAccess context) {
        super(FBScreenHandlers.BOTANY_TABLE_SCREEN_HANDLER, syncId);

        this.world = playerInventory.player.level();
        //this.recipes = this.world.getRecipeManager().listAllOfType(FBRecipes.BOTANY_TABLE_TYPE);

        int i;
        this.context = context;
        this.player = playerInventory.player;
        this.addSlot(new BotanyTableSlot(this.input, 0, 36, 24, null, vials));
        this.addSlot(new BotanyTableSlot(this.input, 1, 36, 41, null, vials));
        this.addSlot(new BotanyTableSlot(this.input, 2, 79, 33, null, jars));
        this.addSlot(new Slot(this.output, 3, 131, 33) {

            @Override
            public boolean mayPlace(ItemStack stack) {
                return false;
            }

            @Override
            public void onTake(Player player, ItemStack stack) {
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

    public void slotsChanged(Container inventory) {
        super.slotsChanged(inventory);
        if (inventory == this.input) {
            this.updateResult();
        }
    }

    private void onTakeOutput(Player player, ItemStack stack) {
        stack.onCraftedBy(player, stack.getCount());
        world.playSound(player, player.blockPosition(), SoundEvents.CAVE_VINES_PICK_BERRIES, SoundSource.BLOCKS);

        this.output.awardUsedRecipes(player, List.of(this.input.getItem(0), this.input.getItem(1), this.input.getItem(2)));
        for (int i = 0; i < 3; i++) {
            this.decrementStack(i);
        }
        player.getInventory().placeItemBackInInventory(new ItemStack(FBItems.EMPTY_POLLEN_VIAL, 2));
        player.getInventory().placeItemBackInInventory(new ItemStack(FBItems.EMPTY_PIGMENT_JAR, 1));
        // this.context.run((world, pos) -> world.syncWorldEvent(WorldEvents.SMITHING_TABLE_USED, (BlockPos)pos, 0));
    }

    private void decrementStack(int slot) {
        ItemStack itemStack = this.input.getItem(slot);
        itemStack.shrink(1);
        this.input.setItem(slot, itemStack);
    }

    private BotanyTableRecipeInput createRecipeInput() {
        return new BotanyTableRecipeInput(this.input.getItem(0), this.input.getItem(1), this.input.getItem(2));
    }

    public void updateResult() {
        BotanyTableRecipeInput botanyRecipeInput = this.createRecipeInput();
        Optional<RecipeHolder<BotanyTableRecipe>> optional;
        if (this.world instanceof ServerLevel serverWorld) {
            optional = serverWorld.recipeAccess().getRecipeFor(FBRecipes.BOTANY_TABLE_TYPE, botanyRecipeInput, serverWorld);
        } else {
            optional = Optional.empty();
        }
        optional.ifPresentOrElse((recipe) -> {
            ItemStack itemStack = recipe.value().assemble(botanyRecipeInput);
            this.output.setRecipeUsed(recipe);
            this.output.setItem(0, itemStack);
        }, () -> {
            this.output.setRecipeUsed(null);
            this.output.setItem(0, ItemStack.EMPTY);
        });
    }

    @Override
    public void removed(Player player) {
        super.removed(player);
        this.context.execute((world, pos) -> this.clearContainer(player, this.input));
    }

    @Override
    public boolean stillValid(Player player) {
        return this.context.evaluate((world, pos) -> {

            if (!(this.world.getBlockState(pos).getBlock() instanceof BotanyTableBlock)) {
                return false;
            }
            return player.distanceToSqr((double) pos.getX() + 0.5, (double) pos.getY() + 0.5, (double) pos.getZ() + 0.5) <= 64.0;
        }, true);
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);
        if (slot.hasItem()) {
            ItemStack itemStack2 = slot.getItem();
            itemStack = itemStack2.copy();
            if (index == 3) {
                // output slot
                if (!this.moveItemStackTo(itemStack2, 4, 40, true)) {
                    return ItemStack.EMPTY;
                }
                slot.onQuickCraft(itemStack2, itemStack);
            } else if (index == 0 || index == 1 || index == 2) {
                // input slots
                if (!this.moveItemStackTo(itemStack2, 4, 40, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (index >= 4 && index <= 39) {
                // player inv slots
                if (!this.moveItemStackTo(itemStack2, 0, 3, false)) {
                    return ItemStack.EMPTY;
                }
            }
            if (itemStack2.isEmpty()) {
                slot.setByPlayer(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
            if (itemStack2.getCount() == itemStack.getCount()) {
                return ItemStack.EMPTY;
            }
            slot.onTake(player, itemStack2);
        }
        return itemStack;
    }
}