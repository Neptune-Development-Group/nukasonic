package com.neptunedevelopmentteam.nukasonic.client;

import com.neptunedevelopmentteam.nukasonic.client.models.renderers.TenMMGunRenderer;
import com.neptunedevelopmentteam.nukasonic.registration.NukaItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;

public class NukasonicClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BuiltinItemRendererRegistry.INSTANCE.register(NukaItems.TEN_MM_GUN, new TenMMGunRenderer());
    }
}
