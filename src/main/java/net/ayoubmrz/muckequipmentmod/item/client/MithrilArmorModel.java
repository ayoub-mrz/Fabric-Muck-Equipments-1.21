package net.ayoubmrz.muckequipmentmod.item.client;

import net.ayoubmrz.muckequipmentmod.MuckEquipmentMod;
import net.ayoubmrz.muckequipmentmod.item.custom.MithrilArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class MithrilArmorModel extends GeoModel<MithrilArmorItem> {
    @Override
    public Identifier getModelResource(MithrilArmorItem mithrilArmorItem) {
        return Identifier.of(MuckEquipmentMod.MOD_ID, "geo/mithril_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(MithrilArmorItem mithrilArmorItem) {
        return Identifier.of(MuckEquipmentMod.MOD_ID, "textures/armor/mithril_armor.png");
    }

    @Override
    public Identifier getAnimationResource(MithrilArmorItem mithrilArmorItem) {
        return Identifier.of(MuckEquipmentMod.MOD_ID, "animations/armor.animation.json");
    }
}
