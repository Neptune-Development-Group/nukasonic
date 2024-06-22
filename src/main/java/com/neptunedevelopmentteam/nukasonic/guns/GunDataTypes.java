package com.neptunedevelopmentteam.nukasonic.guns;

import com.neptunedevelopmentteam.neptunelib.core.easydata.NeptuneDataRegistry;
import com.neptunedevelopmentteam.neptunelib.core.easydata.NeptuneDataType;
import com.neptunedevelopmentteam.neptunelib.core.registration.NeptuneDataRegistrationType;
import com.neptunedevelopmentteam.nukasonic.Nukasonic;
import net.minecraft.util.Identifier;

public class GunDataTypes implements NeptuneDataRegistrationType {
    public static final NeptuneDataType<Integer> AMMO_COUNT = NeptuneDataRegistry.create(Identifier.of(Nukasonic.MOD_ID, "ammo_count"), 0);
}
