package com.neptunedevelopmentteam.nukasonic.datagen.datagen_providers;

import com.neptunedevelopmentteam.nukasonic.datagen.datagen_providers.sound.NukaSonicCustomSoundBuilder;
import com.neptunedevelopmentteam.nukasonic.datagen.datagen_providers.sound.NukaSonicCustomSoundProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.sound.SoundEvent;

import java.util.HashMap;

public class NukaSonicSoundProvider extends NukaSonicCustomSoundProvider {
    private final FabricDataOutput dataGenerator;

    private final HashMap<String, SoundEvent[]> soundEventList = new HashMap<>();

    public NukaSonicSoundProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
        dataGenerator = dataOutput;
    }

    @Override
    public void generateSoundsData(NukaSonicCustomSoundBuilder nukaSonicCustomSoundBuilder) {
        soundEventList.forEach(nukaSonicCustomSoundBuilder::add);
    }

    public void addSound(String soundName, SoundEvent sound) {
        soundEventList.put(soundName, new SoundEvent[]{sound});
    }

    public void addSound(String soundName, SoundEvent[] soundEvents) {
        soundEventList.put(soundName, soundEvents);
    }
}
