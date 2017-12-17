package com.noikion.noresplus.world.dimension_generator.specific_biomes;

import com.noikion.noresplus.world.dimension_generator.specific_biome_properties.FrozenOresBiomeProperties;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;

public class FrozenOresBiome extends Biome{
    
    public FrozenOresBiome(BiomeProperties properties){
        super(properties);
        registerBiome(999, "frozen_ores_biome", new FrozenOresBiome(new FrozenOresBiomeProperties()));
    }
}
