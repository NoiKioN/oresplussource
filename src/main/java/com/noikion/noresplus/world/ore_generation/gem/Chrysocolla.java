package com.noikion.noresplus.world.ore_generation.gem;

import com.noikion.noresplus.world.ore_generation.ModMinableWorldGenerator;
import com.noikion.noresplus.blocks.BlockNameToBlock;

public class Chrysocolla extends ModMinableWorldGenerator {

    public Chrysocolla() {
        setBlockState(BlockNameToBlock.getRegisteredBlockByName("chrysocolla_ore").getDefaultState());
        setBlockCount(11);
        setChancesToSpawn(6);
        setMinHeight(0);
        setMaxHeight(95);
        initWorldGen();
    }
}
