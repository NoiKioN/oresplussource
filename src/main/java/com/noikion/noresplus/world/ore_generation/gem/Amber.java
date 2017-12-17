package com.noikion.noresplus.world.ore_generation.gem;

import com.noikion.noresplus.world.ore_generation.ModMinableWorldGenerator;
import com.noikion.noresplus.blocks.BlockNameToBlock;

public class Amber extends ModMinableWorldGenerator {

    public Amber() {
        setBlockState(BlockNameToBlock.getRegisteredBlockByName("amber_ore").getDefaultState());
        setBlockCount(12);
        setChancesToSpawn(6);
        setMinHeight(0);
        setMaxHeight(100);
        initWorldGen();
    }
}
