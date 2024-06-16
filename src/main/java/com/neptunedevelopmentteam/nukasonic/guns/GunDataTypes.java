package com.neptunedevelopmentteam.nukasonic.guns;

import com.neptunedevelopmentteam.neptunelib.core.easydata.NeptuneDataRegistry;
import com.neptunedevelopmentteam.neptunelib.core.easydata.NeptuneDataType;
import com.neptunedevelopmentteam.neptunelib.core.init_handlers.NeptuneDataInit;
import com.neptunedevelopmentteam.nukasonic.Nukasonic;
import net.minecraft.util.Identifier;

public class GunDataTypes implements NeptuneDataInit {
    public static final NeptuneDataType<Integer> AMMO_COUNT = NeptuneDataRegistry.create(Identifier.of(Nukasonic.MOD_ID, "ammo_count"), 0);
}
