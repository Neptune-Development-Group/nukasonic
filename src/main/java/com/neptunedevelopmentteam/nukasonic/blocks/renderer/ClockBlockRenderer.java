package com.neptunedevelopmentteam.nukasonic.blocks.renderer;

import com.neptunedevelopmentteam.nukasonic.blocks.ClockBlock;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;

public class ClockBlockRenderer implements BlockEntityRenderer<ClockBlock> {

    public ClockBlockRenderer(BlockEntityRendererFactory.Context context){

    }
    @Override
    public void render(ClockBlock entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {

    }
}
