package com.neptunedevelopmentteam.nukasonic;

import com.neptunedevelopmentteam.neptunelib.core.datagen.NeptuneDataGenerator;
import com.neptunedevelopmentteam.neptunelib.core.datagen.recipe.NeptuneRecipe;
import com.neptunedevelopmentteam.neptunelib.core.datagen.recipe.RecipeInput;
import com.neptunedevelopmentteam.neptunelib.core.datagen.recipe.RecipeOutput;
import com.neptunedevelopmentteam.neptunelib.core.datagen.recipe.RecipeRow;
import com.neptunedevelopmentteam.neptunelib.core.datagen.translation.NeptuneLanguages;
import com.neptunedevelopmentteam.neptunelib.core.datagen.translation.NeptuneTranslation;
import com.neptunedevelopmentteam.nukasonic.registration.NukaBlocks;
import com.neptunedevelopmentteam.nukasonic.registration.NukaItems;
import com.neptunedevelopmentteam.nukasonic.registration.NukaSounds;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.HashMap;

public class NukasonicDataGenerator extends NeptuneDataGenerator {
    @Override
    public String getModId() {
        return Nukasonic.MOD_ID;
    }

    @Override
    public void onInit() {
        handleRecipes();
        handleSounds();
        handleTranslations();
    }

    public void handleRecipes() {
        RecipeInput recipeInput = RecipeInput.createShapedRecipe(RecipeRow.create(Items.IRON_NUGGET, Items.GLASS_BOTTLE, Items.IRON_NUGGET),
                RecipeRow.create(Items.IRON_NUGGET, Items.GLASS_BOTTLE, Items.IRON_NUGGET),
                RecipeRow.create(null, NukaItems.SYRINGE, null));
        NeptuneRecipe recipe = new NeptuneRecipe(RecipeCategory.COMBAT, recipeInput, new RecipeOutput(NukaItems.STIMPAK, 1));
        this.addRecipe(recipe);


    }

    public void handleSounds() {
        this.addSound(NukaSounds.STIMPAK_USE_SOUND);
    }

    public void handleTranslations() {
        NeptuneTranslation english_translation = new NeptuneTranslation(NeptuneLanguages.English, "Nukasonic");
        this.addTranslation(Nukasonic.NUKASONIC_ITEMS, english_translation);

        english_translation = new NeptuneTranslation(NeptuneLanguages.English, "Pipboy");
        this.addTranslation(NukaItems.PIPBOY, english_translation);

        english_translation = new NeptuneTranslation(NeptuneLanguages.English, "Stimpak");
        this.addTranslation(NukaItems.STIMPAK, english_translation);

        english_translation = new NeptuneTranslation(NeptuneLanguages.English, "Syringe");
        this.addTranslation(NukaItems.SYRINGE, english_translation);

        english_translation = new NeptuneTranslation(NeptuneLanguages.English, "Uranium Ore");
        this.addTranslation(NukaBlocks.URANIUM_ORE, english_translation);

        english_translation = new NeptuneTranslation(NeptuneLanguages.English, "Uranium Chunk");
        this.addTranslation(NukaItems.URANIUM_CHUNK, english_translation);

        english_translation = new NeptuneTranslation(NeptuneLanguages.English, "Stimpak Use");
        this.addTranslation(NukaSounds.STIMPAK_USE_SOUND, english_translation);

        english_translation = new NeptuneTranslation(NeptuneLanguages.English, "10mm Gun");
        this.addTranslation(NukaItems.TEN_MM_GUN, english_translation);

        english_translation = new NeptuneTranslation(NeptuneLanguages.English, "Ammo: %d / %d");
        this.addTranslation("nukasonic.item.tooltip.ammo", english_translation);
    }
}
