package net.ayoubmrz.muckequipmentmod.item;

import com.google.common.base.Suppliers;
import net.ayoubmrz.muckequipmentmod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    MITHRIL(ModTags.Blocks.INCORRECT_FOR_MITHRIL_TOOL,
            1822, 14.0F, 9.0F, 15, () -> Ingredient.ofItems(ModItems.MITHRIL_INGOT)),

    ADAMANTITE(ModTags.Blocks.INCORRECT_FOR_ADAMANTITE_TOOL,
            2130, 16.0F, 12.0F, 15, () -> Ingredient.ofItems(ModItems.ADAMANTITE_INGOT)),

    OBAMIUM(ModTags.Blocks.INCORRECT_FOR_OBAMIUM_TOOL,
            2431, 18.0F, 16.0F, 15, () -> Ingredient.ofItems(ModItems.OBAMIUM_INGOT));


    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability, final float miningSpeed,
                     final float attackDamage, final int enchantability, final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
