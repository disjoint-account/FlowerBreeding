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

        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_FOXGLOVE), Identifier.of("magenta_foxglove_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_FOXGLOVE), Identifier.of("magenta_foxglove_2"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_FOXGLOVE), Identifier.of("blue_foxglove_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_FOXGLOVE), Identifier.of("blue_foxglove_2"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_FOXGLOVE), Identifier.of("white_foxglove_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_FOXGLOVE), Identifier.of("white_foxglove_2"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_FOXGLOVE), Identifier.of("orange_foxglove_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_FOXGLOVE), Identifier.of("orange_foxglove_2"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_FOXGLOVE), Identifier.of("red_foxglove_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_FOXGLOVE), Identifier.of("red_foxglove_2"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_FOXGLOVE), Identifier.of("yellow_foxglove_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_FOXGLOVE), Identifier.of("yellow_foxglove_2"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_FOXGLOVE), Identifier.of("light_blue_foxglove_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_FOXGLOVE), Identifier.of("light_blue_foxglove_2"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_FOXGLOVE), Identifier.of("pink_foxglove_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_FOXGLOVE), Identifier.of("pink_foxglove_2"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_FOXGLOVE), Identifier.of("black_foxglove_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_FOXGLOVE), Identifier.of("black_foxglove_2"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_FOXGLOVE), Identifier.of("cyan_foxglove_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_FOXGLOVE), Identifier.of("cyan_foxglove_2"));

        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_HYACINTH), Identifier.of("magenta_hyacinth_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_HYACINTH), Identifier.of("magenta_hyacinth_2"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_HYACINTH), Identifier.of("blue_hyacinth_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_HYACINTH), Identifier.of("blue_hyacinth_2"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_HYACINTH), Identifier.of("white_hyacinth_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_HYACINTH), Identifier.of("white_hyacinth_2"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_HYACINTH), Identifier.of("orange_hyacinth_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_HYACINTH), Identifier.of("orange_hyacinth_2"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_HYACINTH), Identifier.of("red_hyacinth_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_HYACINTH), Identifier.of("red_hyacinth_2"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_HYACINTH), Identifier.of("yellow_hyacinth_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_HYACINTH), Identifier.of("yellow_hyacinth_2"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_HYACINTH), Identifier.of("light_blue_hyacinth_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_HYACINTH), Identifier.of("light_blue_hyacinth_2"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_HYACINTH), Identifier.of("pink_hyacinth_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_HYACINTH), Identifier.of("pink_hyacinth_2"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_HYACINTH), Identifier.of("black_hyacinth_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_HYACINTH), Identifier.of("black_hyacinth_2"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_HYACINTH), Identifier.of("cyan_hyacinth_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_HYACINTH), Identifier.of("cyan_hyacinth_2"));

        offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBItems.MAGENTA_LOTUS_FLOWER), Identifier.of("magenta_lotus_flower_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBItems.MAGENTA_LOTUS_FLOWER), Identifier.of("magenta_lotus_flower_2"));
        offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBItems.BLUE_LOTUS_FLOWER), Identifier.of("blue_lotus_flower_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBItems.BLUE_LOTUS_FLOWER), Identifier.of("blue_lotus_flower_2"));
        offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBItems.WHITE_LOTUS_FLOWER), Identifier.of("white_lotus_flower_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBItems.WHITE_LOTUS_FLOWER), Identifier.of("white_lotus_flower_2"));
        offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBItems.ORANGE_LOTUS_FLOWER), Identifier.of("orange_lotus_flower_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBItems.ORANGE_LOTUS_FLOWER), Identifier.of("orange_lotus_flower_2"));
        offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBItems.RED_LOTUS_FLOWER), Identifier.of("red_lotus_flower_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBItems.RED_LOTUS_FLOWER), Identifier.of("red_lotus_flower_2"));
        offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBItems.YELLOW_LOTUS_FLOWER), Identifier.of("yellow_lotus_flower_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBItems.YELLOW_LOTUS_FLOWER), Identifier.of("yellow_lotus_flower_2"));
        offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBItems.LIGHT_BLUE_LOTUS_FLOWER), Identifier.of("light_blue_lotus_flower_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBItems.LIGHT_BLUE_LOTUS_FLOWER), Identifier.of("light_blue_lotus_flower_2"));
        offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBItems.PINK_LOTUS_FLOWER), Identifier.of("pink_lotus_flower_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBItems.PINK_LOTUS_FLOWER), Identifier.of("pink_lotus_flower_2"));
        offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBItems.BLACK_LOTUS_FLOWER), Identifier.of("black_lotus_flower_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBItems.BLACK_LOTUS_FLOWER), Identifier.of("black_lotus_flower_2"));
        offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBItems.CYAN_LOTUS_FLOWER), Identifier.of("cyan_lotus_flower_1"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBItems.CYAN_LOTUS_FLOWER), Identifier.of("cyan_lotus_flower_2"));
    }


    public static void offerBotanyRecipe(RecipeExporter exporter, Item vial1, Item vial2, Item jar, ItemStack result, Identifier recipeId) {
        BotanyTableRecipeJsonBuilder.create(Ingredient.ofItems(vial1), Ingredient.ofItems(vial2), Ingredient.ofItems(jar), result, RecipeCategory.MISC)
                .criterion("has_vial1", conditionsFromItem(vial1))
                .criterion("has_vial2", conditionsFromItem(vial2))
                .offerTo(exporter, recipeId);
    }
}
