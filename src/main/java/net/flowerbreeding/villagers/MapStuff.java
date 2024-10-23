package net.flowerbreeding.villagers;

import net.flowerbreeding.util.FBTags;
import net.minecraft.block.MapColor;
import net.minecraft.item.map.MapDecorationType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffers;

public class MapStuff {

    public static final RegistryEntry<MapDecorationType> GREENHOUSE_DECORATION;
    private static final TradeOffers.Factory SELL_GREENHOUSE_MAP_TRADE;
    static {
        GREENHOUSE_DECORATION = register("flowerbreeding:greenhouse", "flowerbreeding:greenhouse", true, MapColor.LIGHT_GRAY.color, false, true);
        SELL_GREENHOUSE_MAP_TRADE = new SellCustomMapTradeFactory(14, FBTags.Structures.ON_FLORA_EXPLORER_MAPS, "filled_map.greenhouse", GREENHOUSE_DECORATION, 12, 5);
    }

    private static RegistryEntry<MapDecorationType> register(String id, String assetId, boolean showOnItemFrame, int mapColor, boolean trackCount, boolean explorationMapElement) {
        RegistryKey<MapDecorationType> registryKey = RegistryKey.of(RegistryKeys.MAP_DECORATION_TYPE, Identifier.of(id));
        MapDecorationType mapDecorationType = new MapDecorationType(Identifier.of(assetId), showOnItemFrame, mapColor, explorationMapElement, trackCount);
        return Registry.registerReference(Registries.MAP_DECORATION_TYPE, registryKey, mapDecorationType);
    }
}
