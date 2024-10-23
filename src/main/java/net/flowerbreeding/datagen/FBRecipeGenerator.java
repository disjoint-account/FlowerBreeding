package net.flowerbreeding.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FBItems;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.recipe.book.RecipeCategory.MISC;

public class FBRecipeGenerator extends FabricRecipeProvider {
    public FBRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(Blocks.ALLIUM), Identifier.of("magenta_allium"));
        offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_ALLIUM), Identifier.of("blue_allium"));
        offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_ALLIUM), Identifier.of("white_allium"));
        offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_ALLIUM), Identifier.of("orange_allium"));
        offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_ALLIUM), Identifier.of("red_allium"));
        offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_ALLIUM), Identifier.of("yellow_allium"));
        offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_ALLIUM), Identifier.of("light_blue_allium"));
        offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_ALLIUM), Identifier.of("pink_allium"));
        offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_ALLIUM), Identifier.of("black_allium"));
        offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_ALLIUM), Identifier.of("cyan_allium"));

        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_CORNFLOWER), Identifier.of("magenta_cornflower"));
        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(Blocks.CORNFLOWER), Identifier.of("blue_cornflower"));
        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_CORNFLOWER), Identifier.of("white_cornflower"));
        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_CORNFLOWER), Identifier.of("orange_cornflower"));
        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_CORNFLOWER), Identifier.of("red_cornflower"));
        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_CORNFLOWER), Identifier.of("yellow_cornflower"));
        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_CORNFLOWER), Identifier.of("light_blue_cornflower"));
        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_CORNFLOWER), Identifier.of("pink_cornflower"));
        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_CORNFLOWER), Identifier.of("black_cornflower"));
        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_CORNFLOWER), Identifier.of("cyan_cornflower"));

        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_DAISY), Identifier.of("magenta_daisy"));
        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_DAISY), Identifier.of("blue_daisy"));
        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(Blocks.OXEYE_DAISY), Identifier.of("white_daisy"));
        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_DAISY), Identifier.of("orange_daisy"));
        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_DAISY), Identifier.of("red_daisy"));
        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_DAISY), Identifier.of("yellow_daisy"));
        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_DAISY), Identifier.of("light_blue_daisy"));
        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_DAISY), Identifier.of("pink_daisy"));
        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_DAISY), Identifier.of("black_daisy"));
        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_DAISY), Identifier.of("cyan_daisy"));

        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_TORCHFLOWER), Identifier.of("magenta_torchflower"));
        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_TORCHFLOWER), Identifier.of("blue_torchflower"));
        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_TORCHFLOWER), Identifier.of("white_torchflower"));
        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(Blocks.TORCHFLOWER), Identifier.of("orange_torchflower"));
        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_TORCHFLOWER), Identifier.of("red_torchflower"));
        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_TORCHFLOWER), Identifier.of("yellow_torchflower"));
        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_TORCHFLOWER), Identifier.of("light_blue_torchflower"));
        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_TORCHFLOWER), Identifier.of("pink_torchflower"));
        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_TORCHFLOWER), Identifier.of("black_torchflower"));
        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_TORCHFLOWER), Identifier.of("cyan_torchflower"));

        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_TULIP), Identifier.of("magenta_tulip"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_TULIP), Identifier.of("blue_tulip"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(Blocks.WHITE_TULIP), Identifier.of("white_tulip"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(Blocks.ORANGE_TULIP), Identifier.of("orange_tulip"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(Blocks.RED_TULIP), Identifier.of("red_tulip"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_TULIP), Identifier.of("yellow_tulip"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_TULIP), Identifier.of("light_blue_tulip"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(Blocks.PINK_TULIP), Identifier.of("pink_tulip"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_TULIP), Identifier.of("black_tulip"));
        offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_TULIP), Identifier.of("cyan_tulip"));

        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_AZURE_BLUET), Identifier.of("magenta_azure_bluet"));
        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_AZURE_BLUET), Identifier.of("blue_azure_bluet"));
        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(Blocks.AZURE_BLUET), Identifier.of("white_azure_bluet"));
        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_AZURE_BLUET), Identifier.of("orange_azure_bluet"));
        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_AZURE_BLUET), Identifier.of("red_azure_bluet"));
        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_AZURE_BLUET), Identifier.of("yellow_azure_bluet"));
        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_AZURE_BLUET), Identifier.of("light_blue_azure_bluet"));
        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_AZURE_BLUET), Identifier.of("pink_azure_bluet"));
        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_AZURE_BLUET), Identifier.of("black_azure_bluet"));
        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_AZURE_BLUET), Identifier.of("cyan_azure_bluet"));

        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_DANDELION), Identifier.of("magenta_dandelion"));
        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_DANDELION), Identifier.of("blue_dandelion"));
        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_DANDELION), Identifier.of("white_dandelion"));
        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_DANDELION), Identifier.of("orange_dandelion"));
        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_DANDELION), Identifier.of("red_dandelion"));
        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(Blocks.DANDELION), Identifier.of("yellow_dandelion"));
        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_DANDELION), Identifier.of("light_blue_dandelion"));
        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_DANDELION), Identifier.of("pink_dandelion"));
        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_DANDELION), Identifier.of("black_dandelion"));
        offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_DANDELION), Identifier.of("cyan_dandelion"));

        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_ORCHID), Identifier.of("magenta_orchid"));
        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_ORCHID), Identifier.of("blue_orchid"));
        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_ORCHID), Identifier.of("white_orchid"));
        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_ORCHID), Identifier.of("orange_orchid"));
        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_ORCHID), Identifier.of("red_orchid"));
        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_ORCHID), Identifier.of("yellow_orchid"));
        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(Blocks.BLUE_ORCHID), Identifier.of("light_blue_orchid"));
        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_ORCHID), Identifier.of("pink_orchid"));
        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_ORCHID), Identifier.of("black_orchid"));
        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_ORCHID), Identifier.of("cyan_orchid"));

        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_LILY), Identifier.of("magenta_lily"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_LILY), Identifier.of("blue_lily"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(Blocks.LILY_OF_THE_VALLEY), Identifier.of("white_lily"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_LILY), Identifier.of("orange_lily"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_LILY), Identifier.of("red_lily"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_LILY), Identifier.of("yellow_lily"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_LILY), Identifier.of("light_blue_lily"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_LILY), Identifier.of("pink_lily"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_LILY), Identifier.of("black_lily"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_LILY), Identifier.of("cyan_lily"));

        offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_POPPY), Identifier.of("magenta_poppy"));
        offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_POPPY), Identifier.of("blue_poppy"));
        offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_POPPY), Identifier.of("white_poppy"));
        offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_POPPY), Identifier.of("orange_poppy"));
        offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(Blocks.POPPY), Identifier.of("red_poppy"));
        offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_POPPY), Identifier.of("yellow_poppy"));
        offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_POPPY), Identifier.of("light_blue_poppy"));
        offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_POPPY), Identifier.of("pink_poppy"));
        offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_POPPY), Identifier.of("black_poppy"));
        offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_POPPY), Identifier.of("cyan_poppy"));

        offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_WITHER_ROSE), Identifier.of("magenta_wither_rose"));
        offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_WITHER_ROSE), Identifier.of("blue_wither_rose"));
        offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_WITHER_ROSE), Identifier.of("white_wither_rose"));
        offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_WITHER_ROSE), Identifier.of("orange_wither_rose"));
        offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_WITHER_ROSE), Identifier.of("red_wither_rose"));
        offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_WITHER_ROSE), Identifier.of("yellow_wither_rose"));
        offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_WITHER_ROSE), Identifier.of("light_blue_wither_rose"));
        offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_WITHER_ROSE), Identifier.of("pink_wither_rose"));
        offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(Blocks.WITHER_ROSE), Identifier.of("black_wither_rose"));
        offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_WITHER_ROSE), Identifier.of("cyan_wither_rose"));

        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_LILAC), Identifier.of("magenta_lilac"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_LILAC), Identifier.of("blue_lilac"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_LILAC), Identifier.of("white_lilac"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_LILAC), Identifier.of("orange_lilac"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_LILAC), Identifier.of("red_lilac"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_LILAC), Identifier.of("yellow_lilac"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_LILAC), Identifier.of("light_blue_lilac"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(Blocks.LILAC), Identifier.of("pink_lilac"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_LILAC), Identifier.of("black_lilac"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_LILAC), Identifier.of("cyan_lilac"));

        offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_PEONY), Identifier.of("magenta_peony"));
        offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_PEONY), Identifier.of("blue_peony"));
        offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_PEONY), Identifier.of("white_peony"));
        offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_PEONY), Identifier.of("orange_peony"));
        offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_PEONY), Identifier.of("red_peony"));
        offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_PEONY), Identifier.of("yellow_peony"));
        offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_PEONY), Identifier.of("light_blue_peony"));
        offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(Blocks.PEONY), Identifier.of("pink_peony"));
        offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_PEONY), Identifier.of("black_peony"));
        offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_PEONY), Identifier.of("cyan_peony"));

        offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_PITCHER_PLANT), Identifier.of("magenta_pitcher_plant"));
        offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_PITCHER_PLANT), Identifier.of("blue_pitcher_plant"));
        offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_PITCHER_PLANT), Identifier.of("white_pitcher_plant"));
        offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_PITCHER_PLANT), Identifier.of("orange_pitcher_plant"));
        offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_PITCHER_PLANT), Identifier.of("red_pitcher_plant"));
        offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_PITCHER_PLANT), Identifier.of("yellow_pitcher_plant"));
        offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_PITCHER_PLANT), Identifier.of("light_blue_pitcher_plant"));
        offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_PITCHER_PLANT), Identifier.of("pink_pitcher_plant"));
        offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_PITCHER_PLANT), Identifier.of("black_pitcher_plant"));
        offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(Blocks.PITCHER_PLANT), Identifier.of("cyan_pitcher_plant"));

        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_ROSE_BUSH), Identifier.of("magenta_rose_bush"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_ROSE_BUSH), Identifier.of("blue_rose_bush"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_ROSE_BUSH), Identifier.of("white_rose_bush"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_ROSE_BUSH), Identifier.of("orange_rose_bush"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(Blocks.ROSE_BUSH), Identifier.of("red_rose_bush"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_ROSE_BUSH), Identifier.of("yellow_rose_bush"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_ROSE_BUSH), Identifier.of("light_blue_rose_bush"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_ROSE_BUSH), Identifier.of("pink_rose_bush"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_ROSE_BUSH), Identifier.of("black_rose_bush"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_ROSE_BUSH), Identifier.of("cyan_rose_bush"));

        offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_SUNFLOWER), Identifier.of("magenta_sunflower"));
        offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_SUNFLOWER), Identifier.of("blue_sunflower"));
        offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_SUNFLOWER), Identifier.of("white_sunflower"));
        offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_SUNFLOWER), Identifier.of("orange_sunflower"));
        offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_SUNFLOWER), Identifier.of("red_sunflower"));
        offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(Blocks.SUNFLOWER), Identifier.of("yellow_sunflower"));
        offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_SUNFLOWER), Identifier.of("light_blue_sunflower"));
        offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_SUNFLOWER), Identifier.of("pink_sunflower"));
        offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_SUNFLOWER), Identifier.of("black_sunflower"));
        offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_SUNFLOWER), Identifier.of("cyan_sunflower"));

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

        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_PHLOX), Identifier.of("magenta_phlox_1"));
        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_PHLOX), Identifier.of("magenta_phlox_2"));
        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_PHLOX), Identifier.of("blue_phlox_1"));
        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_PHLOX), Identifier.of("blue_phlox_2"));
        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_PHLOX), Identifier.of("white_phlox_1"));
        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_PHLOX), Identifier.of("white_phlox_2"));
        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_PHLOX), Identifier.of("orange_phlox_1"));
        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_PHLOX), Identifier.of("orange_phlox_2"));
        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_PHLOX), Identifier.of("red_phlox_1"));
        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_PHLOX), Identifier.of("red_phlox_2"));
        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_PHLOX), Identifier.of("yellow_phlox_1"));
        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_PHLOX), Identifier.of("yellow_phlox_2"));
        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_PHLOX), Identifier.of("light_blue_phlox_1"));
        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_PHLOX), Identifier.of("light_blue_phlox_2"));
        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_PHLOX), Identifier.of("pink_phlox_1"));
        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_PHLOX), Identifier.of("pink_phlox_2"));
        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_PHLOX), Identifier.of("black_phlox_1"));
        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_PHLOX), Identifier.of("black_phlox_2"));
        offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_PHLOX), Identifier.of("cyan_phlox_1"));
        offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_PHLOX), Identifier.of("cyan_phlox_2"));

        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_SMALL_ROSE), Identifier.of("magenta_small_rose_1"));
        offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_SMALL_ROSE), Identifier.of("magenta_small_rose_2"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_SMALL_ROSE), Identifier.of("blue_small_rose_1"));
        offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_SMALL_ROSE), Identifier.of("blue_small_rose_2"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_SMALL_ROSE), Identifier.of("white_small_rose_1"));
        offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_SMALL_ROSE), Identifier.of("white_small_rose_2"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_SMALL_ROSE), Identifier.of("orange_small_rose_1"));
        offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_SMALL_ROSE), Identifier.of("orange_small_rose_2"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_SMALL_ROSE), Identifier.of("red_small_rose_1"));
        offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_SMALL_ROSE), Identifier.of("red_small_rose_2"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_SMALL_ROSE), Identifier.of("yellow_small_rose_1"));
        offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_SMALL_ROSE), Identifier.of("yellow_small_rose_2"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_SMALL_ROSE), Identifier.of("light_blue_small_rose_1"));
        offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_SMALL_ROSE), Identifier.of("light_blue_small_rose_2"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_SMALL_ROSE), Identifier.of("pink_small_rose_1"));
        offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_SMALL_ROSE), Identifier.of("pink_small_rose_2"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_SMALL_ROSE), Identifier.of("black_small_rose_1"));
        offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_SMALL_ROSE), Identifier.of("black_small_rose_2"));
        offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_SMALL_ROSE), Identifier.of("cyan_small_rose_1"));
        offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_SMALL_ROSE), Identifier.of("cyan_small_rose_2"));

        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_LAVENDER), Identifier.of("magenta_lavender_1"));
        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_LAVENDER), Identifier.of("magenta_lavender_2"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_LAVENDER), Identifier.of("blue_lavender_1"));
        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_LAVENDER), Identifier.of("blue_lavender_2"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_LAVENDER), Identifier.of("white_lavender_1"));
        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_LAVENDER), Identifier.of("white_lavender_2"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_LAVENDER), Identifier.of("orange_lavender_1"));
        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_LAVENDER), Identifier.of("orange_lavender_2"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_LAVENDER), Identifier.of("red_lavender_1"));
        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_LAVENDER), Identifier.of("red_lavender_2"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_LAVENDER), Identifier.of("yellow_lavender_1"));
        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_LAVENDER), Identifier.of("yellow_lavender_2"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_LAVENDER), Identifier.of("light_blue_lavender_1"));
        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_LAVENDER), Identifier.of("light_blue_lavender_2"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_LAVENDER), Identifier.of("pink_lavender_1"));
        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_LAVENDER), Identifier.of("pink_lavender_2"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_LAVENDER), Identifier.of("black_lavender_1"));
        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_LAVENDER), Identifier.of("black_lavender_2"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_LAVENDER), Identifier.of("cyan_lavender_1"));
        offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_LAVENDER), Identifier.of("cyan_lavender_2"));

        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_HYDRANGEA), Identifier.of("magenta_hydrangea_1"));
        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_HYDRANGEA), Identifier.of("magenta_hydrangea_2"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_HYDRANGEA), Identifier.of("blue_hydrangea_1"));
        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_HYDRANGEA), Identifier.of("blue_hydrangea_2"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_HYDRANGEA), Identifier.of("white_hydrangea_1"));
        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_HYDRANGEA), Identifier.of("white_hydrangea_2"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_HYDRANGEA), Identifier.of("orange_hydrangea_1"));
        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_HYDRANGEA), Identifier.of("orange_hydrangea_2"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_HYDRANGEA), Identifier.of("red_hydrangea_1"));
        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_HYDRANGEA), Identifier.of("red_hydrangea_2"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_HYDRANGEA), Identifier.of("yellow_hydrangea_1"));
        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_HYDRANGEA), Identifier.of("yellow_hydrangea_2"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_HYDRANGEA), Identifier.of("light_blue_hydrangea_1"));
        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_HYDRANGEA), Identifier.of("light_blue_hydrangea_2"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_HYDRANGEA), Identifier.of("pink_hydrangea_1"));
        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_HYDRANGEA), Identifier.of("pink_hydrangea_2"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_HYDRANGEA), Identifier.of("black_hydrangea_1"));
        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_HYDRANGEA), Identifier.of("black_hydrangea_2"));
        offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_HYDRANGEA), Identifier.of("cyan_hydrangea_1"));
        offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_HYDRANGEA), Identifier.of("cyan_hydrangea_2"));

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

        offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_JASMINE), Identifier.of("magenta_jasmine_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_JASMINE), Identifier.of("magenta_jasmine_2"));
        offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_JASMINE), Identifier.of("blue_jasmine_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_JASMINE), Identifier.of("blue_jasmine_2"));
        offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_JASMINE), Identifier.of("white_jasmine_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_JASMINE), Identifier.of("white_jasmine_2"));
        offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_JASMINE), Identifier.of("orange_jasmine_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_JASMINE), Identifier.of("orange_jasmine_2"));
        offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_JASMINE), Identifier.of("red_jasmine_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_JASMINE), Identifier.of("red_jasmine_2"));
        offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_JASMINE), Identifier.of("yellow_jasmine_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_JASMINE), Identifier.of("yellow_jasmine_2"));
        offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_JASMINE), Identifier.of("light_blue_jasmine_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_JASMINE), Identifier.of("light_blue_jasmine_2"));
        offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_JASMINE), Identifier.of("pink_jasmine_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_JASMINE), Identifier.of("pink_jasmine_2"));
        offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_JASMINE), Identifier.of("black_jasmine_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_JASMINE), Identifier.of("black_jasmine_2"));
        offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_JASMINE), Identifier.of("cyan_jasmine_1"));
        offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_JASMINE), Identifier.of("cyan_jasmine_2"));

        offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_CYPRUS_VINE), Identifier.of("magenta_cyprus_vine_1"));
        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_CYPRUS_VINE), Identifier.of("magenta_cyprus_vine_2"));
        offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_CYPRUS_VINE), Identifier.of("blue_cyprus_vine_1"));
        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_CYPRUS_VINE), Identifier.of("blue_cyprus_vine_2"));
        offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_CYPRUS_VINE), Identifier.of("white_cyprus_vine_1"));
        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_CYPRUS_VINE), Identifier.of("white_cyprus_vine_2"));
        offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_CYPRUS_VINE), Identifier.of("orange_cyprus_vine_1"));
        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_CYPRUS_VINE), Identifier.of("orange_cyprus_vine_2"));
        offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_CYPRUS_VINE), Identifier.of("red_cyprus_vine_1"));
        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_CYPRUS_VINE), Identifier.of("red_cyprus_vine_2"));
        offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_CYPRUS_VINE), Identifier.of("yellow_cyprus_vine_1"));
        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_CYPRUS_VINE), Identifier.of("yellow_cyprus_vine_2"));
        offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_CYPRUS_VINE), Identifier.of("light_blue_cyprus_vine_1"));
        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_CYPRUS_VINE), Identifier.of("light_blue_cyprus_vine_2"));
        offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_CYPRUS_VINE), Identifier.of("pink_cyprus_vine_1"));
        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_CYPRUS_VINE), Identifier.of("pink_cyprus_vine_2"));
        offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_CYPRUS_VINE), Identifier.of("black_cyprus_vine_1"));
        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_CYPRUS_VINE), Identifier.of("black_cyprus_vine_2"));
        offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_CYPRUS_VINE), Identifier.of("cyan_cyprus_vine_1"));
        offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_CYPRUS_VINE), Identifier.of("cyan_cyprus_vine_2"));

        offerSmithingTrimRecipe(exporter, FBItems.FLORAL_SMITHING_TEMPLATE, Identifier.of(FlowerBreeding.MOD_ID, "floral"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, FBItems.FLORAL_SMITHING_TEMPLATE, 2)
                .input('#', Items.DIAMOND)
                .input('M', Blocks.MOSS_BLOCK)
                .input('T', FBItems.FLORAL_SMITHING_TEMPLATE)
                .pattern("#T#")
                .pattern("#M#")
                .pattern("###")
                .criterion(hasItem(FBItems.FLORAL_SMITHING_TEMPLATE), conditionsFromItem(FBItems.FLORAL_SMITHING_TEMPLATE))
                .offerTo(exporter);
    }

    public static void offerBotanyRecipe(RecipeExporter exporter, Item vial1, Item vial2, Item jar, ItemStack result, Identifier recipeId) {
        BotanyTableRecipeJsonBuilder.create(Ingredient.ofItems(vial1), Ingredient.ofItems(vial2), Ingredient.ofItems(jar), result, MISC)
                .criterion("has_vial1", conditionsFromItem(vial1))
                .criterion("has_vial2", conditionsFromItem(vial2))
                .offerTo(exporter, recipeId);
    }
}
