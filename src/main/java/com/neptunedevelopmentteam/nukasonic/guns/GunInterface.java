package com.neptunedevelopmentteam.nukasonic.guns;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public interface GunInterface {

    void onFire(World world, PlayerEntity player, Hand hand, GunItem gunItem);
    void setMagazine(GunMagazine magazine);
    GunMagazine getMagazine();
}
