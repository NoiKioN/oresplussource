package com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes;

import com.noikion.noresplus.crafting.specific_recipes.ToolCraftingRecipes;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;

public class ZektzeriteTools extends ToolCraftingRecipes {

    public ZektzeriteTools() {
        setItems(GemItemNamesListedInTypes.ZEKTZERITE_TOOLS);
        setMaterial("zektzerite");
        createRecipes();
    }
}
