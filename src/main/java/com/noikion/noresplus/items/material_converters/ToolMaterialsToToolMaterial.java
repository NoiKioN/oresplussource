package com.noikion.noresplus.items.material_converters;

import com.noikion.noresplus.items.indexes.ToolIndexes;
import com.noikion.noresplus.items.materials.ToolMaterials;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ToolMaterialsToToolMaterial {

    public static ToolMaterial toolMaterialsToToolMaterial(ToolMaterials material, int index) {
        return EnumHelper.addToolMaterial(material.getName(), material.getHarvestLevel(), material.getMaxUsesByToolIndex(index), material.getEfficiencyByToolIndex(index),
            material.getDamagesByToolIndex(index), material.getEnchantability());
    }
}
