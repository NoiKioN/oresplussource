package com.noikion.noresplus.registers.block_registers;

import com.noikion.noresplus.blocks.properties.BlockProperties;
import com.noikion.noresplus.blocks.specific_blocks.OreBlock;
import com.noikion.noresplus.blocks.specific_blocks.TranslucentBlock;
import com.noikion.noresplus.lists.gem.GemBlockNamesListedInTypes;
import com.noikion.noresplus.lists.gem.GemBlockPropertiesListedInTypes;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRegister {

    public void registerBlocks() {
        // ------------------------------------------- ORES ------------------------------------------- //
        registerOreBlocks(GemBlockPropertiesListedInTypes.ORES.getProperties(), GemBlockNamesListedInTypes.ORES.getBlockNames());

        // ------------------------------------------- BLOCKS ------------------------------------------- //
        registerTranslucentBlocks(GemBlockPropertiesListedInTypes.ALL_BLOCKS.getProperties(), GemBlockNamesListedInTypes.ALL_BLOCKS.getBlockNamePairs());
    }

    private void registerOreBlocks(BlockProperties[] blockProperties, String[] blockNames) {
        int i = 0;
        for (String blockName : blockNames) {
            registerOreBlock(blockProperties[i], blockName);
            i++;
        }
    }

    private void registerTranslucentBlocks(BlockProperties[] blockProperties, String[][] blockNamePairs) {
        int i = 0;
        for (String[] blockNames : blockNamePairs) {
            for (String blockName : blockNames) {
                registerTranslucentBlock(blockProperties[i], blockName);
            }
            i++;
        }
    }

    private void registerOreBlock(BlockProperties blockProperties, String blockName) {
        GameRegistry.register(new OreBlock(blockProperties, blockName));
    }

    private void registerTranslucentBlock(BlockProperties blockProperties, String blockName) {
        GameRegistry.register(new TranslucentBlock(blockProperties, blockName));
    }
}
