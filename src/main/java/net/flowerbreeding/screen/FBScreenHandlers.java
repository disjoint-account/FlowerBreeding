package net.flowerbreeding.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.flowerbreeding.FlowerBreeding;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class FBScreenHandlers {
    public static final ScreenHandlerType<BotanyTableScreenHandler> BOTANY_TABLE_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(FlowerBreeding.MOD_ID, "botany_table_screen_handler"),
                    new ExtendedScreenHandlerType<>(BotanyTableScreenHandler::new, BlockPos.PACKET_CODEC));

    public static void registerScreenHandlers() {
        FlowerBreeding.LOGGER.info("Registering Screen Handlers for " + FlowerBreeding.MOD_ID);
    }
}

