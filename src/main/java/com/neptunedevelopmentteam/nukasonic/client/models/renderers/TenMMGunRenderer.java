package com.neptunedevelopmentteam.nukasonic.client.models.renderers;

import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.fabricmc.fabric.api.renderer.v1.model.ForwardingBakedModel;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;

public class TenMMGunRenderer implements BuiltinItemRendererRegistry.DynamicItemRenderer {
    @Override
    public void render(ItemStack stack, ModelTransformationMode mode, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        System.out.println("render");
        if (mode.isFirstPerson()) {
            TenMMGunModel tenMMGunModel = new TenMMGunModel();
            tenMMGunModel.setModel(MinecraftClient.getInstance().getItemRenderer().getModel(stack, null, null, 0));
            matrices.push();
            matrices.translate(0.10, 0.10, 0.10);
            MinecraftClient.getInstance().getItemRenderer().renderItem(stack, ModelTransformationMode.NONE, false, matrices, vertexConsumers, light, overlay, tenMMGunModel);
            matrices.pop();
        }

    }

    private static class TenMMGunModel extends ForwardingBakedModel {
        public void setModel(BakedModel model) {
            this.wrapped = model;
        }
    }
}
