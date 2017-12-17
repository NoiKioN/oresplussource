package com.noikion.noresplus.items.specific_items.tools;

import com.google.common.collect.Multimap;
import com.noikion.noresplus.creative_tabs.ModCreativeTabs;
import com.noikion.noresplus.items.InformationAdding;
import com.noikion.noresplus.items.indexes.ToolIndexes;
import com.noikion.noresplus.items.materials.ToolMaterials;
import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class RefinerItem extends Item {

    private static final int TOOL_INDEX = ToolIndexes.REFINER;

    ToolMaterials material;
    ToolMaterial materialOriginal;

    public RefinerItem(ToolMaterials material, String itemName) {
        this.material = material;

        this.setRegistryName(itemName);
        this.setUnlocalizedName(itemName);
        this.setCreativeTab(ModCreativeTabs.NORES_PLUS_TOOLS);

        this.setMaxStackSize(1);
        this.setMaxDamage(material.getMaxUsesByToolIndex(TOOL_INDEX));
    }

    public RefinerItem(ToolMaterial material, String itemName) {
        materialOriginal = material;

        this.setRegistryName(itemName);
        this.setUnlocalizedName(itemName);
        this.setCreativeTab(ModCreativeTabs.NORES_PLUS_TOOLS);

        this.setMaxStackSize(1);
        this.setMaxDamage(material.getMaxUses());
    }

    @Override
    public int getItemEnchantability() {
        if (material != null) {
            return material.getEnchantability();
        }
        return materialOriginal.getEnchantability();
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        if (material != null) {
            if (material.getName().equals(repair.getItem().getRegistryName().getResourcePath())) {
                return true;
            }
        } else if (materialOriginal.getRepairItemStack() != null) {
            if (repair == materialOriginal.getRepairItemStack()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean doesSneakBypassUse(ItemStack stack, IBlockAccess world, BlockPos pos, EntityPlayer player) {
        return true;
    }

    @Override
    public boolean isDamageable() {
        return true;
    }

    @Override
    public float getStrVsBlock(ItemStack stack, IBlockState state) {
        return 0;
    }

    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos,
        EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (playerIn.getCooledAttackStrength(0.5F) > 0.9F) {
            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.FAIL;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        InformationAdding.addInfoToRefinerItems(stack, tooltip);
    }

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot equipmentSlot, ItemStack itemStack) {
        Multimap<String, AttributeModifier> multimap = super.getAttributeModifiers(equipmentSlot, itemStack);
        if (material != null) {
            if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {

                multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getAttributeUnlocalizedName(),
                    new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier",
                        (double) material.getDamagesByToolIndex(TOOL_INDEX), 0));
                multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getAttributeUnlocalizedName(),
                    new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier",
                        (double) material.getAttackSpeedByToolIndex(TOOL_INDEX), 0));
            }
        } else if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {

            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getAttributeUnlocalizedName(),
                new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier",
                    (double) materialOriginal.getDamageVsEntity(), 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getAttributeUnlocalizedName(),
                new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier",
                    -3.0D, 0));
        }
        return multimap;
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        stack.damageItem(2, attacker);
        return true;
    }
}
