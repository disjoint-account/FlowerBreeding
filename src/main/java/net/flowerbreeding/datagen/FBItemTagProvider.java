package net.flowerbreeding.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.util.FBTags;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class FBItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public FBItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(FBTags.Items.MAGENTA_FLOWERS)
                .addOptionalTag(FBTags.Items.SMALL_MAGENTA_FLOWERS)
                .addOptionalTag(FBTags.Items.TALL_MAGENTA_FLOWERS);

        getOrCreateTagBuilder(FBTags.Items.SMALL_MAGENTA_FLOWERS)
                .add(Items.ALLIUM)
                .add(FBBlocks.MAGENTA_CORNFLOWER.asItem())
                .add(FBBlocks.MAGENTA_DAISY.asItem())
                .add(FBBlocks.MAGENTA_TORCHFLOWER.asItem())
                .add(FBBlocks.MAGENTA_TULIP.asItem())
                .add(FBBlocks.MAGENTA_AZURE_BLUET.asItem())
                .add(FBBlocks.MAGENTA_DANDELION.asItem())
                .add(FBBlocks.MAGENTA_ORCHID.asItem())
                .add(FBBlocks.MAGENTA_LILY.asItem())
                .add(FBBlocks.MAGENTA_POPPY.asItem())
                .add(FBBlocks.MAGENTA_WITHER_ROSE.asItem());

        getOrCreateTagBuilder(FBTags.Items.TALL_MAGENTA_FLOWERS)
                .add(FBBlocks.MAGENTA_LILAC.asItem())
                .add(FBBlocks.MAGENTA_PEONY.asItem())
                .add(FBBlocks.MAGENTA_PITCHER_PLANT.asItem())
                .add(FBBlocks.MAGENTA_ROSE_BUSH.asItem())
                .add(FBBlocks.MAGENTA_SUNFLOWER.asItem());

        getOrCreateTagBuilder(FBTags.Items.BLUE_FLOWERS)
                .addOptionalTag(FBTags.Items.SMALL_BLUE_FLOWERS)
                .addOptionalTag(FBTags.Items.TALL_BLUE_FLOWERS);

        getOrCreateTagBuilder(FBTags.Items.SMALL_BLUE_FLOWERS)
                .add(FBBlocks.BLUE_ALLIUM.asItem())
                .add(Items.CORNFLOWER)
                .add(FBBlocks.BLUE_DAISY.asItem())
                .add(FBBlocks.BLUE_TORCHFLOWER.asItem())
                .add(FBBlocks.BLUE_TULIP.asItem())
                .add(FBBlocks.BLUE_AZURE_BLUET.asItem())
                .add(FBBlocks.BLUE_DANDELION.asItem())
                .add(FBBlocks.BLUE_ORCHID.asItem())
                .add(FBBlocks.BLUE_LILY.asItem())
                .add(FBBlocks.BLUE_POPPY.asItem())
                .add(FBBlocks.BLUE_WITHER_ROSE.asItem());

        getOrCreateTagBuilder(FBTags.Items.TALL_BLUE_FLOWERS)
                .add(FBBlocks.BLUE_LILAC.asItem())
                .add(FBBlocks.BLUE_PEONY.asItem())
                .add(FBBlocks.BLUE_PITCHER_PLANT.asItem())
                .add(FBBlocks.BLUE_ROSE_BUSH.asItem())
                .add(FBBlocks.BLUE_SUNFLOWER.asItem());

        getOrCreateTagBuilder(FBTags.Items.WHITE_FLOWERS)
                .addOptionalTag(FBTags.Items.SMALL_WHITE_FLOWERS)
                .addOptionalTag(FBTags.Items.TALL_WHITE_FLOWERS);

        getOrCreateTagBuilder(FBTags.Items.SMALL_WHITE_FLOWERS)
                .add(FBBlocks.WHITE_ALLIUM.asItem())
                .add(FBBlocks.WHITE_CORNFLOWER.asItem())
                .add(Items.LILY_OF_THE_VALLEY)
                .add(FBBlocks.WHITE_TORCHFLOWER.asItem())
                .add(Items.WHITE_TULIP)
                .add(Items.AZURE_BLUET)
                .add(FBBlocks.WHITE_DANDELION.asItem())
                .add(FBBlocks.WHITE_ORCHID.asItem())
                .add(Items.LILY_OF_THE_VALLEY)
                .add(FBBlocks.WHITE_POPPY.asItem())
                .add(FBBlocks.WHITE_WITHER_ROSE.asItem());

        getOrCreateTagBuilder(FBTags.Items.TALL_WHITE_FLOWERS)
                .add(FBBlocks.WHITE_LILAC.asItem())
                .add(FBBlocks.WHITE_PEONY.asItem())
                .add(FBBlocks.WHITE_PITCHER_PLANT.asItem())
                .add(FBBlocks.WHITE_ROSE_BUSH.asItem())
                .add(FBBlocks.WHITE_SUNFLOWER.asItem());

        getOrCreateTagBuilder(FBTags.Items.ORANGE_FLOWERS)
                .addOptionalTag(FBTags.Items.SMALL_ORANGE_FLOWERS)
                .addOptionalTag(FBTags.Items.TALL_ORANGE_FLOWERS);

        getOrCreateTagBuilder(FBTags.Items.SMALL_ORANGE_FLOWERS)
                .add(FBBlocks.ORANGE_ALLIUM.asItem())
                .add(FBBlocks.ORANGE_CORNFLOWER.asItem())
                .add(FBBlocks.ORANGE_DAISY.asItem())
                .add(Items.TORCHFLOWER)
                .add(Items.ORANGE_TULIP)
                .add(FBBlocks.ORANGE_AZURE_BLUET.asItem())
                .add(FBBlocks.ORANGE_DANDELION.asItem())
                .add(FBBlocks.ORANGE_ORCHID.asItem())
                .add(FBBlocks.ORANGE_LILY.asItem())
                .add(FBBlocks.ORANGE_POPPY.asItem())
                .add(FBBlocks.ORANGE_WITHER_ROSE.asItem());

        getOrCreateTagBuilder(FBTags.Items.TALL_ORANGE_FLOWERS)
                .add(FBBlocks.ORANGE_LILAC.asItem())
                .add(FBBlocks.ORANGE_PEONY.asItem())
                .add(FBBlocks.ORANGE_PITCHER_PLANT.asItem())
                .add(FBBlocks.ORANGE_ROSE_BUSH.asItem())
                .add(FBBlocks.ORANGE_SUNFLOWER.asItem());

        getOrCreateTagBuilder(FBTags.Items.RED_FLOWERS)
                .addOptionalTag(FBTags.Items.SMALL_RED_FLOWERS)
                .addOptionalTag(FBTags.Items.TALL_RED_FLOWERS);

        getOrCreateTagBuilder(FBTags.Items.SMALL_RED_FLOWERS)
                .add(FBBlocks.RED_ALLIUM.asItem())
                .add(FBBlocks.RED_CORNFLOWER.asItem())
                .add(FBBlocks.RED_DAISY.asItem())
                .add(FBBlocks.RED_TORCHFLOWER.asItem())
                .add(Items.RED_TULIP)
                .add(FBBlocks.RED_AZURE_BLUET.asItem())
                .add(FBBlocks.RED_DANDELION.asItem())
                .add(FBBlocks.RED_ORCHID.asItem())
                .add(FBBlocks.RED_LILY.asItem())
                .add(Items.POPPY)
                .add(FBBlocks.RED_WITHER_ROSE.asItem());

        getOrCreateTagBuilder(FBTags.Items.TALL_RED_FLOWERS)
                .add(FBBlocks.RED_LILAC.asItem())
                .add(FBBlocks.RED_PEONY.asItem())
                .add(FBBlocks.RED_PITCHER_PLANT.asItem())
                .add(Items.ROSE_BUSH)
                .add(FBBlocks.RED_SUNFLOWER.asItem());

        getOrCreateTagBuilder(FBTags.Items.YELLOW_FLOWERS)
                .addOptionalTag(FBTags.Items.SMALL_YELLOW_FLOWERS)
                .addOptionalTag(FBTags.Items.TALL_YELLOW_FLOWERS);

        getOrCreateTagBuilder(FBTags.Items.SMALL_YELLOW_FLOWERS)
                .add(FBBlocks.YELLOW_ALLIUM.asItem())
                .add(FBBlocks.YELLOW_CORNFLOWER.asItem())
                .add(FBBlocks.YELLOW_DAISY.asItem())
                .add(FBBlocks.YELLOW_TORCHFLOWER.asItem())
                .add(FBBlocks.YELLOW_TULIP.asItem())
                .add(FBBlocks.YELLOW_AZURE_BLUET.asItem())
                .add(Items.DANDELION)
                .add(FBBlocks.YELLOW_ORCHID.asItem())
                .add(FBBlocks.YELLOW_LILY.asItem())
                .add(FBBlocks.YELLOW_POPPY.asItem())
                .add(FBBlocks.YELLOW_WITHER_ROSE.asItem());

        getOrCreateTagBuilder(FBTags.Items.TALL_YELLOW_FLOWERS)
                .add(FBBlocks.YELLOW_LILAC.asItem())
                .add(FBBlocks.YELLOW_PEONY.asItem())
                .add(FBBlocks.YELLOW_PITCHER_PLANT.asItem())
                .add(FBBlocks.YELLOW_ROSE_BUSH.asItem())
                .add(Items.SUNFLOWER);

        getOrCreateTagBuilder(FBTags.Items.LIGHT_BLUE_FLOWERS)
                .addOptionalTag(FBTags.Items.SMALL_LIGHT_BLUE_FLOWERS)
                .addOptionalTag(FBTags.Items.TALL_LIGHT_BLUE_FLOWERS);

        getOrCreateTagBuilder(FBTags.Items.SMALL_LIGHT_BLUE_FLOWERS)
                .add(FBBlocks.LIGHT_BLUE_ALLIUM.asItem())
                .add(FBBlocks.LIGHT_BLUE_CORNFLOWER.asItem())
                .add(FBBlocks.LIGHT_BLUE_DAISY.asItem())
                .add(FBBlocks.LIGHT_BLUE_TORCHFLOWER.asItem())
                .add(FBBlocks.LIGHT_BLUE_TULIP.asItem())
                .add(FBBlocks.LIGHT_BLUE_AZURE_BLUET.asItem())
                .add(FBBlocks.LIGHT_BLUE_DANDELION.asItem())
                .add(Items.BLUE_ORCHID)
                .add(FBBlocks.LIGHT_BLUE_LILY.asItem())
                .add(FBBlocks.LIGHT_BLUE_POPPY.asItem())
                .add(FBBlocks.LIGHT_BLUE_WITHER_ROSE.asItem());

        getOrCreateTagBuilder(FBTags.Items.TALL_LIGHT_BLUE_FLOWERS)
                .add(FBBlocks.LIGHT_BLUE_LILAC.asItem())
                .add(FBBlocks.LIGHT_BLUE_PEONY.asItem())
                .add(FBBlocks.LIGHT_BLUE_PITCHER_PLANT.asItem())
                .add(FBBlocks.LIGHT_BLUE_ROSE_BUSH.asItem())
                .add(FBBlocks.LIGHT_BLUE_SUNFLOWER.asItem());

        getOrCreateTagBuilder(FBTags.Items.PINK_FLOWERS)
                .addOptionalTag(FBTags.Items.SMALL_PINK_FLOWERS)
                .addOptionalTag(FBTags.Items.TALL_PINK_FLOWERS);

        getOrCreateTagBuilder(FBTags.Items.SMALL_PINK_FLOWERS)
                .add(FBBlocks.PINK_ALLIUM.asItem())
                .add(FBBlocks.PINK_CORNFLOWER.asItem())
                .add(FBBlocks.PINK_DAISY.asItem())
                .add(FBBlocks.PINK_TORCHFLOWER.asItem())
                .add(Items.PINK_TULIP)
                .add(FBBlocks.PINK_AZURE_BLUET.asItem())
                .add(FBBlocks.PINK_DANDELION.asItem())
                .add(FBBlocks.PINK_ORCHID.asItem())
                .add(FBBlocks.PINK_LILY.asItem())
                .add(FBBlocks.PINK_POPPY.asItem())
                .add(FBBlocks.PINK_WITHER_ROSE.asItem());

        getOrCreateTagBuilder(FBTags.Items.TALL_PINK_FLOWERS)
                .add(FBBlocks.PINK_LILAC.asItem())
                .add(Items.PEONY)
                .add(FBBlocks.PINK_PITCHER_PLANT.asItem())
                .add(FBBlocks.PINK_ROSE_BUSH.asItem())
                .add(FBBlocks.PINK_SUNFLOWER.asItem());

        getOrCreateTagBuilder(FBTags.Items.BLACK_FLOWERS)
                .addOptionalTag(FBTags.Items.SMALL_BLACK_FLOWERS)
                .addOptionalTag(FBTags.Items.TALL_BLACK_FLOWERS);

        getOrCreateTagBuilder(FBTags.Items.SMALL_BLACK_FLOWERS)
                .add(FBBlocks.BLACK_ALLIUM.asItem())
                .add(FBBlocks.BLACK_CORNFLOWER.asItem())
                .add(FBBlocks.BLACK_DAISY.asItem())
                .add(FBBlocks.BLACK_TORCHFLOWER.asItem())
                .add(FBBlocks.BLACK_TULIP.asItem())
                .add(FBBlocks.BLACK_AZURE_BLUET.asItem())
                .add(FBBlocks.BLACK_DANDELION.asItem())
                .add(FBBlocks.BLACK_ORCHID.asItem())
                .add(FBBlocks.BLACK_LILY.asItem())
                .add(FBBlocks.BLACK_POPPY.asItem())
                .add(Items.WITHER_ROSE);

        getOrCreateTagBuilder(FBTags.Items.TALL_BLACK_FLOWERS)
                .add(FBBlocks.BLACK_LILAC.asItem())
                .add(FBBlocks.BLACK_PEONY.asItem())
                .add(FBBlocks.BLACK_PITCHER_PLANT.asItem())
                .add(FBBlocks.BLACK_ROSE_BUSH.asItem())
                .add(FBBlocks.BLACK_SUNFLOWER.asItem());

        getOrCreateTagBuilder(FBTags.Items.LILAC_FLOWERS)
                .addOptionalTag(FBTags.Items.SMALL_LILAC_FLOWERS)
                .addOptionalTag(FBTags.Items.TALL_LILAC_FLOWERS);

        getOrCreateTagBuilder(FBTags.Items.SMALL_LILAC_FLOWERS)
                .add(FBBlocks.LILAC_ALLIUM.asItem())
                .add(FBBlocks.LILAC_CORNFLOWER.asItem())
                .add(FBBlocks.LILAC_DAISY.asItem())
                .add(FBBlocks.LILAC_TORCHFLOWER.asItem())
                .add(FBBlocks.LILAC_TULIP.asItem())
                .add(FBBlocks.LILAC_AZURE_BLUET.asItem())
                .add(FBBlocks.LILAC_DANDELION.asItem())
                .add(FBBlocks.LILAC_ORCHID.asItem())
                .add(FBBlocks.LILAC_LILY.asItem())
                .add(FBBlocks.LILAC_POPPY.asItem())
                .add(FBBlocks.LILAC_WITHER_ROSE.asItem());

        getOrCreateTagBuilder(FBTags.Items.TALL_LILAC_FLOWERS)
                .add(Items.LILAC)
                .add(FBBlocks.LILAC_PEONY.asItem())
                .add(FBBlocks.LILAC_PITCHER_PLANT.asItem())
                .add(FBBlocks.LILAC_ROSE_BUSH.asItem())
                .add(FBBlocks.LILAC_SUNFLOWER.asItem());

        getOrCreateTagBuilder(FBTags.Items.CYAN_FLOWERS)
                .addOptionalTag(FBTags.Items.SMALL_CYAN_FLOWERS)
                .addOptionalTag(FBTags.Items.TALL_CYAN_FLOWERS);

        getOrCreateTagBuilder(FBTags.Items.SMALL_CYAN_FLOWERS)
                .add(FBBlocks.CYAN_ALLIUM.asItem())
                .add(FBBlocks.CYAN_CORNFLOWER.asItem())
                .add(FBBlocks.CYAN_DAISY.asItem())
                .add(FBBlocks.CYAN_TORCHFLOWER.asItem())
                .add(FBBlocks.CYAN_TULIP.asItem())
                .add(FBBlocks.CYAN_AZURE_BLUET.asItem())
                .add(FBBlocks.CYAN_DANDELION.asItem())
                .add(FBBlocks.CYAN_ORCHID.asItem())
                .add(FBBlocks.CYAN_LILY.asItem())
                .add(FBBlocks.CYAN_POPPY.asItem())
                .add(FBBlocks.CYAN_WITHER_ROSE.asItem());

        getOrCreateTagBuilder(FBTags.Items.TALL_CYAN_FLOWERS)
                .add(FBBlocks.CYAN_LILAC.asItem())
                .add(FBBlocks.CYAN_PEONY.asItem())
                .add(Items.PITCHER_PLANT.asItem())
                .add(FBBlocks.CYAN_ROSE_BUSH.asItem())
                .add(FBBlocks.CYAN_SUNFLOWER.asItem());

        getOrCreateTagBuilder(FBTags.Items.SMALL_MAGENTA_DYE_FLOWERS)
                .addOptionalTag(FBTags.Items.SMALL_MAGENTA_FLOWERS)
                .addOptionalTag(FBTags.Items.SMALL_LILAC_FLOWERS);

        getOrCreateTagBuilder(FBTags.Items.TALL_MAGENTA_DYE_FLOWERS)
                .addOptionalTag(FBTags.Items.TALL_MAGENTA_FLOWERS)
                .addOptionalTag(FBTags.Items.TALL_LILAC_FLOWERS);
    }
}