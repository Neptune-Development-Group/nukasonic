package com.neptunedevelopmentteam.nukasonic.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
        if (user.getHealth() >= 20) {
            return TypedActionResult.fail(itemStack);
        }
        else {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 2));
            return TypedActionResult.consume(itemStack);
        }

    }

}
