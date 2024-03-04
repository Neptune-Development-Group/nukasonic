package com.neptunedevelopmentteam.nukasonic.registration;

import com.neptunedevelopmentteam.neptunelib.core.blocksettings.NeptuneBlockSettings;
import com.neptunedevelopmentteam.neptunelib.core.init_handlers.NeptuneBlockInit;
import com.neptunedevelopmentteam.neptunelib.core.itemsettings.NeptuneItemSettings;
import com.neptunedevelopmentteam.nukasonic.Nukasonic;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;


public class NukaBlocks implements NeptuneBlockInit {

    public static final Block URANIUM_ORE = new Block(NeptuneBlockSettings.create().addItemSettings(new NeptuneItemSettings().group(() -> Nukasonic.NUKASONIC_ITEMS)));

}
