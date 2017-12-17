package com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes;

import com.noikion.noresplus.crafting.CraftingRecipe;
import com.noikion.noresplus.crafting.CraftingRecipePatterns;
import com.noikion.noresplus.crafting.CraftingRecipes;
import com.noikion.noresplus.items.ItemNameToItem;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AdditionalRefiners implements CraftingRecipes {

    private final Item[] items = ItemNameToItem.getRegisteredItemsByNames(GemItemNamesListedInTypes.ADDITIONAL_REFINERS.getItemNames());
    private final Object[] materials = new Object[]{Blocks.PLANKS, Blocks.COBBLESTONE, Items.IRON_INGOT, Items.GOLD_INGOT, Items.DIAMOND};
    private final String[] recipePatterns = CraftingRecipePatterns.REFINER.getRecipePattern();
    private CraftingRecipe[] recipes;

    public AdditionalRefiners() {
        createRecipes();
    }

    @Override
    public final void createRecipes() {
        recipes = new CraftingRecipe[items.length];
        int i = 0;
        for (Item item : items) {
            CraftingRecipe recipe = new CraftingRecipe();
            recipe.setCraftedItem(new ItemStack(items[i]));
            recipe.setCraftingRecipePattern(recipePatterns);
            recipe.setMaterials(materials[i], Items.STICK);
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
