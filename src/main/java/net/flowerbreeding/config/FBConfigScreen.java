package net.flowerbreeding.config;

import net.flowerbreeding.FlowerBreeding;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.GridWidget;
import net.minecraft.client.gui.widget.TextWidget;
import net.minecraft.client.gui.widget.ThreePartsLayoutWidget;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;

public class FBConfigScreen extends Screen {

    private static final int BUTTON_WIDTH = 205;
    private static final int BUTTON_HEIGHT = 20;

    private final Screen parent;

    private boolean modified = false;

    protected FBConfigScreen(Screen parent) {
        super(Text.literal("flowerbreeding.options"));
        this.parent = parent;
    }

    @Override
    protected void init() {
        ThreePartsLayoutWidget layout = new ThreePartsLayoutWidget(this);
        layout.addHeader(new TextWidget(Text.translatable("flowerbreeding.text.optionsTitle"), this.textRenderer));
        GridWidget grid = new GridWidget();
        grid.setRowSpacing(5);
        GridWidget.Adder adder = grid.createAdder(1);
        adder.add(createToggleButton("fastRecolouring", FlowerBreeding.CONFIG.fastRecolouring, b -> {
            setToggleButtonMessage(b, "fastRecolouring", FlowerBreeding.CONFIG.fastRecolouring ^= true);
        }));
        adder.add(createToggleButton("craftableBotanyTables", FlowerBreeding.CONFIG.craftableBotanyTables, b -> {
            setToggleButtonMessage(b, "craftableBotanyTables", FlowerBreeding.CONFIG.craftableBotanyTables ^= true);
        }));
        adder.add(createToggleButton("craftableVialsAndJars", FlowerBreeding.CONFIG.craftableVialsAndJars, b -> {
            setToggleButtonMessage(b, "craftableVialsAndJars", FlowerBreeding.CONFIG.craftableVialsAndJars ^= true);
        }));
        adder.add(createToggleButton("craftableTrowels", FlowerBreeding.CONFIG.craftableTrowels, b -> {
            setToggleButtonMessage(b, "craftableTrowels", FlowerBreeding.CONFIG.craftableTrowels ^= true);
        }));
        layout.addBody(grid);
        layout.addFooter(ButtonWidget.builder(ScreenTexts.DONE, b -> {
            close();
        }).build());
        layout.forEachChild(this::addDrawableChild);
        layout.refreshPositions();
    }

    @Override
    public void close() {
        if (modified) {
            FlowerBreeding.CONFIG.write();
        }
        assert this.client != null;
        this.client.setScreen(this.parent);
    }

    private ButtonWidget createToggleButton(String key, boolean value, ButtonWidget.PressAction action) {
        return ButtonWidget.builder(ScreenTexts.composeToggleText(Text.translatable("flowerbreeding.option." + key), value), action).tooltip(Tooltip.of(Text.translatable("flowerbreeding.tooltip." + key))).size(BUTTON_WIDTH, BUTTON_HEIGHT).build();
    }

    private void setToggleButtonMessage(ButtonWidget button, String key, boolean value) {
        button.setMessage(ScreenTexts.composeToggleText(Text.translatable("flowerbreeding.option." + key), value));
        modified = true;
    }

}