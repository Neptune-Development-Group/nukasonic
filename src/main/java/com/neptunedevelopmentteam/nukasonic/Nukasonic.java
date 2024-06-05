package com.neptunedevelopmentteam.nukasonic;

import com.neptunedevelopmentteam.neptunelib.core.easydata.NeptuneDataRegistry;
import com.neptunedevelopmentteam.neptunelib.core.easydata.NeptuneDataType;
import com.neptunedevelopmentteam.neptunelib.core.init_handlers.NeptuneInitHandler;
import com.neptunedevelopmentteam.neptunelib.core.itemgroup.NeptuneItemGroup;
import com.neptunedevelopmentteam.nukasonic.registration.NukaBlocks;
import com.neptunedevelopmentteam.nukasonic.registration.NukaItems;
import com.neptunedevelopmentteam.nukasonic.registration.NukaOres;
import com.neptunedevelopmentteam.nukasonic.registration.NukaSounds;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Nukasonic implements ModInitializer {
    public static final String MOD_ID = "nukasonic";
    public static final Logger LOGGER = Logger.getLogger(MOD_ID);

    public static final NeptuneDataType<Integer> AMMO_COUNT = NeptuneDataRegistry.register(new Identifier(Nukasonic.MOD_ID, "ammo_count"), 0);
    public static final NeptuneItemGroup NUKASONIC_ITEMS = new NeptuneItemGroup(new Identifier(MOD_ID, "nukasonic_items"), new ItemStack(NukaItems.PIPBOY));

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Nukasonic");
        NeptuneInitHandler.register(NukaItems.class, MOD_ID);
        NeptuneInitHandler.register(NukaBlocks.class, MOD_ID);
        NeptuneInitHandler.register(NukaSounds.class, MOD_ID);
        NeptuneInitHandler.registerCustom(NukaOres.class, MOD_ID);
        NUKASONIC_ITEMS.initialize();
    }
}
