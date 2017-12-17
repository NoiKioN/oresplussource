package com.noikion.noresplus.items.materials;

public class ArmorMaterials {

    private String name;
    private int[] defenses;
    private int toughness;
    private int durability;
    private int enchantability;

    public String getName() {
        return "noresplus:" + name.toLowerCase();
    }

    public final void setName(String name) {
        this.name = name;
    }

    public int[] getDefenses() {
        return defenses;
    }

    public final void setDefenses(int... defenses) {
        this.defenses = defenses;
    }

    public int getToughness() {
        return toughness;
    }

    public final void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public int getDurability() {
        return durability;
    }

    public final void setDurability(int durability) {
        this.durability = durability;
    }

    public int getEnchantability() {
        return enchantability;
    }

    public final void setEnchantability(int enchantability) {
        this.enchantability = enchantability;
    }
}
