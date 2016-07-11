package com.noikion.oresplus.items.item_registers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class RegisterItemRenderers {
	
	public void registerItemRenderers()
	{

		registerItemRenderer(RegisterItems.cordierite, 0);
		
	}
	
	public void registerItemRenderer(Item item, int meta)
	{
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	
	}
}
