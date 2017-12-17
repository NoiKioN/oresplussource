package com.noikion.noresplus.registers.item_registers;

import com.noikion.noresplus.items.BasicItem;
import com.noikion.noresplus.items.indexes.ArmorIndexesAndEquipmentSlots;
import com.noikion.noresplus.items.materials.AllArmorMaterials;
import com.noikion.noresplus.items.materials.AllToolMaterials;
import com.noikion.noresplus.items.materials.ArmorMaterials;
import com.noikion.noresplus.items.materials.ToolMaterials;
import com.noikion.noresplus.items.specific_items.ArmorItem;
import com.noikion.noresplus.items.specific_items.tools.AxeItem;
import com.noikion.noresplus.items.specific_items.tools.HoeItem;
import com.noikion.noresplus.items.specific_items.tools.PickaxeItem;
import com.noikion.noresplus.items.specific_items.tools.RefinerItem;
import com.noikion.noresplus.items.specific_items.tools.ShovelItem;
import com.noikion.noresplus.items.specific_items.tools.SwordItem;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;
import net.minecraft.item.Item.ToolMaterial;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemRegister {

    public void registerItems() {
        // ------------------------------------------- MATERIALS ------------------------------------------- //
        registerBasicItems(GemItemNamesListedInTypes.MATERIALS);

        // ------------------------------------------- TOOLS ------------------------------------------- //
        // ****************************** AMBER ****************************** //
        registerToolItems(GemItemNamesListedInTypes.AMBER_TOOLS, AllToolMaterials.AMBER);

        // ****************************** CHRYSOCOLLA ****************************** //
        registerToolItems(GemItemNamesListedInTypes.CHRYSOCOLLA_TOOLS, AllToolMaterials.CHRYSOCOLLA);

        // ****************************** CALCITE ****************************** //
        registerToolItems(GemItemNamesListedInTypes.CALCITE_TOOLS, AllToolMaterials.CALCITE);

        // ****************************** MALACHITE ****************************** //
        registerToolItems(GemItemNamesListedInTypes.MALACHITE_TOOLS, AllToolMaterials.MALACHITE);

        // ****************************** GASPEITE ****************************** //
        registerToolItems(GemItemNamesListedInTypes.GASPEITE_TOOLS, AllToolMaterials.GASPEITE);

        // ****************************** ZEKTZERITE ****************************** //
        registerToolItems(GemItemNamesListedInTypes.ZEKTZERITE_TOOLS, AllToolMaterials.ZEKTZERITE);

        // ****************************** CORDIERITE ****************************** //
        registerToolItems(GemItemNamesListedInTypes.CORDIERITE_TOOLS, AllToolMaterials.CORDIERITE);

        // ****************************** BERYL ****************************** //
        registerToolItems(GemItemNamesListedInTypes.BERYL_TOOLS, AllToolMaterials.BERYL);
        
        // ****************************** RUBY ****************************** //
        registerToolItems(GemItemNamesListedInTypes.RUBY_TOOLS, AllToolMaterials.RUBY);
        
        // ****************************** SAPPHIRE ****************************** //
        registerToolItems(GemItemNamesListedInTypes.SAPPHIRE_TOOLS, AllToolMaterials.SAPPHIRE);

        // ****************************** PLUS REFINER TOOLS ****************************** //
        registerRefinerItems(GemItemNamesListedInTypes.ADDITIONAL_REFINERS);

        // ------------------------------------------- ARMOR ------------------------------------------- //
        // ****************************** AMBER ****************************** //
        registerArmorItems(AllArmorMaterials.AMBER, GemItemNamesListedInTypes.AMBER_ARMORS);

        // ****************************** CHRYSOCOLLA ****************************** //
        registerArmorItems(AllArmorMaterials.CHRYSOCOLLA, GemItemNamesListedInTypes.CHRYSOCOLLA_ARMORS);

        // ****************************** CALCITE ****************************** //
        registerArmorItems(AllArmorMaterials.CALCITE, GemItemNamesListedInTypes.CALCITE_ARMORS);

        // ****************************** MALACHITE ****************************** //
        registerArmorItems(AllArmorMaterials.MALACHITE, GemItemNamesListedInTypes.MALACHITE_ARMORS);

        // ****************************** GASPEITE ****************************** //
        registerArmorItems(AllArmorMaterials.GASPEITE, GemItemNamesListedInTypes.GASPEITE_ARMORS);

        // ****************************** ZEKTZERITE ****************************** //
        registerArmorItems(AllArmorMaterials.ZEKTZERITE, GemItemNamesListedInTypes.ZEKTZERITE_ARMORS);

        // ****************************** CORDIERITE ****************************** //
        registerArmorItems(AllArmorMaterials.CORDIERITE, GemItemNamesListedInTypes.CORDIERITE_ARMORS);

        // ****************************** BERYL ****************************** //
        registerArmorItems(AllArmorMaterials.BERYL, GemItemNamesListedInTypes.BERYL_ARMORS);
        
        // ****************************** RUBY ****************************** //
        registerArmorItems(AllArmorMaterials.RUBY, GemItemNamesListedInTypes.RUBY_ARMORS);
        
        // ****************************** SAPPHIRE ****************************** //
        registerArmorItems(AllArmorMaterials.SAPPHIRE, GemItemNamesListedInTypes.SAPPHIRE_ARMORS);
    }

    // ****************************** BASIC ITEMS REGISTRY ****************************** //
    private void registerBasicItems(GemItemNamesListedInTypes itemNames) {
        for (String itemName : itemNames.getItemNames()) {
            registerBasicItem(itemName);
        }
    }

    private void registerBasicItem(String itemName) {
        GameRegistry.register(new BasicItem(itemName));
    }

    // ****************************** TOOL ITEM REGISTRY ****************************** //
    private void registerToolItems(GemItemNamesListedInTypes itemNames, ToolMaterials material) {
        for (String itemName : itemNames.getItemNames()) {
            if (itemName.contains("sword")) {
                registerSwordItem(material, itemName);
            } else if (itemName.contains("pickaxe")) {
                registerPickaxeItem(material, itemName);
            } else if (itemName.contains("axe")) {
                registerAxeItem(material, itemName);
            } else if (itemName.contains("shovel")) {
                registerShovelItem(material, itemName);
            } else if (itemName.contains("hoe")) {
                registerHoeItem(material, itemName);
            } else if (itemName.contains("refiner")) {
                registerRefinerItem(material, itemName);
            }
        }
    }

    private void registerSwordItem(ToolMaterials toolMaterial, String itemName) {
        GameRegistry.register(new SwordItem(toolMaterial, itemName));
    }

    private void registerPickaxeItem(ToolMaterials toolMaterial, String itemName) {
        GameRegistry.register(new PickaxeItem(toolMaterial, itemName));
    }

    private void registerAxeItem(ToolMaterials toolMaterial, String itemName) {
        GameRegistry.register(new AxeItem(toolMaterial, itemName));
    }

    private void registerShovelItem(ToolMaterials toolMaterial, String itemName) {
        GameRegistry.register(new ShovelItem(toolMaterial, itemName));
    }

    private void registerHoeItem(ToolMaterials toolMaterial, String itemName) {
        GameRegistry.register(new HoeItem(toolMaterial, itemName));
    }

    // ****************************** REFINER ITEM REGISTRY ****************************** //
    private void registerRefinerItems(GemItemNamesListedInTypes itemNames) {

        if (itemNames == GemItemNamesListedInTypes.ADDITIONAL_REFINERS) {
            int i = 0;
            for (String itemName : itemNames.getItemNames()) {
                registerRefinerItem(ToolMaterial.values()[i], itemName);
                i++;
            }
        }
    }

    private void registerRefinerItem(ToolMaterials material, String itemName) {
        GameRegistry.register(new RefinerItem(material, itemName));
    }

    private void registerRefinerItem(ToolMaterial material, String itemName) {
        GameRegistry.register(new RefinerItem(material, itemName));
    }

    private void registerArmorItems(ArmorMaterials material, GemItemNamesListedInTypes itemNames) {
        for (String itemName : itemNames.getItemNames()) {
            if (itemName.contains("helmet")) {
                registerArmorItem(material, itemName, ArmorIndexesAndEquipmentSlots.DEFAULT_HELMET);
            }
            if (itemName.contains("chestplate")) {
                registerArmorItem(material, itemName, ArmorIndexesAndEquipmentSlots.DEFAULT_CHESTPLATE);
            }
            if (itemName.contains("leggings")) {
                registerArmorItem(material, itemName, ArmorIndexesAndEquipmentSlots.DEFAULT_LEGGINGS);
            }
            if (itemName.contains("boots")) {
                registerArmorItem(material, itemName, ArmorIndexesAndEquipmentSlots.DEFAULT_BOOTS);
            }
        }
    }

    private void registerArmorItem(ArmorMaterials material, String itemName, ArmorIndexesAndEquipmentSlots indexAndEquipmentSlot) {
        GameRegistry.register(new ArmorItem(material, itemName, indexAndEquipmentSlot));
    }
}
