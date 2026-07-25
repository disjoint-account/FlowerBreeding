package net.flowerbreeding.trim;

import net.flowerbreeding.FlowerBreeding;
import net.minecraft.world.item.equipment.trim.TrimPattern;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Util;

public class FBArmourTrims {
    public static final ResourceKey<TrimPattern> FLORAL = ResourceKey.create(Registries.TRIM_PATTERN, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, "floral"));

    public static void bootstrap(BootstrapContext<TrimPattern> context) {
        register(context, FLORAL);
    }

    private static void register(BootstrapContext<TrimPattern> context, ResourceKey<TrimPattern> key) {
        TrimPattern trimPattern = new TrimPattern(key.identifier(),
                Component.translatable(Util.makeDescriptionId("trim_pattern", key.identifier())), false);
        context.register(key, trimPattern);
    }
}