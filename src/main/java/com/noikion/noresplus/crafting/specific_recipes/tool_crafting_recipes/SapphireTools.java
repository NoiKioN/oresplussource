package com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes;

import com.noikion.noresplus.crafting.specific_recipes.ToolCraftingRecipes;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;

public class SapphireTools extends ToolCraftingRecipes{
    public SapphireTools(){
        setItems(GemItemNamesListedInTypes.SAPPHIRE_TOOLS);
        setMaterial("sapphire");
        createRecipes();
    }
}
