package com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes;

import com.noikion.noresplus.crafting.specific_recipes.ToolCraftingRecipes;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;

public class MalachiteTools extends ToolCraftingRecipes {

    public MalachiteTools() {
        setItems(GemItemNamesListedInTypes.MALACHITE_TOOLS);
        setMaterial("malachite");
        createRecipes();
    }
}
