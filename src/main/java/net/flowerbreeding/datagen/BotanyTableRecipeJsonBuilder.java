package net.flowerbreeding.datagen;

import net.flowerbreeding.botanytable.BotanyTableRecipe;
import net.minecraft.advancements.triggers.Criterion;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeUnlockAdvancementBuilder;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.resources.ResourceKey;
import org.jspecify.annotations.NonNull;

import java.util.List;

public class BotanyTableRecipeJsonBuilder implements RecipeBuilder {
    private final RecipeCategory category;
    private final ItemStackTemplate result;
    private final List<Ingredient> inputItems;
    private final RecipeUnlockAdvancementBuilder advancementBuilder = new RecipeUnlockAdvancementBuilder();

    public BotanyTableRecipeJsonBuilder(RecipeCategory category, Ingredient vial1, Ingredient vial2, Ingredient jar, ItemStackTemplate result) {
        this.category = category;
        this.result = result;
        this.inputItems = List.of(vial1, vial2, jar);
    }

    public static BotanyTableRecipeJsonBuilder create(Ingredient vial1, Ingredient vial2, Ingredient jar, ItemStackTemplate result, RecipeCategory category) {
        return new BotanyTableRecipeJsonBuilder(category, vial1, vial2, jar, result);
    }

    @Override
    public @NonNull RecipeBuilder unlockedBy(@NonNull String name, @NonNull Criterion<?> criterion) {
        advancementBuilder.unlockedBy(name, criterion);
        return this;
    }

    @Override
    public @NonNull RecipeBuilder group(String group) {
        return this;
    }

    @Override
    public @NonNull ResourceKey<Recipe<?>> defaultId() {
        return RecipeBuilder.getDefaultRecipeId(this.result);
    }

    @Override
    public void save(RecipeOutput output, @NonNull ResourceKey<Recipe<?>> id) {
        BotanyTableRecipe recipe = new BotanyTableRecipe(this.inputItems, this.result);
        output.accept(id, recipe, this.advancementBuilder.build(output, id, this.category));
    }
}
