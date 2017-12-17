package com.noikion.noresplus.crafting.specific_recipes.armor_crafting_recipes;

import com.noikion.noresplus.crafting.specific_recipes.ArmorCraftingRecipes;
import com.noikion.noresplus.lists.CraftingRecipePatternsOrdered;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;

public class BerylArmors extends ArmorCraftingRecipes {

    public BerylArmors() {
        setItems(GemItemNamesListedInTypes.BERYL_ARMORS);
        setRecipePatterns(CraftingRecipePatternsOrdered.ARMORS);
        setMaterial("beryl");
        createRecipes();
    }
}
