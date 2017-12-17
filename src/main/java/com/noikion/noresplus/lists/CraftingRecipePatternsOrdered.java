package com.noikion.noresplus.lists;

import com.noikion.noresplus.crafting.CraftingRecipePatterns;

public enum CraftingRecipePatternsOrdered {
    TOOLS(CraftingRecipePatterns.SWORD, CraftingRecipePatterns.PICKAXE, CraftingRecipePatterns.AXE, CraftingRecipePatterns.SHOVEL,
        CraftingRecipePatterns.HOE, CraftingRecipePatterns.REFINER),
    ARMORS(CraftingRecipePatterns.HELMET, CraftingRecipePatterns.CHESTPLATE, CraftingRecipePatterns.LEGGINGS, CraftingRecipePatterns.BOOTS);

    private CraftingRecipePatterns[] recipePatterns;

    CraftingRecipePatternsOrdered(CraftingRecipePatterns... recipePatterns) {
        this.recipePatterns = recipePatterns;
    }

    public CraftingRecipePatterns[] getRecipePatterns() {
        return recipePatterns;
    }
}
