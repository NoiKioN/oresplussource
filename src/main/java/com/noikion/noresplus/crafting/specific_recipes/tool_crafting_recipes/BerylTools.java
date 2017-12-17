package com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes;

import com.noikion.noresplus.crafting.specific_recipes.ToolCraftingRecipes;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;

public class BerylTools extends ToolCraftingRecipes {

    public BerylTools() {
        setItems(GemItemNamesListedInTypes.BERYL_TOOLS);
        setMaterial("beryl");
        createRecipes();
    }
}
