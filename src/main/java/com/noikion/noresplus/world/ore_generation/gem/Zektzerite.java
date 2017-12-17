package com.noikion.noresplus.world.ore_generation.gem;

import com.noikion.noresplus.blocks.BlockNameToBlock;
import com.noikion.noresplus.world.ore_generation.ModMinableWorldGenerator;

public class Zektzerite extends ModMinableWorldGenerator {

    public Zektzerite() {
        setBlockState(BlockNameToBlock.getRegisteredBlockByName("zektzerite_ore").getDefaultState());
        setBlockCount(9);
        setChancesToSpawn(4);
        setMinHeight(0);
        setMaxHeight(75);
        initWorldGen();
    }
}
