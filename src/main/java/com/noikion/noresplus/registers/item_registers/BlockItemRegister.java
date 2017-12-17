package com.noikion.noresplus.registers.item_registers;

import com.noikion.noresplus.blocks.BlockNameToBlock;
import com.noikion.noresplus.items.specific_items.BlockItem;
import com.noikion.noresplus.lists.gem.GemBlockNamesListedInTypes;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockItemRegister {

    public void registerBlockItems() {
        // ------------------------------------------- ORES  ------------------------------------------- //
        registerItemBlocks(GemBlockNamesListedInTypes.ORES.getBlockNames());

        // ------------------------------------------- BLOCKS  ------------------------------------------- //
        registerItemBlocks(GemBlockNamesListedInTypes.ALL_BLOCKS.getBlockNamePairs());

    }

    private void registerItemBlocks(String[][] blockNames) {
        int i = 0;
        for (String[] blockNamePair : blockNames) {
            int j = 0;
            for (String blockName : blockNamePair) {
                registerItemBlock(BlockNameToBlock.getRegisteredBlockByName(blockName), blockName);
                j++;
            }
            i++;
        }
    }

    private void registerItemBlocks(String[] blockNames) {
        int i = 0;
        for (String blockName : blockNames) {
            registerItemBlock(BlockNameToBlock.getRegisteredBlockByName(blockName), blockName);
            i++;
        }
    }

    private void registerItemBlock(Block block, String blockName) {
        GameRegistry.register(new BlockItem(block, blockName));
    }
}
