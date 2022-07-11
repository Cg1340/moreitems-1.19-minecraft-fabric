package net.fabricmc.cg1340mod.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;

public class Amethyst_slab {
    public static final SlabBlock AMETHYST_SLAB = new SlabBlock(FabricBlockSettings.of(Material.AMETHYST).hardness(4.0F).requiresTool());
}
