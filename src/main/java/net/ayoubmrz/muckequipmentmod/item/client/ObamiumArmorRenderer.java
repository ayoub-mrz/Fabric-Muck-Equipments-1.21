package net.ayoubmrz.muckequipmentmod.item.client;

import net.ayoubmrz.muckequipmentmod.item.custom.ObamiumArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ObamiumArmorRenderer extends GeoArmorRenderer<ObamiumArmorItem> {

    public ObamiumArmorRenderer() {
        super(new ObamiumArmorModel());
    }
}
