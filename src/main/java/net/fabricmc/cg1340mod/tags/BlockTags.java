package net.fabricmc.cg1340mod.tags;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockTags {
    public static final TagKey<Block> STONES = TagKey.of(Registry.BLOCK_KEY, new Identifier("moreitems", "stones"));
}
