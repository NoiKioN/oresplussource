package com.noikion.noresplus.crafting;

public enum CraftingRecipePatterns {
    BLOCK(new String[]{"OOO", "OOO", "OOO"}),
    CONVERT_BLOCK(new String[]{"O"}),
    SWORD(new String[]{"O", "O", "I"}),
    PICKAXE(new String[]{"OOO", " I ", " I "}),
    AXE(new String[]{"OO", "OI", " I"}),
    SHOVEL(new String[]{"O", "I", "I"}),
    HOE(new String[]{"OO", " I", " I"}),
    REFINER(new String[]{"OO", "I "}),
    HELMET(new String[]{"OOO", "O O"}),
    CHESTPLATE(new String[]{"O O", "OOO", "OOO"}),
    LEGGINGS(new String[]{"OOO", "O O", "O O"}),
    BOOTS(new String[]{"O O", "O O"});

    private final String[] recipePatterns;

    CraftingRecipePatterns(String[] recipePatterns) {
        this.recipePatterns = recipePatterns;
    }

    public String[] getRecipePattern() {
        return recipePatterns;
    }
}
