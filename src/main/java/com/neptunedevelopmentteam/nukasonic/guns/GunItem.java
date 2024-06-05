package com.neptunedevelopmentteam.nukasonic.guns;

import com.neptunedevelopmentteam.neptunelib.interfaces.NeptuneItemDataImpl;
import com.neptunedevelopmentteam.nukasonic.Nukasonic;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget;
import net.minecraft.client.item.TooltipType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TextContent;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public abstract class GunItem extends Item implements GunInterface, NeptuneItemDataImpl {
    private GunMagazine magazine;
    public GunItem(Settings settings, GunMagazine magazine) {
        super(settings);
        this.magazine = magazine;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        onFire(world, user, hand, this);
        return TypedActionResult.success(user.getStackInHand(hand));
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        Text text = Text.literal(": " + getAmmoCount(stack) + " / " + getMagazine().getMagazineSize());
        tooltip.add(Text.translatable("nukasonic.item.tooltip.ammo", getAmmoCount(stack), getMagazine().getMagazineSize()));
    }

    @Override
    public GunMagazine getMagazine() {
        return this.magazine;
    }

    @Override
    public void setMagazine(GunMagazine magazine) {
        this.magazine = magazine;
    }

    public void setAmmoCount(ItemStack stack, int count) {
        this.setStackData(stack, Nukasonic.AMMO_COUNT, count);
    }

    public int getAmmoCount(ItemStack stack) {
        return this.getOrCreateStackData(stack, Nukasonic.AMMO_COUNT);
    }


}
