package net.flowerbreeding.villagers;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FBItems;
import net.flowerbreeding.util.FBTags;
import net.minecraft.block.MapColor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.map.MapDecorationType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;

public class FBVillagerTrades {

    public static final RegistryEntry<MapDecorationType> GREENHOUSE_DECORATION;
    private static final TradeOffers.Factory SELL_GREENHOUSE_MAP_TRADE;
    private static RegistryEntry<MapDecorationType> register(String id, String assetId, boolean showOnItemFrame, int mapColor, boolean trackCount, boolean explorationMapElement) {
        RegistryKey<MapDecorationType> registryKey = RegistryKey.of(RegistryKeys.MAP_DECORATION_TYPE, Identifier.of(id));
        MapDecorationType mapDecorationType = new MapDecorationType(Identifier.of(assetId), showOnItemFrame, mapColor, explorationMapElement, trackCount);
        return Registry.registerReference(Registries.MAP_DECORATION_TYPE, registryKey, mapDecorationType);
    }
    static {
        GREENHOUSE_DECORATION = register("flowerbreeding:greenhouse", "flowerbreeding:greenhouse", true, MapColor.GREEN.color, false, true);
        SELL_GREENHOUSE_MAP_TRADE = new SellCustomMapTradeFactory(12, FBTags.Structures.ON_FLORA_EXPLORER_MAPS, "filled_map.greenhouse", GREENHOUSE_DECORATION, 12, 5);
    }

    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(FBVillagers.BOTANIST_KEY, 1, factories -> {
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.RED_TULIP, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 1, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.ALLIUM, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 1, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.CORNFLOWER, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 1, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.OXEYE_DAISY, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 1, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.TORCHFLOWER, 1),
                    new ItemStack(Items.EMERALD, 2), 16, 2, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.RED_TULIP, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 1, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.AZURE_BLUET, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 1, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.DANDELION, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 1, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.ORANGE_TULIP, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 1, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.WHITE_TULIP, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 1, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.BLUE_ORCHID, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 1, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.LILY_OF_THE_VALLEY, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 1, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.POPPY, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 1, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.PINK_TULIP, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 1, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.WITHER_ROSE, 1),
                    new ItemStack(Items.EMERALD, 2), 16, 1, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.OPEN_EYEBLOSSOM, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 1, 0.05f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(FBVillagers.BOTANIST_KEY, 2, factories -> {
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 4),
                    new ItemStack(FBItems.EMPTY_PIGMENT_JAR, 1), 12, 5, 0.2f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 4),
                    new ItemStack(FBItems.EMPTY_POLLEN_VIAL, 1), 12, 5, 0.2f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(FBVillagers.BOTANIST_KEY, 3, factories -> {
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(FBBlocks.YELLOW_DAFFODIL, 1), 16, 5, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(FBBlocks.RED_FOXGLOVE, 1), 16, 5, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(FBBlocks.PINK_HYACINTH, 1), 16, 5, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(FBBlocks.MAGENTA_PHLOX, 1), 16, 5, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(FBBlocks.BLUE_LUPIN, 1), 16, 5, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(FBBlocks.RED_SMALL_ROSE, 1), 16, 5, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(FBBlocks.MAGENTA_LAVENDER, 1), 16, 5, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(FBBlocks.LIGHT_BLUE_HYDRANGEA, 1), 16, 5, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(FBItems.PINK_LOTUS_FLOWER, 1), 16, 5, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(FBBlocks.WHITE_JASMINE, 1), 16, 5, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(FBBlocks.ORANGE_CYPRESS_VINE, 1), 16, 5, 0.05f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 2),
                    new ItemStack(FBBlocks.GREEN_GLOWSHROOM, 1), 16, 5, 0.05f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(FBVillagers.BOTANIST_KEY, 4, factories -> {
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 2),
                    new ItemStack(FBBlocks.CLIMBING_IVY, 1), 12, 5, 0.2f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 2),
                    new ItemStack(FBBlocks.CATTAILS, 1), 12, 5, 0.2f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 1),
                    new ItemStack(FBBlocks.SAGE, 1), 12, 5, 0.2f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(FBVillagers.BOTANIST_KEY, 5, factories -> {
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 10),
                    new ItemStack(FBBlocks.BOTANY_TABLE, 1), 3, 30, 0.2f
            ));
            factories.add((serverWorld, entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(FBItems.TROWEL, 1), 3, 30, 0.2f
            ));
        });

//insert map to cartographer pool
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 2, (trades) -> {
                        trades.add(SELL_GREENHOUSE_MAP_TRADE);
        });
    }
}
