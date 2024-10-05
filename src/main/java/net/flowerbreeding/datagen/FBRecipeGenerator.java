package net.flowerbreeding.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FBItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class FBRecipeGenerator extends FabricRecipeProvider {
    public FBRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBItems.LOTUS_FLOWER), Identifier.of("magenta_lotus_flower_1"));

        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_DAFFODIL), Identifier.of("magenta_daffodil_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_DAFFODIL), Identifier.of("magenta_daffodil_2"));
        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_DAFFODIL), Identifier.of("blue_daffodil_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_DAFFODIL), Identifier.of("blue_daffodil_2"));
        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_DAFFODIL), Identifier.of("white_daffodil_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_DAFFODIL), Identifier.of("white_daffodil_2"));
        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_DAFFODIL), Identifier.of("orange_daffodil_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_DAFFODIL), Identifier.of("orange_daffodil_2"));
        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_DAFFODIL), Identifier.of("red_daffodil_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_DAFFODIL), Identifier.of("red_daffodil_2"));
        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_DAFFODIL), Identifier.of("yellow_daffodil_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_DAFFODIL), Identifier.of("yellow_daffodil_2"));
        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_DAFFODIL), Identifier.of("light_blue_daffodil_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_DAFFODIL), Identifier.of("light_blue_daffodil_2"));
        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_DAFFODIL), Identifier.of("pink_daffodil_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_DAFFODIL), Identifier.of("pink_daffodil_2"));
        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_DAFFODIL), Identifier.of("black_daffodil_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_DAFFODIL), Identifier.of("black_daffodil_2"));
        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_DAFFODIL), Identifier.of("cyan_daffodil_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_DAFFODIL), Identifier.of("cyan_daffodil_2"));
    }


    public static void offerBotanyRecipe(RecipeExporter exporter, Item vial1, Item vial2, Item jar, ItemStack result, Identifier recipeId) {
        BotanyTableRecipeJsonBuilder.create(Ingredient.ofItems(vial1), Ingredient.ofItems(vial2), Ingredient.ofItems(jar), result, RecipeCategory.MISC)
                .criterion("has_vial1", conditionsFromItem(vial1))
                .criterion("has_vial2", conditionsFromItem(vial2))
                .offerTo(exporter, recipeId);
    }
}
