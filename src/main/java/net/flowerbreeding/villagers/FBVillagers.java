package net.flowerbreeding.villagers;

import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import com.google.common.collect.ImmutableSet;

public class FBVillagers {
    public static final RegistryKey<PointOfInterestType> BOTANIST_POI_KEY = registerPoiKey("botanist_poi");
    public static final PointOfInterestType BOTANIST_POI = registerPOI("botanist_poi", FBBlocks.BOTANY_TABLE);
    public static final RegistryKey<VillagerProfession> BOTANIST_KEY = RegistryKey.of(RegistryKeys.VILLAGER_PROFESSION, Identifier.of(FlowerBreeding.MOD_ID, "botanist"));
    public static final VillagerProfession BOTANIST = registerProfession(BOTANIST_KEY, BOTANIST_POI_KEY, SoundEvents.BLOCK_CAVE_VINES_PICK_BERRIES);


    private static VillagerProfession registerProfession(RegistryKey<VillagerProfession> key, RegistryKey<PointOfInterestType> poi, SoundEvent sound) {
        var profession = new VillagerProfession(
                Text.translatable("entity." + key.getValue().getNamespace() + ".villager." + key.getValue().getPath()),
                entry -> entry.matchesKey(poi),
                entry -> entry.matchesKey(poi),
                ImmutableSet.of(),
                ImmutableSet.of(),
                sound
        );
        return Registry.register(Registries.VILLAGER_PROFESSION, key.getValue(), profession);
    }


    private static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(Identifier.of(FlowerBreeding.MOD_ID, name),
                1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> registerPoiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, Identifier.of(FlowerBreeding.MOD_ID, name));
    }

    public static void registerVillagers() {
        FlowerBreeding.LOGGER.info("Registering Villagers for " + FlowerBreeding.MOD_ID);
    }
}