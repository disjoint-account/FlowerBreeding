package net.flowerbreeding.villagers;

import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PoiHelper;
import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FlowerBreeding;
import net.flowerbreeding.datagen.villager.FBTradeSets;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.villager.VillagerProfession;
import net.minecraft.world.level.block.Block;

public class FBVillagers {
    public static final ResourceKey<PoiType> BOTANIST_POI_KEY = registerPoiKey("botanist_poi");
    public static final PoiType BOTANIST_POI = registerPOI("botanist_poi", FBBlocks.BOTANY_TABLE);

    public static final ResourceKey<VillagerProfession> BOTANIST_KEY = ResourceKey.create(Registries.VILLAGER_PROFESSION, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, "botanist"));
    public static final VillagerProfession BOTANIST = registerProfession("botanist", new VillagerProfession(
            Component.literal("Botanist"), holder -> holder.is(BOTANIST_POI_KEY), holder -> holder.is(BOTANIST_POI_KEY),
            ImmutableSet.of(), ImmutableSet.of(), SoundEvents.CAVE_VINES_PICK_BERRIES, Int2ObjectMap.ofEntries(
            Int2ObjectMap.entry(1, FBTradeSets.BOTANIST_LEVEL_1),
            Int2ObjectMap.entry(2, FBTradeSets.BOTANIST_LEVEL_2),
            Int2ObjectMap.entry(3, FBTradeSets.BOTANIST_LEVEL_3),
            Int2ObjectMap.entry(4, FBTradeSets.BOTANIST_LEVEL_4),
            Int2ObjectMap.entry(5, FBTradeSets.BOTANIST_LEVEL_5))));


    private static VillagerProfession registerProfession(String name, VillagerProfession profession) {
        return Registry.register(BuiltInRegistries.VILLAGER_PROFESSION, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, name), profession);
    }


    private static PoiType registerPOI(String name, Block block) {
        return PoiHelper.register(Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, name),
                1, 1, block);
    }

    private static ResourceKey<PoiType> registerPoiKey(String name) {
        return ResourceKey.create(Registries.POINT_OF_INTEREST_TYPE, Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, name));
    }

    public static void registerVillagers() {
        FlowerBreeding.LOGGER.info("Registering Villagers and POIs for " + FlowerBreeding.MOD_ID);
    }
}