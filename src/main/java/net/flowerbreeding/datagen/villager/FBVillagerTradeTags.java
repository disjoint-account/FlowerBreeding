package net.flowerbreeding.datagen.villager;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.flowerbreeding.util.FBTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagEntry;
import net.minecraft.tags.VillagerTradeTags;
import net.minecraft.world.item.trading.VillagerTrade;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class FBVillagerTradeTags extends FabricTagsProvider<VillagerTrade> {
    public FBVillagerTradeTags(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, Registries.VILLAGER_TRADE, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider registries) {
        getOrCreateRawBuilder(VillagerTradeTags.CARTOGRAPHER_LEVEL_3)
                .add(TagEntry.element(FBVillagerTrades.CARTOGRAPHER_3_EMERALD_FLORA_MAP.identifier()));

        getOrCreateRawBuilder(FBTags.Trades.BOTANIST_LEVEL_1)
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_1_RED_TULIP_EMERALD.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_1_ALLIUM_EMERALD.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_1_CORNFLOWER_EMERALD.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_1_DAISY_EMERALD.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_1_TORCHFLOWER_EMERALD.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_1_BLUET_EMERALD.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_1_DANDELION_EMERALD.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_1_ORANGE_TULIP_EMERALD.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_1_WHITE_TULIP_EMERALD.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_1_ORCHID_EMERALD.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_1_LILY_EMERALD.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_1_POPPY_EMERALD.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_1_PINK_TULIP_EMERALD.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_1_WITHER_ROSE_EMERALD.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_1_EYEBLOSSOM_EMERALD.identifier()));

        getOrCreateRawBuilder(FBTags.Trades.BOTANIST_LEVEL_2)
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_2_EMERALD_JAR.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_2_EMERALD_VIAL.identifier()));

        getOrCreateRawBuilder(FBTags.Trades.BOTANIST_LEVEL_3)
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_3_EMERALD_DAFFODIL.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_3_EMERALD_FOXGLOVE.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_3_EMERALD_HYACINTH.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_3_EMERALD_PHLOX.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_3_EMERALD_LUPIN.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_3_EMERALD_SMALL_ROSE.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_3_EMERALD_LAVENDER.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_3_EMERALD_HYDRANGEA.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_3_EMERALD_LOTUS.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_3_EMERALD_JASMINE.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_3_EMERALD_CYPRESS_VINE.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_3_EMERALD_GLOWSHROOM.identifier()));

        getOrCreateRawBuilder(FBTags.Trades.BOTANIST_LEVEL_4)
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_4_EMERALD_IVY.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_4_EMERALD_CATTAILS.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_4_EMERALD_SAGE.identifier()));

        getOrCreateRawBuilder(FBTags.Trades.BOTANIST_LEVEL_5)
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_5_EMERALD_BOTANY_TABLE.identifier()))
                .add(TagEntry.element(FBVillagerTrades.BOTANIST_5_EMERALD_TROWEL.identifier()));
    }
}