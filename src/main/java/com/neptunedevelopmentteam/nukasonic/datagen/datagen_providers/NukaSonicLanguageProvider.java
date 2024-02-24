package com.neptunedevelopmentteam.nukasonic.datagen.datagen_providers;

import com.neptunedevelopmentteam.neptunelib.core.itemgroup.NeptuneItemGroup;
import com.neptunedevelopmentteam.nukasonic.Nukasonic;
import com.neptunedevelopmentteam.nukasonic.datagen.LanguageType;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.HashMap;

public class NukaSonicLanguageProvider extends FabricLanguageProvider {

    public HashMap<String, String> translations = new HashMap<>();

    public LanguageType languageType;
    private final FabricDataOutput dataGenerator;

    public NukaSonicLanguageProvider(FabricDataOutput dataOutput, LanguageType languageType) {
        super(dataOutput, languageType.name().toLowerCase());
        this.languageType = languageType;
        this.dataGenerator = dataOutput;
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        for (String key : translations.keySet()) {
            translationBuilder.add(key, translations.get(key));
        }

        dataGenerator.getModContainer().findPath("assets/" + Nukasonic.MOD_ID + "/lang/" + languageType.name().toLowerCase() + ".existing.json").ifPresent(existingFilePath -> {
            try {
                translationBuilder.add(existingFilePath);
            } catch (Exception e) {
                LOGGER.warn("Failed to add existing language file! " + "(" + languageType.name().toLowerCase() + ") | ", e);
            }
        });
    }

    /**
     * Adds a translation to the language file.
     *
     * @param item        The item to add the translation for.
     * @param translation The translation.
     */
    public void addTranslation(Item item, String translation) {
        translations.put(item.getTranslationKey(), translation);
    }

    /**
     * Adds a translation to the language file.
     *
     * @param itemGroup   The item group to add the translation for.
     * @param translation The translation.
     */
    public void addTranslation(NeptuneItemGroup itemGroup, String translation) {
        translations.put(getTranslationKeyForNeptuneItemGroup(itemGroup), translation);
    }

    /**
     * Adds a translation to the language file.
     *
     * @param key         The key to add the translation for.
     * @param translation The translation.
     */
    public void addTranslation(String key, String translation) {
        translations.put(key, translation);
    }

    /**
     * Adds a translation to the language file
     *
     * @param block       The block to add the translation for
     * @param translation The translation
     */
    public void addTranslation(Block block, String translation) {
        translations.put(block.getTranslationKey(), translation);
    }

    /**
     * Get the translation key for the OwoItemGroup
     *
     * @param itemGroup The item group to get the translation key for
     * @return The translation key for the item group
     */

    private String getTranslationKeyForNeptuneItemGroup(NeptuneItemGroup itemGroup) {
        return itemGroup.getTranslationKey();
    }

}
