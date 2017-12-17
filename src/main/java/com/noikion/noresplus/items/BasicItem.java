package com.noikion.noresplus.items;

import java.util.List;

import com.noikion.noresplus.creative_tabs.ModCreativeTabs;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BasicItem extends Item {

    public BasicItem(String itemName) {
        super();

        this.setRegistryName(itemName);
        this.setUnlocalizedName(itemName);
        this.setCreativeTab(ModCreativeTabs.NORES_PLUS_BLOCKS_AND_MATERIALS);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        InformationAdding.addInfoToMaterialItems(stack, tooltip);
    }
}
