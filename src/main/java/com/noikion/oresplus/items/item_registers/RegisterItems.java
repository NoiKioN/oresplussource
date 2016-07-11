package com.noikion.oresplus.items.item_registers;

import com.noikion.oresplus.items.BasicItem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterItems
{

	public static Item cordierite;
	
	public static void createItems()
	{
		cordierite = new BasicItem("cordierite", "cordierite");
		GameRegistry.register(cordierite);
	}
}
