package com.neptunedevelopmentteam.nukasonic.registration;

import com.neptunedevelopmentteam.neptunelib.core.init_handlers.NeptuneItemInit;
import com.neptunedevelopmentteam.neptunelib.core.itemsettings.NeptuneItemSettings;
import com.neptunedevelopmentteam.nukasonic.Nukasonic;
import com.neptunedevelopmentteam.nukasonic.items.PipboyItem;
import net.minecraft.item.Item;

public class NukaItems implements NeptuneItemInit {
    public static final Item PIPBOY = new PipboyItem(new NeptuneItemSettings().maxDamage(1).group(() ->Nukasonic.NUKASONIC_ITEMS));
}
