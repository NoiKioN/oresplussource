package com.noikion.noresplus.world.ore_generation.gem;

import com.noikion.noresplus.world.ore_generation.ModMinableWorldGenerator;
import com.noikion.noresplus.blocks.BlockNameToBlock;

public class Cordierite extends ModMinableWorldGenerator {

    public Cordierite() {
        setBlockState(BlockNameToBlock.getRegisteredBlockByName("cordierite_ore").getDefaultState());
        setBlockCount(9);
        setChancesToSpawn(3);
        setMinHeight(0);
        setMaxHeight(70);
        initWorldGen();
    }
}
