package com.noikion.noresplus.blocks.properties.block_properties;

import com.noikion.noresplus.blocks.properties.BlockProperties;
import com.noikion.noresplus.blocks.properties.default_properties.BlockHardness;
import com.noikion.noresplus.blocks.properties.default_properties.BlockHarvestTools;
import com.noikion.noresplus.blocks.properties.default_properties.BlockResistance;
import net.minecraft.block.material.Material;

public class Amber extends BlockProperties {

    public Amber() {
        setMaterial(Material.ROCK);
        setHarvestLevel(0);
        setHarvestTool(BlockHarvestTools.PICKAXE);
        setItemDropped(null);
        setDropMinQuantity(1);
        setDropMaxQuantity(1);
        setHardness(BlockHardness.DEFAULT_BLOCK);
        setResistance(BlockResistance.DEFAULT_BLOCK);
        setTranslucent(true);
        setEmittedLightLevel(0.0F);
        setLightOpacity(4);
        setBlockMeta(0);
        setTickingRandomly(false);
    }
}
