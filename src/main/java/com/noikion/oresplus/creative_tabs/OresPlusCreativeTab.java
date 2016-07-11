package com.noikion.oresplus.creative_tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class OresPlusCreativeTab {
	public static CreativeTabs oresPlusCreativeTab = (new CreativeTabs("oreplus"){

		@Override
		public Item getTabIconItem() {
			return Items.FLINT;
		}
		
	});
}
