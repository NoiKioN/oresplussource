package com.noikion.noresplus.world.ore_generation.gem;

import com.noikion.noresplus.world.ore_generation.ModMinableWorldGenerator;
import com.noikion.noresplus.blocks.BlockNameToBlock;

public class Malachite extends ModMinableWorldGenerator {

    public Malachite() {
        setBlockState(BlockNameToBlock.getRegisteredBlockByName("malachite_ore").getDefaultState());
        setBlockCount(10);
        setChancesToSpawn(5);
        setMinHeight(0);
        setMaxHeight(85);
        initWorldGen();
    }
}
