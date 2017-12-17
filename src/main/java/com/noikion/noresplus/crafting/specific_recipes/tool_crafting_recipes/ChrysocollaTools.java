package com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes;

import com.noikion.noresplus.crafting.specific_recipes.ToolCraftingRecipes;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;

public class ChrysocollaTools extends ToolCraftingRecipes {

    public ChrysocollaTools() {
        setItems(GemItemNamesListedInTypes.CHRYSOCOLLA_TOOLS);
        setMaterial("chrysocolla");
        createRecipes();
    }
}
