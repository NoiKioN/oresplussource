package com.noikion.noresplus.proxies;

import com.noikion.noresplus.eventHandlers.playerEventHandler;
import com.noikion.noresplus.registers.block_registers.BlockRegister;
import com.noikion.noresplus.registers.crafting_recipe_registers.CraftingRecipeRegister;
import com.noikion.noresplus.registers.item_registers.BlockItemRegister;
import com.noikion.noresplus.registers.item_registers.ItemRegister;
import com.noikion.noresplus.registers.world_generation_registers.WorldGeneratorRegister;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    private ItemRegister itemRegister;
    private BlockRegister blockRegister;
    private BlockItemRegister blockItemRegister;
    private CraftingRecipeRegister craftingRecipeRegister;
    private WorldGeneratorRegister worldGeneratorRegister;

    public void preInit(FMLPreInitializationEvent event) {
        itemRegister = new ItemRegister();
        itemRegister.registerItems();

        blockRegister = new BlockRegister();
        blockRegister.registerBlocks();

        blockItemRegister = new BlockItemRegister();
        blockItemRegister.registerBlockItems();
    }

    public void init(FMLInitializationEvent event) {
        worldGeneratorRegister = new WorldGeneratorRegister();
        worldGeneratorRegister.registerAllWorldGenerator();

        craftingRecipeRegister = new CraftingRecipeRegister();
        craftingRecipeRegister.registerAllRecipes();

        MinecraftForge.EVENT_BUS.register(new playerEventHandler());
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
