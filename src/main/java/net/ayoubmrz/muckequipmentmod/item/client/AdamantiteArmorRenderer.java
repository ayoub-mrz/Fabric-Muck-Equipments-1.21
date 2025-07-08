package net.ayoubmrz.muckequipmentmod.item.client;

import net.ayoubmrz.muckequipmentmod.item.custom.AdamantiteArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AdamantiteArmorRenderer extends GeoArmorRenderer<AdamantiteArmorItem> {

    public AdamantiteArmorRenderer() {
        super(new AdamantiteArmorModel());
    }
}
