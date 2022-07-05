package net.fabricmc.cg1340mod.copper;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.cg1340mod.Cg1340mod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

//铜粒
public class CopperNugget implements ModInitializer {

    public static final Item COPPER_NUGGET = new Item(new FabricItemSettings().group(Cg1340mod.MORE_TOOLS_GROUP));
    @Override
    public void onInitialize() {

    }
}
