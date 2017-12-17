package com.noikion.noresplus.blocks.specific_blocks;

import java.util.Random;

import com.noikion.noresplus.blocks.BasicBlock;
import com.noikion.noresplus.blocks.properties.BlockProperties;

import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TranslucentBlock extends BasicBlock {

    public TranslucentBlock(BlockProperties blockProperties, String blockName) {
        super(blockProperties, blockName);

        this.translucent = blockProperties.isTranslucent();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
    }
}
