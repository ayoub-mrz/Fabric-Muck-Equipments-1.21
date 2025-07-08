package net.ayoubmrz.muckequipmentmod.item.client;

import net.ayoubmrz.muckequipmentmod.item.custom.MithrilArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MithrilArmorRenderer extends GeoArmorRenderer<MithrilArmorItem> {

    public MithrilArmorRenderer() {
        super(new MithrilArmorModel());
    }
}
