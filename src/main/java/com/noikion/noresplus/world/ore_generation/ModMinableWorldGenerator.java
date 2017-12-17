package com.noikion.noresplus.world.ore_generation;

import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModMinableWorldGenerator implements IWorldGenerator {

    private WorldGenerator minableWorldGenerator;
    private IBlockState blockState;
    private int blockCount;
    private int chancesToSpawn;
    private int minHeight;
    private int maxHeight;

    public final void initWorldGen() {
        minableWorldGenerator = new WorldGenMinable(blockState, blockCount);
        checkChancesToSpawn();
        checkHeightValues();
    }

    public final void setBlockState(IBlockState blockState) {
        this.blockState = blockState;
    }

    public final void setBlockCount(int blockCount) {
        this.blockCount = blockCount;
    }

    public final void setChancesToSpawn(int chancesToSpawn) {
        this.chancesToSpawn = chancesToSpawn;
    }

    public final void setMinHeight(int minHeight) {
        this.minHeight = minHeight;
    }

    public final void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
        IChunkProvider chunkProvider) {
        if (blockState != null && blockCount != 0) {
            switch (world.provider.getDimension()) {
                case 0:
                    runGenerator(minableWorldGenerator, world, random, chunkX, chunkZ, chancesToSpawn, minHeight, maxHeight);
                    break;
                case -1:
                    break;
                case 1:
                    break;
            }
        } else {
            throw new IllegalArgumentException("The generator is not initialized properly!");
        }
    }

    private void runGenerator(WorldGenerator generator, World world, Random random, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
        }

        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chancesToSpawn; i++) {
            int x = chunk_X * 16 + random.nextInt(16);
            int y = minHeight + random.nextInt(heightDiff);
            int z = chunk_Z * 16 + random.nextInt(16);
            generator.generate(world, random, new BlockPos(x, y, z));
        }
    }

    private void checkChancesToSpawn() {
        if (this.chancesToSpawn == 0) {
            throw new IllegalArgumentException("Illegal Spawn Arguments!");
        }
    }

    private void checkHeightValues() {
        if (this.minHeight == 0 && this.maxHeight == 0) {
            throw new IllegalArgumentException("Illegal Height Arguments!");
        }
    }
}
