package com.noikion.noresplus.lists.gem;

public enum GemItemNamesListedInTypes {
    // ------------------------------------------- MATERIALS ------------------------------------------- //
    MATERIALS("amber", "chrysocolla", "calcite", "malachite", "gaspeite", "zektzerite", "cordierite", "beryl", "ruby", "sapphire"/*, "galactic_crystal", "galactic_crystal_enchanter"*/),
    // ------------------------------------------- TOOLS ------------------------------------------- //
    AMBER_TOOLS,
    CHRYSOCOLLA_TOOLS,
    CALCITE_TOOLS,
    MALACHITE_TOOLS,
    GASPEITE_TOOLS,
    ZEKTZERITE_TOOLS,
    CORDIERITE_TOOLS,
    BERYL_TOOLS,
    RUBY_TOOLS,
    SAPPHIRE_TOOLS,
    ADDITIONAL_REFINERS("wood_refiner", "stone_refiner", "iron_refiner", "gold_refiner", "diamond_refiner"),
    
    // ------------------------------------------- SUPERIOR TOOLS ------------------------------------------- //
    //GALACTIC_CRYSTAL_TOOLS("galactic_crystal_sword"),
    //GALACTIC_CRYSTAL_ENHANCED_TOOLS("galactic_crystal_sword_enchanted"),
    
    // ------------------------------------------- ARMORS ------------------------------------------- //
    AMBER_ARMORS,
    CHRYSOCOLLA_ARMORS,
    CALCITE_ARMORS,
    MALACHITE_ARMORS,
    GASPEITE_ARMORS,
    ZEKTZERITE_ARMORS,
    CORDIERITE_ARMORS,
    BERYL_ARMORS,
    RUBY_ARMORS,
    SAPPHIRE_ARMORS,
    
    // ------------------------------------------- SUPERIOR ARMORS ------------------------------------------- //
    //GALACTIC_CRYSTAL_ARMORS("galactic_crystal_boots"),
    //GALACTIC_CRYSTAL_ENCHANTED_ARMORS("galactic_crystal_boots_enchanted"),
    ;
    private final String[] itemNames;

    GemItemNamesListedInTypes(String... itemNames) {
        if (itemNames.length > 0) {
            this.itemNames = itemNames;
        } else if (name().contains("TOOLS")) {
            this.itemNames = GenerateToolItemNames();
        } else {
            this.itemNames = GenerateArmorItemNames();
        }
    }

    public String[] getItemNames() {
        return itemNames;
    }

    private String[] GenerateToolItemNames() {
        String[] toolNames = {"sword", "pickaxe", "axe", "shovel", "hoe", "refiner"};
        String[] itemNames = new String[toolNames.length];
        int i = 0;
        for (String toolName : toolNames) {
            itemNames[i] = name().substring(0, name().indexOf("_")).toLowerCase() + "_" + toolName;
            i++;
        }
        return itemNames;
    }

    private String[] GenerateArmorItemNames() {
        String[] armorNames = {"helmet", "chestplate", "leggings", "boots"};
        String[] itemNames = new String[armorNames.length];
        int i = 0;
        for (String armorName : armorNames) {
            itemNames[i] = name().substring(0, name().indexOf("_")).toLowerCase() + "_" + armorName;
            i++;
        }
        return itemNames;
    }
}
