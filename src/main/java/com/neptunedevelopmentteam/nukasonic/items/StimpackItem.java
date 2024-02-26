package com.neptunedevelopmentteam.nukasonic.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class StimpackItem extends Item {
    public StimpackItem(Settings settings) {
        super(settings);
    }

    public TypedActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        if (user.getHealth() >= 20) {
            return TypedActionResult.fail(itemStack);
        }
        else {

            return TypedActionResult.consume(itemStack);
        }

    }

}
