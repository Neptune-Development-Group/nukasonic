package com.neptunedevelopmentteam.nukasonic.registration;

import com.neptunedevelopmentteam.neptunelib.core.init_handlers.CustomName;
import com.neptunedevelopmentteam.neptunelib.core.init_handlers.NeptuneItemInit;
import com.neptunedevelopmentteam.neptunelib.core.itemsettings.NeptuneItemSettings;
import com.neptunedevelopmentteam.nukasonic.Nukasonic;
import com.neptunedevelopmentteam.nukasonic.items.BlueMentatsItem;
import com.neptunedevelopmentteam.nukasonic.items.PipboyItem;
import com.neptunedevelopmentteam.nukasonic.items.StimpakItem;
import com.neptunedevelopmentteam.nukasonic.items.UraniumChunkItem;
import com.neptunedevelopmentteam.nukasonic.items.guns.tenmm.TenMMGunItem;
import net.minecraft.item.Item;

public class NukaItems implements NeptuneItemInit {
    public static final Item PIPBOY = new PipboyItem(new NeptuneItemSettings().maxDamage(1).group(() ->Nukasonic.NUKASONIC_ITEMS));
    public static final Item STIMPAK = new StimpakItem((new NeptuneItemSettings().group(() -> Nukasonic.NUKASONIC_ITEMS)));
    public static final Item SYRINGE = new Item(new NeptuneItemSettings().maxDamage(1).group(() -> Nukasonic.NUKASONIC_ITEMS));
    public static final Item BLUE_MENTATS = new BlueMentatsItem(new NeptuneItemSettings().group(() -> Nukasonic.NUKASONIC_ITEMS));
    public static final Item URANIUM_CHUNK = new UraniumChunkItem(new NeptuneItemSettings().group(() -> Nukasonic.NUKASONIC_ITEMS));
    @CustomName("10mm")
    public static final Item TEN_MM_GUN = new TenMMGunItem();

}
