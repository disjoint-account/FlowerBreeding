package net.flowerbreeding.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.util.FBTags;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class FBBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public FBBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(FBTags.Blocks.FBFLOWERS)
                .addOptionalTag(FBTags.Blocks.MAGENTA_FLOWERS)
                .addOptionalTag(FBTags.Blocks.BLUE_FLOWERS)
                .addOptionalTag(FBTags.Blocks.WHITE_FLOWERS)
                .addOptionalTag(FBTags.Blocks.ORANGE_FLOWERS)
                .addOptionalTag(FBTags.Blocks.RED_FLOWERS)
                .addOptionalTag(FBTags.Blocks.YELLOW_FLOWERS)
                .addOptionalTag(FBTags.Blocks.CYAN_FLOWERS)
                .addOptionalTag(FBTags.Blocks.PINK_FLOWERS)
                .addOptionalTag(FBTags.Blocks.BLACK_FLOWERS)
                .addOptionalTag(FBTags.Blocks.LILAC_FLOWERS);

        getOrCreateTagBuilder(FBTags.Blocks.MAGENTA_FLOWERS)
                .add(Blocks.ALLIUM,
                        FBBlocks.MAGENTA_CORNFLOWER,
                        FBBlocks.MAGENTA_DAISY,
                        FBBlocks.MAGENTA_TORCHFLOWER,
                        FBBlocks.MAGENTA_TULIP,
                        FBBlocks.MAGENTA_AZURE_BLUET,
                        FBBlocks.MAGENTA_DANDELION,
                        FBBlocks.MAGENTA_ORCHID,
                        FBBlocks.MAGENTA_LILY,
                        FBBlocks.MAGENTA_POPPY,
                        FBBlocks.MAGENTA_WITHER_ROSE,
                        FBBlocks.MAGENTA_LILAC,
                        FBBlocks.MAGENTA_PEONY,
                        FBBlocks.MAGENTA_PITCHER_PLANT,
                        FBBlocks.MAGENTA_ROSE_BUSH,
                        FBBlocks.MAGENTA_SUNFLOWER);

        getOrCreateTagBuilder(FBTags.Blocks.BLUE_FLOWERS)
                .add(FBBlocks.BLUE_ALLIUM,
                        Blocks.CORNFLOWER,
                        FBBlocks.BLUE_DAISY,
                        FBBlocks.BLUE_TORCHFLOWER,
                        FBBlocks.BLUE_TULIP,
                        FBBlocks.BLUE_AZURE_BLUET,
                        FBBlocks.BLUE_DANDELION,
                        FBBlocks.BLUE_ORCHID,
                        FBBlocks.BLUE_LILY,
                        FBBlocks.BLUE_POPPY,
                        FBBlocks.BLUE_WITHER_ROSE,
                        FBBlocks.BLUE_LILAC,
                        FBBlocks.BLUE_PEONY,
                        Blocks.PITCHER_PLANT,
                        FBBlocks.BLUE_ROSE_BUSH,
                        FBBlocks.BLUE_SUNFLOWER);

        getOrCreateTagBuilder(FBTags.Blocks.WHITE_FLOWERS)
                .add(FBBlocks.WHITE_ALLIUM,
                        FBBlocks.WHITE_CORNFLOWER,
                        Blocks.OXEYE_DAISY,
                        FBBlocks.WHITE_TORCHFLOWER,
                        Blocks.WHITE_TULIP,
                        Blocks.AZURE_BLUET,
                        FBBlocks.WHITE_DANDELION,
                        FBBlocks.WHITE_ORCHID,
                        Blocks.LILY_OF_THE_VALLEY,
                        FBBlocks.WHITE_POPPY,
                        FBBlocks.WHITE_WITHER_ROSE,
                        FBBlocks.WHITE_LILAC,
                        FBBlocks.WHITE_PEONY,
                        FBBlocks.WHITE_PITCHER_PLANT,
                        FBBlocks.WHITE_ROSE_BUSH,
                        FBBlocks.WHITE_SUNFLOWER);

        getOrCreateTagBuilder(FBTags.Blocks.ORANGE_FLOWERS)
                .add(FBBlocks.ORANGE_ALLIUM,
                        FBBlocks.ORANGE_CORNFLOWER,
                        FBBlocks.ORANGE_DAISY,
                        Blocks.TORCHFLOWER,
                        Blocks.ORANGE_TULIP,
                        FBBlocks.ORANGE_AZURE_BLUET,
                        FBBlocks.ORANGE_DANDELION,
                        FBBlocks.ORANGE_ORCHID,
                        FBBlocks.ORANGE_LILY,
                        FBBlocks.ORANGE_POPPY,
                        FBBlocks.ORANGE_WITHER_ROSE,
                        FBBlocks.ORANGE_LILAC,
                        FBBlocks.ORANGE_PEONY,
                        FBBlocks.ORANGE_PITCHER_PLANT,
                        FBBlocks.ORANGE_ROSE_BUSH,
                        FBBlocks.ORANGE_SUNFLOWER);

        getOrCreateTagBuilder(FBTags.Blocks.RED_FLOWERS)
                .add(FBBlocks.RED_ALLIUM,
                        FBBlocks.RED_CORNFLOWER,
                        FBBlocks.RED_DAISY,
                        FBBlocks.RED_TORCHFLOWER,
                        Blocks.RED_TULIP,
                        FBBlocks.RED_AZURE_BLUET,
                        FBBlocks.RED_DANDELION,
                        FBBlocks.RED_ORCHID,
                        FBBlocks.RED_LILY,
                        Blocks.POPPY,
                        FBBlocks.RED_WITHER_ROSE,
                        FBBlocks.RED_LILAC,
                        FBBlocks.RED_PEONY,
                        FBBlocks.RED_PITCHER_PLANT,
                        Blocks.ROSE_BUSH,
                        FBBlocks.RED_SUNFLOWER);

        getOrCreateTagBuilder(FBTags.Blocks.YELLOW_FLOWERS)
                .add(FBBlocks.YELLOW_ALLIUM,
                        FBBlocks.YELLOW_CORNFLOWER,
                        FBBlocks.YELLOW_DAISY,
                        FBBlocks.YELLOW_TORCHFLOWER,
                        FBBlocks.YELLOW_TULIP,
                        FBBlocks.YELLOW_AZURE_BLUET,
                        Blocks.DANDELION,
                        FBBlocks.YELLOW_ORCHID,
                        FBBlocks.YELLOW_LILY,
                        FBBlocks.YELLOW_POPPY,
                        FBBlocks.YELLOW_WITHER_ROSE,
                        FBBlocks.YELLOW_LILAC,
                        FBBlocks.YELLOW_PEONY,
                        FBBlocks.YELLOW_PITCHER_PLANT,
                        FBBlocks.YELLOW_ROSE_BUSH,
                        Blocks.SUNFLOWER);

        getOrCreateTagBuilder(FBTags.Blocks.CYAN_FLOWERS)
                .add(FBBlocks.CYAN_ALLIUM,
                        FBBlocks.CYAN_CORNFLOWER,
                        FBBlocks.CYAN_DAISY,
                        FBBlocks.CYAN_TORCHFLOWER,
                        FBBlocks.CYAN_TULIP,
                        FBBlocks.CYAN_AZURE_BLUET,
                        FBBlocks.CYAN_DANDELION,
                        Blocks.BLUE_ORCHID,
                        FBBlocks.CYAN_LILY,
                        FBBlocks.CYAN_POPPY,
                        FBBlocks.CYAN_WITHER_ROSE,
                        FBBlocks.CYAN_LILAC,
                        FBBlocks.CYAN_PEONY,
                        FBBlocks.CYAN_PITCHER_PLANT,
                        FBBlocks.CYAN_ROSE_BUSH,
                        FBBlocks.CYAN_SUNFLOWER);

        getOrCreateTagBuilder(FBTags.Blocks.PINK_FLOWERS)
                .add(FBBlocks.PINK_ALLIUM,
                        FBBlocks.PINK_CORNFLOWER,
                        FBBlocks.PINK_DAISY,
                        FBBlocks.PINK_TORCHFLOWER,
                        Blocks.PINK_TULIP,
                        FBBlocks.PINK_AZURE_BLUET,
                        FBBlocks.PINK_DANDELION,
                        FBBlocks.PINK_ORCHID,
                        FBBlocks.PINK_LILY,
                        FBBlocks.PINK_POPPY,
                        FBBlocks.PINK_WITHER_ROSE,
                        FBBlocks.PINK_LILAC,
                        Blocks.PEONY,
                        FBBlocks.PINK_PITCHER_PLANT,
                        FBBlocks.PINK_ROSE_BUSH,
                        FBBlocks.PINK_SUNFLOWER);

        getOrCreateTagBuilder(FBTags.Blocks.BLACK_FLOWERS)
                .add(FBBlocks.BLACK_ALLIUM,
                        FBBlocks.BLACK_CORNFLOWER,
                        FBBlocks.BLACK_DAISY,
                        FBBlocks.BLACK_TORCHFLOWER,
                        FBBlocks.BLACK_TULIP,
                        FBBlocks.BLACK_AZURE_BLUET,
                        FBBlocks.BLACK_DANDELION,
                        FBBlocks.BLACK_ORCHID,
                        FBBlocks.BLACK_LILY,
                        FBBlocks.BLACK_POPPY,
                        Blocks.WITHER_ROSE,
                        FBBlocks.BLACK_LILAC,
                        FBBlocks.BLACK_PEONY,
                        FBBlocks.BLACK_PITCHER_PLANT,
                        FBBlocks.BLACK_ROSE_BUSH,
                        FBBlocks.BLACK_SUNFLOWER);

        getOrCreateTagBuilder(FBTags.Blocks.LILAC_FLOWERS)
                .add(FBBlocks.LILAC_ALLIUM,
                        FBBlocks.LILAC_CORNFLOWER,
                        FBBlocks.LILAC_DAISY,
                        FBBlocks.LILAC_TORCHFLOWER,
                        FBBlocks.LILAC_TULIP,
                        FBBlocks.LILAC_AZURE_BLUET,
                        FBBlocks.LILAC_DANDELION,
                        FBBlocks.LILAC_ORCHID,
                        FBBlocks.LILAC_LILY,
                        FBBlocks.LILAC_POPPY,
                        FBBlocks.LILAC_WITHER_ROSE,
                        Blocks.LILAC,
                        FBBlocks.LILAC_PEONY,
                        FBBlocks.LILAC_PITCHER_PLANT,
                        FBBlocks.LILAC_ROSE_BUSH,
                        FBBlocks.LILAC_SUNFLOWER);

        getOrCreateTagBuilder(FBTags.Blocks.ALLIUMS)
                .add(Blocks.ALLIUM,
                        FBBlocks.BLUE_ALLIUM,
                        FBBlocks.WHITE_ALLIUM,
                        FBBlocks.ORANGE_ALLIUM,
                        FBBlocks.RED_ALLIUM,
                        FBBlocks.YELLOW_ALLIUM,
                        FBBlocks.CYAN_ALLIUM,
                        FBBlocks.PINK_ALLIUM,
                        FBBlocks.BLACK_ALLIUM,
                        FBBlocks.LILAC_ALLIUM);

        getOrCreateTagBuilder(FBTags.Blocks.CORNFLOWERS)
                .add(FBBlocks.MAGENTA_CORNFLOWER,
                        Blocks.CORNFLOWER,
                        FBBlocks.WHITE_CORNFLOWER,
                        FBBlocks.ORANGE_CORNFLOWER,
                        FBBlocks.RED_CORNFLOWER,
                        FBBlocks.YELLOW_CORNFLOWER,
                        FBBlocks.CYAN_CORNFLOWER,
                        FBBlocks.PINK_CORNFLOWER,
                        FBBlocks.BLACK_CORNFLOWER,
                        FBBlocks.LILAC_CORNFLOWER);

        getOrCreateTagBuilder(FBTags.Blocks.DAISIES)
                .add(FBBlocks.MAGENTA_DAISY,
                        FBBlocks.BLUE_DAISY,
                        Blocks.OXEYE_DAISY,
                        FBBlocks.ORANGE_DAISY,
                        FBBlocks.RED_DAISY,
                        FBBlocks.YELLOW_DAISY,
                        FBBlocks.CYAN_DAISY,
                        FBBlocks.PINK_DAISY,
                        FBBlocks.BLACK_DAISY,
                        FBBlocks.LILAC_DAISY);

        getOrCreateTagBuilder(FBTags.Blocks.TORCHFLOWERS)
                .add(FBBlocks.MAGENTA_TORCHFLOWER,
                        FBBlocks.BLUE_TORCHFLOWER,
                        FBBlocks.WHITE_TORCHFLOWER,
                        Blocks.TORCHFLOWER,
                        FBBlocks.RED_TORCHFLOWER,
                        FBBlocks.YELLOW_TORCHFLOWER,
                        FBBlocks.CYAN_TORCHFLOWER,
                        FBBlocks.PINK_TORCHFLOWER,
                        FBBlocks.BLACK_TORCHFLOWER,
                        FBBlocks.LILAC_TORCHFLOWER);

        getOrCreateTagBuilder(FBTags.Blocks.TULIPS)
                .add(FBBlocks.MAGENTA_TULIP,
                        FBBlocks.BLUE_TULIP,
                        Blocks.WHITE_TULIP,
                        Blocks.ORANGE_TULIP,
                        Blocks.RED_TULIP,
                        FBBlocks.YELLOW_TULIP,
                        FBBlocks.CYAN_TULIP,
                        Blocks.PINK_TULIP,
                        FBBlocks.BLACK_TULIP,
                        FBBlocks.LILAC_TULIP);

        getOrCreateTagBuilder(FBTags.Blocks.AZURE_BLUETS)
                .add(FBBlocks.MAGENTA_AZURE_BLUET,
                        FBBlocks.BLUE_AZURE_BLUET,
                        Blocks.AZURE_BLUET,
                        FBBlocks.ORANGE_AZURE_BLUET,
                        FBBlocks.RED_AZURE_BLUET,
                        FBBlocks.YELLOW_AZURE_BLUET,
                        FBBlocks.CYAN_AZURE_BLUET,
                        FBBlocks.PINK_AZURE_BLUET,
                        FBBlocks.BLACK_AZURE_BLUET,
                        FBBlocks.LILAC_AZURE_BLUET);

        getOrCreateTagBuilder(FBTags.Blocks.DANDELIONS)
                .add(FBBlocks.MAGENTA_DANDELION,
                        FBBlocks.BLUE_DANDELION,
                        FBBlocks.WHITE_DANDELION,
                        FBBlocks.ORANGE_DANDELION,
                        FBBlocks.RED_DANDELION,
                        Blocks.DANDELION,
                        FBBlocks.CYAN_DANDELION,
                        FBBlocks.PINK_DANDELION,
                        FBBlocks.BLACK_DANDELION,
                        FBBlocks.LILAC_DANDELION);

        getOrCreateTagBuilder(FBTags.Blocks.ORCHIDS)
                .add(FBBlocks.MAGENTA_ORCHID,
                        FBBlocks.BLUE_ORCHID,
                        FBBlocks.WHITE_ORCHID,
                        FBBlocks.ORANGE_ORCHID,
                        FBBlocks.RED_ORCHID,
                        FBBlocks.YELLOW_ORCHID,
                        Blocks.BLUE_ORCHID,
                        FBBlocks.PINK_ORCHID,
                        FBBlocks.BLACK_ORCHID,
                        FBBlocks.LILAC_ORCHID);

        getOrCreateTagBuilder(FBTags.Blocks.POPPIES)
                .add(FBBlocks.MAGENTA_POPPY,
                        FBBlocks.BLUE_POPPY,
                        FBBlocks.WHITE_POPPY,
                        FBBlocks.ORANGE_POPPY,
                        Blocks.POPPY,
                        FBBlocks.YELLOW_POPPY,
                        FBBlocks.CYAN_POPPY,
                        FBBlocks.PINK_POPPY,
                        FBBlocks.BLACK_POPPY,
                        FBBlocks.LILAC_POPPY);

        getOrCreateTagBuilder(FBTags.Blocks.WITHER_ROSES)
                .add(FBBlocks.MAGENTA_WITHER_ROSE,
                        FBBlocks.BLUE_WITHER_ROSE,
                        FBBlocks.WHITE_WITHER_ROSE,
                        FBBlocks.ORANGE_WITHER_ROSE,
                        FBBlocks.RED_WITHER_ROSE,
                        FBBlocks.YELLOW_WITHER_ROSE,
                        FBBlocks.CYAN_WITHER_ROSE,
                        FBBlocks.PINK_WITHER_ROSE,
                        Blocks.WITHER_ROSE,
                        FBBlocks.LILAC_WITHER_ROSE);

        getOrCreateTagBuilder(FBTags.Blocks.LILACS)
                .add(FBBlocks.MAGENTA_LILAC,
                        FBBlocks.BLUE_LILAC,
                        FBBlocks.WHITE_LILAC,
                        FBBlocks.ORANGE_LILAC,
                        FBBlocks.RED_LILAC,
                        FBBlocks.YELLOW_LILAC,
                        FBBlocks.CYAN_LILAC,
                        FBBlocks.PINK_LILAC,
                        FBBlocks.BLACK_LILAC,
                        Blocks.LILAC);

        getOrCreateTagBuilder(FBTags.Blocks.PEONIES)
                .add(FBBlocks.MAGENTA_PEONY,
                        FBBlocks.BLUE_PEONY,
                        FBBlocks.WHITE_PEONY,
                        FBBlocks.ORANGE_PEONY,
                        FBBlocks.RED_PEONY,
                        FBBlocks.YELLOW_PEONY,
                        FBBlocks.CYAN_PEONY,
                        Blocks.PEONY,
                        FBBlocks.BLACK_PEONY,
                        FBBlocks.LILAC_PEONY);

        getOrCreateTagBuilder(FBTags.Blocks.PITCHER_PLANTS)
                .add(FBBlocks.MAGENTA_PITCHER_PLANT,
                        Blocks.PITCHER_PLANT,
                        FBBlocks.WHITE_PITCHER_PLANT,
                        FBBlocks.ORANGE_PITCHER_PLANT,
                        FBBlocks.RED_PITCHER_PLANT,
                        FBBlocks.YELLOW_PITCHER_PLANT,
                        FBBlocks.CYAN_PITCHER_PLANT,
                        FBBlocks.PINK_PITCHER_PLANT,
                        FBBlocks.BLACK_PITCHER_PLANT,
                        FBBlocks.LILAC_PITCHER_PLANT);

        getOrCreateTagBuilder(FBTags.Blocks.ROSE_BUSHES)
                .add(FBBlocks.MAGENTA_ROSE_BUSH,
                        FBBlocks.BLUE_ROSE_BUSH,
                        FBBlocks.WHITE_ROSE_BUSH,
                        FBBlocks.ORANGE_ROSE_BUSH,
                        Blocks.ROSE_BUSH,
                        FBBlocks.YELLOW_ROSE_BUSH,
                        FBBlocks.CYAN_ROSE_BUSH,
                        FBBlocks.PINK_ROSE_BUSH,
                        FBBlocks.BLACK_ROSE_BUSH,
                        FBBlocks.LILAC_ROSE_BUSH);

        getOrCreateTagBuilder(FBTags.Blocks.SUNFLOWERS)
                .add(FBBlocks.MAGENTA_SUNFLOWER,
                        FBBlocks.BLUE_SUNFLOWER,
                        FBBlocks.WHITE_SUNFLOWER,
                        FBBlocks.ORANGE_SUNFLOWER,
                        FBBlocks.RED_SUNFLOWER,
                        Blocks.SUNFLOWER,
                        FBBlocks.CYAN_SUNFLOWER,
                        FBBlocks.PINK_SUNFLOWER,
                        FBBlocks.BLACK_SUNFLOWER,
                        FBBlocks.LILAC_SUNFLOWER);
}
}
