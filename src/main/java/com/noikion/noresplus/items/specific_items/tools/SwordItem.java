package com.noikion.noresplus.items.specific_items.tools;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.noikion.noresplus.creative_tabs.ModCreativeTabs;
import com.noikion.noresplus.items.material_converters.ToolMaterialsToToolMaterial;
import com.noikion.noresplus.items.indexes.ToolIndexes;
import com.noikion.noresplus.items.materials.ToolMaterials;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class SwordItem extends ItemSword {

    private static final int TOOL_INDEX = ToolIndexes.SWORD;
    private ToolMaterials material;
    private float attackSpeed;
    private float damageVsEntities;

    public SwordItem(ToolMaterials material, String itemName) {
        super(ToolMaterialsToToolMaterial.toolMaterialsToToolMaterial(material, TOOL_INDEX));

        this.material = material;
        this.setRegistryName(itemName);
        this.setUnlocalizedName(itemName);
        this.setCreativeTab(ModCreativeTabs.NORES_PLUS_WEAPONS_AND_ARMOR);
        this.attackSpeed = material.getAttackSpeedByToolIndex(TOOL_INDEX);
        this.damageVsEntities = material.getDamagesByToolIndex(TOOL_INDEX);
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        if (material.getName() == repair.getItem().getRegistryName().getResourcePath()) {
            return true;
        }
        return false;
    }

    @Override
    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
        Multimap<String, AttributeModifier> multimap = HashMultimap.<String, AttributeModifier>create();

        if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getAttributeUnlocalizedName(),
                new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double) this.damageVsEntities, 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getAttributeUnlocalizedName(),
                new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", (double) attackSpeed, 0));
        }

        return multimap;
    }
}
