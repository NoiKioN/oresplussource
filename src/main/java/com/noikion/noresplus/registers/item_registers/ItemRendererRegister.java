package com.noikion.noresplus.registers.item_registers;

import com.noikion.noresplus.items.ItemNameToItem;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRendererRegister {

    public void registerAllItemRenderers() {
        for (GemItemNamesListedInTypes itemNames : GemItemNamesListedInTypes.values()) {
            for (String item : itemNames.getItemNames()) {
                registerItemRenderer(ItemNameToItem.getRegisteredItemByName(item));
            }
        }
    }

    private void registerItemRenderer(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
