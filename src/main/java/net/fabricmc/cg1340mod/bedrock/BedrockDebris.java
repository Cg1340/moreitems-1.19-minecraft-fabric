package net.fabricmc.cg1340mod.bedrock;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.cg1340mod.Cg1340mod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class BedrockDebris implements ModInitializer {

    public static final Item BEDROCK_DEBRIS = new Item(new FabricItemSettings().group(Cg1340mod.MORE_TOOLS_GROUP));

    @Override
    public void onInitialize() {

    }
}
