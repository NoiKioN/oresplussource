package com.noikion.noresplus.crafting.specific_recipes.armor_crafting_recipes;

import com.noikion.noresplus.crafting.specific_recipes.ArmorCraftingRecipes;
import com.noikion.noresplus.lists.CraftingRecipePatternsOrdered;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;

public class CalciteArmors extends ArmorCraftingRecipes {

    public CalciteArmors() {
        setItems(GemItemNamesListedInTypes.CALCITE_ARMORS);
        setRecipePatterns(CraftingRecipePatternsOrdered.ARMORS);
        setMaterial("calcite");
        createRecipes();
    }

}
