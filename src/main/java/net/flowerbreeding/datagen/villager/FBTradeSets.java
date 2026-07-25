package net.flowerbreeding.datagen.villager;

import net.flowerbreeding.FlowerBreeding;
import net.flowerbreeding.util.FBTags;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.trading.TradeSet;
import net.minecraft.world.item.trading.VillagerTrade;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.NumberProvider;

import java.util.Optional;

public class FBTradeSets {
    public static final ResourceKey<TradeSet> BOTANIST_LEVEL_1 = create("botanist/level_1");
    public static final ResourceKey<TradeSet> BOTANIST_LEVEL_2 = create("botanist/level_2");
    public static final ResourceKey<TradeSet> BOTANIST_LEVEL_3 = create("botanist/level_3");
    public static final ResourceKey<TradeSet> BOTANIST_LEVEL_4 = create("botanist/level_4");
    public static final ResourceKey<TradeSet> BOTANIST_LEVEL_5 = create("botanist/level_5");

    public static void bootstrap(BootstrapContext<TradeSet> context) {
        register(context, BOTANIST_LEVEL_1, FBTags.Trades.BOTANIST_LEVEL_1);
        register(context, BOTANIST_LEVEL_2, FBTags.Trades.BOTANIST_LEVEL_2);
        register(context, BOTANIST_LEVEL_3, FBTags.Trades.BOTANIST_LEVEL_3);
        register(context, BOTANIST_LEVEL_4, FBTags.Trades.BOTANIST_LEVEL_4);
        register(context, BOTANIST_LEVEL_5, FBTags.Trades.BOTANIST_LEVEL_5);
    }

    private static ResourceKey<TradeSet> create(final String id) {
        return ResourceKey.create(Registries.TRADE_SET, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, id));
    }

    public static Holder.Reference<TradeSet> register(final BootstrapContext<TradeSet> context,
                                                      final ResourceKey<TradeSet> resourceKey, final TagKey<VillagerTrade> tradeTag) {
        return register(context, resourceKey, tradeTag, ConstantValue.exactly(2.0F));
    }

    public static Holder.Reference<TradeSet> register(final BootstrapContext<TradeSet> context, final ResourceKey<TradeSet> resourceKey,
                                                      final TagKey<VillagerTrade> tradeTag, final NumberProvider numberProvider) {
        return context.register(resourceKey, new TradeSet(context.lookup(Registries.VILLAGER_TRADE).getOrThrow(tradeTag),
                numberProvider, false, Optional.of(resourceKey.identifier().withPrefix("trade_set/"))));
    }
}
