package net.flowerbreeding;

import net.flowerbreeding.botanytable.BotanyTableRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;

public class FBRecipes {
    public static final RecipeSerializer<BotanyTableRecipe> BOTANY_TABLE_SERIALIZER = Registry.register(
            BuiltInRegistries.RECIPE_SERIALIZER, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, "botany"),
            new RecipeSerializer<>(BotanyTableRecipe.CODEC, BotanyTableRecipe.STREAM_CODEC));
    public static final RecipeType<BotanyTableRecipe> BOTANY_TABLE_TYPE = Registry.register(
            BuiltInRegistries.RECIPE_TYPE, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, "botany"),
            new RecipeType<BotanyTableRecipe>() {
                @Override
                public String toString() {
                    return "botany";
                }
            });

    public static void registerRecipes() {
        FlowerBreeding.LOGGER.info("Registering Custom Recipes for " + FlowerBreeding.MOD_ID);
    }
}