package com.neptunedevelopmentteam.nukasonic.items.guns.tenmm;

import com.neptunedevelopmentteam.neptunelib.core.itemsettings.NeptuneItemSettings;
import com.neptunedevelopmentteam.nukasonic.Nukasonic;
import com.neptunedevelopmentteam.nukasonic.guns.GunItem;
import com.neptunedevelopmentteam.nukasonic.guns.GunMagazine;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class TenMMGunItem extends GunItem {
    private static final float RELOAD_TIME = 0.2f; // this is in seconds
    private static final float DAMAGE = 5f; // Regular damage, in relation to HP, can be reduced by armor
    private static final float SPREAD = 0.01f; // How far the gun's angle of fire spreads randomly from the center
    private static final float ADS_SPREAD_MODIFIER = -0.1f; // Multiplies the spread by the ADS SPREAD MODIFIER and adds it to the SPREAD to get the spread
    private static final float RECOIL = 0.1f;
    private static final float CROUCH_RECOIL_MODIFIER = 0.5f; // Multiplies recoil by CROUCH RECOIL MODIFIER and adds it to recoil, recoil is set to 0 if it goes below 0
    private static final float PROJECTILE_SPEED = 0.1f;
    public TenMMGunItem() {
        super(new NeptuneItemSettings().maxCount(1).group(() -> Nukasonic.NUKASONIC_ITEMS)
    , new GunMagazine(10, 0, 0));
    }


    @Override
    public void onFire(World world, PlayerEntity player, Hand hand, GunItem gunItem) {

    }


}
