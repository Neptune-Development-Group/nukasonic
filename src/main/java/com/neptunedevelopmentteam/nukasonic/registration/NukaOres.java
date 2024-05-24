package com.neptunedevelopmentteam.nukasonic.registration;

import com.neptunedevelopmentteam.neptunelib.core.datagen.worldgen.NeptuneOre;
import com.neptunedevelopmentteam.neptunelib.core.init_handlers.NeptuneOreInit;
import com.neptunedevelopmentteam.nukasonic.Nukasonic;
import net.minecraft.util.Identifier;

public class NukaOres implements NeptuneOreInit {
    public static final NeptuneOre URANIUM_ORE = NeptuneOre.createStoneOverworldOre(
            new Identifier(Nukasonic.MOD_ID, "uranium_ore"),
            NukaBlocks.URANIUM_ORE,
            50,
            -50,
            3,
            2,
            0.35f
    );

    public static final NeptuneOre DEEPSLATE_URANIUM_ORE = NeptuneOre.createDeepslateOverworldOre(
            new Identifier(Nukasonic.MOD_ID, "deepslate_uranium_ore"),
            NukaBlocks.URANIUM_ORE, // Add a deepslate variant here
            50,
            -50,
            7,
            5,
            0.5f
    );
}
