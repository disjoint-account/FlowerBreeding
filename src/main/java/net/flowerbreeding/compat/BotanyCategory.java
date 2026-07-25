package net.flowerbreeding.compat;

import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.Display;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.flowerbreeding.FBBlocks;
import net.minecraft.network.chat.Component;

import java.util.LinkedList;
import java.util.List;

public class BotanyCategory implements DisplayCategory<Display> {
    @Override
    public CategoryIdentifier<? extends Display> getCategoryIdentifier() {
        return FBREICommon.BOTANY_CRAFTING;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Botany");
    }

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(FBBlocks.BOTANY_TABLE.asItem().getDefaultInstance());
    }

    @Override
    public List<Widget> setupDisplay(Display display, Rectangle bounds) {
        Point startPoint = new Point(bounds.getCenterX() - 87, bounds.getCenterY() - 62);
        List<Widget> widgets = new LinkedList<>();

        var ingredients = display.getInputEntries();

        int workingX = startPoint.x + 54;
        int y = startPoint.y + 47;

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 4, y))
                .entries(display.getInputEntries().getFirst()).markInput());

        int otherItemsCount = ingredients.size() - 1;

        for (int i = 0; i < otherItemsCount; i++) {
            widgets.add(Widgets.createSlot(new Point(workingX, y))
                    .entries(display.getInputEntries().get(i + 1)).markInput());

            workingX += 50;
        }
        widgets.add(Widgets.createSlot(new Point(workingX, y))
                .entries(display.getOutputEntries().getFirst()).markOutput());

        widgets.add(Widgets.createArrow(new Point(startPoint.x + 125, y)));

        return widgets;
    }
}
