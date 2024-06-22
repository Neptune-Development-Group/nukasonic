package com.neptunedevelopmentteam.nukasonic;

import com.neptunedevelopmentteam.neptunelib.core.easydata.NeptuneDataRegistry;
import com.neptunedevelopmentteam.neptunelib.core.easydata.NeptuneDataType;
import com.neptunedevelopmentteam.neptunelib.core.itemgroup.NeptuneItemGroup;
import com.neptunedevelopmentteam.neptunelib.core.registration.NeptuneItemRegistrationType;
import com.neptunedevelopmentteam.neptunelib.core.registration.NeptuneRegistrationManager;
import com.neptunedevelopmentteam.nukasonic.guns.GunDataTypes;
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

    public static final NeptuneItemGroup NUKASONIC_ITEMS = new NeptuneItemGroup(Identifier.of(MOD_ID, "nukasonic_items"), new ItemStack(NukaItems.PIPBOY));

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Nukasonic");
        NeptuneRegistrationManager.setup(MOD_ID, NukaItems.class, NukaBlocks.class, NukaSounds.class, NukaOres.class, GunDataTypes.class);
        NUKASONIC_ITEMS.initialize();
    }
}
