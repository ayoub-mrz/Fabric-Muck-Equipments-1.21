package net.ayoubmrz.muckequipmentmod.item.client;

import net.ayoubmrz.muckequipmentmod.MuckEquipmentMod;
import net.ayoubmrz.muckequipmentmod.item.custom.ObamiumArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class ObamiumArmorModel extends GeoModel<ObamiumArmorItem> {
    @Override
    public Identifier getModelResource(ObamiumArmorItem obamiumArmorItem) {
        return Identifier.of(MuckEquipmentMod.MOD_ID, "geo/obamium_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(ObamiumArmorItem obamiumArmorItem) {
        return Identifier.of(MuckEquipmentMod.MOD_ID, "textures/armor/obamium_armor.png");
    }

    @Override
    public Identifier getAnimationResource(ObamiumArmorItem obamiumArmorItem) {
        return Identifier.of(MuckEquipmentMod.MOD_ID, "animations/armor.animation.json");
    }
}
