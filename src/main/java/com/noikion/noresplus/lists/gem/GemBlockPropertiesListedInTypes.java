package com.noikion.noresplus.lists.gem;

import com.noikion.noresplus.blocks.properties.GemBlockProperties;
import com.noikion.noresplus.blocks.properties.GemOreProperties;
import com.noikion.noresplus.blocks.properties.BlockProperties;

public enum GemBlockPropertiesListedInTypes {
    ALL_BLOCKS(GemBlockProperties.AMBER, GemBlockProperties.CHRYSOCOLLA, GemBlockProperties.CALCITE, GemBlockProperties.MALACHITE, GemBlockProperties.GASPEITE,
        GemBlockProperties.ZEKTZERITE, GemBlockProperties.CORDIERITE, GemBlockProperties.BERYL, GemBlockProperties.RUBY, GemBlockProperties.SAPPHIRE),
    ORES(GemOreProperties.AMBER, GemOreProperties.CHRYSOCOLLA, GemOreProperties.CALCITE, GemOreProperties.MALACHITE, GemOreProperties.GASPEITE,
        GemOreProperties.ZEKTZERITE, GemOreProperties.CORDIERITE, GemOreProperties.BERYL, GemOreProperties.RUBY, GemOreProperties.SAPPHIRE);

    private final BlockProperties[] properties;

    GemBlockPropertiesListedInTypes(BlockProperties... properties) {
        this.properties = properties;
    }

    public BlockProperties[] getProperties() {
        return properties;
    }
}
