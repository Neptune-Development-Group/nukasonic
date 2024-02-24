package com.neptunedevelopmentteam.nukasonic.client.models.trinkets;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.LivingEntity;

@Environment(EnvType.CLIENT)
public class TrinketSleeveModel extends BipedEntityModel<LivingEntity> {
    public TrinketSleeveModel(ModelPart root) {
        super(root);
        this.setVisible(false);
        
    }
}
