package net.fabricmc.cg1340mod.items.copper;

import net.fabricmc.cg1340mod.Cg1340mod;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CopperArmor implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {2, 4, 6, 3};
    //                                                       {靴子, 护腿, 胸甲, 头盔}

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 14;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 8;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }

    @Override
    public String getName() {
        return "copper";
    }

    @Override
    public float getToughness() {
        return 0.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0F;
    }


    public static final CopperArmor COPPER_ARMOR_MATERIAL = new CopperArmor();
    public static final Item COPPER_HELMET = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Cg1340mod.MORE_TOOLS_GROUP));  // 头盔
    public static final Item COPPER_CHESTPLATE = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Cg1340mod.MORE_TOOLS_GROUP));  // 胸甲
    public static final Item COPPER_LEGGINGS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Cg1340mod.MORE_TOOLS_GROUP));  // 护腿
    public static final Item COPPER_BOOTS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Cg1340mod.MORE_TOOLS_GROUP));  // 靴子

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("moreitems", "copper_helmet"), COPPER_HELMET);
        Registry.register(Registry.ITEM, new Identifier("moreitems", "copper_chestplate"), COPPER_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("moreitems", "copper_leggings"), COPPER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("moreitems", "copper_boots"), COPPER_BOOTS);
    }

}
