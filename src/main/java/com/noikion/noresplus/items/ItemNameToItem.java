package com.noikion.noresplus.items;

import com.noikion.noresplus.ModProperties;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemNameToItem {

    public static final Item[] getRegisteredItemsByNames(String[] names) {
        Item[] items = new Item[names.length];

        int i = 0;
        for (String name : names) {
            items[i] = getRegisteredItemByName(name);
            i++;
        }

        return items;
    }

    public static final Item getRegisteredItemByName(String name) {
        Item item = (Item) Item.REGISTRY.getObject(new ResourceLocation(ModProperties.MOD_ID, name));

        if (item == null) {
            throw new IllegalStateException("Invalid Item requested: " + name);
        } else {
            return item;
        }
    }
}
