package com.noikion.noresplus.crafting.specific_recipes.armor_crafting_recipes;

import com.noikion.noresplus.crafting.specific_recipes.ArmorCraftingRecipes;
import com.noikion.noresplus.lists.CraftingRecipePatternsOrdered;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;

public class SapphireArmors extends ArmorCraftingRecipes{
    public SapphireArmors(){
        setItems(GemItemNamesListedInTypes.SAPPHIRE_ARMORS);
        setRecipePatterns(CraftingRecipePatternsOrdered.ARMORS);
        setMaterial("sapphire");
        createRecipes();
    }
}
