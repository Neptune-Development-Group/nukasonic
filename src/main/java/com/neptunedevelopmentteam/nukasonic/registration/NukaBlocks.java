package com.neptunedevelopmentteam.nukasonic.registration;

import com.neptunedevelopmentteam.neptunelib.core.blocksettings.NeptuneBlockSettings;
import com.neptunedevelopmentteam.neptunelib.core.init_handlers.NeptuneBlockInit;
import net.minecraft.block.Block;


public class NukaBlocks implements NeptuneBlockInit {

    public static final Block URANIUM = new Block(NeptuneBlockSettings.create());
    public static final Block BEANS = new Block(NeptuneBlockSettings.create());

}
