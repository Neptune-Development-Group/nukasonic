package com.neptunedevelopmentteam.nukasonic.hiddeneffects;

import net.minecraft.util.Identifier;

public class HiddenEffect {

    private Identifier ID;
    private Integer power;
    private Integer duration;

    public HiddenEffect(Identifier ID, Integer power, Integer duration) {
        this.ID = ID;
        this.power = power;
        this.duration = duration;
    }

    public Identifier getID() {
        return ID;
    }

    public Integer getPower() {
        return power;
    }

    public Integer getDuration() {
        return duration;
    }
}
