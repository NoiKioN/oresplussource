package com.noikion.noresplus.items.specific_items.tools;

import com.google.common.collect.Multimap;
import com.noikion.noresplus.creative_tabs.ModCreativeTabs;
import com.noikion.noresplus.items.material_converters.ToolMaterialsToToolMaterial;
import com.noikion.noresplus.items.indexes.ToolIndexes;
import com.noikion.noresplus.items.materials.ToolMaterials;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class HoeItem extends ItemHoe {

    private static final int TOOL_INDEX = ToolIndexes.HOE;
    private ToolMaterials material;
    private float attackSpeed;
    private float damageVsEntity;

    public HoeItem(ToolMaterials material, String itemName) {
        super(ToolMaterialsToToolMaterial.toolMaterialsToToolMaterial(material, TOOL_INDEX));

        this.material = material;
        this.setRegistryName(itemName);
        this.setUnlocalizedName(itemName);
        this.setCreativeTab(ModCreativeTabs.NORES_PLUS_TOOLS);
        attackSpeed = material.getAttackSpeedByToolIndex(TOOL_INDEX);
        damageVsEntity = material.getDamagesByToolIndex(TOOL_INDEX);
        this.setMaxDamage(material.getMaxUsesByToolIndex(TOOL_INDEX));
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        if (material.getName() == repair.getItem().getRegistryName().getResourcePath()) {
            return true;
        }
        return false;
    }

    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

        if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getAttributeUnlocalizedName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double) damageVsEntity, 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getAttributeUnlocalizedName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", (double) attackSpeed, 0));
        }

        return multimap;
    }
}
