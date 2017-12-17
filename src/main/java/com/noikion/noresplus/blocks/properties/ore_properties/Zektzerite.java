package com.noikion.noresplus.blocks.properties.ore_properties;

import com.noikion.noresplus.blocks.properties.BlockProperties;
import com.noikion.noresplus.blocks.properties.default_properties.BlockHardness;
import com.noikion.noresplus.blocks.properties.default_properties.BlockHarvestTools;
import com.noikion.noresplus.blocks.properties.default_properties.BlockResistance;
import com.noikion.noresplus.items.ItemNameToItem;
import net.minecraft.block.material.Material;

public class Zektzerite extends BlockProperties {

    public Zektzerite() {
        setMaterial(Material.ROCK);
        setHarvestLevel(2);
        setHarvestTool(BlockHarvestTools.PICKAXE);
        setItemDropped(ItemNameToItem.getRegisteredItemByName("zektzerite"));
        setDropMinQuantity(1);
        setDropMaxQuantity(1);
        setHardness(BlockHardness.DEFAULT_ORE);
        setResistance(BlockResistance.DEFAULT_ORE);
        setTranslucent(false);
        setEmittedLightLevel(10.0F);
        setLightOpacity(16);
        setBlockMeta(0);
        setTickingRandomly(false);
    }
}
