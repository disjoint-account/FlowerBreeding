package net.flowerbreeding.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.HolderLookup;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class FBRegistryDataGenerator extends FabricDynamicRegistryProvider {
    public FBRegistryDataGenerator(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registries, Entries entries) {
        entries.addAll(registries.lookupOrThrow(Registries.TRIM_PATTERN));
        entries.addAll(registries.lookupOrThrow(Registries.FEATURE));
        entries.addAll(registries.lookupOrThrow(Registries.PLACED_FEATURE));
        entries.addAll(registries.lookupOrThrow(Registries.VILLAGER_TRADE));
        entries.addAll(registries.lookupOrThrow(Registries.TRADE_SET));
    }

    @Override
    public @NonNull String getName() {
        return FlowerBreeding.MOD_ID;
    }
}