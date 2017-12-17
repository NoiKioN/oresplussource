package com.noikion.noresplus.items.specific_items;

import com.noikion.noresplus.creative_tabs.ModCreativeTabs;
import com.noikion.noresplus.items.material_converters.ArmorMaterialsToArmorMaterial;
import com.noikion.noresplus.items.indexes.ArmorIndexesAndEquipmentSlots;
import com.noikion.noresplus.items.materials.ArmorMaterials;

import net.minecraft.item.ItemArmor;

public class ArmorItem extends ItemArmor {

    public ArmorItem(ArmorMaterials materialIn, String itemName, ArmorIndexesAndEquipmentSlots indexAndEquipmentSlot) {
        super(ArmorMaterialsToArmorMaterial.armorMaterialsToArmorMaterial(materialIn), indexAndEquipmentSlot.getRenderIndex(), indexAndEquipmentSlot.getEquipmentSlot());

        this.setRegistryName(itemName);
        this.setUnlocalizedName(itemName);
        this.setCreativeTab(ModCreativeTabs.NORES_PLUS_WEAPONS_AND_ARMOR);
    }
}
