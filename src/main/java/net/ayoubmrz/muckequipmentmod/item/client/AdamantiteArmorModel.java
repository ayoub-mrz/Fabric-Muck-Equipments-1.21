package net.ayoubmrz.muckequipmentmod.item.client;

import net.ayoubmrz.muckequipmentmod.MuckEquipmentMod;
import net.ayoubmrz.muckequipmentmod.item.custom.AdamantiteArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class AdamantiteArmorModel extends GeoModel<AdamantiteArmorItem> {
    @Override
    public Identifier getModelResource(AdamantiteArmorItem adamantiteArmorItem) {
        return Identifier.of(MuckEquipmentMod.MOD_ID, "geo/adamantite_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(AdamantiteArmorItem adamantiteArmorItem) {
        return Identifier.of(MuckEquipmentMod.MOD_ID, "textures/armor/adamantite_armor.png");
    }

    @Override
    public Identifier getAnimationResource(AdamantiteArmorItem adamantiteArmorItem) {
        return Identifier.of(MuckEquipmentMod.MOD_ID, "animations/armor.animation.json");
    }
}
