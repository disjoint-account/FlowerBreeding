package net.flowerbreeding.compat;

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.DisplaySerializerRegistry;
import me.shedaniel.rei.api.common.plugins.REICommonPlugin;
import me.shedaniel.rei.api.common.registry.display.ServerDisplayRegistry;
import net.flowerbreeding.FlowerBreeding;
import net.flowerbreeding.botanytable.BotanyTableRecipe;
import net.minecraft.resources.Identifier;

public class FBREICommon implements REICommonPlugin {

    public static final CategoryIdentifier<BotanyDisplay> BOTANY_CRAFTING = CategoryIdentifier.of(FlowerBreeding.MOD_ID, "botany_crafting");

    @Override
    public void registerDisplaySerializer(DisplaySerializerRegistry registry) {
        REICommonPlugin.super.registerDisplaySerializer(registry);

        registry.register(Identifier.fromNamespaceAndPath(FlowerBreeding.MOD_ID, "botany_serializer"), BotanyDisplay.SERIALIZER);
    }

    @Override
    public void registerDisplays(ServerDisplayRegistry registry) {
        registry.beginRecipeFiller(BotanyTableRecipe.class).fill(BotanyDisplay::new);
    }
}
