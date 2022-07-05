package net.fabricmc.cg1340mod.bedrock;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class BedrockPickaxe extends PickaxeItem {
    protected BedrockPickaxe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
