package com.noikion.noresplus.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

public class ModEnchantment extends Enchantment {

    public ModEnchantment(Rarity rarityIn, EnumEnchantmentType typeIn, EntityEquipmentSlot[] slots, AllEnchantments enchantmentName) {
        super(rarityIn, typeIn, slots);

        this.setRegistryName(enchantmentName.getName());
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return this.type.canEnchantItem(stack.getItem());
    }

    public String getName() {
        return "noresplus.enchantment." + this.name;
    }
}
