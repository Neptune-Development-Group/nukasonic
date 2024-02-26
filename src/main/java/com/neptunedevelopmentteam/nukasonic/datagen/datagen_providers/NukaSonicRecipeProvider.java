package com.neptunedevelopmentteam.nukasonic.datagen.datagen_providers;

import com.neptunedevelopmentteam.nukasonic.registration.NukaItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

public class NukaSonicRecipeProvider extends FabricRecipeProvider {
    public List<ShapelessRecipeJsonBuilder> shapelessRecipes = new ArrayList<>();
    public List<ShapedRecipeJsonBuilder> shapedRecipes = new ArrayList<>();
    public HashMap<SmithingTransformRecipeJsonBuilder, Identifier> smithingTransformRecipes = new HashMap<>();
    public HashMap<ShapelessRecipeJsonBuilder, Identifier> shapelessRecipesWithNameHashMap = new HashMap<>();

    public NukaSonicRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        for (ShapelessRecipeJsonBuilder shapelessRecipeJsonBuilder : shapelessRecipes) {
            shapelessRecipeJsonBuilder.offerTo(exporter);
        }
        for (ShapedRecipeJsonBuilder shapedRecipeJsonBuilder : shapedRecipes) {
            shapedRecipeJsonBuilder.offerTo(exporter);
        }
        shapelessRecipesWithNameHashMap.forEach((shapelessRecipeJsonBuilder, identifier) -> {
            shapelessRecipeJsonBuilder.offerTo(exporter, identifier);
        });
        smithingTransformRecipes.forEach((smithingTransformRecipeJsonBuilder, identifier) -> {
            smithingTransformRecipeJsonBuilder.offerTo(exporter, identifier);
        });

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, NukaItems.STIMPAK)
                .pattern("IBI").pattern("IGI").pattern(" S ")
                .input('I', Items.IRON_NUGGET).input('B', Items.GLASS_BOTTLE).input('B', ItemTags.BUTTONS).input('S', NukaItems.SYRINGE)
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(Items.GLASS_BOTTLE))
                .criterion(hasItem(NukaItems.SYRINGE), conditionsFromItem(NukaItems.SYRINGE))
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(NukaItems.STIMPAK)));
    }

    public void addShapelessRecipe(ShapelessRecipeJsonBuilder builder) {
        if (!shapelessRecipes.contains(builder)) {
            shapelessRecipes.add(builder);
        }
    }

    public void addShapelessRecipeWithCustomname(ShapelessRecipeJsonBuilder builder, Identifier id) {
        shapelessRecipesWithNameHashMap.put(builder, id);
    }

    public void addSmithingTransformRecipe(SmithingTransformRecipeJsonBuilder builder, Identifier id) {
        smithingTransformRecipes.put(builder, id);
    }

    public void addShapedRecipe(ShapedRecipeJsonBuilder builder) {
        if (!shapedRecipes.contains(builder)) {
            shapedRecipes.add(builder);
        }
    }
}
