package net.swutm.netheritestick.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.swutm.netheritestick.item.custom.ModAxeItem;
import net.swutm.netheritestick.item.custom.ModHoeItem;
import net.swutm.netheritestick.item.custom.ModPickaxeItem;
import net.swutm.netheritestick.netheritestick;

public class ModItems {

    public static final Item WOOD_SWORD = registerItem("wood_sword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));

    public static final Item WOOD_PICKAXE = registerItem("wood_pickaxe",
            new ModPickaxeItem(ToolMaterials.WOOD, 1, -2.8f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    public static final Item WOOD_SHOVEL = registerItem("wood_shovel",
            new ShovelItem(ToolMaterials.WOOD, 1.5f, -3f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    public static final Item WOOD_AXE = registerItem("wood_axe",
            new ModAxeItem(ToolMaterials.WOOD, 6, -3.2f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    public static final Item WOOD_HOE = registerItem("wood_hoe",
            new ModHoeItem(ToolMaterials.WOOD, 0, -3f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));



    public static final Item STONE_SWORD = registerItem("stone_sword",
            new SwordItem(ToolMaterials.WOOD, 4, -2.4f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));

    public static final Item STONE_PICKAXE = registerItem("stone_pickaxe",
            new ModPickaxeItem(ToolMaterials.WOOD, 2, -2.8f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    public static final Item STONE_SHOVEL = registerItem("stone_shovel",
            new ShovelItem(ToolMaterials.WOOD, 2.5f, -3f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    public static final Item STONE_AXE = registerItem("stone_axe",
            new ModAxeItem(ToolMaterials.WOOD, 8, -3.2f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    public static final Item STONE_HOE = registerItem("stone_hoe",
            new ModHoeItem(ToolMaterials.WOOD, 0, -2f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));



    public static final Item IRON_SWORD = registerItem("iron_sword",
            new SwordItem(ToolMaterials.WOOD, 5, -2.4f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));

    public static final Item IRON_PICKAXE = registerItem("iron_pickaxe",
            new ModPickaxeItem(ToolMaterials.WOOD, 3, -2.8f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    public static final Item IRON_SHOVEL = registerItem("iron_shovel",
            new ShovelItem(ToolMaterials.WOOD, 3.5f, -3f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    public static final Item IRON_AXE = registerItem("iron_axe",
            new ModAxeItem(ToolMaterials.WOOD, 8, -3.1f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    public static final Item IRON_HOE = registerItem("iron_hoe",
            new ModHoeItem(ToolMaterials.WOOD, 0, -1f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));



    public static final Item GOLD_SWORD = registerItem("gold_sword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));

    public static final Item GOLD_PICKAXE = registerItem("gold_pickaxe",
            new ModPickaxeItem(ToolMaterials.WOOD, 1, -2.8f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    public static final Item GOLD_SHOVEL = registerItem("gold_shovel",
            new ShovelItem(ToolMaterials.WOOD, 1.5f, -3f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    public static final Item GOLD_AXE = registerItem("gold_axe",
            new ModAxeItem(ToolMaterials.WOOD, 6, -3f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    public static final Item GOLD_HOE = registerItem("gold_hoe",
            new ModHoeItem(ToolMaterials.WOOD, 0, -1f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));



    public static final Item DIAMOND_SWORD = registerItem("diamond_sword",
            new SwordItem(ToolMaterials.WOOD, 6, -2.4f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));

    public static final Item DIAMOND_PICKAXE = registerItem("diamond_pickaxe",
            new ModPickaxeItem(ToolMaterials.WOOD, 4, -2.8f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    public static final Item DIAMOND_SHOVEL = registerItem("diamond_shovel",
            new ShovelItem(ToolMaterials.WOOD, 4.5f, -3f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    public static final Item DIAMOND_AXE = registerItem("diamond_axe",
            new ModAxeItem(ToolMaterials.WOOD, 8, -3f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    public static final Item DIAMOND_HOE = registerItem("diamond_hoe",
            new ModHoeItem(ToolMaterials.WOOD, 0, -1f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));



    public static final Item NETHERITE_STICK = registerItem("netherite_stick",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof()));

    public static final Item NETHERITE_NUGGEST = registerItem("netherite_nuggest",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof()));

    public static final Item NETHERITE_BOW = registerItem("netherite_bow",
            new BowItem(new FabricItemSettings().group(ItemGroup.COMBAT).maxDamage(384).fireproof()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(netheritestick.MOD_ID, name), item);
    }

    public static void registerModItems() {
        netheritestick.LOGGER.info("1" + netheritestick.MOD_ID);
    }

}
