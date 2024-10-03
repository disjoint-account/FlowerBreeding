package net.flowerbreeding.villagers;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.flowerbreeding.FBItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;

public class FBVillagerTrades {
    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(FBVillagers.BOTANIST, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.RED_TULIP, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 2, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.ALLIUM, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 2, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.CORNFLOWER, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 2, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.OXEYE_DAISY, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 2, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.TORCHFLOWER, 1),
                    new ItemStack(Items.EMERALD, 2), 16, 5, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.RED_TULIP, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 2, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.AZURE_BLUET, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 2, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.DANDELION, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 2, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.ORANGE_TULIP, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 2, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.WHITE_TULIP, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 2, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.BLUE_ORCHID, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 2, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.LILY_OF_THE_VALLEY, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 2, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.POPPY, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 2, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.PINK_TULIP, 1),
                    new ItemStack(Items.EMERALD, 1), 16, 2, 0.05f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.PITCHER_PLANT, 1),
                    new ItemStack(Items.EMERALD, 2), 16, 5, 0.05f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(FBVillagers.BOTANIST, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 4),
                    new ItemStack(FBItems.EMPTY_PIGMENT_JAR, 1), 12, 5, 0.2f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 4),
                    new ItemStack(FBItems.EMPTY_PIGMENT_JAR, 1), 12, 5, 0.2f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(FBVillagers.BOTANIST, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(FBItems.EMPTY_POLLEN_VIAL, 1), 12, 5, 0.2f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 4),
                    new ItemStack(FBItems.EMPTY_PIGMENT_JAR, 1), 12, 5, 0.2f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(FBVillagers.BOTANIST, 4, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 2),
                    new ItemStack(FBItems.LOTUS_FLOWER, 1), 12, 15, 0.2f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 2),
                    new ItemStack(FBItems.LOTUS_FLOWER, 1), 12, 15, 0.2f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(FBVillagers.BOTANIST, 5, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 16),
                    new ItemStack(Items.HEART_OF_THE_SEA, 1), 3, 30, 0.2f
            ));
        });
    }
}
