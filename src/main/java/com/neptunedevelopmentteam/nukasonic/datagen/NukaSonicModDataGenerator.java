package com.neptunedevelopmentteam.nukasonic.datagen;

import com.neptunedevelopmentteam.nukasonic.Nukasonic;
import com.neptunedevelopmentteam.nukasonic.datagen.datagen_providers.*;
import com.neptunedevelopmentteam.nukasonic.registration.NukaBlocks;
import com.neptunedevelopmentteam.nukasonic.registration.NukaItems;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class NukaSonicModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        System.out.println("Running datagen for " + Nukasonic.MOD_ID);
        generateLanguages(pack);
        generateItemTags(pack);
        generateRecipes(pack);
        generateBlockModels(pack);
        generateSoundData(pack);
        generateAdvancements(pack);
        generateLoot(pack);
        generateWorldGen(pack);
    }

    public void generateLoot(FabricDataGenerator.Pack pack) {
    }

    private void generateAdvancements(FabricDataGenerator.Pack pack) {
    }

    public void generateRecipes(FabricDataGenerator.Pack pack) {
        pack.addProvider((((output, registriesFuture) -> {
            NukaSonicRecipeProvider provider = new NukaSonicRecipeProvider(output);
            generateSmithingRecipes(provider);
            return provider;
        })));
    }

    public void generateSmithingRecipes(NukaSonicRecipeProvider provider) {
    }

    public void generateSoundData(FabricDataGenerator.Pack pack) {
        pack.addProvider((((output, registriesFuture) -> {
            NukaSonicSoundProvider provider = new NukaSonicSoundProvider(output);
            return provider;
        })));
    }

    public void generateItemTags(FabricDataGenerator.Pack pack) {
    }

    public void generateBlockModels(FabricDataGenerator.Pack pack) {
        pack.addProvider(((output, registriesFuture) -> {
            NukaSonicModelProvider aitModelProvider = new NukaSonicModelProvider(output);
            return aitModelProvider;
        }));
    }

    public void generateWorldGen(FabricDataGenerator.Pack pack) {
        pack.addProvider(((output, registriesFuture) -> {
            NukaSonicWorldGenProvider aitWorldGenProvider = new NukaSonicWorldGenProvider(output, registriesFuture);
            return aitWorldGenProvider;
        }));
    }

    public void generateLanguages(FabricDataGenerator.Pack pack) {
        generate_EN_US_Language(pack); // en_us (English US)
        generate_EN_UK_Language(pack); // en_uk (English UK)
        generate_EN_AU_Language(pack); // en_au (English Australia)
        generate_EN_CA_Language(pack); // en_ca (English Canada)
        generate_EN_GB_Language(pack); // en_gb (English Great Britain)
        generate_EN_NZ_Language(pack); // en_nz (English New Zealand)
    }

    /**
     * Adds English translations to the language file.
     *
     * @param output           The data generator output.
     * @param registriesFuture The registries future.
     * @param languageType     The language type.
     * @return The AITLanguageProvider.
     */
    public NukaSonicLanguageProvider addEnglishTranslations(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture, LanguageType languageType) {
        NukaSonicLanguageProvider provider = new NukaSonicLanguageProvider(output, languageType);
        provider.addTranslation(Nukasonic.NUKASONIC_ITEMS, "Nukasonic");
        provider.addTranslation(NukaItems.PIPBOY, "Pipboy");
        provider.addTranslation(NukaItems.STIMPAK, "Stimpak");
        provider.addTranslation(NukaItems.SYRINGE, "Syringe");
        provider.addTranslation(NukaBlocks.URANIUM_ORE, "Uranium Ore");
        provider.addTranslation(NukaItems.URANIUM_CHUNK, "Uranium Chunk");
        provider.addTranslation("trinkets.slot.hand.sleeve", "Sleeve");
        provider.addTranslation("trinkets.slot.offhand.sleeve", "Offhand Sleeve");
        return provider;
    }

    public void generate_EN_US_Language(FabricDataGenerator.Pack pack) {
        pack.addProvider(((output, registriesFuture) -> addEnglishTranslations(output, registriesFuture, LanguageType.EN_US))); // en_us (English US)
    }

    public void generate_EN_UK_Language(FabricDataGenerator.Pack pack) {
        pack.addProvider(((output, registriesFuture) -> addEnglishTranslations(output, registriesFuture, LanguageType.EN_UK))); // en_uk (English UK)
    }

    public void generate_EN_AU_Language(FabricDataGenerator.Pack pack) {
        pack.addProvider(((output, registriesFuture) -> addEnglishTranslations(output, registriesFuture, LanguageType.EN_AU))); // en_au (English Australia)
    }

    public void generate_EN_CA_Language(FabricDataGenerator.Pack pack) {
        pack.addProvider(((output, registriesFuture) -> addEnglishTranslations(output, registriesFuture, LanguageType.EN_CA))); // en_ca (English Canada)
    }

    public void generate_EN_GB_Language(FabricDataGenerator.Pack pack) {
        pack.addProvider(((output, registriesFuture) -> addEnglishTranslations(output, registriesFuture, LanguageType.EN_GB))); // en_gb (English Great Britain)
    }

    public void generate_EN_NZ_Language(FabricDataGenerator.Pack pack) {
        pack.addProvider(((output, registriesFuture) -> addEnglishTranslations(output, registriesFuture, LanguageType.EN_NZ))); // en_nz (English New Zealand)
    }
}
