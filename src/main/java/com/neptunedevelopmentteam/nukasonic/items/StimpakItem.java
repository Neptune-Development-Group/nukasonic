package com.neptunedevelopmentteam.nukasonic.items;

import com.neptunedevelopmentteam.nukasonic.registration.NukaSounds;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class StimpakItem extends Item {
    public StimpakItem(net.minecraft.item.Item.Settings settings) {
        super(settings);
    }


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 2));
        itemStack.decrement(1);
        user.getWorld().playSound(null, user.getBlockPos(), NukaSounds.STIMPAK_USE_SOUND.getSoundEvent(), SoundCategory.PLAYERS, 1f, 1f);
        return TypedActionResult.consume(itemStack);
    }
}
