package net.flowerbreeding.config;

import net.flowerbreeding.FlowerBreeding;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.layouts.GridLayout;
import net.minecraft.client.gui.components.StringWidget;
import net.minecraft.client.gui.layouts.HeaderAndFooterLayout;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;

public class FBConfigScreen extends Screen {

    private static final int BUTTON_WIDTH = 205;
    private static final int BUTTON_HEIGHT = 20;

    private final Screen parent;

    private boolean modified = false;

    protected FBConfigScreen(Screen parent) {
        super(Component.literal("flowerbreeding.options"));
        this.parent = parent;
    }

    @Override
    protected void init() {
        HeaderAndFooterLayout layout = new HeaderAndFooterLayout(this);
        layout.addToHeader(new StringWidget(Component.translatable("flowerbreeding.text.optionsTitle"), this.font));
        GridLayout grid = new GridLayout();
        grid.rowSpacing(5);
        GridLayout.RowHelper adder = grid.createRowHelper(1);
        adder.addChild(createToggleButton("fastRecolouring", FlowerBreeding.CONFIG.fastRecolouring, b -> setToggleButtonMessage(b, "fastRecolouring", FlowerBreeding.CONFIG.fastRecolouring ^= true)));
        adder.addChild(createToggleButton("craftableBotanyTables", FlowerBreeding.CONFIG.craftableBotanyTables, b -> setToggleButtonMessage(b, "craftableBotanyTables", FlowerBreeding.CONFIG.craftableBotanyTables ^= true)));
        adder.addChild(createToggleButton("craftableVialsAndJars", FlowerBreeding.CONFIG.craftableVialsAndJars, b -> setToggleButtonMessage(b, "craftableVialsAndJars", FlowerBreeding.CONFIG.craftableVialsAndJars ^= true)));
        adder.addChild(createToggleButton("craftableTrowels", FlowerBreeding.CONFIG.craftableTrowels, b -> {
            setToggleButtonMessage(b, "craftableTrowels", FlowerBreeding.CONFIG.craftableTrowels ^= true);
        }));
        layout.addToContents(grid);
        layout.addToFooter(Button.builder(CommonComponents.GUI_DONE, b -> onClose()).build());
        layout.visitWidgets(this::addRenderableWidget);
        layout.arrangeElements();
    }

    @Override
    public void onClose() {
        if (modified) {
            FlowerBreeding.CONFIG.write();
        }
        this.minecraft.setScreenAndShow(this.parent);
    }

    private Button createToggleButton(String key, boolean value, Button.OnPress action) {
        return Button.builder(CommonComponents.optionStatus(Component.translatable("flowerbreeding.option." + key), value), action).tooltip(Tooltip.create(Component.translatable("flowerbreeding.tooltip." + key))).size(BUTTON_WIDTH, BUTTON_HEIGHT).build();
    }

    private void setToggleButtonMessage(Button button, String key, boolean value) {
        button.setMessage(CommonComponents.optionStatus(Component.translatable("flowerbreeding.option." + key), value));
        modified = true;
    }

}