package net.fabricmc.cg1340mod.items.amethyst;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AmethystToolMaterial implements ToolMaterial {

    public static final AmethystToolMaterial INSTANCE = new AmethystToolMaterial();

    @Override
    public int getDurability() {
        return 512 + 256;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0F;
    }

    @Override
    public float getAttackDamage() {
        return 0.0F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 12;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.AMETHYST_SHARD);
    }
}
