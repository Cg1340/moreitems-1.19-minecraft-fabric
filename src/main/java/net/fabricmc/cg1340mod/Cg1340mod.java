package net.fabricmc.cg1340mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.cg1340mod.blocks.Amethyst_slab;
import net.fabricmc.cg1340mod.blocks.Smooth_amethyst_block;
import net.fabricmc.cg1340mod.blocks.Smooth_amethyst_slab;
import net.fabricmc.cg1340mod.items.amethyst.AmethystTool;
import net.fabricmc.cg1340mod.items.copper.CopperArmor;
import net.fabricmc.cg1340mod.items.copper.CopperNugget;
import net.fabricmc.cg1340mod.items.copper.CopperTool;
import net.fabricmc.cg1340mod.items.stones.StoneTool;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Cg1340mod implements ModInitializer {
    public static final ItemGroup MORE_TOOLS_GROUP = FabricItemGroupBuilder.create(
                    new Identifier("moreitems", "more_tools_group"))
            .icon(() -> new ItemStack(Items.COPPER_INGOT)) // 这里将你创建的新的材料的模型用作图标，但是你也可以随时使用你喜欢的
            .build();
    public static final ItemGroup MORE_BLOCKS_GROUP = FabricItemGroupBuilder.create(
                    new Identifier("moreitems", "more_blocks_group"))
            .icon(() -> new ItemStack(Items.TUFF))
            .build();


    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        System.out.println("[MoreItems] Thank you playing the More Items Mod!");
        Registry.register(Registry.ITEM, new Identifier("moreitems", "copper_sword"), CopperTool.COPPER_SWORD);  // 铜剑
        Registry.register(Registry.ITEM, new Identifier("moreitems", "copper_shovel"), CopperTool.COPPER_SHOVEL);  // 铜锹
        Registry.register(Registry.ITEM, new Identifier("moreitems", "copper_pickaxe"), CopperTool.COPPER_PICKAXE);  // 铜镐
        Registry.register(Registry.ITEM, new Identifier("moreitems", "copper_axe"), CopperTool.COPPER_AXE);  // 铜斧
        Registry.register(Registry.ITEM, new Identifier("moreitems", "copper_hoe"), CopperTool.COPPER_HOE);  // 铜锄

        Registry.register(Registry.ITEM, new Identifier("moreitems", "copper_nugget"), CopperNugget.COPPER_NUGGET);

        Registry.register(Registry.ITEM, new Identifier("moreitems", "amethyst_sword"), AmethystTool.AMETHYST_SWORD);  // 紫水晶剑
        Registry.register(Registry.ITEM, new Identifier("moreitems", "amethyst_shovel"), AmethystTool.AMETHYST_SHOVEL);  // 紫水晶锹
        Registry.register(Registry.ITEM, new Identifier("moreitems", "amethyst_pickaxe"), AmethystTool.POTATO_PICKAXE);  // 紫水晶镐
        Registry.register(Registry.ITEM, new Identifier("moreitems", "amethyst_axe"), AmethystTool.POTATO_AXE);  // 紫水晶斧
        Registry.register(Registry.ITEM, new Identifier("moreitems", "amethyst_hoe"), AmethystTool.POTATO_HOE);  // 紫水晶锄

        Registry.register(Registry.ITEM, new Identifier("moreitems", "tuff_sword"), StoneTool.TUFF_SWORD);  // 凝灰岩剑
        Registry.register(Registry.ITEM, new Identifier("moreitems", "tuff_shovel"), StoneTool.TUFF_SHOVEL);  // 凝灰岩锹
        Registry.register(Registry.ITEM, new Identifier("moreitems", "tuff_pickaxe"), StoneTool.TUFF_PICKAXE);  // 凝灰岩镐
        Registry.register(Registry.ITEM, new Identifier("moreitems", "tuff_axe"), StoneTool.TUFF_AXE);  // 凝灰岩斧
        Registry.register(Registry.ITEM, new Identifier("moreitems", "tuff_hoe"), StoneTool.TUFF_HOE);  // 凝灰岩锄

        Registry.register(Registry.ITEM, new Identifier("moreitems", "calcite_sword"), StoneTool.CALCITE_SWORD);  // 方解石剑
        Registry.register(Registry.ITEM, new Identifier("moreitems", "calcite_shovel"), StoneTool.CALCITE_SHOVEL);  // 方解石锹
        Registry.register(Registry.ITEM, new Identifier("moreitems", "calcite_pickaxe"), StoneTool.CALCITE_PICKAXE);  // 方解石镐
        Registry.register(Registry.ITEM, new Identifier("moreitems", "calcite_axe"), StoneTool.CALCITE_AXE);  // 方解石斧
        Registry.register(Registry.ITEM, new Identifier("moreitems", "calcite_hoe"), StoneTool.CALCITE_HOE);  // 方解石锄

        Registry.register(Registry.ITEM, new Identifier("moreitems", "granite_sword"), StoneTool.GRANITE_SWORD);  // 花岗岩剑
        Registry.register(Registry.ITEM, new Identifier("moreitems", "granite_shovel"), StoneTool.GRANITE_SHOVEL);  // 花岗岩锹
        Registry.register(Registry.ITEM, new Identifier("moreitems", "granite_pickaxe"), StoneTool.GRANITE_PICKAXE);  // 花岗岩镐
        Registry.register(Registry.ITEM, new Identifier("moreitems", "granite_axe"), StoneTool.GRANITE_AXE);  // 花岗岩斧
        Registry.register(Registry.ITEM, new Identifier("moreitems", "granite_hoe"), StoneTool.GRANITE_HOE);  // 花岗岩锄

        Registry.register(Registry.ITEM, new Identifier("moreitems", "diorite_sword"), StoneTool.DIORITE_SWORD);  // 闪长岩剑
        Registry.register(Registry.ITEM, new Identifier("moreitems", "diorite_shovel"), StoneTool.DIORITE_SHOVEL);  // 闪长岩锹
        Registry.register(Registry.ITEM, new Identifier("moreitems", "diorite_pickaxe"), StoneTool.DIORITE_PICKAXE);  // 闪长岩镐
        Registry.register(Registry.ITEM, new Identifier("moreitems", "diorite_axe"), StoneTool.DIORITE_AXE);  // 闪长岩斧
        Registry.register(Registry.ITEM, new Identifier("moreitems", "diorite_hoe"), StoneTool.DIORITE_HOE);  // 闪长岩锄

        Registry.register(Registry.ITEM, new Identifier("moreitems", "andesite_sword"), StoneTool.ANDESITE_SWORD);  // 安山岩剑
        Registry.register(Registry.ITEM, new Identifier("moreitems", "andesite_shovel"), StoneTool.ANDESITE_SHOVEL);  // 安山岩锹
        Registry.register(Registry.ITEM, new Identifier("moreitems", "andesite_pickaxe"), StoneTool.ANDESITE_PICKAXE);  // 安山岩镐
        Registry.register(Registry.ITEM, new Identifier("moreitems", "andesite_axe"), StoneTool.ANDESITE_AXE);  // 安山岩斧
        Registry.register(Registry.ITEM, new Identifier("moreitems", "andesite_hoe"), StoneTool.ANDESITE_HOE);  // 安山岩锄

        Registry.register(Registry.BLOCK, new Identifier("moreitems", "smooth_amethyst_block"), Smooth_amethyst_block.smooth_amethyst_block);
        Registry.register(Registry.ITEM, new Identifier("moreitems", "smooth_amethyst_block"), new BlockItem(Smooth_amethyst_block.smooth_amethyst_block, new Item.Settings().group(MORE_BLOCKS_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("moreitems", "smooth_amethyst_slab"), Smooth_amethyst_slab.smooth_amethyst_slab);
        Registry.register(Registry.ITEM, new Identifier("moreitems", "smooth_amethyst_slab"), new BlockItem(Smooth_amethyst_slab.smooth_amethyst_slab, new Item.Settings().group(MORE_BLOCKS_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("moreitems", "amethyst_slab"), Amethyst_slab.amethyst_slab);
        Registry.register(Registry.ITEM, new Identifier("moreitems", "amethyst_slab"), new BlockItem(Amethyst_slab.amethyst_slab, new Item.Settings().group(MORE_BLOCKS_GROUP)));

        CopperArmor.register();
        System.out.println("[MoreItems] More Items Mod is loaded! have fun!");

    }
}
