package net.flowerbreeding.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BotanyTableScreen extends HandledScreen<BotanyTableScreenHandler> {
    private static final Identifier GUI_TEXTURE =
            Identifier.of(FlowerBreeding.MOD_ID, "textures/gui/botany_table/botany_table_gui.png");

    public BotanyTableScreen(BotanyTableScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();

        titleX = 56;
        titleY = 6;
        playerInventoryTitleY = 72;
    }

    @Override
    public void handledScreenTick() {
        super.handledScreenTick();
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, GUI_TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;

        context.drawTexture(GUI_TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
}