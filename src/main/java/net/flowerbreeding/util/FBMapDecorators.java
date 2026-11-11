package net.flowerbreeding.util;

import net.flowerbreeding.FlowerBreeding;
import net.minecraft.world.level.saveddata.maps.MapDecorationType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;

public class FBMapDecorators {

    public static final Holder<MapDecorationType> GREENHOUSE_DECORATION;
    static {
        GREENHOUSE_DECORATION = register("flowerbreeding:greenhouse", "flowerbreeding:greenhouse", true, false);
    }

    private static Holder<MapDecorationType> register(String id, String assetId, boolean showOnItemFrame, boolean trackCount) {
        ResourceKey<MapDecorationType> registryKey = ResourceKey.create(Registries.MAP_DECORATION_TYPE, Identifier.parse(id));
        MapDecorationType mapDecorationType = new MapDecorationType(Identifier.parse(assetId), showOnItemFrame, trackCount);
        return Registry.registerForHolder(BuiltInRegistries.MAP_DECORATION_TYPE, registryKey, mapDecorationType);
    }

    public static void registerMapDecorators() {
        FlowerBreeding.LOGGER.info("Registering map decorators for " + FlowerBreeding.MOD_ID);
    }
}
