package net.fabricmc.cg1340mod.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;

public class Smooth_amethyst_slab {
    public static final SlabBlock smooth_amethyst_slab = new SlabBlock(FabricBlockSettings.of(Material.AMETHYST).hardness(4.0F).requiresTool());
}
