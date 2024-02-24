package com.neptunedevelopmentteam.nukasonic.datagen.datagen_providers.sound;

import net.minecraft.sound.SoundEvent;

@FunctionalInterface
public interface NukaSonicCustomSoundBuilder {
    void add(String soundName, SoundEvent[] soundEvents);

    default void add(String soundName, SoundEvent soundEvent) {
        add(soundName, new SoundEvent[]{soundEvent});
    }
}
