package com.noikion.noresplus.items.materials;

public class ToolMaterials {

    private String name;
    private int harvestLevel;
    private int[] maxUses;
    private float[] efficiencies;
    private float[] damages;
    private float[] attackSpeeds;
    private int enchantability;

    public String getName() {
        return name.toLowerCase();
    }

    protected final void setName(String name) {
        this.name = name;
    }

    public int getHarvestLevel() {
        return harvestLevel;
    }

    protected final void setHarvestLevel(int harvestLevel) {
        this.harvestLevel = harvestLevel;
    }

    public int getMaxUsesByToolIndex(int index) {
        return maxUses[index];
    }

    protected final void setMaxUses(int... maxUses) {
        this.maxUses = maxUses;
    }

    protected final void setMaxUses(int maxUses) {
        this.maxUses = new int[]{maxUses, maxUses, maxUses, maxUses, maxUses, maxUses};
    }

    public float getEfficiencyByToolIndex(int index) {
        return efficiencies[index];
    }

    protected final void setEfficiencies(float... efficiencies) {
        this.efficiencies = efficiencies;
    }

    protected final void setEfficiencies(float efficiency) {
        this.efficiencies = new float[]{efficiency, efficiency, efficiency, efficiency, efficiency, efficiency};
    }

    public float getDamagesByToolIndex(int index) {
        return damages[index];
    }

    protected final void setDamages(float... damages) {
        this.damages = damages;
    }

    protected final void setDamages(float damage) {
        this.damages = new float[]{damage, damage, damage, damage, damage, damage};
    }

    public float getAttackSpeedByToolIndex(int index) {
        return attackSpeeds[index];
    }

    protected final void setAttackSpeeds(float... attackSpeeds) {
        this.attackSpeeds = attackSpeeds;
    }

    protected final void setAttackSpeeds(float attackSpeed) {
        this.attackSpeeds = new float[]{attackSpeed, attackSpeed, attackSpeed, attackSpeed, attackSpeed, attackSpeed,};
    }

    public int getEnchantability() {
        return enchantability;
    }

    protected final void setEnchantability(int enchantability) {
        this.enchantability = enchantability;
    }
}
