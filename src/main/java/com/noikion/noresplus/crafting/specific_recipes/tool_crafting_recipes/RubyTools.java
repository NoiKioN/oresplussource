package com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes;

import com.noikion.noresplus.crafting.specific_recipes.ToolCraftingRecipes;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;

public class RubyTools extends ToolCraftingRecipes{
    public RubyTools(){
        setItems(GemItemNamesListedInTypes.RUBY_TOOLS);
        setMaterial("ruby");
        createRecipes();
    }
}
