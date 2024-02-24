package com.neptunedevelopmentteam.nukasonic.registration;

import com.neptunedevelopmentteam.neptunelib.core.blocksettings.NeptuneBlockSettings;
import com.neptunedevelopmentteam.neptunelib.core.init_handlers.NeptuneBlockInit;
import com.neptunedevelopmentteam.neptunelib.core.itemsettings.NeptuneItemSettings;
import com.neptunedevelopmentteam.nukasonic.Nukasonic;
import com.neptunedevelopmentteam.nukasonic.blocks.ClockBlock;
import net.minecraft.block.Block;

public class NukaBlocks implements NeptuneBlockInit {
    public static final Block CLOCK = new ClockBlock(NeptuneBlockSettings.create()
            .solidBlock(null)
            .addItemSettings(new NeptuneItemSettings().group(() -> Nukasonic.NUKASONIC_ITEMS)));
}