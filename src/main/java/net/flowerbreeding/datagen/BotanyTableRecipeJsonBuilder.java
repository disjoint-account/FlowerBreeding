package net.flowerbreeding.datagen;

import net.flowerbreeding.botanytable.BotanyTableRecipe;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.advancement.AdvancementRequirements;
import net.minecraft.advancement.AdvancementRewards;
import net.minecraft.advancement.criterion.RecipeUnlockedCriterion;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import java.util.LinkedHashMap;
import java.util.Map;

public class BotanyTableRecipeJsonBuilder {
    private final RecipeCategory category;
    private final Ingredient vial1;
    private final Ingredient vial2;
    private final Ingredient jar;
    private final ItemStack result;
    private final Map<String, AdvancementCriterion<?>> criteria = new LinkedHashMap<>();

    public BotanyTableRecipeJsonBuilder(RecipeCategory botany, Ingredient vial1, Ingredient vial2, Ingredient jar, ItemStack result) {
        this.category = botany;
        this.vial1 = vial1;
        this.vial2 = vial2;
        this.jar = jar;
        this.result = result;
    }

    public static BotanyTableRecipeJsonBuilder create(Ingredient vial1, Ingredient vial2, Ingredient jar, ItemStack result, RecipeCategory category) {
        return new BotanyTableRecipeJsonBuilder(category, vial1, vial2, jar, result);
    }

    public BotanyTableRecipeJsonBuilder criterion(String name, AdvancementCriterion<?> criterion) {
        this.criteria.put(name, criterion);
        return this;
    }

    public void offerTo(RecipeExporter exporter, Identifier recipeId, RegistryKey<Recipe<?>> recipeKey) {
        this.validate(recipeId);
        Advancement.Builder builder = exporter.getAdvancementBuilder()
                .criterion("has_the_recipe", RecipeUnlockedCriterion.create(recipeKey))
                .rewards(AdvancementRewards.Builder.recipe(recipeKey))
                .criteriaMerger(AdvancementRequirements.CriterionMerger.OR);
        this.criteria.forEach(builder::criterion);
        BotanyTableRecipe botanyTableRecipe = new BotanyTableRecipe(this.vial1, this.vial2, this.jar, this.result);
        exporter.accept(recipeKey, botanyTableRecipe, builder.build(recipeId.withPrefixedPath("recipes/" + this.category.getName() + "/")));
    }

    private void validate(Identifier recipeId) {
        if (this.criteria.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + recipeId);
        }
    }
}
