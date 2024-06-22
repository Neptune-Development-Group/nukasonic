package com.neptunedevelopmentteam.nukasonic.registration;

import com.neptunedevelopmentteam.neptunelib.core.blocksettings.NeptuneBlockSettings;
import com.neptunedevelopmentteam.neptunelib.core.itemsettings.NeptuneItemSettings;
import com.neptunedevelopmentteam.neptunelib.core.registration.NeptuneBlockRegistrationType;
import com.neptunedevelopmentteam.nukasonic.Nukasonic;
import net.minecraft.block.Block;


public class NukaBlocks implements NeptuneBlockRegistrationType {
    public static final Block URANIUM_ORE = new Block(NeptuneBlockSettings.create().addItemSettings(new NeptuneItemSettings().group(() -> Nukasonic.NUKASONIC_ITEMS)).hardness(3).getSettings());
}
