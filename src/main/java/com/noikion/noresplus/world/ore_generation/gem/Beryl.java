package com.noikion.noresplus.world.ore_generation.gem;

import com.noikion.noresplus.world.ore_generation.ModMinableWorldGenerator;
import com.noikion.noresplus.blocks.BlockNameToBlock;

public class Beryl extends ModMinableWorldGenerator {

    public Beryl() {
        setBlockState(BlockNameToBlock.getRegisteredBlockByName("beryl_ore").getDefaultState());
        setBlockCount(8);
        setChancesToSpawn(3);
        setMinHeight(0);
        setMaxHeight(65);
        initWorldGen();
    }
}
