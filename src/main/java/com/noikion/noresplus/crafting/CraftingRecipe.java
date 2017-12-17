package com.noikion.noresplus.crafting;

import net.minecraft.item.ItemStack;

public class CraftingRecipe {

    private ItemStack craftedItem;
    private String[] craftingRecipePattern;
    private Object[] materials;
    private Character[] recipeMaterialIndicators;
    private Object[] recipeDetails;
    
    public final void setCraftedItem(ItemStack craftedItem) {
        this.craftedItem = craftedItem;
    }
    
    public ItemStack getCraftedItem() {
        return craftedItem;
    }


    public final void setCraftingRecipePattern(String[] craftingRecipePattern) {
        this.craftingRecipePattern = craftingRecipePattern;
    }

    public final void setMaterials(Object... materials) {
        this.materials = materials;
    }

    public final void setRecipeMaterialIndicators(Character... recipeMaterialIndicators) {
        this.recipeMaterialIndicators = recipeMaterialIndicators;
    }
    
    public final void createRecipeDetails() {
        Object[] recipeDetails = new Object[materials.length + recipeMaterialIndicators.length + 1];
        recipeDetails[0] = craftingRecipePattern;
        int i = 0;
        int j = 2;
        for (int k = 1; k < recipeDetails.length; k += 2) {
            recipeDetails[k] = recipeMaterialIndicators[i];
            recipeDetails[j] = materials[i];
            i++;
            j += 2;
        }
        this.recipeDetails = recipeDetails;
    }
    
    public Object[] getRecipeDetails(){
        return recipeDetails;
    } 
}
