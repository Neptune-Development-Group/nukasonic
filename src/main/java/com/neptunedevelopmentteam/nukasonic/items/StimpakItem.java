package com.neptunedevelopmentteam.nukasonic.items;

import com.neptunedevelopmentteam.nukasonic.datagen.datagen_providers.NukaSonicSoundProvider;
import com.neptunedevelopmentteam.nukasonic.datagen.datagen_providers.sound.NukaSonicCustomSoundProvider;
import com.neptunedevelopmentteam.nukasonic.registration.NukaSounds;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class StimpakItem extends Item {
    public StimpakItem(Settings settings) {
        super(settings);
    }

    public TypedActionResult use(World world, PlayerEntity user, Hand hand) {

        //TODO: Add a slight glow to the edge of the screen to indicate using a stimpak

        ItemStack itemStack = user.getStackInHand(hand);
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 2));
        itemStack.decrement(1);
        user.getWorld().playSound(null, user.getBlockPos(), NukaSounds.STIMPAK_USE_SOUND, SoundCategory.PLAYERS, 1f, 1f);
        return TypedActionResult.consume(itemStack);
    }
}
