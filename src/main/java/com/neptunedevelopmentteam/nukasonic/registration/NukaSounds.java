package com.neptunedevelopmentteam.nukasonic.registration;

import com.neptunedevelopmentteam.neptunelib.core.datagen.sound.NeptuneSound;
import com.neptunedevelopmentteam.neptunelib.core.registration.NeptuneSoundRegistrationType;
import com.neptunedevelopmentteam.nukasonic.Nukasonic;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class NukaSounds implements NeptuneSoundRegistrationType {
    public static final NeptuneSound STIMPAK_USE_SOUND = new NeptuneSound(Identifier.of(Nukasonic.MOD_ID, "stimpak_use"), Identifier.of(Nukasonic.MOD_ID, "stimpak_use"));
}
