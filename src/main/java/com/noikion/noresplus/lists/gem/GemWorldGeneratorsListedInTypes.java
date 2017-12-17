package com.noikion.noresplus.lists.gem;

import com.noikion.noresplus.world.ore_generation.ModMinableWorldGenerator;
import com.noikion.noresplus.world.ore_generation.GemOreGenerators;

public enum GemWorldGeneratorsListedInTypes {
    MINABLE_WORLD_GENERATORS(GemOreGenerators.AMBER, GemOreGenerators.CHRYSOCOLLA, GemOreGenerators.CALCITE, GemOreGenerators.GASPEITE, GemOreGenerators.ZEKTZERITE,
        GemOreGenerators.MALACHITE, GemOreGenerators.CORDIERITE, GemOreGenerators.BERYL, GemOreGenerators.RUBY, GemOreGenerators.SAPPHIRE);

    private final ModMinableWorldGenerator[] minableWorldGenerators;

    GemWorldGeneratorsListedInTypes(ModMinableWorldGenerator... minableWorldGenerators) {
        this.minableWorldGenerators = minableWorldGenerators;
    }

    public ModMinableWorldGenerator[] getMinableWorldGenerators() {
        return minableWorldGenerators;
    }
}
