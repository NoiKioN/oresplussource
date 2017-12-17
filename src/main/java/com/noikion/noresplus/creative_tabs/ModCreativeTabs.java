package com.noikion.noresplus.creative_tabs;

import com.noikion.noresplus.blocks.BlockNameToBlock;
import com.noikion.noresplus.items.ItemNameToItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModCreativeTabs {

    public static final CreativeTabs NORES_PLUS_BLOCKS_AND_MATERIALS = (new CreativeTabs("noresplus_blocks_and_materials") {

        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(BlockNameToBlock.getRegisteredBlockByName("beryl_block"));
        }

    });

    public static final CreativeTabs NORES_PLUS_WEAPONS_AND_ARMOR = (new CreativeTabs("noresplus_weapons_and_armor") {

        @Override
        public Item getTabIconItem() {
            return ItemNameToItem.getRegisteredItemByName("beryl_sword");
        }

    });

    public static final CreativeTabs NORES_PLUS_TOOLS = (new CreativeTabs("noresplus_tools") {

        @Override
        public Item getTabIconItem() {
            return ItemNameToItem.getRegisteredItemByName("beryl_pickaxe");
        }

    });
}
