package com.neptunedevelopmentteam.nukasonic.registration;

import com.neptunedevelopmentteam.neptunelib.core.init_handlers.NeptuneSoundEventInit;
import com.neptunedevelopmentteam.nukasonic.Nukasonic;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class NukaSounds implements NeptuneSoundEventInit {
    public static final SoundEvent STIMPACK_USE_SOUND = SoundEvent.of(new Identifier(Nukasonic.MOD_ID, "stimpack_use"));
}
