package com.noikion.noresplus.crafting.specific_recipes;

import com.noikion.noresplus.blocks.BlockNameToBlock;
import com.noikion.noresplus.crafting.CraftingRecipe;
import com.noikion.noresplus.crafting.CraftingRecipePatterns;
import com.noikion.noresplus.crafting.CraftingRecipes;
import com.noikion.noresplus.items.ItemNameToItem;
import com.noikion.noresplus.lists.gem.GemBlockNamesListedInTypes;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockCraftingRecipes implements CraftingRecipes {

    private final Block[] blocks = BlockNameToBlock.getRegisteredBlocksByNames(GemBlockNamesListedInTypes.BLOCKS.getBlockNames());
    private final Item[] materials = ItemNameToItem.getRegisteredItemsByNames(GemItemNamesListedInTypes.MATERIALS.getItemNames());
    private final String[] recipePattern = CraftingRecipePatterns.BLOCK.getRecipePattern();
    private CraftingRecipe[] recipes;

    public BlockCraftingRecipes() {
        createRecipes();
    }

    @Override
    public final void createRecipes() {
        recipes = new CraftingRecipe[blocks.length];
        int i = 0;
        for (Block block : blocks) {
            CraftingRecipe recipe = new CraftingRecipe();
            recipe.setCraftedItem(new ItemStack(block));
            recipe.setCraftingRecipePattern(recipePattern);
            recipe.setMaterials(materials[i]);
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
