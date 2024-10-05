package net.flowerbreeding;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class FBItemGroup {
    public static ItemGroup FLOWERBREEDING = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FlowerBreeding.MOD_ID, "flowerbreeding"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.flowerbreeding"))
                    .icon(() -> new ItemStack(FBItems.EMPTY_POLLEN_VIAL)).entries((displayContext, entries) -> {
                        entries.add(FBBlocks.BOTANY_TABLE);

                        entries.add(FBItems.EMPTY_PIGMENT_JAR);
                        entries.add(FBItems.MAGENTA_PIGMENT_JAR);
                        entries.add(FBItems.BLUE_PIGMENT_JAR);
                        entries.add(FBItems.WHITE_PIGMENT_JAR);
                        entries.add(FBItems.ORANGE_PIGMENT_JAR);
                        entries.add(FBItems.RED_PIGMENT_JAR);
                        entries.add(FBItems.YELLOW_PIGMENT_JAR);
                        entries.add(FBItems.LIGHT_BLUE_PIGMENT_JAR);
                        entries.add(FBItems.PINK_PIGMENT_JAR);
                        entries.add(FBItems.BLACK_PIGMENT_JAR);
                        entries.add(FBItems.CYAN_PIGMENT_JAR);

                        entries.add(FBItems.EMPTY_POLLEN_VIAL);
                        entries.add(FBItems.ALLIUM_POLLEN_VIAL);
                        entries.add(FBItems.CORNFLOWER_POLLEN_VIAL);
                        entries.add(FBItems.DAISY_POLLEN_VIAL);
                        entries.add(FBItems.TORCHFLOWER_POLLEN_VIAL);
                        entries.add(FBItems.TULIP_POLLEN_VIAL);
                        entries.add(FBItems.AZURE_BLUET_POLLEN_VIAL);
                        entries.add(FBItems.DANDELION_POLLEN_VIAL);
                        entries.add(FBItems.ORCHID_POLLEN_VIAL);
                        entries.add(FBItems.LILY_POLLEN_VIAL);
                        entries.add(FBItems.POPPY_POLLEN_VIAL);
                        entries.add(FBItems.WITHER_ROSE_POLLEN_VIAL);
                        entries.add(FBItems.LILAC_POLLEN_VIAL);
                        entries.add(FBItems.PEONY_POLLEN_VIAL);
                        entries.add(FBItems.PITCHER_PLANT_POLLEN_VIAL);
                        entries.add(FBItems.ROSE_BUSH_POLLEN_VIAL);
                        entries.add(FBItems.SUNFLOWER_POLLEN_VIAL);
                        entries.add(FBItems.LILY_PAD_POLLEN_VIAL);

                        entries.add(Blocks.ALLIUM);
                        entries.add(FBBlocks.MAGENTA_CORNFLOWER);
                        entries.add(FBBlocks.MAGENTA_DAISY);
                        entries.add(FBBlocks.MAGENTA_TORCHFLOWER);
                        entries.add(FBBlocks.MAGENTA_TULIP);
                        entries.add(FBBlocks.MAGENTA_AZURE_BLUET);
                        entries.add(FBBlocks.MAGENTA_DANDELION);
                        entries.add(FBBlocks.MAGENTA_ORCHID);
                        entries.add(FBBlocks.MAGENTA_LILY);
                        entries.add(FBBlocks.MAGENTA_POPPY);
                        entries.add(FBBlocks.MAGENTA_WITHER_ROSE);
                        entries.add(Blocks.LILAC);
                        entries.add(FBBlocks.MAGENTA_PEONY);
                        entries.add(FBBlocks.MAGENTA_PITCHER_PLANT);
                        entries.add(FBBlocks.MAGENTA_ROSE_BUSH);
                        entries.add(FBBlocks.MAGENTA_SUNFLOWER);

                        entries.add(FBBlocks.BLUE_ALLIUM);
                        entries.add(Blocks.CORNFLOWER);
                        entries.add(FBBlocks.BLUE_DAISY);
                        entries.add(FBBlocks.BLUE_TORCHFLOWER);
                        entries.add(FBBlocks.BLUE_TULIP);
                        entries.add(FBBlocks.BLUE_AZURE_BLUET);
                        entries.add(FBBlocks.BLUE_DANDELION);
                        entries.add(FBBlocks.BLUE_ORCHID);
                        entries.add(FBBlocks.BLUE_LILY);
                        entries.add(FBBlocks.BLUE_POPPY);
                        entries.add(FBBlocks.BLUE_WITHER_ROSE);
                        entries.add(FBBlocks.BLUE_LILAC);
                        entries.add(FBBlocks.BLUE_PEONY);
                        entries.add(FBBlocks.BLUE_PITCHER_PLANT);
                        entries.add(FBBlocks.BLUE_ROSE_BUSH);
                        entries.add(FBBlocks.BLUE_SUNFLOWER);

                        entries.add(FBBlocks.WHITE_ALLIUM);
                        entries.add(FBBlocks.WHITE_CORNFLOWER);
                        entries.add(Blocks.OXEYE_DAISY);
                        entries.add(FBBlocks.WHITE_TORCHFLOWER);
                        entries.add(Blocks.WHITE_TULIP);
                        entries.add(Blocks.AZURE_BLUET);
                        entries.add(FBBlocks.WHITE_DANDELION);
                        entries.add(FBBlocks.WHITE_ORCHID);
                        entries.add(Blocks.LILY_OF_THE_VALLEY);
                        entries.add(FBBlocks.WHITE_POPPY);
                        entries.add(FBBlocks.WHITE_WITHER_ROSE);
                        entries.add(FBBlocks.WHITE_LILAC);
                        entries.add(FBBlocks.WHITE_PEONY);
                        entries.add(FBBlocks.WHITE_PITCHER_PLANT);
                        entries.add(FBBlocks.WHITE_ROSE_BUSH);
                        entries.add(FBBlocks.WHITE_SUNFLOWER);

                        entries.add(FBBlocks.ORANGE_ALLIUM);
                        entries.add(FBBlocks.ORANGE_CORNFLOWER);
                        entries.add(FBBlocks.ORANGE_DAISY);
                        entries.add(Blocks.TORCHFLOWER);
                        entries.add(Blocks.ORANGE_TULIP);
                        entries.add(FBBlocks.ORANGE_AZURE_BLUET);
                        entries.add(FBBlocks.ORANGE_DANDELION);
                        entries.add(FBBlocks.ORANGE_ORCHID);
                        entries.add(FBBlocks.ORANGE_LILY);
                        entries.add(FBBlocks.ORANGE_POPPY);
                        entries.add(FBBlocks.ORANGE_WITHER_ROSE);
                        entries.add(FBBlocks.ORANGE_LILAC);
                        entries.add(FBBlocks.ORANGE_PEONY);
                        entries.add(FBBlocks.ORANGE_PITCHER_PLANT);
                        entries.add(FBBlocks.ORANGE_ROSE_BUSH);
                        entries.add(FBBlocks.ORANGE_SUNFLOWER);

                        entries.add(FBBlocks.RED_ALLIUM);
                        entries.add(FBBlocks.RED_CORNFLOWER);
                        entries.add(FBBlocks.RED_DAISY);
                        entries.add(FBBlocks.RED_TORCHFLOWER);
                        entries.add(Blocks.RED_TULIP);
                        entries.add(FBBlocks.RED_AZURE_BLUET);
                        entries.add(FBBlocks.RED_DANDELION);
                        entries.add(FBBlocks.RED_ORCHID);
                        entries.add(FBBlocks.RED_LILY);
                        entries.add(Blocks.POPPY);
                        entries.add(FBBlocks.RED_WITHER_ROSE);
                        entries.add(FBBlocks.RED_LILAC);
                        entries.add(FBBlocks.RED_PEONY);
                        entries.add(FBBlocks.RED_PITCHER_PLANT);
                        entries.add(Blocks.ROSE_BUSH);
                        entries.add(FBBlocks.RED_SUNFLOWER);

                        entries.add(FBBlocks.YELLOW_ALLIUM);
                        entries.add(FBBlocks.YELLOW_CORNFLOWER);
                        entries.add(FBBlocks.YELLOW_DAISY);
                        entries.add(FBBlocks.YELLOW_TORCHFLOWER);
                        entries.add(FBBlocks.YELLOW_TULIP);
                        entries.add(FBBlocks.YELLOW_AZURE_BLUET);
                        entries.add(Blocks.DANDELION);
                        entries.add(FBBlocks.YELLOW_ORCHID);
                        entries.add(FBBlocks.YELLOW_LILY);
                        entries.add(FBBlocks.YELLOW_POPPY);
                        entries.add(FBBlocks.YELLOW_WITHER_ROSE);
                        entries.add(FBBlocks.YELLOW_LILAC);
                        entries.add(FBBlocks.YELLOW_PEONY);
                        entries.add(FBBlocks.YELLOW_PITCHER_PLANT);
                        entries.add(FBBlocks.YELLOW_ROSE_BUSH);
                        entries.add(Blocks.SUNFLOWER);

                        entries.add(FBBlocks.LIGHT_BLUE_ALLIUM);
                        entries.add(FBBlocks.LIGHT_BLUE_CORNFLOWER);
                        entries.add(FBBlocks.LIGHT_BLUE_DAISY);
                        entries.add(FBBlocks.LIGHT_BLUE_TORCHFLOWER);
                        entries.add(FBBlocks.LIGHT_BLUE_TULIP);
                        entries.add(FBBlocks.LIGHT_BLUE_AZURE_BLUET);
                        entries.add(FBBlocks.LIGHT_BLUE_DANDELION);
                        entries.add(Blocks.BLUE_ORCHID);
                        entries.add(FBBlocks.LIGHT_BLUE_LILY);
                        entries.add(FBBlocks.LIGHT_BLUE_POPPY);
                        entries.add(FBBlocks.LIGHT_BLUE_WITHER_ROSE);
                        entries.add(FBBlocks.LIGHT_BLUE_LILAC);
                        entries.add(FBBlocks.LIGHT_BLUE_PEONY);
                        entries.add(FBBlocks.LIGHT_BLUE_PITCHER_PLANT);
                        entries.add(FBBlocks.LIGHT_BLUE_ROSE_BUSH);
                        entries.add(FBBlocks.LIGHT_BLUE_SUNFLOWER);

                        entries.add(FBBlocks.PINK_ALLIUM);
                        entries.add(FBBlocks.PINK_CORNFLOWER);
                        entries.add(FBBlocks.PINK_DAISY);
                        entries.add(FBBlocks.PINK_TORCHFLOWER);
                        entries.add(Blocks.PINK_TULIP);
                        entries.add(FBBlocks.PINK_AZURE_BLUET);
                        entries.add(FBBlocks.PINK_DANDELION);
                        entries.add(FBBlocks.PINK_ORCHID);
                        entries.add(FBBlocks.PINK_LILY);
                        entries.add(FBBlocks.PINK_POPPY);
                        entries.add(FBBlocks.PINK_WITHER_ROSE);
                        entries.add(FBBlocks.PINK_LILAC);
                        entries.add(Blocks.PEONY);
                        entries.add(FBBlocks.PINK_PITCHER_PLANT);
                        entries.add(FBBlocks.PINK_ROSE_BUSH);
                        entries.add(FBBlocks.PINK_SUNFLOWER);

                        entries.add(FBBlocks.BLACK_ALLIUM);
                        entries.add(FBBlocks.BLACK_CORNFLOWER);
                        entries.add(FBBlocks.BLACK_DAISY);
                        entries.add(FBBlocks.BLACK_TORCHFLOWER);
                        entries.add(FBBlocks.BLACK_TULIP);
                        entries.add(FBBlocks.BLACK_AZURE_BLUET);
                        entries.add(FBBlocks.BLACK_DANDELION);
                        entries.add(FBBlocks.BLACK_ORCHID);
                        entries.add(FBBlocks.BLACK_LILY);
                        entries.add(FBBlocks.BLACK_POPPY);
                        entries.add(Blocks.WITHER_ROSE);
                        entries.add(FBBlocks.BLACK_LILAC);
                        entries.add(FBBlocks.BLACK_PEONY);
                        entries.add(FBBlocks.BLACK_PITCHER_PLANT);
                        entries.add(FBBlocks.BLACK_ROSE_BUSH);
                        entries.add(FBBlocks.BLACK_SUNFLOWER);

                        entries.add(FBBlocks.CYAN_ALLIUM);
                        entries.add(FBBlocks.CYAN_CORNFLOWER);
                        entries.add(FBBlocks.CYAN_DAISY);
                        entries.add(FBBlocks.CYAN_TORCHFLOWER);
                        entries.add(FBBlocks.CYAN_TULIP);
                        entries.add(FBBlocks.CYAN_AZURE_BLUET);
                        entries.add(FBBlocks.CYAN_DANDELION);
                        entries.add(FBBlocks.CYAN_ORCHID);
                        entries.add(FBBlocks.CYAN_LILY);
                        entries.add(FBBlocks.CYAN_POPPY);
                        entries.add(FBBlocks.CYAN_WITHER_ROSE);
                        entries.add(FBBlocks.CYAN_LILAC);
                        entries.add(FBBlocks.CYAN_PEONY);
                        entries.add(Blocks.PITCHER_PLANT);
                        entries.add(Items.PITCHER_POD);
                        entries.add(FBBlocks.CYAN_ROSE_BUSH);
                        entries.add(FBBlocks.CYAN_SUNFLOWER);

                        entries.add(FBBlocks.MAGENTA_DAFFODIL);
                        entries.add(FBBlocks.BLUE_DAFFODIL);
                        entries.add(FBBlocks.WHITE_DAFFODIL);
                        entries.add(FBBlocks.ORANGE_DAFFODIL);
                        entries.add(FBBlocks.RED_DAFFODIL);
                        entries.add(FBBlocks.YELLOW_DAFFODIL);
                        entries.add(FBBlocks.LIGHT_BLUE_DAFFODIL);
                        entries.add(FBBlocks.PINK_DAFFODIL);
                        entries.add(FBBlocks.BLACK_DAFFODIL);
                        entries.add(FBBlocks.CYAN_DAFFODIL);
                    }).build());
    public static void registerItemGroups() {
        FlowerBreeding.LOGGER.info("Registering Item Groups for " + FlowerBreeding.MOD_ID);
    }
}