package net.fabricmc.cg1340mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.cg1340mod.blocks.amethyst_block_;
import net.fabricmc.cg1340mod.items.amethyst.AmethystTool;
import net.fabricmc.cg1340mod.items.copper.CopperArmor;
import net.fabricmc.cg1340mod.items.copper.CopperNugget;
import net.fabricmc.cg1340mod.items.copper.CopperTool;
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

        System.out.println("[MoreItems]Thank you playing the More Items Mod!");
        Registry.register(Registry.ITEM, new Identifier("moreitems", "copper_sword"), CopperTool.COPPER_SWORD);  // 铜剑
        Registry.register(Registry.ITEM, new Identifier("moreitems", "copper_shovel"), CopperTool.COPPER_SHOVEL);  // 铜锹
        Registry.register(Registry.ITEM, new Identifier("moreitems", "copper_pickaxe"), CopperTool.COPPER_PICKAXE);  // 铜镐
        Registry.register(Registry.ITEM, new Identifier("moreitems", "copper_axe"), CopperTool.COPPER_AXE);  // 铜斧
        Registry.register(Registry.ITEM, new Identifier("moreitems", "copper_hoe"), CopperTool.COPPER_HOE);  // 铜锄

        Registry.register(Registry.ITEM, new Identifier("moreitems", "amethyst_sword"), AmethystTool.AMETHYST_SWORD);  // 紫水晶剑
        Registry.register(Registry.ITEM, new Identifier("moreitems", "amethyst_shovel"), AmethystTool.AMETHYST_SHOVEL);  // 紫水晶锹
        Registry.register(Registry.ITEM, new Identifier("moreitems", "amethyst_pickaxe"), AmethystTool.POTATO_PICKAXE);  // 紫水晶镐
        Registry.register(Registry.ITEM, new Identifier("moreitems", "amethyst_axe"), AmethystTool.POTATO_AXE);  // 紫水晶斧
        Registry.register(Registry.ITEM, new Identifier("moreitems", "amethyst_hoe"), AmethystTool.POTATO_HOE);  // 紫水晶锄
        Registry.register(Registry.ITEM, new Identifier("moreitems", "copper_nugget"), CopperNugget.COPPER_NUGGET);

        Registry.register(Registry.BLOCK, new Identifier("moreitems", "amethyst_block_"), amethyst_block_.AMETHYST_BLOCK_);
        Registry.register(Registry.ITEM, new Identifier("moreitems", "amethyst_block_"), new BlockItem(amethyst_block_.AMETHYST_BLOCK_, new Item.Settings().group(MORE_BLOCKS_GROUP)));

        CopperArmor.register();
        System.out.println("[MoreItems]More Items Mod is loaded! have fun!");

    }
}
