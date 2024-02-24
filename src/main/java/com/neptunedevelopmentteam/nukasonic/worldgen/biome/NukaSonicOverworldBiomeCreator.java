package com.neptunedevelopmentteam.nukasonic.worldgen.biome;

import net.minecraft.world.biome.*;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

public class NukaSonicOverworldBiomeCreator {

    private static final Biome WASTELAND = createWasteland();

    private static Biome createWasteland() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100, false);

        GenerationSettings.Builder genSettings = new GenerationSettings.Builder();

        return (new Biome.Builder())
                .precipitation(true)
                .temperature(0.8F)
                .downfall(0.4F)
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x3f76e4)
                        .waterFogColor(0x050533)
                        .fogColor(0xc0d8ff)
                        .skyColor(0x77adff)
                        .build())
                .spawnSettings(spawnSettings.build())
                .generationSettings(genSettings.build())
                .build();

    }
}
