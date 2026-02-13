package net.flowerbreeding.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FBItems;
import net.flowerbreeding.FlowerBreeding;
import net.flowerbreeding.trim.FBArmourTrims;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.recipe.book.RecipeCategory.MISC;

public class FBRecipeGenerator extends FabricRecipeProvider {
    public FBRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        return new RecipeGenerator(registries, exporter) {
            @Override
            public void generate() {
                offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(Blocks.ALLIUM), "magenta_allium");
                offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_ALLIUM), "blue_allium");
                offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_ALLIUM), "white_allium");
                offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_ALLIUM), "orange_allium");
                offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_ALLIUM), "red_allium");
                offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_ALLIUM), "yellow_allium");
                offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_ALLIUM), "light_blue_allium");
                offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_ALLIUM), "pink_allium");
                offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_ALLIUM), "black_allium");
                offerBotanyRecipe(exporter, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_ALLIUM), "cyan_allium");

                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_CORNFLOWER), "magenta_cornflower");
                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(Blocks.CORNFLOWER), "blue_cornflower");
                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_CORNFLOWER), "white_cornflower");
                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_CORNFLOWER), "orange_cornflower");
                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_CORNFLOWER), "red_cornflower");
                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_CORNFLOWER), "yellow_cornflower");
                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_CORNFLOWER), "light_blue_cornflower");
                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_CORNFLOWER), "pink_cornflower");
                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_CORNFLOWER), "black_cornflower");
                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_CORNFLOWER), "cyan_cornflower");

                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_DAISY), "magenta_daisy");
                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_DAISY), "blue_daisy");
                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(Blocks.OXEYE_DAISY), "white_daisy");
                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_DAISY), "orange_daisy");
                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_DAISY), "red_daisy");
                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_DAISY), "yellow_daisy");
                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_DAISY), "light_blue_daisy");
                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_DAISY), "pink_daisy");
                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_DAISY), "black_daisy");
                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_DAISY), "cyan_daisy");

                offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_TORCHFLOWER), "magenta_torchflower");
                offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_TORCHFLOWER), "blue_torchflower");
                offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_TORCHFLOWER), "white_torchflower");
                offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(Blocks.TORCHFLOWER), "orange_torchflower");
                offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_TORCHFLOWER), "red_torchflower");
                offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_TORCHFLOWER), "yellow_torchflower");
                offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_TORCHFLOWER), "light_blue_torchflower");
                offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_TORCHFLOWER), "pink_torchflower");
                offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_TORCHFLOWER), "black_torchflower");
                offerBotanyRecipe(exporter, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_TORCHFLOWER), "cyan_torchflower");

                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_TULIP), "magenta_tulip");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_TULIP), "blue_tulip");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(Blocks.WHITE_TULIP), "white_tulip");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(Blocks.ORANGE_TULIP), "orange_tulip");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(Blocks.RED_TULIP), "red_tulip");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_TULIP), "yellow_tulip");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_TULIP), "light_blue_tulip");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(Blocks.PINK_TULIP), "pink_tulip");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_TULIP), "black_tulip");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_TULIP), "cyan_tulip");

                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_AZURE_BLUET), "magenta_azure_bluet");
                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_AZURE_BLUET), "blue_azure_bluet");
                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(Blocks.AZURE_BLUET), "white_azure_bluet");
                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_AZURE_BLUET), "orange_azure_bluet");
                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_AZURE_BLUET), "red_azure_bluet");
                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_AZURE_BLUET), "yellow_azure_bluet");
                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_AZURE_BLUET), "light_blue_azure_bluet");
                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_AZURE_BLUET), "pink_azure_bluet");
                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_AZURE_BLUET), "black_azure_bluet");
                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_AZURE_BLUET), "cyan_azure_bluet");

                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_DANDELION), "magenta_dandelion");
                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_DANDELION), "blue_dandelion");
                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_DANDELION), "white_dandelion");
                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_DANDELION), "orange_dandelion");
                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_DANDELION), "red_dandelion");
                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(Blocks.DANDELION), "yellow_dandelion");
                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_DANDELION), "light_blue_dandelion");
                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_DANDELION), "pink_dandelion");
                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_DANDELION), "black_dandelion");
                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_DANDELION), "cyan_dandelion");

                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_ORCHID), "magenta_orchid");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_ORCHID), "blue_orchid");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_ORCHID), "white_orchid");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_ORCHID), "orange_orchid");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_ORCHID), "red_orchid");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_ORCHID), "yellow_orchid");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(Blocks.BLUE_ORCHID), "light_blue_orchid");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_ORCHID), "pink_orchid");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_ORCHID), "black_orchid");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_ORCHID), "cyan_orchid");

                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_LILY), "magenta_lily");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_LILY), "blue_lily");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(Blocks.LILY_OF_THE_VALLEY), "white_lily");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_LILY), "orange_lily");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_LILY), "red_lily");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_LILY), "yellow_lily");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_LILY), "light_blue_lily");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_LILY), "pink_lily");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_LILY), "black_lily");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_LILY), "cyan_lily");

                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_POPPY), "magenta_poppy");
                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_POPPY), "blue_poppy");
                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_POPPY), "white_poppy");
                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_POPPY), "orange_poppy");
                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(Blocks.POPPY), "red_poppy");
                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_POPPY), "yellow_poppy");
                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_POPPY), "light_blue_poppy");
                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_POPPY), "pink_poppy");
                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_POPPY), "black_poppy");
                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_POPPY), "cyan_poppy");

                offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_WITHER_ROSE), "magenta_wither_rose");
                offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_WITHER_ROSE), "blue_wither_rose");
                offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_WITHER_ROSE), "white_wither_rose");
                offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_WITHER_ROSE), "orange_wither_rose");
                offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_WITHER_ROSE), "red_wither_rose");
                offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_WITHER_ROSE), "yellow_wither_rose");
                offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_WITHER_ROSE), "light_blue_wither_rose");
                offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_WITHER_ROSE), "pink_wither_rose");
                offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(Blocks.WITHER_ROSE), "black_wither_rose");
                offerBotanyRecipe(exporter, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_WITHER_ROSE), "cyan_wither_rose");

                offerBotanyRecipe(exporter, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.OPEN_MAGENTA_EYEBLOSSOM), "magenta_eyeblossom");
                offerBotanyRecipe(exporter, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.OPEN_BLUE_EYEBLOSSOM), "blue_eyeblossom");
                offerBotanyRecipe(exporter, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.OPEN_WHITE_EYEBLOSSOM), "white_eyeblossom");
                offerBotanyRecipe(exporter, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(Blocks.OPEN_EYEBLOSSOM), "orange_eyeblossom");
                offerBotanyRecipe(exporter, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.OPEN_RED_EYEBLOSSOM), "red_eyeblossom");
                offerBotanyRecipe(exporter, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.OPEN_YELLOW_EYEBLOSSOM), "yellow_eyeblossom");
                offerBotanyRecipe(exporter, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.OPEN_LIGHT_BLUE_EYEBLOSSOM), "light_blue_eyeblossom");
                offerBotanyRecipe(exporter, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.OPEN_PINK_EYEBLOSSOM), "pink_eyeblossom");
                offerBotanyRecipe(exporter, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.OPEN_BLACK_EYEBLOSSOM), "black_eyeblossom");
                offerBotanyRecipe(exporter, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.OPEN_CYAN_EYEBLOSSOM), "cyan_eyeblossom");

                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_LILAC), "magenta_lilac");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_LILAC), "blue_lilac");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_LILAC), "white_lilac");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_LILAC), "orange_lilac");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_LILAC), "red_lilac");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_LILAC), "yellow_lilac");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_LILAC), "light_blue_lilac");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(Blocks.LILAC), "pink_lilac");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_LILAC), "black_lilac");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_LILAC), "cyan_lilac");

                offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_PEONY), "magenta_peony");
                offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_PEONY), "blue_peony");
                offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_PEONY), "white_peony");
                offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_PEONY), "orange_peony");
                offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_PEONY), "red_peony");
                offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_PEONY), "yellow_peony");
                offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_PEONY), "light_blue_peony");
                offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(Blocks.PEONY), "pink_peony");
                offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_PEONY), "black_peony");
                offerBotanyRecipe(exporter, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_PEONY), "cyan_peony");

                offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_PITCHER_PLANT), "magenta_pitcher_plant");
                offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_PITCHER_PLANT), "blue_pitcher_plant");
                offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_PITCHER_PLANT), "white_pitcher_plant");
                offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_PITCHER_PLANT), "orange_pitcher_plant");
                offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_PITCHER_PLANT), "red_pitcher_plant");
                offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_PITCHER_PLANT), "yellow_pitcher_plant");
                offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_PITCHER_PLANT), "light_blue_pitcher_plant");
                offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_PITCHER_PLANT), "pink_pitcher_plant");
                offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_PITCHER_PLANT), "black_pitcher_plant");
                offerBotanyRecipe(exporter, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(Blocks.PITCHER_PLANT), "cyan_pitcher_plant");

                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_ROSE_BUSH), "magenta_rose_bush");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_ROSE_BUSH), "blue_rose_bush");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_ROSE_BUSH), "white_rose_bush");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_ROSE_BUSH), "orange_rose_bush");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(Blocks.ROSE_BUSH), "red_rose_bush");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_ROSE_BUSH), "yellow_rose_bush");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_ROSE_BUSH), "light_blue_rose_bush");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_ROSE_BUSH), "pink_rose_bush");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_ROSE_BUSH), "black_rose_bush");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_ROSE_BUSH), "cyan_rose_bush");

                offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_SUNFLOWER), "magenta_sunflower");
                offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_SUNFLOWER), "blue_sunflower");
                offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_SUNFLOWER), "white_sunflower");
                offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_SUNFLOWER), "orange_sunflower");
                offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_SUNFLOWER), "red_sunflower");
                offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(Blocks.SUNFLOWER), "yellow_sunflower");
                offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_SUNFLOWER), "light_blue_sunflower");
                offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_SUNFLOWER), "pink_sunflower");
                offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_SUNFLOWER), "black_sunflower");
                offerBotanyRecipe(exporter, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_SUNFLOWER), "cyan_sunflower");

                offerBotanyRecipe(exporter, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_PETALS), "magenta_petals");
                offerBotanyRecipe(exporter, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_PETALS), "blue_petals");
                offerBotanyRecipe(exporter, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_PETALS), "white_petals");
                offerBotanyRecipe(exporter, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_PETALS), "orange_petals");
                offerBotanyRecipe(exporter, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_PETALS), "red_petals");
                offerBotanyRecipe(exporter, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_PETALS), "yellow_petals");
                offerBotanyRecipe(exporter, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_PETALS), "light_blue_petals");
                offerBotanyRecipe(exporter, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(Blocks.PINK_PETALS), "pink_petals");
                offerBotanyRecipe(exporter, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_PETALS), "black_petals");
                offerBotanyRecipe(exporter, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_PETALS), "cyan_petals");

                offerBotanyRecipe(exporter, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_WILDFLOWERS), "magenta_wildflowers");
                offerBotanyRecipe(exporter, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_WILDFLOWERS), "blue_wildflowers");
                offerBotanyRecipe(exporter, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_WILDFLOWERS), "white_wildflowers");
                offerBotanyRecipe(exporter, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_WILDFLOWERS), "orange_wildflowers");
                offerBotanyRecipe(exporter, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_WILDFLOWERS), "red_wildflowers");
                offerBotanyRecipe(exporter, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(Blocks.WILDFLOWERS), "yellow_wildflowers");
                offerBotanyRecipe(exporter, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_WILDFLOWERS), "light_blue_wildflowers");
                offerBotanyRecipe(exporter, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_WILDFLOWERS), "pink_wildflowers");
                offerBotanyRecipe(exporter, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_WILDFLOWERS), "black_wildflowers");
                offerBotanyRecipe(exporter, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_WILDFLOWERS), "cyan_wildflowers");

                offerBotanyRecipe(exporter, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_CACTUS_FLOWER), "magenta_cactus_flower");
                offerBotanyRecipe(exporter, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_CACTUS_FLOWER), "blue_cactus_flower");
                offerBotanyRecipe(exporter, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_CACTUS_FLOWER), "white_cactus_flower");
                offerBotanyRecipe(exporter, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_CACTUS_FLOWER), "orange_cactus_flower");
                offerBotanyRecipe(exporter, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_CACTUS_FLOWER), "red_cactus_flower");
                offerBotanyRecipe(exporter, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_CACTUS_FLOWER), "yellow_cactus_flower");
                offerBotanyRecipe(exporter, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_CACTUS_FLOWER), "light_blue_cactus_flower");
                offerBotanyRecipe(exporter, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(Blocks.CACTUS_FLOWER), "pink_cactus_flower");
                offerBotanyRecipe(exporter, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_CACTUS_FLOWER), "black_cactus_flower");
                offerBotanyRecipe(exporter, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_CACTUS_FLOWER), "cyan_cactus_flower");

                offerBotanyRecipe(exporter, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_SPORE_BLOSSOM), "magenta_spore_blossom");
                offerBotanyRecipe(exporter, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_SPORE_BLOSSOM), "blue_spore_blossom");
                offerBotanyRecipe(exporter, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_SPORE_BLOSSOM), "white_spore_blossom");
                offerBotanyRecipe(exporter, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_SPORE_BLOSSOM), "orange_spore_blossom");
                offerBotanyRecipe(exporter, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_SPORE_BLOSSOM), "red_spore_blossom");
                offerBotanyRecipe(exporter, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_SPORE_BLOSSOM), "yellow_spore_blossom");
                offerBotanyRecipe(exporter, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_SPORE_BLOSSOM), "light_blue_spore_blossom");
                offerBotanyRecipe(exporter, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(Blocks.SPORE_BLOSSOM), "pink_spore_blossom");
                offerBotanyRecipe(exporter, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_SPORE_BLOSSOM), "black_spore_blossom");
                offerBotanyRecipe(exporter, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_SPORE_BLOSSOM), "cyan_spore_blossom");

                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_FLOWERING_AZALEA), "magenta_flowering_azalea");
                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_FLOWERING_AZALEA), "blue_flowering_azalea");
                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_FLOWERING_AZALEA), "white_flowering_azalea");
                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_FLOWERING_AZALEA), "orange_flowering_azalea");
                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_FLOWERING_AZALEA), "red_flowering_azalea");
                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_FLOWERING_AZALEA), "yellow_flowering_azalea");
                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_FLOWERING_AZALEA), "light_blue_flowering_azalea");
                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(Blocks.FLOWERING_AZALEA), "pink_flowering_azalea");
                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_FLOWERING_AZALEA), "black_flowering_azalea");
                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_FLOWERING_AZALEA), "cyan_flowering_azalea");

                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_FLOWERING_AZALEA_LEAVES), "magenta_flowering_azalea_leaves");
                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_FLOWERING_AZALEA_LEAVES), "blue_flowering_azalea_leaves");
                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_FLOWERING_AZALEA_LEAVES), "white_flowering_azalea_leaves");
                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_FLOWERING_AZALEA_LEAVES), "orange_flowering_azalea_leaves");
                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_FLOWERING_AZALEA_LEAVES), "red_flowering_azalea_leaves");
                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_FLOWERING_AZALEA_LEAVES), "yellow_flowering_azalea_leaves");
                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_FLOWERING_AZALEA_LEAVES), "light_blue_flowering_azalea_leaves");
                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(Blocks.FLOWERING_AZALEA_LEAVES), "pink_flowering_azalea_leaves");
                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_FLOWERING_AZALEA_LEAVES), "black_flowering_azalea_leaves");
                offerBotanyRecipe(exporter, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_FLOWERING_AZALEA_LEAVES), "cyan_flowering_azalea_leaves");

                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_DAFFODIL), "magenta_daffodil_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_DAFFODIL), "magenta_daffodil_2");
                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_DAFFODIL), "blue_daffodil_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_DAFFODIL), "blue_daffodil_2");
                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_DAFFODIL), "white_daffodil_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_DAFFODIL), "white_daffodil_2");
                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_DAFFODIL), "orange_daffodil_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_DAFFODIL), "orange_daffodil_2");
                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_DAFFODIL), "red_daffodil_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_DAFFODIL), "red_daffodil_2");
                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_DAFFODIL), "yellow_daffodil_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_DAFFODIL), "yellow_daffodil_2");
                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_DAFFODIL), "light_blue_daffodil_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_DAFFODIL), "light_blue_daffodil_2");
                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_DAFFODIL), "pink_daffodil_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_DAFFODIL), "pink_daffodil_2");
                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_DAFFODIL), "black_daffodil_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_DAFFODIL), "black_daffodil_2");
                offerBotanyRecipe(exporter, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_DAFFODIL), "cyan_daffodil_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_DAFFODIL), "cyan_daffodil_2");

                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_FOXGLOVE), "magenta_foxglove_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_FOXGLOVE), "magenta_foxglove_2");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_FOXGLOVE), "blue_foxglove_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_FOXGLOVE), "blue_foxglove_2");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_FOXGLOVE), "white_foxglove_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_FOXGLOVE), "white_foxglove_2");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_FOXGLOVE), "orange_foxglove_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_FOXGLOVE), "orange_foxglove_2");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_FOXGLOVE), "red_foxglove_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_FOXGLOVE), "red_foxglove_2");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_FOXGLOVE), "yellow_foxglove_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_FOXGLOVE), "yellow_foxglove_2");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_FOXGLOVE), "light_blue_foxglove_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_FOXGLOVE), "light_blue_foxglove_2");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_FOXGLOVE), "pink_foxglove_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_FOXGLOVE), "pink_foxglove_2");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_FOXGLOVE), "black_foxglove_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_FOXGLOVE), "black_foxglove_2");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_FOXGLOVE), "cyan_foxglove_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_FOXGLOVE), "cyan_foxglove_2");

                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_HYACINTH), "magenta_hyacinth_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_HYACINTH), "magenta_hyacinth_2");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_HYACINTH), "blue_hyacinth_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_HYACINTH), "blue_hyacinth_2");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_HYACINTH), "white_hyacinth_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_HYACINTH), "white_hyacinth_2");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_HYACINTH), "orange_hyacinth_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_HYACINTH), "orange_hyacinth_2");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_HYACINTH), "red_hyacinth_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_HYACINTH), "red_hyacinth_2");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_HYACINTH), "yellow_hyacinth_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_HYACINTH), "yellow_hyacinth_2");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_HYACINTH), "light_blue_hyacinth_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_HYACINTH), "light_blue_hyacinth_2");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_HYACINTH), "pink_hyacinth_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_HYACINTH), "pink_hyacinth_2");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_HYACINTH), "black_hyacinth_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_HYACINTH), "black_hyacinth_2");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_HYACINTH), "cyan_hyacinth_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_HYACINTH), "cyan_hyacinth_2");

                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_PHLOX), "magenta_phlox_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_PHLOX), "magenta_phlox_2");
                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_PHLOX), "blue_phlox_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_PHLOX), "blue_phlox_2");
                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_PHLOX), "white_phlox_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_PHLOX), "white_phlox_2");
                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_PHLOX), "orange_phlox_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_PHLOX), "orange_phlox_2");
                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_PHLOX), "red_phlox_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_PHLOX), "red_phlox_2");
                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_PHLOX), "yellow_phlox_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_PHLOX), "yellow_phlox_2");
                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_PHLOX), "light_blue_phlox_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_PHLOX), "light_blue_phlox_2");
                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_PHLOX), "pink_phlox_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_PHLOX), "pink_phlox_2");
                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_PHLOX), "black_phlox_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_PHLOX), "black_phlox_2");
                offerBotanyRecipe(exporter, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_PHLOX), "cyan_phlox_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_PHLOX), "cyan_phlox_2");

                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_LUPIN), "magenta_lupin_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_LUPIN), "magenta_lupin_2");
                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_LUPIN), "blue_lupin_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_LUPIN), "blue_lupin_2");
                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_LUPIN), "white_lupin_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_LUPIN), "white_lupin_2");
                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_LUPIN), "orange_lupin_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_LUPIN), "orange_lupin_2");
                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_LUPIN), "red_lupin_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_LUPIN), "red_lupin_2");
                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_LUPIN), "yellow_lupin_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_LUPIN), "yellow_lupin_2");
                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_LUPIN), "light_blue_lupin_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_LUPIN), "light_blue_lupin_2");
                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_LUPIN), "pink_lupin_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_LUPIN), "pink_lupin_2");
                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_LUPIN), "black_lupin_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_LUPIN), "black_lupin_2");
                offerBotanyRecipe(exporter, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_LUPIN), "cyan_lupin_1");
                offerBotanyRecipe(exporter, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_LUPIN), "cyan_lupin_2");

                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_SMALL_ROSE), "magenta_small_rose_1");
                offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_SMALL_ROSE), "magenta_small_rose_2");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_SMALL_ROSE), "blue_small_rose_1");
                offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_SMALL_ROSE), "blue_small_rose_2");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_SMALL_ROSE), "white_small_rose_1");
                offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_SMALL_ROSE), "white_small_rose_2");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_SMALL_ROSE), "orange_small_rose_1");
                offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_SMALL_ROSE), "orange_small_rose_2");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_SMALL_ROSE), "red_small_rose_1");
                offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_SMALL_ROSE), "red_small_rose_2");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_SMALL_ROSE), "yellow_small_rose_1");
                offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_SMALL_ROSE), "yellow_small_rose_2");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_SMALL_ROSE), "light_blue_small_rose_1");
                offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_SMALL_ROSE), "light_blue_small_rose_2");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_SMALL_ROSE), "pink_small_rose_1");
                offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_SMALL_ROSE), "pink_small_rose_2");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_SMALL_ROSE), "black_small_rose_1");
                offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_SMALL_ROSE), "black_small_rose_2");
                offerBotanyRecipe(exporter, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_SMALL_ROSE), "cyan_small_rose_1");
                offerBotanyRecipe(exporter, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_SMALL_ROSE), "cyan_small_rose_2");

                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_LAVENDER), "magenta_lavender_1");
                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_LAVENDER), "magenta_lavender_2");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_LAVENDER), "blue_lavender_1");
                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_LAVENDER), "blue_lavender_2");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_LAVENDER), "white_lavender_1");
                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_LAVENDER), "white_lavender_2");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_LAVENDER), "orange_lavender_1");
                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_LAVENDER), "orange_lavender_2");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_LAVENDER), "red_lavender_1");
                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_LAVENDER), "red_lavender_2");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_LAVENDER), "yellow_lavender_1");
                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_LAVENDER), "yellow_lavender_2");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_LAVENDER), "light_blue_lavender_1");
                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_LAVENDER), "light_blue_lavender_2");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_LAVENDER), "pink_lavender_1");
                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_LAVENDER), "pink_lavender_2");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_LAVENDER), "black_lavender_1");
                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_LAVENDER), "black_lavender_2");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_LAVENDER), "cyan_lavender_1");
                offerBotanyRecipe(exporter, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_LAVENDER), "cyan_lavender_2");

                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_HYDRANGEA), "magenta_hydrangea_1");
                offerBotanyRecipe(exporter, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_HYDRANGEA), "magenta_hydrangea_2");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_HYDRANGEA), "blue_hydrangea_1");
                offerBotanyRecipe(exporter, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_HYDRANGEA), "blue_hydrangea_2");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_HYDRANGEA), "white_hydrangea_1");
                offerBotanyRecipe(exporter, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_HYDRANGEA), "white_hydrangea_2");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_HYDRANGEA), "orange_hydrangea_1");
                offerBotanyRecipe(exporter, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_HYDRANGEA), "orange_hydrangea_2");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_HYDRANGEA), "red_hydrangea_1");
                offerBotanyRecipe(exporter, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_HYDRANGEA), "red_hydrangea_2");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_HYDRANGEA), "yellow_hydrangea_1");
                offerBotanyRecipe(exporter, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_HYDRANGEA), "yellow_hydrangea_2");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_HYDRANGEA), "light_blue_hydrangea_1");
                offerBotanyRecipe(exporter, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_HYDRANGEA), "light_blue_hydrangea_2");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_HYDRANGEA), "pink_hydrangea_1");
                offerBotanyRecipe(exporter, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_HYDRANGEA), "pink_hydrangea_2");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_HYDRANGEA), "black_hydrangea_1");
                offerBotanyRecipe(exporter, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_HYDRANGEA), "black_hydrangea_2");
                offerBotanyRecipe(exporter, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_HYDRANGEA), "cyan_hydrangea_1");
                offerBotanyRecipe(exporter, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_HYDRANGEA), "cyan_hydrangea_2");

                offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBItems.MAGENTA_LOTUS_FLOWER), "magenta_lotus_flower_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBItems.MAGENTA_LOTUS_FLOWER), "magenta_lotus_flower_2");
                offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBItems.BLUE_LOTUS_FLOWER), "blue_lotus_flower_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBItems.BLUE_LOTUS_FLOWER), "blue_lotus_flower_2");
                offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBItems.WHITE_LOTUS_FLOWER), "white_lotus_flower_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBItems.WHITE_LOTUS_FLOWER), "white_lotus_flower_2");
                offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBItems.ORANGE_LOTUS_FLOWER), "orange_lotus_flower_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBItems.ORANGE_LOTUS_FLOWER), "orange_lotus_flower_2");
                offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBItems.RED_LOTUS_FLOWER), "red_lotus_flower_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBItems.RED_LOTUS_FLOWER), "red_lotus_flower_2");
                offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBItems.YELLOW_LOTUS_FLOWER), "yellow_lotus_flower_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBItems.YELLOW_LOTUS_FLOWER), "yellow_lotus_flower_2");
                offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBItems.LIGHT_BLUE_LOTUS_FLOWER), "light_blue_lotus_flower_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBItems.LIGHT_BLUE_LOTUS_FLOWER), "light_blue_lotus_flower_2");
                offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBItems.PINK_LOTUS_FLOWER), "pink_lotus_flower_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBItems.PINK_LOTUS_FLOWER), "pink_lotus_flower_2");
                offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBItems.BLACK_LOTUS_FLOWER), "black_lotus_flower_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBItems.BLACK_LOTUS_FLOWER), "black_lotus_flower_2");
                offerBotanyRecipe(exporter, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBItems.CYAN_LOTUS_FLOWER), "cyan_lotus_flower_1");
                offerBotanyRecipe(exporter, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBItems.CYAN_LOTUS_FLOWER), "cyan_lotus_flower_2");

                offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_JASMINE), "magenta_jasmine_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_JASMINE), "magenta_jasmine_2");
                offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_JASMINE), "blue_jasmine_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_JASMINE), "blue_jasmine_2");
                offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_JASMINE), "white_jasmine_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_JASMINE), "white_jasmine_2");
                offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_JASMINE), "orange_jasmine_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_JASMINE), "orange_jasmine_2");
                offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_JASMINE), "red_jasmine_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_JASMINE), "red_jasmine_2");
                offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_JASMINE), "yellow_jasmine_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_JASMINE), "yellow_jasmine_2");
                offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_JASMINE), "light_blue_jasmine_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_JASMINE), "light_blue_jasmine_2");
                offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_JASMINE), "pink_jasmine_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_JASMINE), "pink_jasmine_2");
                offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_JASMINE), "black_jasmine_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_JASMINE), "black_jasmine_2");
                offerBotanyRecipe(exporter, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_JASMINE), "cyan_jasmine_1");
                offerBotanyRecipe(exporter, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_JASMINE), "cyan_jasmine_2");

                offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_CYPRESS_VINE), "magenta_cypress_vine_1");
                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_CYPRESS_VINE), "magenta_cypress_vine_2");
                offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_CYPRESS_VINE), "blue_cypress_vine_1");
                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_CYPRESS_VINE), "blue_cypress_vine_2");
                offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_CYPRESS_VINE), "white_cypress_vine_1");
                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_CYPRESS_VINE), "white_cypress_vine_2");
                offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_CYPRESS_VINE), "orange_cypress_vine_1");
                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_CYPRESS_VINE), "orange_cypress_vine_2");
                offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_CYPRESS_VINE), "red_cypress_vine_1");
                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_CYPRESS_VINE), "red_cypress_vine_2");
                offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_CYPRESS_VINE), "yellow_cypress_vine_1");
                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_CYPRESS_VINE), "yellow_cypress_vine_2");
                offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_CYPRESS_VINE), "light_blue_cypress_vine_1");
                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_CYPRESS_VINE), "light_blue_cypress_vine_2");
                offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_CYPRESS_VINE), "pink_cypress_vine_1");
                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_CYPRESS_VINE), "pink_cypress_vine_2");
                offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_CYPRESS_VINE), "black_cypress_vine_1");
                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_CYPRESS_VINE), "black_cypress_vine_2");
                offerBotanyRecipe(exporter, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_CYPRESS_VINE), "cyan_cypress_vine_1");
                offerBotanyRecipe(exporter, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_CYPRESS_VINE), "cyan_cypress_vine_2");

                offerBotanyRecipe(exporter, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_GLOWSHROOM), "magenta_glowshroom_1");
                offerBotanyRecipe(exporter, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStack(FBBlocks.MAGENTA_GLOWSHROOM), "magenta_glowshroom_2");
                offerBotanyRecipe(exporter, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_GLOWSHROOM), "blue_glowshroom_1");
                offerBotanyRecipe(exporter, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.BLUE_GLOWSHROOM), "blue_glowshroom_2");
                offerBotanyRecipe(exporter, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_GLOWSHROOM), "white_glowshroom_1");
                offerBotanyRecipe(exporter, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStack(FBBlocks.WHITE_GLOWSHROOM), "white_glowshroom_2");
                offerBotanyRecipe(exporter, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_GLOWSHROOM), "orange_glowshroom_1");
                offerBotanyRecipe(exporter, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStack(FBBlocks.ORANGE_GLOWSHROOM), "orange_glowshroom_2");
                offerBotanyRecipe(exporter, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_GLOWSHROOM), "red_glowshroom_1");
                offerBotanyRecipe(exporter, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStack(FBBlocks.RED_GLOWSHROOM), "red_glowshroom_2");
                offerBotanyRecipe(exporter, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_GLOWSHROOM), "yellow_glowshroom_1");
                offerBotanyRecipe(exporter, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStack(FBBlocks.YELLOW_GLOWSHROOM), "yellow_glowshroom_2");
                offerBotanyRecipe(exporter, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_GLOWSHROOM), "light_blue_glowshroom_1");
                offerBotanyRecipe(exporter, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStack(FBBlocks.LIGHT_BLUE_GLOWSHROOM), "light_blue_glowshroom_2");
                offerBotanyRecipe(exporter, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_GLOWSHROOM), "pink_glowshroom_1");
                offerBotanyRecipe(exporter, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStack(FBBlocks.PINK_GLOWSHROOM), "pink_glowshroom_2");
                offerBotanyRecipe(exporter, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_GLOWSHROOM), "black_glowshroom_1");
                offerBotanyRecipe(exporter, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStack(FBBlocks.BLACK_GLOWSHROOM), "black_glowshroom_2");
                offerBotanyRecipe(exporter, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_GLOWSHROOM), "cyan_glowshroom_1");
                offerBotanyRecipe(exporter, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStack(FBBlocks.CYAN_GLOWSHROOM), "cyan_glowshroom_2");

                createShaped(RecipeCategory.MISC, FBBlocks.PLANTER)
                        .input('#', Items.BRICK)
                        .input('X', Items.DIRT)
                        .pattern("# #")
                        .pattern("#X#")
                        .pattern("###")
                        .criterion(hasItem(Items.BRICK), conditionsFromItem(Items.BRICK))
                        .offerTo(exporter);

                offerVaseRecipe(FBBlocks.WHITE_VASE, Items.WHITE_TERRACOTTA);
                offerVaseRecipe(FBBlocks.LIGHT_GRAY_VASE, Items.LIGHT_GRAY_TERRACOTTA);
                offerVaseRecipe(FBBlocks.GRAY_VASE, Items.GRAY_TERRACOTTA);
                offerVaseRecipe(FBBlocks.BLACK_VASE, Items.BLACK_TERRACOTTA);
                offerVaseRecipe(FBBlocks.BROWN_VASE, Items.BROWN_TERRACOTTA);
                offerVaseRecipe(FBBlocks.RED_VASE, Items.RED_TERRACOTTA);
                offerVaseRecipe(FBBlocks.ORANGE_VASE, Items.ORANGE_TERRACOTTA);
                offerVaseRecipe(FBBlocks.YELLOW_VASE, Items.YELLOW_TERRACOTTA);
                offerVaseRecipe(FBBlocks.LIME_VASE, Items.LIME_TERRACOTTA);
                offerVaseRecipe(FBBlocks.GREEN_VASE, Items.GREEN_TERRACOTTA);
                offerVaseRecipe(FBBlocks.CYAN_VASE, Items.CYAN_TERRACOTTA);
                offerVaseRecipe(FBBlocks.LIGHT_BLUE_VASE, Items.LIGHT_BLUE_TERRACOTTA);
                offerVaseRecipe(FBBlocks.BLUE_VASE, Items.BLUE_TERRACOTTA);
                offerVaseRecipe(FBBlocks.PURPLE_VASE, Items.PURPLE_TERRACOTTA);
                offerVaseRecipe(FBBlocks.MAGENTA_VASE, Items.MAGENTA_TERRACOTTA);
                offerVaseRecipe(FBBlocks.PINK_VASE, Items.PINK_TERRACOTTA);

                offerSmithingTrimRecipe(FBItems.FLORAL_SMITHING_TEMPLATE, FBArmourTrims.FLORAL, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(FlowerBreeding.MOD_ID, "floral_smithing_trim")));

                offerSmithingTemplateCopyingRecipe(FBItems.FLORAL_SMITHING_TEMPLATE, Blocks.MOSS_BLOCK);
            }

            public void offerBotanyRecipe(RecipeExporter exporter, Item vial1, Item vial2, Item jar, ItemStack result, String recipeId) {
                BotanyTableRecipeJsonBuilder.create(Ingredient.ofItems(vial1), Ingredient.ofItems(vial2), Ingredient.ofItems(jar), result, MISC)
                        .criterion("has_vial1", conditionsFromItem(vial1))
                        .criterion("has_vial2", conditionsFromItem(vial2))
                        .offerTo(exporter, Identifier.of(FlowerBreeding.MOD_ID, recipeId), RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(FlowerBreeding.MOD_ID, recipeId + "_botany")));
            }

            private void offerVaseRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.DECORATIONS, output, 1)
                        .group("vase")
                        .input('#', input)
                        .pattern("# #")
                        .pattern(" # ")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }
        };
    }
    @Override
    public String getName() {
        return "Flower Breeding Recipes";
    }
}
