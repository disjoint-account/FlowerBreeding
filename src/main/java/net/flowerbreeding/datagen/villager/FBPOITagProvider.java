package net.flowerbreeding.datagen.villager;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.flowerbreeding.villagers.FBVillagers;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.PoiTypeTags;
import net.minecraft.tags.TagEntry;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class FBPOITagProvider extends FabricTagsProvider<PoiType> {
    public FBPOITagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, Registries.POINT_OF_INTEREST_TYPE, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider lookup) {
        getOrCreateRawBuilder(PoiTypeTags.ACQUIRABLE_JOB_SITE)
                .add(TagEntry.element(FBVillagers.BOTANIST_POI_KEY.identifier()));
    }
}
