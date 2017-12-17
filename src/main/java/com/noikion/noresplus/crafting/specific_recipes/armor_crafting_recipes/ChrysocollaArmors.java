package com.noikion.noresplus.crafting.specific_recipes.armor_crafting_recipes;

import com.noikion.noresplus.crafting.specific_recipes.ArmorCraftingRecipes;
import com.noikion.noresplus.lists.CraftingRecipePatternsOrdered;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;

public class ChrysocollaArmors extends ArmorCraftingRecipes {

    public ChrysocollaArmors() {
        setItems(GemItemNamesListedInTypes.CHRYSOCOLLA_ARMORS);
        setRecipePatterns(CraftingRecipePatternsOrdered.ARMORS);
        setMaterial("chrysocolla");
        createRecipes();
    }

}
