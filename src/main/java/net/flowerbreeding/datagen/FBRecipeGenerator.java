package net.flowerbreeding.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FBItems;
import net.flowerbreeding.FlowerBreeding;
import net.flowerbreeding.trim.FBArmourTrims;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponentPatch;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import org.jspecify.annotations.NullMarked;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.recipes.RecipeCategory.MISC;

@NullMarked
public class FBRecipeGenerator extends FabricRecipeProvider {
    public FBRecipeGenerator(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, BootstrapContext<Recipe<?>> recipes, BootstrapContext<Advancement> advancements) {
        return new RecipeProvider(recipes, advancements) {
            @Override
            public void buildRecipes() {
                offerBotanyRecipe(output, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(Blocks.ALLIUM.asItem()), "magenta_allium");
                offerBotanyRecipe(output, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_ALLIUM.asItem()), "blue_allium");
                offerBotanyRecipe(output, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_ALLIUM.asItem()), "white_allium");
                offerBotanyRecipe(output, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_ALLIUM.asItem()), "orange_allium");
                offerBotanyRecipe(output, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_ALLIUM.asItem()), "red_allium");
                offerBotanyRecipe(output, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_ALLIUM.asItem()), "yellow_allium");
                offerBotanyRecipe(output, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_ALLIUM.asItem()), "light_blue_allium");
                offerBotanyRecipe(output, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_ALLIUM.asItem()), "pink_allium");
                offerBotanyRecipe(output, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_ALLIUM.asItem()), "black_allium");
                offerBotanyRecipe(output, FBItems.ALLIUM_POLLEN_VIAL, FBItems.ALLIUM_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_ALLIUM.asItem()), "cyan_allium");

                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_CORNFLOWER.asItem()), "magenta_cornflower");
                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(Blocks.CORNFLOWER.asItem()), "blue_cornflower");
                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_CORNFLOWER.asItem()), "white_cornflower");
                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_CORNFLOWER.asItem()), "orange_cornflower");
                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_CORNFLOWER.asItem()), "red_cornflower");
                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_CORNFLOWER.asItem()), "yellow_cornflower");
                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_CORNFLOWER.asItem()), "light_blue_cornflower");
                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_CORNFLOWER.asItem()), "pink_cornflower");
                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_CORNFLOWER.asItem()), "black_cornflower");
                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_CORNFLOWER.asItem()), "cyan_cornflower");

                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_DAISY.asItem()), "magenta_daisy");
                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_DAISY.asItem()), "blue_daisy");
                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(Blocks.OXEYE_DAISY.asItem()), "white_daisy");
                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_DAISY.asItem()), "orange_daisy");
                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_DAISY.asItem()), "red_daisy");
                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_DAISY.asItem()), "yellow_daisy");
                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_DAISY.asItem()), "light_blue_daisy");
                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_DAISY.asItem()), "pink_daisy");
                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_DAISY.asItem()), "black_daisy");
                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_DAISY.asItem()), "cyan_daisy");

                offerBotanyRecipe(output, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_TORCHFLOWER.asItem()), "magenta_torchflower");
                offerBotanyRecipe(output, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_TORCHFLOWER.asItem()), "blue_torchflower");
                offerBotanyRecipe(output, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_TORCHFLOWER.asItem()), "white_torchflower");
                offerBotanyRecipe(output, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(Blocks.TORCHFLOWER.asItem()), "orange_torchflower");
                offerBotanyRecipe(output, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_TORCHFLOWER.asItem()), "red_torchflower");
                offerBotanyRecipe(output, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_TORCHFLOWER.asItem()), "yellow_torchflower");
                offerBotanyRecipe(output, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_TORCHFLOWER.asItem()), "light_blue_torchflower");
                offerBotanyRecipe(output, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_TORCHFLOWER.asItem()), "pink_torchflower");
                offerBotanyRecipe(output, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_TORCHFLOWER.asItem()), "black_torchflower");
                offerBotanyRecipe(output, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.TORCHFLOWER_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_TORCHFLOWER.asItem()), "cyan_torchflower");

                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_TULIP.asItem()), "magenta_tulip");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_TULIP.asItem()), "blue_tulip");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(Blocks.WHITE_TULIP.asItem()), "white_tulip");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(Blocks.ORANGE_TULIP.asItem()), "orange_tulip");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(Blocks.RED_TULIP.asItem()), "red_tulip");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_TULIP.asItem()), "yellow_tulip");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_TULIP.asItem()), "light_blue_tulip");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(Blocks.PINK_TULIP.asItem()), "pink_tulip");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_TULIP.asItem()), "black_tulip");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_TULIP.asItem()), "cyan_tulip");

                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_AZURE_BLUET.asItem()), "magenta_azure_bluet");
                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_AZURE_BLUET.asItem()), "blue_azure_bluet");
                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(Blocks.AZURE_BLUET.asItem()), "white_azure_bluet");
                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_AZURE_BLUET.asItem()), "orange_azure_bluet");
                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_AZURE_BLUET.asItem()), "red_azure_bluet");
                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_AZURE_BLUET.asItem()), "yellow_azure_bluet");
                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_AZURE_BLUET.asItem()), "light_blue_azure_bluet");
                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_AZURE_BLUET.asItem()), "pink_azure_bluet");
                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_AZURE_BLUET.asItem()), "black_azure_bluet");
                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_AZURE_BLUET.asItem()), "cyan_azure_bluet");

                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_DANDELION.asItem()), "magenta_dandelion");
                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_DANDELION.asItem()), "blue_dandelion");
                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_DANDELION.asItem()), "white_dandelion");
                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_DANDELION.asItem()), "orange_dandelion");
                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_DANDELION.asItem()), "red_dandelion");
                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(Blocks.DANDELION.asItem()), "yellow_dandelion");
                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_DANDELION.asItem()), "light_blue_dandelion");
                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_DANDELION.asItem()), "pink_dandelion");
                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_DANDELION.asItem()), "black_dandelion");
                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_DANDELION.asItem()), "cyan_dandelion");

                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_ORCHID.asItem()), "magenta_orchid");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_ORCHID.asItem()), "blue_orchid");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_ORCHID.asItem()), "white_orchid");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_ORCHID.asItem()), "orange_orchid");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_ORCHID.asItem()), "red_orchid");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_ORCHID.asItem()), "yellow_orchid");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(Blocks.BLUE_ORCHID.asItem()), "light_blue_orchid");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_ORCHID.asItem()), "pink_orchid");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_ORCHID.asItem()), "black_orchid");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_ORCHID.asItem()), "cyan_orchid");

                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_LILY.asItem()), "magenta_lily");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_LILY.asItem()), "blue_lily");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(Blocks.LILY_OF_THE_VALLEY.asItem()), "white_lily");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_LILY.asItem()), "orange_lily");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_LILY.asItem()), "red_lily");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_LILY.asItem()), "yellow_lily");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_LILY.asItem()), "light_blue_lily");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_LILY.asItem()), "pink_lily");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_LILY.asItem()), "black_lily");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_LILY.asItem()), "cyan_lily");

                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_POPPY.asItem()), "magenta_poppy");
                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_POPPY.asItem()), "blue_poppy");
                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_POPPY.asItem()), "white_poppy");
                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_POPPY.asItem()), "orange_poppy");
                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(Blocks.POPPY.asItem()), "red_poppy");
                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_POPPY.asItem()), "yellow_poppy");
                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_POPPY.asItem()), "light_blue_poppy");
                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_POPPY.asItem()), "pink_poppy");
                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_POPPY.asItem()), "black_poppy");
                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_POPPY.asItem()), "cyan_poppy");

                offerBotanyRecipe(output, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_WITHER_ROSE.asItem()), "magenta_wither_rose");
                offerBotanyRecipe(output, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_WITHER_ROSE.asItem()), "blue_wither_rose");
                offerBotanyRecipe(output, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_WITHER_ROSE.asItem()), "white_wither_rose");
                offerBotanyRecipe(output, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_WITHER_ROSE.asItem()), "orange_wither_rose");
                offerBotanyRecipe(output, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_WITHER_ROSE.asItem()), "red_wither_rose");
                offerBotanyRecipe(output, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_WITHER_ROSE.asItem()), "yellow_wither_rose");
                offerBotanyRecipe(output, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_WITHER_ROSE.asItem()), "light_blue_wither_rose");
                offerBotanyRecipe(output, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_WITHER_ROSE.asItem()), "pink_wither_rose");
                offerBotanyRecipe(output, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(Blocks.WITHER_ROSE.asItem()), "black_wither_rose");
                offerBotanyRecipe(output, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.WITHER_ROSE_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_WITHER_ROSE.asItem()), "cyan_wither_rose");

                offerBotanyRecipe(output, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.OPEN_MAGENTA_EYEBLOSSOM.asItem()), "magenta_eyeblossom");
                offerBotanyRecipe(output, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.OPEN_BLUE_EYEBLOSSOM.asItem()), "blue_eyeblossom");
                offerBotanyRecipe(output, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.OPEN_WHITE_EYEBLOSSOM.asItem()), "white_eyeblossom");
                offerBotanyRecipe(output, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(Blocks.OPEN_EYEBLOSSOM.asItem()), "orange_eyeblossom");
                offerBotanyRecipe(output, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.OPEN_RED_EYEBLOSSOM.asItem()), "red_eyeblossom");
                offerBotanyRecipe(output, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.OPEN_YELLOW_EYEBLOSSOM.asItem()), "yellow_eyeblossom");
                offerBotanyRecipe(output, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.OPEN_LIGHT_BLUE_EYEBLOSSOM.asItem()), "light_blue_eyeblossom");
                offerBotanyRecipe(output, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.OPEN_PINK_EYEBLOSSOM.asItem()), "pink_eyeblossom");
                offerBotanyRecipe(output, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.OPEN_BLACK_EYEBLOSSOM.asItem()), "black_eyeblossom");
                offerBotanyRecipe(output, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.EYEBLOSSOM_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.OPEN_CYAN_EYEBLOSSOM.asItem()), "cyan_eyeblossom");

                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_LILAC.asItem()), "magenta_lilac");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_LILAC.asItem()), "blue_lilac");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_LILAC.asItem()), "white_lilac");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_LILAC.asItem()), "orange_lilac");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_LILAC.asItem()), "red_lilac");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_LILAC.asItem()), "yellow_lilac");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_LILAC.asItem()), "light_blue_lilac");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(Blocks.LILAC.asItem()), "pink_lilac");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_LILAC.asItem()), "black_lilac");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_LILAC.asItem()), "cyan_lilac");

                offerBotanyRecipe(output, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_PEONY.asItem()), "magenta_peony");
                offerBotanyRecipe(output, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_PEONY.asItem()), "blue_peony");
                offerBotanyRecipe(output, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_PEONY.asItem()), "white_peony");
                offerBotanyRecipe(output, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_PEONY.asItem()), "orange_peony");
                offerBotanyRecipe(output, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_PEONY.asItem()), "red_peony");
                offerBotanyRecipe(output, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_PEONY.asItem()), "yellow_peony");
                offerBotanyRecipe(output, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_PEONY.asItem()), "light_blue_peony");
                offerBotanyRecipe(output, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(Blocks.PEONY.asItem()), "pink_peony");
                offerBotanyRecipe(output, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_PEONY.asItem()), "black_peony");
                offerBotanyRecipe(output, FBItems.PEONY_POLLEN_VIAL, FBItems.PEONY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_PEONY.asItem()), "cyan_peony");

                offerBotanyRecipe(output, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_PITCHER_PLANT.asItem()), "magenta_pitcher_plant");
                offerBotanyRecipe(output, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_PITCHER_PLANT.asItem()), "blue_pitcher_plant");
                offerBotanyRecipe(output, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_PITCHER_PLANT.asItem()), "white_pitcher_plant");
                offerBotanyRecipe(output, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_PITCHER_PLANT.asItem()), "orange_pitcher_plant");
                offerBotanyRecipe(output, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_PITCHER_PLANT.asItem()), "red_pitcher_plant");
                offerBotanyRecipe(output, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_PITCHER_PLANT.asItem()), "yellow_pitcher_plant");
                offerBotanyRecipe(output, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_PITCHER_PLANT.asItem()), "light_blue_pitcher_plant");
                offerBotanyRecipe(output, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_PITCHER_PLANT.asItem()), "pink_pitcher_plant");
                offerBotanyRecipe(output, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_PITCHER_PLANT.asItem()), "black_pitcher_plant");
                offerBotanyRecipe(output, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.PITCHER_PLANT_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(Blocks.PITCHER_PLANT.asItem()), "cyan_pitcher_plant");

                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_ROSE_BUSH.asItem()), "magenta_rose_bush");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_ROSE_BUSH.asItem()), "blue_rose_bush");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_ROSE_BUSH.asItem()), "white_rose_bush");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_ROSE_BUSH.asItem()), "orange_rose_bush");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(Blocks.ROSE_BUSH.asItem()), "red_rose_bush");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_ROSE_BUSH.asItem()), "yellow_rose_bush");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_ROSE_BUSH.asItem()), "light_blue_rose_bush");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_ROSE_BUSH.asItem()), "pink_rose_bush");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_ROSE_BUSH.asItem()), "black_rose_bush");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_ROSE_BUSH.asItem()), "cyan_rose_bush");

                offerBotanyRecipe(output, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_SUNFLOWER.asItem()), "magenta_sunflower");
                offerBotanyRecipe(output, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_SUNFLOWER.asItem()), "blue_sunflower");
                offerBotanyRecipe(output, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_SUNFLOWER.asItem()), "white_sunflower");
                offerBotanyRecipe(output, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_SUNFLOWER.asItem()), "orange_sunflower");
                offerBotanyRecipe(output, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_SUNFLOWER.asItem()), "red_sunflower");
                offerBotanyRecipe(output, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(Blocks.SUNFLOWER.asItem()), "yellow_sunflower");
                offerBotanyRecipe(output, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_SUNFLOWER.asItem()), "light_blue_sunflower");
                offerBotanyRecipe(output, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_SUNFLOWER.asItem()), "pink_sunflower");
                offerBotanyRecipe(output, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_SUNFLOWER.asItem()), "black_sunflower");
                offerBotanyRecipe(output, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.SUNFLOWER_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_SUNFLOWER.asItem()), "cyan_sunflower");

                offerBotanyRecipe(output, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_PETALS.asItem()), "magenta_petals");
                offerBotanyRecipe(output, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_PETALS.asItem()), "blue_petals");
                offerBotanyRecipe(output, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_PETALS.asItem()), "white_petals");
                offerBotanyRecipe(output, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_PETALS.asItem()), "orange_petals");
                offerBotanyRecipe(output, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_PETALS.asItem()), "red_petals");
                offerBotanyRecipe(output, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_PETALS.asItem()), "yellow_petals");
                offerBotanyRecipe(output, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_PETALS.asItem()), "light_blue_petals");
                offerBotanyRecipe(output, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(Blocks.PINK_PETALS.asItem()), "pink_petals");
                offerBotanyRecipe(output, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_PETALS.asItem()), "black_petals");
                offerBotanyRecipe(output, FBItems.PETAL_POLLEN_VIAL, FBItems.PETAL_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_PETALS.asItem()), "cyan_petals");

                offerBotanyRecipe(output, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_WILDFLOWERS.asItem()), "magenta_wildflowers");
                offerBotanyRecipe(output, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_WILDFLOWERS.asItem()), "blue_wildflowers");
                offerBotanyRecipe(output, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_WILDFLOWERS.asItem()), "white_wildflowers");
                offerBotanyRecipe(output, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_WILDFLOWERS.asItem()), "orange_wildflowers");
                offerBotanyRecipe(output, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_WILDFLOWERS.asItem()), "red_wildflowers");
                offerBotanyRecipe(output, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(Blocks.WILDFLOWERS.asItem()), "yellow_wildflowers");
                offerBotanyRecipe(output, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_WILDFLOWERS.asItem()), "light_blue_wildflowers");
                offerBotanyRecipe(output, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_WILDFLOWERS.asItem()), "pink_wildflowers");
                offerBotanyRecipe(output, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_WILDFLOWERS.asItem()), "black_wildflowers");
                offerBotanyRecipe(output, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.WILDFLOWER_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_WILDFLOWERS.asItem()), "cyan_wildflowers");

                offerBotanyRecipe(output, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_CACTUS_FLOWER.asItem()), "magenta_cactus_flower");
                offerBotanyRecipe(output, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_CACTUS_FLOWER.asItem()), "blue_cactus_flower");
                offerBotanyRecipe(output, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_CACTUS_FLOWER.asItem()), "white_cactus_flower");
                offerBotanyRecipe(output, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_CACTUS_FLOWER.asItem()), "orange_cactus_flower");
                offerBotanyRecipe(output, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_CACTUS_FLOWER.asItem()), "red_cactus_flower");
                offerBotanyRecipe(output, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_CACTUS_FLOWER.asItem()), "yellow_cactus_flower");
                offerBotanyRecipe(output, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_CACTUS_FLOWER.asItem()), "light_blue_cactus_flower");
                offerBotanyRecipe(output, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(Blocks.CACTUS_FLOWER.asItem()), "pink_cactus_flower");
                offerBotanyRecipe(output, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_CACTUS_FLOWER.asItem()), "black_cactus_flower");
                offerBotanyRecipe(output, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CACTUS_FLOWER_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_CACTUS_FLOWER.asItem()), "cyan_cactus_flower");

                offerBotanyRecipe(output, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_SPORE_BLOSSOM.asItem()), "magenta_spore_blossom");
                offerBotanyRecipe(output, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_SPORE_BLOSSOM.asItem()), "blue_spore_blossom");
                offerBotanyRecipe(output, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_SPORE_BLOSSOM.asItem()), "white_spore_blossom");
                offerBotanyRecipe(output, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_SPORE_BLOSSOM.asItem()), "orange_spore_blossom");
                offerBotanyRecipe(output, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_SPORE_BLOSSOM.asItem()), "red_spore_blossom");
                offerBotanyRecipe(output, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_SPORE_BLOSSOM.asItem()), "yellow_spore_blossom");
                offerBotanyRecipe(output, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_SPORE_BLOSSOM.asItem()), "light_blue_spore_blossom");
                offerBotanyRecipe(output, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(Blocks.SPORE_BLOSSOM.asItem()), "pink_spore_blossom");
                offerBotanyRecipe(output, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_SPORE_BLOSSOM.asItem()), "black_spore_blossom");
                offerBotanyRecipe(output, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.SPORE_BLOSSOM_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_SPORE_BLOSSOM.asItem()), "cyan_spore_blossom");

                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_FLOWERING_AZALEA.asItem()), "magenta_flowering_azalea");
                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_FLOWERING_AZALEA.asItem()), "blue_flowering_azalea");
                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_FLOWERING_AZALEA.asItem()), "white_flowering_azalea");
                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_FLOWERING_AZALEA.asItem()), "orange_flowering_azalea");
                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_FLOWERING_AZALEA.asItem()), "red_flowering_azalea");
                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_FLOWERING_AZALEA.asItem()), "yellow_flowering_azalea");
                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_FLOWERING_AZALEA.asItem()), "light_blue_flowering_azalea");
                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(Blocks.FLOWERING_AZALEA.asItem()), "pink_flowering_azalea");
                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_FLOWERING_AZALEA.asItem()), "black_flowering_azalea");
                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_FLOWERING_AZALEA.asItem()), "cyan_flowering_azalea");

                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_FLOWERING_AZALEA_LEAVES.asItem()), "magenta_flowering_azalea_leaves");
                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_FLOWERING_AZALEA_LEAVES.asItem()), "blue_flowering_azalea_leaves");
                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_FLOWERING_AZALEA_LEAVES.asItem()), "white_flowering_azalea_leaves");
                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_FLOWERING_AZALEA_LEAVES.asItem()), "orange_flowering_azalea_leaves");
                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_FLOWERING_AZALEA_LEAVES.asItem()), "red_flowering_azalea_leaves");
                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_FLOWERING_AZALEA_LEAVES.asItem()), "yellow_flowering_azalea_leaves");
                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_FLOWERING_AZALEA_LEAVES.asItem()), "light_blue_flowering_azalea_leaves");
                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(Blocks.FLOWERING_AZALEA_LEAVES.asItem()), "pink_flowering_azalea_leaves");
                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_FLOWERING_AZALEA_LEAVES.asItem()), "black_flowering_azalea_leaves");
                offerBotanyRecipe(output, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_FLOWERING_AZALEA_LEAVES.asItem()), "cyan_flowering_azalea_leaves");

                offerBotanyRecipe(output, FBItems.SHRUB_POLLEN_VIAL, FBItems.SHRUB_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_SHRUB.asItem()), "magenta_shrub");
                offerBotanyRecipe(output, FBItems.SHRUB_POLLEN_VIAL, FBItems.SHRUB_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_SHRUB.asItem()), "blue_shrub");
                offerBotanyRecipe(output, FBItems.SHRUB_POLLEN_VIAL, FBItems.SHRUB_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_SHRUB.asItem()), "white_shrub");
                offerBotanyRecipe(output, FBItems.SHRUB_POLLEN_VIAL, FBItems.SHRUB_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_SHRUB.asItem()), "orange_shrub");
                offerBotanyRecipe(output, FBItems.SHRUB_POLLEN_VIAL, FBItems.SHRUB_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(Blocks.RED_SHRUB.asItem()), "red_shrub");
                offerBotanyRecipe(output, FBItems.SHRUB_POLLEN_VIAL, FBItems.SHRUB_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_SHRUB.asItem()), "yellow_shrub");
                offerBotanyRecipe(output, FBItems.SHRUB_POLLEN_VIAL, FBItems.SHRUB_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_SHRUB.asItem()), "light_blue_shrub");
                offerBotanyRecipe(output, FBItems.SHRUB_POLLEN_VIAL, FBItems.SHRUB_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_SHRUB.asItem()), "pink_shrub");
                offerBotanyRecipe(output, FBItems.SHRUB_POLLEN_VIAL, FBItems.SHRUB_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_SHRUB.asItem()), "black_shrub");
                offerBotanyRecipe(output, FBItems.SHRUB_POLLEN_VIAL, FBItems.SHRUB_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_SHRUB.asItem()), "cyan_shrub");

                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_DAFFODIL.asItem()), "magenta_daffodil_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_DAFFODIL.asItem()), "magenta_daffodil_2");
                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_DAFFODIL.asItem()), "blue_daffodil_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_DAFFODIL.asItem()), "blue_daffodil_2");
                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_DAFFODIL.asItem()), "white_daffodil_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_DAFFODIL.asItem()), "white_daffodil_2");
                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_DAFFODIL.asItem()), "orange_daffodil_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_DAFFODIL.asItem()), "orange_daffodil_2");
                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_DAFFODIL.asItem()), "red_daffodil_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_DAFFODIL.asItem()), "red_daffodil_2");
                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_DAFFODIL.asItem()), "yellow_daffodil_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_DAFFODIL.asItem()), "yellow_daffodil_2");
                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_DAFFODIL.asItem()), "light_blue_daffodil_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_DAFFODIL.asItem()), "light_blue_daffodil_2");
                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_DAFFODIL.asItem()), "pink_daffodil_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_DAFFODIL.asItem()), "pink_daffodil_2");
                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_DAFFODIL.asItem()), "black_daffodil_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_DAFFODIL.asItem()), "black_daffodil_2");
                offerBotanyRecipe(output, FBItems.DANDELION_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_DAFFODIL.asItem()), "cyan_daffodil_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.DANDELION_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_DAFFODIL.asItem()), "cyan_daffodil_2");

                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_FOXGLOVE.asItem()), "magenta_foxglove_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_FOXGLOVE.asItem()), "magenta_foxglove_2");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_FOXGLOVE.asItem()), "blue_foxglove_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_FOXGLOVE.asItem()), "blue_foxglove_2");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_FOXGLOVE.asItem()), "white_foxglove_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_FOXGLOVE.asItem()), "white_foxglove_2");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_FOXGLOVE.asItem()), "orange_foxglove_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_FOXGLOVE.asItem()), "orange_foxglove_2");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_FOXGLOVE.asItem()), "red_foxglove_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_FOXGLOVE.asItem()), "red_foxglove_2");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_FOXGLOVE.asItem()), "yellow_foxglove_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_FOXGLOVE.asItem()), "yellow_foxglove_2");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_FOXGLOVE.asItem()), "light_blue_foxglove_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_FOXGLOVE.asItem()), "light_blue_foxglove_2");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_FOXGLOVE.asItem()), "pink_foxglove_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_FOXGLOVE.asItem()), "pink_foxglove_2");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_FOXGLOVE.asItem()), "black_foxglove_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_FOXGLOVE.asItem()), "black_foxglove_2");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_FOXGLOVE.asItem()), "cyan_foxglove_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_FOXGLOVE.asItem()), "cyan_foxglove_2");

                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_HYACINTH.asItem()), "magenta_hyacinth_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_HYACINTH.asItem()), "magenta_hyacinth_2");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_HYACINTH.asItem()), "blue_hyacinth_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_HYACINTH.asItem()), "blue_hyacinth_2");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_HYACINTH.asItem()), "white_hyacinth_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_HYACINTH.asItem()), "white_hyacinth_2");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_HYACINTH.asItem()), "orange_hyacinth_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_HYACINTH.asItem()), "orange_hyacinth_2");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_HYACINTH.asItem()), "red_hyacinth_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_HYACINTH.asItem()), "red_hyacinth_2");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_HYACINTH.asItem()), "yellow_hyacinth_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_HYACINTH.asItem()), "yellow_hyacinth_2");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_HYACINTH.asItem()), "light_blue_hyacinth_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_HYACINTH.asItem()), "light_blue_hyacinth_2");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_HYACINTH.asItem()), "pink_hyacinth_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_HYACINTH.asItem()), "pink_hyacinth_2");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_HYACINTH.asItem()), "black_hyacinth_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_HYACINTH.asItem()), "black_hyacinth_2");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_HYACINTH.asItem()), "cyan_hyacinth_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_HYACINTH.asItem()), "cyan_hyacinth_2");

                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_PHLOX.asItem()), "magenta_phlox_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_PHLOX.asItem()), "magenta_phlox_2");
                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_PHLOX.asItem()), "blue_phlox_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_PHLOX.asItem()), "blue_phlox_2");
                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_PHLOX.asItem()), "white_phlox_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_PHLOX.asItem()), "white_phlox_2");
                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_PHLOX.asItem()), "orange_phlox_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_PHLOX.asItem()), "orange_phlox_2");
                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_PHLOX.asItem()), "red_phlox_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_PHLOX.asItem()), "red_phlox_2");
                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_PHLOX.asItem()), "yellow_phlox_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_PHLOX.asItem()), "yellow_phlox_2");
                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_PHLOX.asItem()), "light_blue_phlox_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_PHLOX.asItem()), "light_blue_phlox_2");
                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_PHLOX.asItem()), "pink_phlox_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_PHLOX.asItem()), "pink_phlox_2");
                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_PHLOX.asItem()), "black_phlox_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_PHLOX.asItem()), "black_phlox_2");
                offerBotanyRecipe(output, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_PHLOX.asItem()), "cyan_phlox_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.AZURE_BLUET_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_PHLOX.asItem()), "cyan_phlox_2");

                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_LUPIN.asItem()), "magenta_lupin_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_LUPIN.asItem()), "magenta_lupin_2");
                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_LUPIN.asItem()), "blue_lupin_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_LUPIN.asItem()), "blue_lupin_2");
                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_LUPIN.asItem()), "white_lupin_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_LUPIN.asItem()), "white_lupin_2");
                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_LUPIN.asItem()), "orange_lupin_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_LUPIN.asItem()), "orange_lupin_2");
                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_LUPIN.asItem()), "red_lupin_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_LUPIN.asItem()), "red_lupin_2");
                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_LUPIN.asItem()), "yellow_lupin_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_LUPIN.asItem()), "yellow_lupin_2");
                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_LUPIN.asItem()), "light_blue_lupin_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_LUPIN.asItem()), "light_blue_lupin_2");
                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_LUPIN.asItem()), "pink_lupin_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_LUPIN.asItem()), "pink_lupin_2");
                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_LUPIN.asItem()), "black_lupin_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_LUPIN.asItem()), "black_lupin_2");
                offerBotanyRecipe(output, FBItems.POPPY_POLLEN_VIAL, FBItems.ORCHID_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_LUPIN.asItem()), "cyan_lupin_1");
                offerBotanyRecipe(output, FBItems.ORCHID_POLLEN_VIAL, FBItems.POPPY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_LUPIN.asItem()), "cyan_lupin_2");

                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_SMALL_ROSE.asItem()), "magenta_small_rose_1");
                offerBotanyRecipe(output, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_SMALL_ROSE.asItem()), "magenta_small_rose_2");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_SMALL_ROSE.asItem()), "blue_small_rose_1");
                offerBotanyRecipe(output, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_SMALL_ROSE.asItem()), "blue_small_rose_2");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_SMALL_ROSE.asItem()), "white_small_rose_1");
                offerBotanyRecipe(output, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_SMALL_ROSE.asItem()), "white_small_rose_2");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_SMALL_ROSE.asItem()), "orange_small_rose_1");
                offerBotanyRecipe(output, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_SMALL_ROSE.asItem()), "orange_small_rose_2");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_SMALL_ROSE.asItem()), "red_small_rose_1");
                offerBotanyRecipe(output, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_SMALL_ROSE.asItem()), "red_small_rose_2");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_SMALL_ROSE.asItem()), "yellow_small_rose_1");
                offerBotanyRecipe(output, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_SMALL_ROSE.asItem()), "yellow_small_rose_2");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_SMALL_ROSE.asItem()), "light_blue_small_rose_1");
                offerBotanyRecipe(output, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_SMALL_ROSE.asItem()), "light_blue_small_rose_2");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_SMALL_ROSE.asItem()), "pink_small_rose_1");
                offerBotanyRecipe(output, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_SMALL_ROSE.asItem()), "pink_small_rose_2");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_SMALL_ROSE.asItem()), "black_small_rose_1");
                offerBotanyRecipe(output, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_SMALL_ROSE.asItem()), "black_small_rose_2");
                offerBotanyRecipe(output, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_SMALL_ROSE.asItem()), "cyan_small_rose_1");
                offerBotanyRecipe(output, FBItems.SWEET_BERRY_POLLEN_VIAL, FBItems.ROSE_BUSH_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_SMALL_ROSE.asItem()), "cyan_small_rose_2");

                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_LAVENDER.asItem()), "magenta_lavender_1");
                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_LAVENDER.asItem()), "magenta_lavender_2");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_LAVENDER.asItem()), "blue_lavender_1");
                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_LAVENDER.asItem()), "blue_lavender_2");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_LAVENDER.asItem()), "white_lavender_1");
                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_LAVENDER.asItem()), "white_lavender_2");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_LAVENDER.asItem()), "orange_lavender_1");
                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_LAVENDER.asItem()), "orange_lavender_2");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_LAVENDER.asItem()), "red_lavender_1");
                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_LAVENDER.asItem()), "red_lavender_2");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_LAVENDER.asItem()), "yellow_lavender_1");
                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_LAVENDER.asItem()), "yellow_lavender_2");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_LAVENDER.asItem()), "light_blue_lavender_1");
                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_LAVENDER.asItem()), "light_blue_lavender_2");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_LAVENDER.asItem()), "pink_lavender_1");
                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_LAVENDER.asItem()), "pink_lavender_2");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_LAVENDER.asItem()), "black_lavender_1");
                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_LAVENDER.asItem()), "black_lavender_2");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_LAVENDER.asItem()), "cyan_lavender_1");
                offerBotanyRecipe(output, FBItems.CORNFLOWER_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_LAVENDER.asItem()), "cyan_lavender_2");

                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_HYDRANGEA.asItem()), "magenta_hydrangea_1");
                offerBotanyRecipe(output, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_HYDRANGEA.asItem()), "magenta_hydrangea_2");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_HYDRANGEA.asItem()), "blue_hydrangea_1");
                offerBotanyRecipe(output, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_HYDRANGEA.asItem()), "blue_hydrangea_2");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_HYDRANGEA.asItem()), "white_hydrangea_1");
                offerBotanyRecipe(output, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_HYDRANGEA.asItem()), "white_hydrangea_2");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_HYDRANGEA.asItem()), "orange_hydrangea_1");
                offerBotanyRecipe(output, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_HYDRANGEA.asItem()), "orange_hydrangea_2");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_HYDRANGEA.asItem()), "red_hydrangea_1");
                offerBotanyRecipe(output, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_HYDRANGEA.asItem()), "red_hydrangea_2");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_HYDRANGEA.asItem()), "yellow_hydrangea_1");
                offerBotanyRecipe(output, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_HYDRANGEA.asItem()), "yellow_hydrangea_2");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_HYDRANGEA.asItem()), "light_blue_hydrangea_1");
                offerBotanyRecipe(output, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_HYDRANGEA.asItem()), "light_blue_hydrangea_2");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_HYDRANGEA.asItem()), "pink_hydrangea_1");
                offerBotanyRecipe(output, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_HYDRANGEA.asItem()), "pink_hydrangea_2");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_HYDRANGEA.asItem()), "black_hydrangea_1");
                offerBotanyRecipe(output, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_HYDRANGEA.asItem()), "black_hydrangea_2");
                offerBotanyRecipe(output, FBItems.LILAC_POLLEN_VIAL, FBItems.BUSH_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_HYDRANGEA.asItem()), "cyan_hydrangea_1");
                offerBotanyRecipe(output, FBItems.BUSH_POLLEN_VIAL, FBItems.LILAC_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_HYDRANGEA.asItem()), "cyan_hydrangea_2");

                offerBotanyRecipe(output, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBItems.MAGENTA_LOTUS_FLOWER.asItem()), "magenta_lotus_flower_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBItems.MAGENTA_LOTUS_FLOWER.asItem()), "magenta_lotus_flower_2");
                offerBotanyRecipe(output, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBItems.BLUE_LOTUS_FLOWER.asItem()), "blue_lotus_flower_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBItems.BLUE_LOTUS_FLOWER.asItem()), "blue_lotus_flower_2");
                offerBotanyRecipe(output, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBItems.WHITE_LOTUS_FLOWER.asItem()), "white_lotus_flower_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBItems.WHITE_LOTUS_FLOWER.asItem()), "white_lotus_flower_2");
                offerBotanyRecipe(output, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBItems.ORANGE_LOTUS_FLOWER.asItem()), "orange_lotus_flower_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBItems.ORANGE_LOTUS_FLOWER.asItem()), "orange_lotus_flower_2");
                offerBotanyRecipe(output, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBItems.RED_LOTUS_FLOWER.asItem()), "red_lotus_flower_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBItems.RED_LOTUS_FLOWER.asItem()), "red_lotus_flower_2");
                offerBotanyRecipe(output, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBItems.YELLOW_LOTUS_FLOWER.asItem()), "yellow_lotus_flower_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBItems.YELLOW_LOTUS_FLOWER.asItem()), "yellow_lotus_flower_2");
                offerBotanyRecipe(output, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBItems.LIGHT_BLUE_LOTUS_FLOWER.asItem()), "light_blue_lotus_flower_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBItems.LIGHT_BLUE_LOTUS_FLOWER.asItem()), "light_blue_lotus_flower_2");
                offerBotanyRecipe(output, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBItems.PINK_LOTUS_FLOWER.asItem()), "pink_lotus_flower_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBItems.PINK_LOTUS_FLOWER.asItem()), "pink_lotus_flower_2");
                offerBotanyRecipe(output, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBItems.BLACK_LOTUS_FLOWER.asItem()), "black_lotus_flower_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBItems.BLACK_LOTUS_FLOWER.asItem()), "black_lotus_flower_2");
                offerBotanyRecipe(output, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.TULIP_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBItems.CYAN_LOTUS_FLOWER.asItem()), "cyan_lotus_flower_1");
                offerBotanyRecipe(output, FBItems.TULIP_POLLEN_VIAL, FBItems.LILY_PAD_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBItems.CYAN_LOTUS_FLOWER.asItem()), "cyan_lotus_flower_2");

                offerBotanyRecipe(output, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_JASMINE.asItem()), "magenta_jasmine_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_JASMINE.asItem()), "magenta_jasmine_2");
                offerBotanyRecipe(output, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_JASMINE.asItem()), "blue_jasmine_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_JASMINE.asItem()), "blue_jasmine_2");
                offerBotanyRecipe(output, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_JASMINE.asItem()), "white_jasmine_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_JASMINE.asItem()), "white_jasmine_2");
                offerBotanyRecipe(output, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_JASMINE.asItem()), "orange_jasmine_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_JASMINE.asItem()), "orange_jasmine_2");
                offerBotanyRecipe(output, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_JASMINE.asItem()), "red_jasmine_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_JASMINE.asItem()), "red_jasmine_2");
                offerBotanyRecipe(output, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_JASMINE.asItem()), "yellow_jasmine_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_JASMINE.asItem()), "yellow_jasmine_2");
                offerBotanyRecipe(output, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_JASMINE.asItem()), "light_blue_jasmine_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_JASMINE.asItem()), "light_blue_jasmine_2");
                offerBotanyRecipe(output, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_JASMINE.asItem()), "pink_jasmine_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_JASMINE.asItem()), "pink_jasmine_2");
                offerBotanyRecipe(output, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_JASMINE.asItem()), "black_jasmine_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_JASMINE.asItem()), "black_jasmine_2");
                offerBotanyRecipe(output, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.LILY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_JASMINE.asItem()), "cyan_jasmine_1");
                offerBotanyRecipe(output, FBItems.LILY_POLLEN_VIAL, FBItems.GLOW_VINE_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_JASMINE.asItem()), "cyan_jasmine_2");

                offerBotanyRecipe(output, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_CYPRESS_VINE.asItem()), "magenta_cypress_vine_1");
                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_CYPRESS_VINE.asItem()), "magenta_cypress_vine_2");
                offerBotanyRecipe(output, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_CYPRESS_VINE.asItem()), "blue_cypress_vine_1");
                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_CYPRESS_VINE.asItem()), "blue_cypress_vine_2");
                offerBotanyRecipe(output, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_CYPRESS_VINE.asItem()), "white_cypress_vine_1");
                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_CYPRESS_VINE.asItem()), "white_cypress_vine_2");
                offerBotanyRecipe(output, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_CYPRESS_VINE.asItem()), "orange_cypress_vine_1");
                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_CYPRESS_VINE.asItem()), "orange_cypress_vine_2");
                offerBotanyRecipe(output, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_CYPRESS_VINE.asItem()), "red_cypress_vine_1");
                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_CYPRESS_VINE.asItem()), "red_cypress_vine_2");
                offerBotanyRecipe(output, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_CYPRESS_VINE.asItem()), "yellow_cypress_vine_1");
                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_CYPRESS_VINE.asItem()), "yellow_cypress_vine_2");
                offerBotanyRecipe(output, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_CYPRESS_VINE.asItem()), "light_blue_cypress_vine_1");
                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_CYPRESS_VINE.asItem()), "light_blue_cypress_vine_2");
                offerBotanyRecipe(output, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_CYPRESS_VINE.asItem()), "pink_cypress_vine_1");
                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_CYPRESS_VINE.asItem()), "pink_cypress_vine_2");
                offerBotanyRecipe(output, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_CYPRESS_VINE.asItem()), "black_cypress_vine_1");
                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_CYPRESS_VINE.asItem()), "black_cypress_vine_2");
                offerBotanyRecipe(output, FBItems.VINE_POLLEN_VIAL, FBItems.DAISY_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_CYPRESS_VINE.asItem()), "cyan_cypress_vine_1");
                offerBotanyRecipe(output, FBItems.DAISY_POLLEN_VIAL, FBItems.VINE_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_CYPRESS_VINE.asItem()), "cyan_cypress_vine_2");

                offerBotanyRecipe(output, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_GLOWSHROOM.asItem()), "magenta_glowshroom_1");
                offerBotanyRecipe(output, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.MAGENTA_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.MAGENTA_GLOWSHROOM.asItem()), "magenta_glowshroom_2");
                offerBotanyRecipe(output, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_GLOWSHROOM.asItem()), "blue_glowshroom_1");
                offerBotanyRecipe(output, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLUE_GLOWSHROOM.asItem()), "blue_glowshroom_2");
                offerBotanyRecipe(output, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_GLOWSHROOM.asItem()), "white_glowshroom_1");
                offerBotanyRecipe(output, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.WHITE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.WHITE_GLOWSHROOM.asItem()), "white_glowshroom_2");
                offerBotanyRecipe(output, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_GLOWSHROOM.asItem()), "orange_glowshroom_1");
                offerBotanyRecipe(output, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.ORANGE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.ORANGE_GLOWSHROOM.asItem()), "orange_glowshroom_2");
                offerBotanyRecipe(output, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_GLOWSHROOM.asItem()), "red_glowshroom_1");
                offerBotanyRecipe(output, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.RED_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.RED_GLOWSHROOM.asItem()), "red_glowshroom_2");
                offerBotanyRecipe(output, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_GLOWSHROOM.asItem()), "yellow_glowshroom_1");
                offerBotanyRecipe(output, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.YELLOW_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.YELLOW_GLOWSHROOM.asItem()), "yellow_glowshroom_2");
                offerBotanyRecipe(output, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_GLOWSHROOM.asItem()), "light_blue_glowshroom_1");
                offerBotanyRecipe(output, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.LIGHT_BLUE_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.LIGHT_BLUE_GLOWSHROOM.asItem()), "light_blue_glowshroom_2");
                offerBotanyRecipe(output, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_GLOWSHROOM.asItem()), "pink_glowshroom_1");
                offerBotanyRecipe(output, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.PINK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.PINK_GLOWSHROOM.asItem()), "pink_glowshroom_2");
                offerBotanyRecipe(output, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_GLOWSHROOM.asItem()), "black_glowshroom_1");
                offerBotanyRecipe(output, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.BLACK_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.BLACK_GLOWSHROOM.asItem()), "black_glowshroom_2");
                offerBotanyRecipe(output, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_GLOWSHROOM.asItem()), "cyan_glowshroom_1");
                offerBotanyRecipe(output, FBItems.FROGLIGHT_POLLEN_VIAL, FBItems.MUSHROOM_POLLEN_VIAL, FBItems.CYAN_PIGMENT_JAR, new ItemStackTemplate(FBBlocks.CYAN_GLOWSHROOM.asItem()), "cyan_glowshroom_2");

                shaped(RecipeCategory.MISC, FBBlocks.PLANTER)
                        .define('#', Items.BRICK)
                        .define('X', Items.DIRT)
                        .pattern("# #")
                        .pattern("#X#")
                        .pattern("###")
                        .unlockedBy(getHasName(Items.BRICK), has(Items.BRICK))
                        .save(output);

                offerVaseRecipe(FBBlocks.WHITE_VASE, Items.DYED_TERRACOTTA.white());
                offerVaseRecipe(FBBlocks.LIGHT_GRAY_VASE, Items.DYED_TERRACOTTA.lightGray());
                offerVaseRecipe(FBBlocks.GRAY_VASE, Items.DYED_TERRACOTTA.gray());
                offerVaseRecipe(FBBlocks.BLACK_VASE, Items.DYED_TERRACOTTA.black());
                offerVaseRecipe(FBBlocks.BROWN_VASE, Items.DYED_TERRACOTTA.brown());
                offerVaseRecipe(FBBlocks.RED_VASE, Items.DYED_TERRACOTTA.red());
                offerVaseRecipe(FBBlocks.ORANGE_VASE, Items.DYED_TERRACOTTA.orange());
                offerVaseRecipe(FBBlocks.YELLOW_VASE, Items.DYED_TERRACOTTA.yellow());
                offerVaseRecipe(FBBlocks.LIME_VASE, Items.DYED_TERRACOTTA.lime());
                offerVaseRecipe(FBBlocks.GREEN_VASE, Items.DYED_TERRACOTTA.green());
                offerVaseRecipe(FBBlocks.CYAN_VASE, Items.DYED_TERRACOTTA.cyan());
                offerVaseRecipe(FBBlocks.LIGHT_BLUE_VASE, Items.DYED_TERRACOTTA.lightBlue());
                offerVaseRecipe(FBBlocks.BLUE_VASE, Items.DYED_TERRACOTTA.blue());
                offerVaseRecipe(FBBlocks.PURPLE_VASE, Items.DYED_TERRACOTTA.purple());
                offerVaseRecipe(FBBlocks.MAGENTA_VASE, Items.DYED_TERRACOTTA.magenta());
                offerVaseRecipe(FBBlocks.PINK_VASE, Items.DYED_TERRACOTTA.pink());

                trimSmithing(FBItems.FLORAL_SMITHING_TEMPLATE, FBArmourTrims.FLORAL, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, "floral_smithing_trim")));

                copySmithingTemplate(FBItems.FLORAL_SMITHING_TEMPLATE, Blocks.MOSS_BLOCK);

                ItemStackTemplate stew = new ItemStackTemplate(
                        Items.SUSPICIOUS_STEW, DataComponentPatch.builder().set(DataComponents.SUSPICIOUS_STEW_EFFECTS, new SuspiciousStewEffects(List.of(new SuspiciousStewEffects.Entry(MobEffects.SATURATION, Mth.floor(0.35f * 20.0F))))).build()
                );
                this.shapeless(RecipeCategory.FOOD, stew)
                        .requires(Items.BOWL)
                        .requires(ItemTags.MUSHROOMS)
                        .requires(ItemTags.MUSHROOMS)
                        .requires(FBBlocks.BLUE_ORCHID.asItem())
                        .group("suspicious_stew")
                        .unlockedBy(getHasName(FBBlocks.BLUE_ORCHID.asItem()), this.has(FBBlocks.BLUE_ORCHID.asItem()))
                        .save(this.output, getItemName(stew.item().value()) + "_from_" + getItemName(FBBlocks.BLUE_ORCHID.asItem()) + "_flowerbreeding");
            }

            public void offerBotanyRecipe(RecipeOutput exporter, Item vial1, Item vial2, Item jar, ItemStackTemplate result, String recipeId) {
                BotanyTableRecipeJsonBuilder.create(Ingredient.of(vial1), Ingredient.of(vial2), Ingredient.of(jar), result, MISC)
                        .unlockedBy("has_vial1", has(vial1))
                        .unlockedBy("has_vial2", has(vial2))
                        .save(exporter, String.valueOf(Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, recipeId + "_botany")));
            }

            private void offerVaseRecipe(ItemLike itemLike, ItemLike input) {
                shaped(RecipeCategory.DECORATIONS, itemLike, 1)
                        .group("vase")
                        .define('#', input)
                        .pattern("# #")
                        .pattern(" # ")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }
        };
    }
    @Override
    public String getName() {
        return "Flower Breeding Recipes";
    }
}
