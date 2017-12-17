package com.noikion.noresplus.crafting.specific_recipes;

import com.noikion.noresplus.blocks.BlockNameToBlock;
import com.noikion.noresplus.crafting.CraftingRecipe;
import com.noikion.noresplus.crafting.CraftingRecipePatterns;
import com.noikion.noresplus.crafting.CraftingRecipes;
import com.noikion.noresplus.items.ItemNameToItem;
import com.noikion.noresplus.lists.gem.GemBlockNamesListedInTypes;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;
import jline.internal.Log;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MaterialsFromBlocks implements CraftingRecipes {

    private CraftingRecipe[] recipes;
    private final String[][] allMaterials = GemBlockNamesListedInTypes.ALL_BLOCKS.getBlockNamePairs();
    private final Item[] items = ItemNameToItem.getRegisteredItemsByNames(GemItemNamesListedInTypes.MATERIALS.getItemNames());
    private final String[] recipePattern = CraftingRecipePatterns.CONVERT_BLOCK.getRecipePattern();
    private final int numberOfItems = 9;

    public MaterialsFromBlocks() {
        createRecipes();
    }

    private int getMaterialLength() {
        int length = 0;
        for (int i = 0; i < allMaterials.length; i++) {
            for (int j = 0; j < allMaterials[i].length; j++) {
                length++;
            }
        }
        return length;
    }

    @Override
    public final void createRecipes() {
        recipes = new CraftingRecipe[getMaterialLength()];
        int i = 0;
        int j = 0;
        for (Item item : items) {
            for(String material : allMaterials[j]){
                CraftingRecipe recipe = new CraftingRecipe();
                recipe.setCraftedItem(new ItemStack(item, numberOfItems));
                recipe.setCraftingRecipePattern(recipePattern);
                recipe.setMaterials(BlockNameToBlock.getRegisteredBlockByName(material));
                recipe.setRecipeMaterialIndicators('O');
                recipe.createRecipeDetails();
                recipes[i] = recipe;
                i++;
            }
            j++;
        }
    }
    
    @Override
    public CraftingRecipe[] getRecipes() {
        return recipes;
    }

}
