package com.noikion.noresplus.blocks;

import com.noikion.noresplus.blocks.properties.BlockProperties;
import com.noikion.noresplus.creative_tabs.ModCreativeTabs;

import net.minecraft.block.BlockBreakable;

public class BasicBlock extends BlockBreakable {

    public BasicBlock(BlockProperties blockProperties, String blockName) {

        super(blockProperties.getMaterial(), blockProperties.isIgnoreSimilarity());

        this.setRegistryName(blockName);
        this.setUnlocalizedName(blockName);
        this.setCreativeTab(ModCreativeTabs.NORES_PLUS_BLOCKS_AND_MATERIALS);

        this.setHardness(blockProperties.getHardness());
        this.setResistance(blockProperties.getResistance());
        this.setHarvestLevel(blockProperties.getHarvestTool(), blockProperties.getHarvestLevel());
        this.setLightLevel(blockProperties.getEmittedLightLevel());
        this.setLightOpacity(blockProperties.getLightOpacity());
        this.setTickRandomly(blockProperties.isTickingRandomly());
    }
}
