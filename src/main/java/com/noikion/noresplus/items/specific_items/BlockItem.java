package com.noikion.noresplus.items.specific_items;

import com.noikion.noresplus.creative_tabs.ModCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class BlockItem extends ItemBlock {

    public BlockItem(Block block, String blockName) {
        super(block);

        this.setRegistryName(blockName);
        this.setUnlocalizedName(blockName);
        this.setCreativeTab(ModCreativeTabs.NORES_PLUS_BLOCKS_AND_MATERIALS);
    }

}
