package net.flowerbreeding;

import net.flowerbreeding.botanytable.BotanyTableRecipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FBRecipes {
    public static final RecipeSerializer<BotanyTableRecipe> BOTANY_TABLE_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(FlowerBreeding.MOD_ID, "botany"), new BotanyTableRecipe.Serializer());
    public static final RecipeType<BotanyTableRecipe> BOTANY_TABLE_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(FlowerBreeding.MOD_ID, "botany"), new RecipeType<>() {
                @Override
                public String toString() {
                    return "botany";
                }
            });

    public static void registerRecipes() {
        FlowerBreeding.LOGGER.info("Registering Custom Recipes for " + FlowerBreeding.MOD_ID);
    }
}