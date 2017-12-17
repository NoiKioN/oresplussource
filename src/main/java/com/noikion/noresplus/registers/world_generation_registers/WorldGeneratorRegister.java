package com.noikion.noresplus.registers.world_generation_registers;

import com.noikion.noresplus.lists.gem.GemWorldGeneratorsListedInTypes;
import net.minecraftforge.fml.common.IWorldGenerator;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class WorldGeneratorRegister {

    public void registerAllWorldGenerator() {
        registerWorldGenerators(GemWorldGeneratorsListedInTypes.MINABLE_WORLD_GENERATORS);
    }

    private void registerWorldGenerators(GemWorldGeneratorsListedInTypes minableGenerators) {
        for (IWorldGenerator worldGenerator : minableGenerators.getMinableWorldGenerators()) {
            registerWorldGenerator(worldGenerator);
        }
    }

    private void registerWorldGenerator(IWorldGenerator generator) {
        GameRegistry.registerWorldGenerator(generator, 0);
    }
}
