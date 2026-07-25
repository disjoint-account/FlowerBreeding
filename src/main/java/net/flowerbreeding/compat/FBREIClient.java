package net.flowerbreeding.compat;

import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.botanytable.BotanyTableScreen;

public class FBREIClient implements REIClientPlugin {
    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new BotanyCategory());

        registry.addWorkstations(FBREICommon.BOTANY_CRAFTING, EntryStacks.of(FBBlocks.BOTANY_TABLE));
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(((screen.width - 176) / 2) + 78,
                        ((screen.height - 166) / 2) + 30, 20, 25),
                BotanyTableScreen.class, FBREICommon.BOTANY_CRAFTING);
    }
}
