package net.fabricmc.cg1340mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.cg1340mod.amethyst.AmethystAxe;
import net.fabricmc.cg1340mod.amethyst.AmethystTool;
import net.fabricmc.cg1340mod.bedrock.BedrockDebris;
import net.fabricmc.cg1340mod.bedrock.BedrockOre;
import net.fabricmc.cg1340mod.bedrock.BedrockTool;
import net.fabricmc.cg1340mod.copper.CopperArmor;
import net.fabricmc.cg1340mod.copper.CopperNugget;
import net.fabricmc.cg1340mod.copper.CopperTool;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.Arrays;

public class Cg1340mod implements ModInitializer {
    public static final ItemGroup MORE_TOOLS_GROUP = FabricItemGroupBuilder.create(
                    new Identifier("moretools", "more_tools_group"))
            .icon(() -> new ItemStack(Items.COPPER_INGOT)) // 这里将你创建的新的材料的模型用作图标，但是你也可以随时使用你喜欢的
            .build();

    private static ConfiguredFeature<?, ?> OVERWORLD_BEDROCK_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(
            OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
            BedrockOre.BEDROCK_ORE.getDefaultState(),
            9));

    public static PlacedFeature OVERWORLD_BEDROCK_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_BEDROCK_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(20),  // number of veins per chunk
                    SquarePlacementModifier.of(),  // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));  // height


    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("moretools", "overworld_bedrock_ore"), OVERWORLD_BEDROCK_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("moretools", "overworld_bedrock_ore"),
                OVERWORLD_BEDROCK_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("moretools", "overworld_bedrock_ore")));



        System.out.println("Thank you playing the MORETOOLS Mod!");
        Registry.register(Registry.ITEM, new Identifier("moretools", "copper_sword"), CopperTool.COPPER_SWORD);  // 铜剑
        Registry.register(Registry.ITEM, new Identifier("moretools", "copper_shovel"), CopperTool.COPPER_SHOVEL);  // 铜锹
        Registry.register(Registry.ITEM, new Identifier("moretools", "copper_pickaxe"), CopperTool.COPPER_PICKAXE);  // 铜镐
        Registry.register(Registry.ITEM, new Identifier("moretools", "copper_axe"), CopperTool.COPPER_AXE);  // 铜斧
        Registry.register(Registry.ITEM, new Identifier("moretools", "copper_hoe"), CopperTool.COPPER_HOE);  // 铜锄

        Registry.register(Registry.ITEM, new Identifier("moretools", "amethyst_sword"), AmethystTool.AMETHYST_SWORD);  // 紫水晶剑
        Registry.register(Registry.ITEM, new Identifier("moretools", "amethyst_shovel"), AmethystTool.AMETHYST_SHOVEL);  // 紫水晶锹
        Registry.register(Registry.ITEM, new Identifier("moretools", "amethyst_pickaxe"), AmethystTool.POTATO_PICKAXE);  // 紫水晶镐
        Registry.register(Registry.ITEM, new Identifier("moretools", "amethyst_axe"), AmethystTool.POTATO_AXE);  // 紫水晶斧
        Registry.register(Registry.ITEM, new Identifier("moretools", "amethyst_hoe"), AmethystTool.POTATO_HOE);  // 紫水晶锄

        Registry.register(Registry.ITEM, new Identifier("moretools", "bedrock_sword"), BedrockTool.BEDROCK_SWORD);  // 基岩剑


        Registry.register(Registry.ITEM, new Identifier("moretools", "long_stick"), LongStick.LONG_STICK);
        Registry.register(Registry.ITEM, new Identifier("moretools", "bedrock_debris"), BedrockDebris.BEDROCK_DEBRIS);
        Registry.register(Registry.ITEM, new Identifier("moretools", "copper_nugget"), CopperNugget.COPPER_NUGGET);

        Registry.register(Registry.BLOCK, new Identifier("moretools", "bedrock_ore"), BedrockOre.BEDROCK_ORE);
        Registry.register(Registry.ITEM, new Identifier("moretools", "bedrock_ore"), new BlockItem(BedrockOre.BEDROCK_ORE, new FabricItemSettings().group(MORE_TOOLS_GROUP)));

        CopperArmor.register();

        System.out.println("*---------------------------------------*");
        System.out.println("|  More Tools Mod is loaded! have fun!  |");
        System.out.println("*---------------------------------------*");
    }
}
