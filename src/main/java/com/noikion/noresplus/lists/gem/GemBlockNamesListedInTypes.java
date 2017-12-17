package com.noikion.noresplus.lists.gem;

public enum GemBlockNamesListedInTypes {
    ALL_BLOCKS(new String[]{"amber_block", "amber_block_clear"},
        new String[]{"chrysocolla_block", "chrysocolla_block_clear"},
        new String[]{"calcite_block", "calcite_block_clear"},
        new String[]{"malachite_block", "malachite_block_clear"},
        new String[]{"gaspeite_block", "gaspeite_block_clear"},
        new String[]{"zektzerite_block", "zektzerite_block_clear"},
        new String[]{"cordierite_block", "cordierite_block_half_clear", "cordierite_block_clear"},
        new String[]{"beryl_block", "beryl_block_clear"},
        new String[]{"ruby_block", "ruby_block_clear"},
        new String[]{"sapphire_block", "sapphire_block_clear"}),
    BLOCKS("amber_block", "chrysocolla_block", "calcite_block", "malachite_block", "gaspeite_block", "zektzerite_block",
        "cordierite_block", "beryl_block", "ruby_block", "sapphire_block"),
    ORES("amber_ore", "chrysocolla_ore", "calcite_ore", "malachite_ore", "gaspeite_ore", "zektzerite_ore",
            "cordierite_ore", "beryl_ore", "ruby_ore", "sapphire_ore"),
    GEM_BLOCKS_TO_BE_SWITCHED(new String[]{"amber_block", "amber_block_clear"},
        new String[]{"chrysocolla_block", "chrysocolla_block_clear"},
        new String[]{"calcite_block", "calcite_block_clear"},
        new String[]{"malachite_block", "malachite_block_clear"},
        new String[]{"gaspeite_block", "gaspeite_block_clear"},
        new String[]{"zektzerite_block", "zektzerite_block_clear"},
        new String[]{"cordierite_block", "cordierite_block_half_clear"},
        new String[]{"cordierite_block_half_clear", "cordierite_block_clear"},
        new String[]{"beryl_block", "beryl_block_clear"},
        new String[]{"ruby_block", "ruby_block_clear"},
        new String[]{"sapphire_block", "sapphire_block_clear"});

    private final String[] blockNames;

    private final String[][] blockNamePairs;

    GemBlockNamesListedInTypes(String... blockNames) {
        this.blockNames = blockNames;
        this.blockNamePairs = null;
    }

    GemBlockNamesListedInTypes(String[]... blockNamePairs) {
        this.blockNamePairs = blockNamePairs;
        this.blockNames = null;
    }

    public String[] getBlockNames() {
        return blockNames;
    }

    public String[][] getBlockNamePairs() {
        return blockNamePairs;
    }

    public static GemBlockNamesListedInTypes[] getRegistryValues() {
        GemBlockNamesListedInTypes[] blockNames = new GemBlockNamesListedInTypes[]{GemBlockNamesListedInTypes.ALL_BLOCKS, GemBlockNamesListedInTypes.ORES};

        return blockNames;
    }
}
