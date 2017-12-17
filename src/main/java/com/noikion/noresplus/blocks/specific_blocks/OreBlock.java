package com.noikion.noresplus.blocks.specific_blocks;

import java.util.Random;

import com.noikion.noresplus.blocks.BasicBlock;
import com.noikion.noresplus.blocks.properties.BlockProperties;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class OreBlock extends BasicBlock {

    private final Item drop;
    private final int meta;
    private final int minQuantity;
    private final int maxQuantity;

    public OreBlock(BlockProperties blockProperties, String blockName) {
        super(blockProperties, blockName);

        this.drop = blockProperties.getItemDropped();
        this.meta = blockProperties.getBlockMeta();
        this.minQuantity = blockProperties.getDropMinQuantity();
        this.maxQuantity = blockProperties.getDropMaxQuantity();
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return this.drop;
    }

    @Override
    public int damageDropped(IBlockState state) {
        return this.meta;
    }

    @Override
    public int quantityDropped(IBlockState state, int fortune, Random random) {
        if (this.minQuantity >= this.maxQuantity || maxQuantity == 0) {
            return this.minQuantity;
        }
        return this.minQuantity + random.nextInt(this.maxQuantity - this.minQuantity + fortune + 1);
    }
}
