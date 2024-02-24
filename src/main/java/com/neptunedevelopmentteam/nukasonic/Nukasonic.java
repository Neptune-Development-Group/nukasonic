package com.neptunedevelopmentteam.nukasonic;

import com.neptunedevelopmentteam.neptunelib.core.init_handlers.NeptuneInitHandler;
import com.neptunedevelopmentteam.nukasonic.registration.NukaItems;
import net.fabricmc.api.ModInitializer;

import java.util.logging.Logger;

public class Nukasonic implements ModInitializer {
    public static final String MOD_ID = "nukasonic";
    public static final Logger LOGGER = Logger.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        NeptuneInitHandler.register(NukaItems.class, MOD_ID);
    }
}
