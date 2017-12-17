package com.noikion.noresplus.proxies;

import com.noikion.noresplus.registers.block_registers.BlockRendererRegister;
import com.noikion.noresplus.registers.item_registers.ItemRendererRegister;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    private ItemRendererRegister registerItemRenderers;
    private BlockRendererRegister registerBlockRenderers;

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        registerItemRenderers = new ItemRendererRegister();
        registerBlockRenderers = new BlockRendererRegister();

        registerItemRenderers.registerAllItemRenderers();
        registerBlockRenderers.registerAllBlockRenderers();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
