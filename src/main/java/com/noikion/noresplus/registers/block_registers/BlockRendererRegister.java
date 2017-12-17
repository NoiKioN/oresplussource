package com.noikion.noresplus.registers.block_registers;

import com.noikion.noresplus.blocks.BlockNameToBlock;
import com.noikion.noresplus.lists.gem.GemBlockNamesListedInTypes;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRendererRegister {

    public void registerAllBlockRenderers() {
        registerBlockRenderers(GemBlockNamesListedInTypes.getRegistryValues());
    }

    private void registerBlockRenderers(GemBlockNamesListedInTypes[] blocks) {
        for (GemBlockNamesListedInTypes blockNames : blocks) {
            if (blockNames == GemBlockNamesListedInTypes.ORES) {
                for (String block : blockNames.getBlockNames()) {
                    registerBlockRenderer(BlockNameToBlock.getRegisteredBlockByName(block));
                }
            } else {
                for (String[] blockPair : blockNames.getBlockNamePairs()) {
                    for (String block : blockPair) {
                        registerBlockRenderer(BlockNameToBlock.getRegisteredBlockByName(block));
                    }
                }
            }
        }
    }

    private void registerBlockRenderer(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
