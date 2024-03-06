package com.neptunedevelopmentteam.nukasonic.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class BlueMentatsItem extends Item {
    public BlueMentatsItem(Settings settings) {
        super(settings);
    }
    public TypedActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        //user.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 6000, 1));
        return TypedActionResult.success(itemStack);
    }
}
