package net.flowerbreeding.botanytable;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.input.RecipeInput;

public record BotanyTableRecipeInput(ItemStack vial1, ItemStack vial2, ItemStack jar) implements RecipeInput {

    @Override
    public ItemStack getStackInSlot(int slot) {
        return switch (slot) {
            case 0 -> this.vial1;
            case 1 -> this.vial2;
            case 2 -> this.jar;
            default -> throw new IllegalArgumentException("Recipe does not contain slot " + slot);
        };
    }

    @Override
    public int size() {
        return 3;
    }

    @Override
    public boolean isEmpty() {
        return this.vial1.isEmpty() && this.vial2.isEmpty() && this.jar.isEmpty();
    }
}
