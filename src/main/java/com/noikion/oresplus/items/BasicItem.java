package com.noikion.oresplus.items;

import com.noikion.oresplus.creative_tabs.OresPlusCreativeTab;

import net.minecraft.item.Item;

public class BasicItem extends Item {
	public BasicItem(String unlocalizedName, String registryName){
		super();
		
		this.setRegistryName(registryName);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(OresPlusCreativeTab.oresPlusCreativeTab);
	}
}
