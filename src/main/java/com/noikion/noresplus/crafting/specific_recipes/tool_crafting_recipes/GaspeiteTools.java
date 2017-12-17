package com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes;

import com.noikion.noresplus.crafting.specific_recipes.ToolCraftingRecipes;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;

public class GaspeiteTools extends ToolCraftingRecipes {
    public GaspeiteTools() {
        setItems(GemItemNamesListedInTypes.GASPEITE_TOOLS);
        setMaterial("gaspeite");
        createRecipes();
    }
}
