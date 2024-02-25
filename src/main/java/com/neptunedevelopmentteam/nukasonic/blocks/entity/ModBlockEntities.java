package com.neptunedevelopmentteam.nukasonic.blocks.entity;
import com.neptunedevelopmentteam.nukasonic.Nukasonic;
import com.neptunedevelopmentteam.nukasonic.registration.NukaBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<ClockBlockEntity> CLOCK_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Nukasonic.MOD_ID, "clock_be"),
                    FabricBlockEntityTypeBuilder.create(ClockBlockEntity::new,
                            NukaBlocks.CLOCK).build());


}


