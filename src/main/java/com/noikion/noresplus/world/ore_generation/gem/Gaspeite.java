package com.noikion.noresplus.world.ore_generation.gem;

import com.noikion.noresplus.blocks.BlockNameToBlock;
import com.noikion.noresplus.world.ore_generation.ModMinableWorldGenerator;

public class Gaspeite extends ModMinableWorldGenerator {

    public Gaspeite() {
        setBlockState(BlockNameToBlock.getRegisteredBlockByName("gaspeite_ore").getDefaultState());
        setBlockCount(10);
        setChancesToSpawn(4);
        setMinHeight(0);
        setMaxHeight(80);
        initWorldGen();
    }
}
