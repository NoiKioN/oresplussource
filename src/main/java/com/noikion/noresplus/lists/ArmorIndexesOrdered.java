package com.noikion.noresplus.lists;

import com.noikion.noresplus.items.indexes.ArmorIndexesAndEquipmentSlots;

public enum ArmorIndexesOrdered {
    ARMOR_INDEXES(ArmorIndexesAndEquipmentSlots.DEFAULT_HELMET, ArmorIndexesAndEquipmentSlots.DEFAULT_CHESTPLATE, ArmorIndexesAndEquipmentSlots.DEFAULT_LEGGINGS,
        ArmorIndexesAndEquipmentSlots.DEFAULT_BOOTS);

    private final ArmorIndexesAndEquipmentSlots[] armorIndexesAndEquipmentSlots;

    ArmorIndexesOrdered(ArmorIndexesAndEquipmentSlots... armorIndexesAndEquipmentSlots) {
        this.armorIndexesAndEquipmentSlots = armorIndexesAndEquipmentSlots;
    }
}
