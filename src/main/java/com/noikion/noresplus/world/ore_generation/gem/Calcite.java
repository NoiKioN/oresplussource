package com.noikion.noresplus.world.ore_generation.gem;

import com.noikion.noresplus.world.ore_generation.ModMinableWorldGenerator;
import com.noikion.noresplus.blocks.BlockNameToBlock;

public class Calcite extends ModMinableWorldGenerator {

    public Calcite() {
        setBlockState(BlockNameToBlock.getRegisteredBlockByName("calcite_ore").getDefaultState());
        setBlockCount(11);
        setChancesToSpawn(5);
        setMinHeight(0);
        setMaxHeight(90);
        initWorldGen();
    }
}
