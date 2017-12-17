package com.noikion.noresplus.crafting.specific_recipes;

import com.noikion.noresplus.crafting.CraftingRecipe;
import com.noikion.noresplus.crafting.CraftingRecipePatterns;
import com.noikion.noresplus.crafting.CraftingRecipes;
import com.noikion.noresplus.items.ItemNameToItem;
import com.noikion.noresplus.lists.CraftingRecipePatternsOrdered;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ArmorCraftingRecipes implements CraftingRecipes {

    private Item[] items;
    private Item material;
    private String[][] recipePatterns;
    private CraftingRecipe[] recipes;

    public final void setItems(GemItemNamesListedInTypes items) {
        this.items = ItemNameToItem.getRegisteredItemsByNames(items.getItemNames());
    }

    public final void setMaterial(String materialName) {
        this.material = ItemNameToItem.getRegisteredItemByName(materialName);
    }

    public final void setRecipePatterns(CraftingRecipePatternsOrdered recipePatterns) {
        this.recipePatterns = new String[recipePatterns.getRecipePatterns().length][];
        int i = 0;
        for (CraftingRecipePatterns recipePattern : recipePatterns.getRecipePatterns()) {
            this.recipePatterns[i] = recipePattern.getRecipePattern();
            i++;
        }
    }

    @Override
    public final void createRecipes() {
        recipes = new CraftingRecipe[items.length];
        int i = 0;
        for (Item item : items) {
            CraftingRecipe recipe = new CraftingRecipe();
            recipe.setCraftedItem(new ItemStack(item));
            recipe.setCraftingRecipePattern(recipePatterns[i]);
            recipe.setMaterials(material);
            recipe.setRecipeMaterialIndicators('O');
            recipe.createRecipeDetails();
            recipes[i] = recipe;
            i++;
        }
    }
    
    @Override
    public CraftingRecipe[] getRecipes() {
        return recipes;
    }

}
