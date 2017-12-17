package com.noikion.noresplus.items.material_converters;

import com.noikion.noresplus.items.materials.ArmorMaterials;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorMaterialsToArmorMaterial {

    public static ArmorMaterial armorMaterialsToArmorMaterial(ArmorMaterials material) {
        return EnumHelper.addArmorMaterial(material.getName(), material.getName(), material.getDurability(), material.getDefenses(), material.getEnchantability(),
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, material.getToughness());
    }
}
