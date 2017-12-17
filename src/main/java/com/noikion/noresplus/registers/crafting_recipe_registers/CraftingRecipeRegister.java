package com.noikion.noresplus.registers.crafting_recipe_registers;

import com.noikion.noresplus.crafting.GemCraftingRecipes;
import com.noikion.noresplus.crafting.CraftingRecipe;
import com.noikion.noresplus.crafting.CraftingRecipes;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRecipeRegister {

    public void registerAllRecipes() {
        // ------------------------------------------- BLOCKS  ------------------------------------------- //
        registerRecipes(GemCraftingRecipes.BLOCKS);

        // ------------------------------------------- MATERIALS  ------------------------------------------- //
        registerRecipes(GemCraftingRecipes.MATERIALS);

        // ------------------------------------------- TOOLS  ------------------------------------------- //
        registerRecipes(GemCraftingRecipes.AMBER_TOOLS);
        registerRecipes(GemCraftingRecipes.CHRYSOCOLLA_TOOLS);
        registerRecipes(GemCraftingRecipes.CALCITE_TOOLS);
        registerRecipes(GemCraftingRecipes.MALACHITE_TOOLS);
        registerRecipes(GemCraftingRecipes.GASPEITE_TOOLS);
        registerRecipes(GemCraftingRecipes.ZEKTZERITE_TOOLS);
        registerRecipes(GemCraftingRecipes.CORDIERITE_TOOLS);
        registerRecipes(GemCraftingRecipes.BERYL_TOOLS);
        registerRecipes(GemCraftingRecipes.RUBY_TOOLS);
        registerRecipes(GemCraftingRecipes.SAPPHIRE_TOOLS);
        registerRecipes(GemCraftingRecipes.ADDITIONAL_REFINERS);

        // ------------------------------------------- ARMORS  ------------------------------------------- //
        registerRecipes(GemCraftingRecipes.AMBER_ARMORS);
        registerRecipes(GemCraftingRecipes.CHRYSOCOLLA_ARMORS);
        registerRecipes(GemCraftingRecipes.CALCITE_ARMORS);
        registerRecipes(GemCraftingRecipes.MALACHITE_ARMORS);
        registerRecipes(GemCraftingRecipes.GASPEITE_ARMORS);
        registerRecipes(GemCraftingRecipes.ZEKTZERITE_ARMORS);
        registerRecipes(GemCraftingRecipes.CORDIERITE_ARMORS);
        registerRecipes(GemCraftingRecipes.BERYL_ARMORS);
        registerRecipes(GemCraftingRecipes.RUBY_ARMORS);
        registerRecipes(GemCraftingRecipes.SAPPHIRE_ARMORS);
    }

    private void registerRecipes(CraftingRecipes recipes) {
        for (CraftingRecipe recipe : recipes.getRecipes()) {
            GameRegistry.addRecipe(recipe.getCraftedItem(), recipe.getRecipeDetails());
        }
    }
}
