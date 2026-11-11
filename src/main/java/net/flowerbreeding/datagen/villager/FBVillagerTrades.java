package net.flowerbreeding.datagen.villager;

import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FBItems;
import net.flowerbreeding.FlowerBreeding;
import net.flowerbreeding.util.FBTags;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.npc.villager.VillagerType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.TradeCost;
import net.minecraft.world.item.trading.VillagerTrade;
import net.minecraft.world.item.trading.VillagerTrades;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.saveddata.maps.MapDecorationType;
import net.minecraft.world.level.storage.loot.functions.ExplorationMapFunction;

import java.util.List;

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
                createBasicExplorerMapTrades(
                        context.lookup(Registries.VILLAGER_TYPE),
                        context.lookup(Registries.STRUCTURE),
                        FBTags.Structures.ON_FLORA_EXPLORER_MAPS,
                        GREENHOUSE_DECORATION,
                        FBItems.FLORA_EXPLORER_MAP,
                        List.of(VillagerType.SWAMP, VillagerType.SAVANNA, VillagerType.DESERT, VillagerType.PLAINS, VillagerType.JUNGLE, VillagerType.SNOW, VillagerType.TAIGA)
                )
        );

        context.register(BOTANIST_1_RED_TULIP_EMERALD, VillagerTrade.builder(
                        new TradeCost(Items.RED_TULIP, 1),
                        new ItemStackTemplate(Items.EMERALD),
                        16, 1, 0.05F).build());

        context.register(BOTANIST_1_ALLIUM_EMERALD, VillagerTrade.builder(
                new TradeCost(Items.ALLIUM, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f).build());

        context.register(BOTANIST_1_CORNFLOWER_EMERALD, VillagerTrade.builder(
                new TradeCost(Items.CORNFLOWER, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f).build());

        context.register(BOTANIST_1_DAISY_EMERALD, VillagerTrade.builder(
                new TradeCost(Items.OXEYE_DAISY, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f).build());

        context.register(BOTANIST_1_TORCHFLOWER_EMERALD, VillagerTrade.builder(
                new TradeCost(Items.TORCHFLOWER, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f).build());

        context.register(BOTANIST_1_BLUET_EMERALD, VillagerTrade.builder(
                new TradeCost(Items.AZURE_BLUET, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f).build());

        context.register(BOTANIST_1_DANDELION_EMERALD, VillagerTrade.builder(
                new TradeCost(Items.DANDELION, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f).build());

        context.register(BOTANIST_1_ORANGE_TULIP_EMERALD, VillagerTrade.builder(
                new TradeCost(Items.ORANGE_TULIP, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f).build());

        context.register(BOTANIST_1_WHITE_TULIP_EMERALD, VillagerTrade.builder(
                new TradeCost(Items.WHITE_TULIP, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f).build());

        context.register(BOTANIST_1_ORCHID_EMERALD, VillagerTrade.builder(
                new TradeCost(Items.BLUE_ORCHID, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f).build());

        context.register(BOTANIST_1_LILY_EMERALD, VillagerTrade.builder(
                new TradeCost(Items.LILY_OF_THE_VALLEY, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f).build());

        context.register(BOTANIST_1_POPPY_EMERALD, VillagerTrade.builder(
                new TradeCost(Items.POPPY, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f).build());

        context.register(BOTANIST_1_PINK_TULIP_EMERALD, VillagerTrade.builder(
                new TradeCost(Items.PINK_TULIP, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f).build());

        context.register(BOTANIST_1_WITHER_ROSE_EMERALD, VillagerTrade.builder(
                new TradeCost(Items.WITHER_ROSE, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f).build());

        context.register(BOTANIST_1_EYEBLOSSOM_EMERALD, VillagerTrade.builder(
                new TradeCost(Items.OPEN_EYEBLOSSOM, 1),
                new ItemStackTemplate(Items.EMERALD),
                16, 1, 0.05f).build());



        context.register(BOTANIST_2_EMERALD_JAR, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 4),
                new ItemStackTemplate(FBItems.EMPTY_PIGMENT_JAR),
                12, 10, 0.2f).build());

        context.register(BOTANIST_2_EMERALD_VIAL, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 4),
                new ItemStackTemplate(FBItems.EMPTY_POLLEN_VIAL),
                12, 10, 0.2f).build());



        context.register(BOTANIST_3_EMERALD_DAFFODIL, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.YELLOW_DAFFODIL.asItem()),
                16, 8, 0.05f).build());

        context.register(BOTANIST_3_EMERALD_FOXGLOVE, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.RED_FOXGLOVE.asItem()),
                16, 8, 0.05f).build());

        context.register(BOTANIST_3_EMERALD_HYACINTH, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.PINK_HYACINTH.asItem()),
                16, 8, 0.05f).build());

        context.register(BOTANIST_3_EMERALD_PHLOX, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.MAGENTA_PHLOX.asItem()),
                16, 8, 0.05f).build());

        context.register(BOTANIST_3_EMERALD_LUPIN, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.BLUE_LUPIN.asItem()),
                16, 8, 0.05f).build());

        context.register(BOTANIST_3_EMERALD_SMALL_ROSE, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.RED_SMALL_ROSE.asItem()),
                16, 8, 0.05f).build());

        context.register(BOTANIST_3_EMERALD_LAVENDER, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.MAGENTA_LAVENDER.asItem()),
                16, 8, 0.05f).build());

        context.register(BOTANIST_3_EMERALD_HYDRANGEA, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.BLUE_HYDRANGEA.asItem()),
                16, 8, 0.05f).build());

        context.register(BOTANIST_3_EMERALD_LOTUS, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBItems.PINK_LOTUS_FLOWER),
                16, 8, 0.05f).build());

        context.register(BOTANIST_3_EMERALD_JASMINE, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.WHITE_JASMINE.asItem()),
                16, 8, 0.05f).build());

        context.register(BOTANIST_3_EMERALD_CYPRESS_VINE, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.ORANGE_CYPRESS_VINE.asItem()),
                16, 8, 0.05f).build());

        context.register(BOTANIST_3_EMERALD_GLOWSHROOM, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(FBBlocks.GREEN_GLOWSHROOM.asItem()),
                16, 8, 0.05f).build());



        context.register(BOTANIST_4_EMERALD_IVY, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 2),
                new ItemStackTemplate(FBBlocks.CLIMBING_IVY.asItem()),
                12, 10, 0.2f).build());

        context.register(BOTANIST_4_EMERALD_CATTAILS, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 2),
                new ItemStackTemplate(FBBlocks.CATTAILS.asItem()),
                12, 10, 0.2f).build());

        context.register(BOTANIST_4_EMERALD_SAGE, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 2),
                new ItemStackTemplate(FBBlocks.SAGE.asItem()),
                12, 10, 0.2f).build());



        context.register(BOTANIST_5_EMERALD_BOTANY_TABLE, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 10),
                new ItemStackTemplate(FBBlocks.BOTANY_TABLE.asItem()),
                3, 30, 0.2f).build());

        context.register(BOTANIST_5_EMERALD_TROWEL, VillagerTrade.builder(
                new TradeCost(Items.EMERALD, 10),
                new ItemStackTemplate(FBItems.TROWEL),
                3, 30, 0.2f).build());
    }

    private static VillagerTrade createBasicExplorerMapTrades(
            final HolderGetter<VillagerType> villagerVariants,
            final HolderGetter<Structure> structures,
            final TagKey<Structure> structureTagKey,
            final Holder<MapDecorationType> mapDecorationType,
            final Item mapItem,
            final List<ResourceKey<VillagerType>> villagerTypes
    ) {
        return VillagerTrade.builder(new TradeCost(Items.EMERALD, 8), new TradeCost(Items.COMPASS, 1), new ItemStackTemplate(mapItem), 12, 5, 0.2F)
                .merchantPredicate(VillagerTrades.villagerTypeRestriction(VillagerTrades.villagerTypeHolderSet(villagerVariants, villagerTypes)))
                .addModifiers(
                        Holder.direct(
                                ExplorationMapFunction.makeExplorationMap(structures.getOrThrow(structureTagKey))
                                        .setMapDecoration(mapDecorationType)
                                        .setSearchRadius(100)
                                        .setSkipKnownStructures(true)
                                        .build()
                        ),
                        VillagerTrades.discardItemIfItsNot(VillagerTrades.anyValidMap())
                )
                .build();
    }

    private static ResourceKey<VillagerTrade> createKey(String name) {
        return ResourceKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, name));
    }

    private static void register(BootstrapContext<VillagerTrade> context, ResourceKey<VillagerTrade> resourceKey, VillagerTrade trade) {
        context.register(resourceKey, trade);
    }
}
