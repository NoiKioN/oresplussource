package com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes;

import com.noikion.noresplus.crafting.specific_recipes.ToolCraftingRecipes;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;

public class CordieriteTools extends ToolCraftingRecipes {

    public CordieriteTools() {
        setItems(GemItemNamesListedInTypes.CORDIERITE_TOOLS);
        setMaterial("cordierite");
        createRecipes();
    }
}
