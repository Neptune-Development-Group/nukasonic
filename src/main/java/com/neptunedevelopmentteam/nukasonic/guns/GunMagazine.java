package com.neptunedevelopmentteam.nukasonic.guns;

public class GunMagazine {
    private int magazine_size;
    private float reload_time_modifier;
    private float ads_time_modifier;
    public GunMagazine(int magazine_size, float reload_time_modifier, float ads_time_modifier) {
        this.magazine_size = magazine_size;
        this.reload_time_modifier = reload_time_modifier;
        this.ads_time_modifier = ads_time_modifier;
    }

    public int getMagazineSize() {
        return magazine_size;
    }

    public float getReloadTimeModifier() {
        return reload_time_modifier;
    }

    public float getAdsTimeModifier() {
        return ads_time_modifier;
    }
}
