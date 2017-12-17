package com.noikion.noresplus.world.ore_generation.gem;

import com.noikion.noresplus.blocks.BlockNameToBlock;
import com.noikion.noresplus.world.ore_generation.ModMinableWorldGenerator;

public class Ruby extends ModMinableWorldGenerator {

    public Ruby() {
        setBlockState(BlockNameToBlock.getRegisteredBlockByName("ruby_ore").getDefaultState());
        setBlockCount(8);
        setChancesToSpawn(2);
        setMinHeight(0);
        setMaxHeight(60);
        initWorldGen();
    }
}
