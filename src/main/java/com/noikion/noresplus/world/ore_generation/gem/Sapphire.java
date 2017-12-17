package com.noikion.noresplus.world.ore_generation.gem;

import com.noikion.noresplus.blocks.BlockNameToBlock;
import com.noikion.noresplus.world.ore_generation.ModMinableWorldGenerator;

public class Sapphire extends ModMinableWorldGenerator {

    public Sapphire() {
        setBlockState(BlockNameToBlock.getRegisteredBlockByName("sapphire_ore").getDefaultState());
        setBlockCount(7);
        setChancesToSpawn(2);
        setMinHeight(0);
        setMaxHeight(55);
        initWorldGen();
    }
}
