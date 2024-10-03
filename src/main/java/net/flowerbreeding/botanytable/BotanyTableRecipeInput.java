package net.flowerbreeding.botanytable;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.input.RecipeInput;

public record BotanyTableRecipeInput(ItemStack vial1, ItemStack vial2, ItemStack jar) implements RecipeInput {
    public BotanyTableRecipeInput(ItemStack vial1, ItemStack vial2, ItemStack jar) {
        this.vial1 = vial1;
        this.vial2 = vial2;
        this.jar = jar;
    }
    public ItemStack getStackInSlot(int slot) {
        ItemStack var10000;
        switch (slot) {
            case 0 -> var10000 = this.vial1;
            case 1 -> var10000 = this.vial2;
            case 2 -> var10000 = this.jar;
            default -> throw new IllegalArgumentException("Recipe does not contain slot " + slot);
        }
        return var10000;
    }
    @Override
    public int getSize() {
        return 3;
    }
    public boolean isEmpty() {
        return this.vial1.isEmpty() && this.vial2.isEmpty() && this.jar.isEmpty();
    }
}
