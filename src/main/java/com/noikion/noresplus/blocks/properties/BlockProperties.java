package com.noikion.noresplus.blocks.properties;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockProperties {

    private Material material;
    private float emittedLightLevel;
    private int lightOpacity;
    private boolean ignoreSimilarity;
    private boolean tickingRandomly;
    private boolean translucent;
    private float hardness;
    private float resistance;
    private int harvestLevel;
    private String harvestTool;
    private Item itemDropped;
    private int dropMinQuantity;
    private int dropMaxQuantity;
    private int blockMeta;

    public Material getMaterial() {
        return material;
    }

    public final void setMaterial(Material material) {
        this.material = material;
    }

    public float getEmittedLightLevel() {
        return emittedLightLevel;
    }

    public final void setEmittedLightLevel(float emittedLightLevel) {
        this.emittedLightLevel = emittedLightLevel;
    }

    public int getLightOpacity() {
        return lightOpacity;
    }

    public final void setLightOpacity(int lightOpacity) {
        this.lightOpacity = lightOpacity;
    }

    public boolean isIgnoreSimilarity() {
        return ignoreSimilarity;
    }

    public final void setIgnoreSimilarity(boolean ignoreSimilarity) {
        this.ignoreSimilarity = ignoreSimilarity;
    }

    public boolean isTickingRandomly() {
        return tickingRandomly;
    }

    public final void setTickingRandomly(boolean isTickingRandomly) {
        this.tickingRandomly = isTickingRandomly;
    }

    public boolean isTranslucent() {
        return translucent;
    }

    public final void setTranslucent(boolean isTranslucent) {
        this.translucent = isTranslucent;
    }

    public float getHardness() {
        return hardness;
    }

    public final void setHardness(float hardness) {
        this.hardness = hardness;
    }

    public float getResistance() {
        return resistance;
    }

    public final void setResistance(float resistance) {
        this.resistance = resistance;
    }

    public int getHarvestLevel() {
        return harvestLevel;
    }

    public final void setHarvestLevel(int harvestLevel) {
        this.harvestLevel = harvestLevel;
    }

    public String getHarvestTool() {
        return harvestTool;
    }

    public final void setHarvestTool(String harvestTool) {
        this.harvestTool = harvestTool;
    }

    public Item getItemDropped() {
        return itemDropped;
    }

    public final void setItemDropped(Item itemDropped) {
        this.itemDropped = itemDropped;
    }

    public int getDropMinQuantity() {
        return dropMinQuantity;
    }

    public final void setDropMinQuantity(int dropMinQuantity) {
        this.dropMinQuantity = dropMinQuantity;
    }

    public int getDropMaxQuantity() {
        return dropMaxQuantity;
    }

    public final void setDropMaxQuantity(int dropMaxQuantity) {
        this.dropMaxQuantity = dropMaxQuantity;
    }

    public int getBlockMeta() {
        return blockMeta;
    }

    public final void setBlockMeta(int blockMeta) {
        this.blockMeta = blockMeta;
    }
}
