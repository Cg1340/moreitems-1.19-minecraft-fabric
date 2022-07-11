package net.fabricmc.cg1340mod.items.stones;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class StoneToolMaterial implements ToolMaterial {

    public static final StoneToolMaterial INSTANCE = new StoneToolMaterial();

    @Override
    public int getDurability() {
        return 131;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 4.0F;
    }

    @Override
    public float getAttackDamage() {
        return -1.0F;
    }

    @Override
    public int getMiningLevel() {
        return 1;
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
