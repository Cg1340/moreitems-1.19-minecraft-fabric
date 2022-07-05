package net.fabricmc.cg1340mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class LongStick implements ModInitializer {

    public static final Item LONG_STICK = new Item(new FabricItemSettings().group(Cg1340mod.MORE_TOOLS_GROUP));

    @Override
    public void onInitialize() {
    }
}
