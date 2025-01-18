package net.flowerbreeding.conditions;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.registry.RegistryOps;
import org.jetbrains.annotations.Nullable;

public class CraftableJarsAndVialsCondition implements ResourceCondition {
    public static final MapCodec<CraftableJarsAndVialsCondition> CODEC = MapCodec.unit(CraftableJarsAndVialsCondition::new);

    @Override
    public ResourceConditionType<?> getType() {
        return FBResourceConditions.JARS_AND_VIALS;
    }

    @Override
    public boolean test(RegistryOps.@Nullable RegistryInfoGetter registryInfoGetter) {
        return FlowerBreeding.CONFIG.craftableJarsAndVials();
    }
}