package com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes;

import com.noikion.noresplus.crafting.specific_recipes.ToolCraftingRecipes;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;

public class CalciteTools extends ToolCraftingRecipes {

    public CalciteTools() {
        setItems(GemItemNamesListedInTypes.CALCITE_TOOLS);
        setMaterial("calcite");
        createRecipes();
    }
}
