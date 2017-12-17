package com.noikion.noresplus.crafting.specific_recipes;

import com.noikion.noresplus.crafting.CraftingRecipe;
import com.noikion.noresplus.crafting.CraftingRecipePatterns;
import com.noikion.noresplus.crafting.CraftingRecipes;
import com.noikion.noresplus.items.ItemNameToItem;
import com.noikion.noresplus.lists.CraftingRecipePatternsOrdered;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ToolCraftingRecipes implements CraftingRecipes {

    private Item[] items;
    private Item material;
    private CraftingRecipe[] recipes;

    public final void setItems(GemItemNamesListedInTypes items) {
        this.items = ItemNameToItem.getRegisteredItemsByNames(items.getItemNames());
    }

    public final void setMaterial(String materialName) {
        this.material = ItemNameToItem.getRegisteredItemByName(materialName);
    }

    @Override
    public final void createRecipes() {
        recipes = new CraftingRecipe[items.length];
        int i = 0;
        for (Item item : items) {
            CraftingRecipe recipe = new CraftingRecipe();
            if(item.getRegistryName().getResourcePath().contains("sword")){
                recipe.setCraftingRecipePattern(CraftingRecipePatterns.SWORD.getRecipePattern());
            }
            else if(item.getRegistryName().getResourcePath().contains("pickaxe")){
                recipe.setCraftingRecipePattern(CraftingRecipePatterns.PICKAXE.getRecipePattern());
            }
            else if(item.getRegistryName().getResourcePath().contains("hoe")){
                recipe.setCraftingRecipePattern(CraftingRecipePatterns.HOE.getRecipePattern());
            }
            else if(item.getRegistryName().getResourcePath().contains("shovel")){
                recipe.setCraftingRecipePattern(CraftingRecipePatterns.SHOVEL.getRecipePattern());
                recipes[i] = recipe;
            }
            else if(item.getRegistryName().getResourcePath().contains("refiner")){
                recipe.setCraftingRecipePattern(CraftingRecipePatterns.REFINER.getRecipePattern());
            }
            else{
                recipe.setCraftingRecipePattern(CraftingRecipePatterns.AXE.getRecipePattern());
            }
            
            recipe.setCraftedItem(new ItemStack(item));
            recipe.setMaterials(material, Items.STICK);
            recipe.setRecipeMaterialIndicators('O', 'I');
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
