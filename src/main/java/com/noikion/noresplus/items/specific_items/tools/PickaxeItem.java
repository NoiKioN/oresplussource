package com.noikion.noresplus.items.specific_items.tools;

import com.noikion.noresplus.creative_tabs.ModCreativeTabs;
import com.noikion.noresplus.items.material_converters.ToolMaterialsToToolMaterial;
import com.noikion.noresplus.items.indexes.ToolIndexes;
import com.noikion.noresplus.items.materials.ToolMaterials;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class PickaxeItem extends ItemPickaxe {

    private static final int TOOL_INDEX = ToolIndexes.PICK_AXE;
    private ToolMaterials material;

    public PickaxeItem(ToolMaterials material, String itemName) {
        super(ToolMaterialsToToolMaterial.toolMaterialsToToolMaterial(material, TOOL_INDEX));

        this.material = material;
        this.setRegistryName(itemName);
        this.setUnlocalizedName(itemName);
        this.setCreativeTab(ModCreativeTabs.NORES_PLUS_TOOLS);
        this.attackSpeed = material.getAttackSpeedByToolIndex(TOOL_INDEX);
        this.damageVsEntity = material.getDamagesByToolIndex(TOOL_INDEX);
        this.setMaxDamage(material.getMaxUsesByToolIndex(TOOL_INDEX));
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        if (material.getName() == repair.getItem().getRegistryName().getResourcePath()) {
            return true;
        }
        return false;
    }
}
