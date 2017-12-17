package com.noikion.noresplus.blocks;

import com.noikion.noresplus.ModProperties;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;

public class BlockNameToBlock {

    public static final Block[] getRegisteredBlocksByNames(String[] names) {
        Block[] blocks = new Block[names.length];

        int i = 0;
        for (String name : names) {
            blocks[i] = getRegisteredBlockByName(name);
            i++;
        }

        return blocks;
    }

    public static Block getRegisteredBlockByName(String name) {
        Block block = (Block) Block.REGISTRY.getObject(new ResourceLocation(ModProperties.MOD_ID, name));

        if (block == null) {
            throw new IllegalStateException("Invalid Item requested: " + name);
        } else {
            return block;
        }
    }
}
