package com.neptunedevelopmentteam.nukasonic.registration;

import com.neptunedevelopmentteam.neptunelib.core.datagen.sound.NeptuneSound;
import com.neptunedevelopmentteam.neptunelib.core.init_handlers.NeptuneSoundEventInit;
import com.neptunedevelopmentteam.nukasonic.Nukasonic;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class NukaSounds implements NeptuneSoundEventInit {
    public static final NeptuneSound STIMPAK_USE_SOUND = new NeptuneSound(Identifier.of(Nukasonic.MOD_ID, "stimpak_use"), Identifier.of(Nukasonic.MOD_ID, "stimpak_use"));
}
