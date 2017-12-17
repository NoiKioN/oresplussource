package com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes;

import com.noikion.noresplus.crafting.specific_recipes.ToolCraftingRecipes;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;

public class AmberTools extends ToolCraftingRecipes {

    public AmberTools() {
        setItems(GemItemNamesListedInTypes.AMBER_TOOLS);
        setMaterial("amber");
        createRecipes();
    }
}
