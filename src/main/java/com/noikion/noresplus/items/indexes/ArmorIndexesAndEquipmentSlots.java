package com.noikion.noresplus.items.indexes;

import net.minecraft.inventory.EntityEquipmentSlot;

public enum ArmorIndexesAndEquipmentSlots {
    DEFAULT_HELMET(1, EntityEquipmentSlot.HEAD),
    DEFAULT_CHESTPLATE(1, EntityEquipmentSlot.CHEST),
    DEFAULT_LEGGINGS(2, EntityEquipmentSlot.LEGS),
    DEFAULT_BOOTS(1, EntityEquipmentSlot.FEET);

    private int renderIndex;
    private EntityEquipmentSlot equipmentSlot;

    ArmorIndexesAndEquipmentSlots(int renderIndex, EntityEquipmentSlot equipmentSlot) {
        this.renderIndex = renderIndex;
        this.equipmentSlot = equipmentSlot;
    }

    public int getRenderIndex() {
        return renderIndex;
    }

    public EntityEquipmentSlot getEquipmentSlot() {
        return equipmentSlot;
    }
}
