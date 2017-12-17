package com.noikion.noresplus.world.dimension_generator.specific_biome_properties;

import net.minecraft.world.biome.Biome;

public class FrozenOresBiomeProperties extends Biome.BiomeProperties{
    public FrozenOresBiomeProperties(){
        super("Frozen Ores");
        setBaseBiome("frozen_biome");
        setBaseHeight(1.0F);
        setHeightVariation(0.5F);
        setRainfall(1.0F);
        setSnowEnabled();
        setTemperature(0.0F);
        setWaterColor(41382);
    }
}
