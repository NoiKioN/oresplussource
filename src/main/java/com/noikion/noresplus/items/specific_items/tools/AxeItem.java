package com.noikion.noresplus.items.specific_items.tools;

import com.noikion.noresplus.creative_tabs.ModCreativeTabs;
import com.noikion.noresplus.items.material_converters.ToolMaterialsToToolMaterial;
import com.noikion.noresplus.items.indexes.ToolIndexes;
import com.noikion.noresplus.items.materials.ToolMaterials;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class AxeItem extends ItemAxe {

    private static final int TOOL_INDEX = ToolIndexes.AXE;
    private ToolMaterials material;

    public AxeItem(ToolMaterials material, String itemName) {
        this(ToolMaterialsToToolMaterial.toolMaterialsToToolMaterial(material, TOOL_INDEX), material.getDamagesByToolIndex(TOOL_INDEX), material.getAttackSpeedByToolIndex(TOOL_INDEX));

        this.material = material;
        this.setRegistryName(itemName);
        this.setUnlocalizedName(itemName);
        this.setCreativeTab(ModCreativeTabs.NORES_PLUS_TOOLS);
        this.setMaxDamage(material.getMaxUsesByToolIndex(TOOL_INDEX));
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        if (material.getName() == repair.getItem().getRegistryName().getResourcePath()) {
            return true;
        }
        return false;
    }

    public AxeItem(ToolMaterial material, float attackSpeed, float attackDamage) {
        super(material, attackSpeed, attackDamage);
    }
}
