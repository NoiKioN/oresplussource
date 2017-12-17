package com.noikion.noresplus;

import com.noikion.noresplus.proxies.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModProperties.MOD_ID, version = ModProperties.MOD_VERSION, updateJSON = ModProperties.MOD_UPDATE_JSON, acceptedMinecraftVersions = ModProperties.ACCEPTED_MINECRAFT_VERSIONS)
public class OresPlus {

    @Instance
    public static OresPlus instance;

    @SidedProxy(clientSide = ModProperties.MOD_CLIENT_PROXY, serverSide = ModProperties.MOD_SERVER_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
