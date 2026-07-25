package net.flowerbreeding.config;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.resources.RegistryOps;
import org.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NonNull;

public class CraftableJarsAndVialsCondition implements ResourceCondition {
    public static final MapCodec<CraftableJarsAndVialsCondition> CODEC = MapCodec.unit(CraftableJarsAndVialsCondition::new);

    @Override
    public @NonNull ResourceConditionType<?> getType() {
        return FBResourceConditions.JARS_AND_VIALS;
    }

    @Override
    public boolean test(RegistryOps.@Nullable RegistryInfoLookup registryInfoGetter) {
        return FlowerBreeding.CONFIG.craftableVialsAndJars;
    }
}