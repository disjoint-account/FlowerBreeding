package net.flowerbreeding.datagen.villager;

import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FBItems;
import net.flowerbreeding.FlowerBreeding;
import net.flowerbreeding.util.FBTags;
import net.minecraft.advancements.predicates.DataComponentMatchers;
import net.minecraft.advancements.predicates.ItemPredicate;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.TradeCost;
import net.minecraft.world.item.trading.VillagerTrade;
import net.minecraft.world.level.storage.loot.functions.DiscardItem;
import net.minecraft.world.level.storage.loot.functions.ExplorationMapFunction;
import net.minecraft.world.level.storage.loot.functions.FilteredFunction;
import net.minecraft.world.level.storage.loot.functions.SetNameFunction;

import java.util.List;
import java.util.Optional;

import static net.flowerbreeding.util.FBMapDecorators.GREENHOUSE_DECORATION;

public class FBVillagerTrades {
    public static final ResourceKey<VillagerTrade> CARTOGRAPHER_3_EMERALD_FLORA_MAP = createKey("cartographer/3/emerald_flora_map");

    public static final ResourceKey<VillagerTrade> BOTANIST_1_RED_TULIP_EMERALD = createKey("botanist/1/red_tulip_emerald");
    public static final ResourceKey<VillagerTrade> BOTANIST_1_ALLIUM_EMERALD = createKey("botanist/1/allium_emerald");
    public static final ResourceKey<VillagerTrade> BOTANIST_1_CORNFLOWER_EMERALD = createKey("botanist/1/cornflower_emerald");
    public static final ResourceKey<VillagerTrade> BOTANIST_1_DAISY_EMERALD = createKey("botanist/1/daisy_emerald");
    public static final ResourceKey<VillagerTrade> BOTANIST_1_TORCHFLOWER_EMERALD = createKey("botanist/1/torchflower_emerald");
    public static final ResourceKey<VillagerTrade> BOTANIST_1_BLUET_EMERALD = createKey("botanist/1/bluet_emerald");
    public static final ResourceKey<VillagerTrade> BOTANIST_1_DANDELION_EMERALD = createKey("botanist/1/dandelion_emerald");
    public static final ResourceKey<VillagerTrade> BOTANIST_1_ORANGE_TULIP_EMERALD = createKey("botanist/1/orange_tulip_emerald");
    public static final ResourceKey<VillagerTrade> BOTANIST_1_WHITE_TULIP_EMERALD = createKey("botanist/1/white_tulip_emerald");
    public static final ResourceKey<VillagerTrade> BOTANIST_1_ORCHID_EMERALD = createKey("botanist/1/orchid_emerald");
    public static final ResourceKey<VillagerTrade> BOTANIST_1_LILY_EMERALD = createKey("botanist/1/lily_emerald");
    public static final ResourceKey<VillagerTrade> BOTANIST_1_POPPY_EMERALD = createKey("botanist/1/poppy_emerald");
    public static final ResourceKey<VillagerTrade> BOTANIST_1_PINK_TULIP_EMERALD = createKey("botanist/1/pink_tulip_emerald");
    public static final ResourceKey<VillagerTrade> BOTANIST_1_WITHER_ROSE_EMERALD = createKey("botanist/1/wither_rose_emerald");
    public static final ResourceKey<VillagerTrade> BOTANIST_1_EYEBLOSSOM_EMERALD = createKey("botanist/1/eyeblossom_emerald");

    public static final ResourceKey<VillagerTrade> BOTANIST_2_EMERALD_JAR = createKey("botanist/2/emerald_jar");
    public static final ResourceKey<VillagerTrade> BOTANIST_2_EMERALD_VIAL = createKey("botanist/2/emerald_vial");

    public static final ResourceKey<VillagerTrade> BOTANIST_3_EMERALD_DAFFODIL = createKey("botanist/3/emerald_daffodil");
    public static final ResourceKey<VillagerTrade> BOTANIST_3_EMERALD_FOXGLOVE = createKey("botanist/3/emerald_foxglove");
    public static final ResourceKey<VillagerTrade> BOTANIST_3_EMERALD_HYACINTH = createKey("botanist/3/emerald_hyacinth");
    public static final ResourceKey<VillagerTrade> BOTANIST_3_EMERALD_PHLOX = createKey("botanist/3/emerald_phlox");
    public static final ResourceKey<VillagerTrade> BOTANIST_3_EMERALD_LUPIN = createKey("botanist/3/emerald_lupin");
    public static final ResourceKey<VillagerTrade> BOTANIST_3_EMERALD_SMALL_ROSE = createKey("botanist/3/emerald_small_rose");
    public static final ResourceKey<VillagerTrade> BOTANIST_3_EMERALD_LAVENDER = createKey("botanist/3/emerald_lavender");
    public static final ResourceKey<VillagerTrade> BOTANIST_3_EMERALD_HYDRANGEA = createKey("botanist/3/emerald_hydrangea");
    public static final ResourceKey<VillagerTrade> BOTANIST_3_EMERALD_LOTUS = createKey("botanist/3/emerald_lotus");
    public static final ResourceKey<VillagerTrade> BOTANIST_3_EMERALD_JASMINE = createKey("botanist/3/emerald_jasmine");
    public static final ResourceKey<VillagerTrade> BOTANIST_3_EMERALD_CYPRESS_VINE = createKey("botanist/3/emerald_cypress_vine");
    public static final ResourceKey<VillagerTrade> BOTANIST_3_EMERALD_GLOWSHROOM = createKey("botanist/3/emerald_glowshroom");

    public static final ResourceKey<VillagerTrade> BOTANIST_4_EMERALD_IVY = createKey("botanist/4/emerald_ivy");
    public static final ResourceKey<VillagerTrade> BOTANIST_4_EMERALD_CATTAILS = createKey("botanist/4/emerald_cattails");
    public static final ResourceKey<VillagerTrade> BOTANIST_4_EMERALD_SAGE = createKey("botanist/4/emerald_sage");

    public static final ResourceKey<VillagerTrade> BOTANIST_5_EMERALD_BOTANY_TABLE = createKey("botanist/5/emerald_botany_table");
    public static final ResourceKey<VillagerTrade> BOTANIST_5_EMERALD_TROWEL = createKey("botanist/5/emerald_trowel");



    public static void bootstrap(BootstrapContext<VillagerTrade> context) {
        register(
                context,
                CARTOGRAPHER_3_EMERALD_FLORA_MAP,
                new VillagerTrade(
                        new TradeCost(Items.EMERALD, 14),
                        Optional.of(new TradeCost(Items.COMPASS, 1)),
                        new ItemStackTemplate(Items.MAP),
                        12,
                        10,
                        0.2F,
                        Optional.empty(),
                        List.of(
                                ExplorationMapFunction.makeExplorationMap()
                                        .setDestination(FBTags.Structures.ON_FLORA_EXPLORER_MAPS)
                                        .setMapDecoration(GREENHOUSE_DECORATION)
                                        .setSearchRadius(100)
                                        .setSkipKnownStructures(true)
                                        .build(),
                                SetNameFunction.setName(Component.translatable("filled_map.greenhouse"), SetNameFunction.Target.ITEM_NAME).build(),
                                FilteredFunction.filtered(
                                                new ItemPredicate.Builder()
                                                        .of(context.lookup(Registries.ITEM), Items.FILLED_MAP)
                                                        .withComponents(DataComponentMatchers.Builder.components().any(DataComponents.MAP_ID).build())
                                                        .build()
                                        )
                                        .onFail(Optional.of(DiscardItem.discardItem().build()))
                                        .build()
                        )
                )
        );



        register(context, BOTANIST_1_RED_TULIP_EMERALD, new VillagerTrade(
                new TradeCost(Items.RED_TULIP, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_1_ALLIUM_EMERALD, new VillagerTrade(
                new TradeCost(Items.ALLIUM, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_1_CORNFLOWER_EMERALD, new VillagerTrade(
                new TradeCost(Items.CORNFLOWER, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_1_DAISY_EMERALD, new VillagerTrade(
                new TradeCost(Items.OXEYE_DAISY, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_1_TORCHFLOWER_EMERALD, new VillagerTrade(
                new TradeCost(Items.TORCHFLOWER, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_1_BLUET_EMERALD, new VillagerTrade(
                new TradeCost(Items.AZURE_BLUET, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_1_DANDELION_EMERALD, new VillagerTrade(
                new TradeCost(Items.DANDELION, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_1_ORANGE_TULIP_EMERALD, new VillagerTrade(
                new TradeCost(Items.ORANGE_TULIP, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_1_WHITE_TULIP_EMERALD, new VillagerTrade(
                new TradeCost(Items.WHITE_TULIP, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_1_ORCHID_EMERALD, new VillagerTrade(
                new TradeCost(Items.BLUE_ORCHID, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_1_LILY_EMERALD, new VillagerTrade(
                new TradeCost(Items.LILY_OF_THE_VALLEY, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_1_POPPY_EMERALD, new VillagerTrade(
                new TradeCost(Items.POPPY, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_1_PINK_TULIP_EMERALD, new VillagerTrade(
                new TradeCost(Items.PINK_TULIP, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_1_WITHER_ROSE_EMERALD, new VillagerTrade(
                new TradeCost(Items.WITHER_ROSE, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_1_EYEBLOSSOM_EMERALD, new VillagerTrade(
                new TradeCost(Items.OPEN_EYEBLOSSOM, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f,
                Optional.empty(), List.of()));



        register(context, BOTANIST_2_EMERALD_JAR, new VillagerTrade(
                new TradeCost(Items.EMERALD, 4),
                new ItemStackTemplate(FBItems.EMPTY_PIGMENT_JAR),
                12, 10, 0.2f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_2_EMERALD_VIAL, new VillagerTrade(
                new TradeCost(Items.EMERALD, 4),
                new ItemStackTemplate(FBItems.EMPTY_POLLEN_VIAL),
                12, 10, 0.2f,
                Optional.empty(), List.of()));



        register(context, BOTANIST_3_EMERALD_DAFFODIL, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.YELLOW_DAFFODIL.asItem()),
                16, 8, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_3_EMERALD_FOXGLOVE, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.RED_FOXGLOVE.asItem()),
                16, 8, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_3_EMERALD_HYACINTH, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.PINK_HYACINTH.asItem()),
                16, 8, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_3_EMERALD_PHLOX, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.MAGENTA_PHLOX.asItem()),
                16, 8, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_3_EMERALD_LUPIN, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.BLUE_LUPIN.asItem()),
                16, 8, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_3_EMERALD_SMALL_ROSE, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.RED_SMALL_ROSE.asItem()),
                16, 8, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_3_EMERALD_LAVENDER, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.MAGENTA_LAVENDER.asItem()),
                16, 8, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_3_EMERALD_HYDRANGEA, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.BLUE_HYDRANGEA.asItem()),
                16, 8, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_3_EMERALD_LOTUS, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBItems.PINK_LOTUS_FLOWER),
                16, 8, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_3_EMERALD_JASMINE, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.WHITE_JASMINE.asItem()),
                16, 8, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_3_EMERALD_CYPRESS_VINE, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.ORANGE_CYPRESS_VINE.asItem()),
                16, 8, 0.05f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_3_EMERALD_GLOWSHROOM, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.GREEN_GLOWSHROOM.asItem()),
                16, 8, 0.05f,
                Optional.empty(), List.of()));



        register(context, BOTANIST_4_EMERALD_IVY, new VillagerTrade(
                new TradeCost(Items.EMERALD, 2),
                new ItemStackTemplate(FBBlocks.CLIMBING_IVY.asItem()),
                12, 10, 0.2f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_4_EMERALD_CATTAILS, new VillagerTrade(
                new TradeCost(Items.EMERALD, 2),
                new ItemStackTemplate(FBBlocks.CATTAILS.asItem()),
                12, 10, 0.2f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_4_EMERALD_SAGE, new VillagerTrade(
                new TradeCost(Items.EMERALD, 2),
                new ItemStackTemplate(FBBlocks.SAGE.asItem()),
                12, 10, 0.2f,
                Optional.empty(), List.of()));



        register(context, BOTANIST_5_EMERALD_BOTANY_TABLE, new VillagerTrade(
                new TradeCost(Items.EMERALD, 10),
                new ItemStackTemplate(FBBlocks.BOTANY_TABLE.asItem()),
                3, 30, 0.2f,
                Optional.empty(), List.of()));

        register(context, BOTANIST_5_EMERALD_TROWEL, new VillagerTrade(
                new TradeCost(Items.EMERALD, 10),
                new ItemStackTemplate(FBItems.TROWEL),
                3, 30, 0.2f,
                Optional.empty(), List.of()));
    }


    private static ResourceKey<VillagerTrade> createKey(String name) {
        return ResourceKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, name));
    }

    private static void register(BootstrapContext<VillagerTrade> context, ResourceKey<VillagerTrade> resourceKey, VillagerTrade trade) {
        context.register(resourceKey, trade);
    }
}
