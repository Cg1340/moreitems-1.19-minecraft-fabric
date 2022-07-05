package net.fabricmc.cg1340mod.amethyst;

import net.fabricmc.cg1340mod.Cg1340mod;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;

public class AmethystTool {
    public static ToolItem AMETHYST_SHOVEL = new ShovelItem(AmethystToolMaterial.INSTANCE, 3, -3.0F, new Item.Settings().group(Cg1340mod.MORE_TOOLS_GROUP));
    public static ToolItem AMETHYST_SWORD = new SwordItem(AmethystToolMaterial.INSTANCE, 7, -1.0F, new Item.Settings().group(Cg1340mod.MORE_TOOLS_GROUP));
    public static ToolItem POTATO_PICKAXE = new AmethystPickaxe(AmethystToolMaterial.INSTANCE, 3, -2.8F, new Item.Settings().group(Cg1340mod.MORE_TOOLS_GROUP));
    public static ToolItem POTATO_AXE = new AmethystAxe(AmethystToolMaterial.INSTANCE, 9, -3.2F, new Item.Settings().group(Cg1340mod.MORE_TOOLS_GROUP));
    public static ToolItem POTATO_HOE = new AmethystHoe(AmethystToolMaterial.INSTANCE, 3, -3.2F, new Item.Settings().group(Cg1340mod.MORE_TOOLS_GROUP));
}
