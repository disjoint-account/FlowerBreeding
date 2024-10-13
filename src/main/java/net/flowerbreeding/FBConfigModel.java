package net.flowerbreeding;

import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;

@Modmenu(modId = "flowerbreeding")
@Config(name = "flowerbreeding-config", wrapperName = "FBConfig")
public class FBConfigModel {
    public boolean fastRecolouring = true;
}