package net.flowerbreeding.config;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.resources.RegistryOps;
import org.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NonNull;

public class CraftableTablesCondition implements ResourceCondition {
    public static final MapCodec<CraftableTablesCondition> CODEC = MapCodec.unit(CraftableTablesCondition::new);

    @Override
    public @NonNull ResourceConditionType<?> getType() {
        return FBResourceConditions.TABLES;
    }

    @Override
    public boolean test(RegistryOps.@Nullable RegistryInfoLookup registryInfoGetter) {
        return FlowerBreeding.CONFIG.craftableBotanyTables;
    }
}