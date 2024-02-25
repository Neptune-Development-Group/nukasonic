package com.neptunedevelopmentteam.nukasonic.blocks.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

public class ClockBlockEntity extends BlockEntity {

    public ClockBlockEntity(BlockEntityType<ClockBlockEntity> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }
}
