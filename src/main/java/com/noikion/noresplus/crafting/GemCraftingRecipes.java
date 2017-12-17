package com.noikion.noresplus.crafting;

import com.noikion.noresplus.crafting.specific_recipes.BlockCraftingRecipes;
import com.noikion.noresplus.crafting.specific_recipes.MaterialsFromBlocks;
import com.noikion.noresplus.crafting.specific_recipes.armor_crafting_recipes.AmberArmors;
import com.noikion.noresplus.crafting.specific_recipes.armor_crafting_recipes.BerylArmors;
import com.noikion.noresplus.crafting.specific_recipes.armor_crafting_recipes.CalciteArmors;
import com.noikion.noresplus.crafting.specific_recipes.armor_crafting_recipes.ChrysocollaArmors;
import com.noikion.noresplus.crafting.specific_recipes.armor_crafting_recipes.CordieriteArmors;
import com.noikion.noresplus.crafting.specific_recipes.armor_crafting_recipes.GaspeiteArmors;
import com.noikion.noresplus.crafting.specific_recipes.armor_crafting_recipes.MalachiteArmors;
import com.noikion.noresplus.crafting.specific_recipes.armor_crafting_recipes.RubyArmors;
import com.noikion.noresplus.crafting.specific_recipes.armor_crafting_recipes.SapphireArmors;
import com.noikion.noresplus.crafting.specific_recipes.armor_crafting_recipes.ZektzeriteArmors;
import com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes.AdditionalRefiners;
import com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes.AmberTools;
import com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes.BerylTools;
import com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes.CalciteTools;
import com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes.ChrysocollaTools;
import com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes.CordieriteTools;
import com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes.GaspeiteTools;
import com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes.MalachiteTools;
import com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes.RubyTools;
import com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes.SapphireTools;
import com.noikion.noresplus.crafting.specific_recipes.tool_crafting_recipes.ZektzeriteTools;

public class GemCraftingRecipes {

    // ------------------------------------------- BLOCKS  ------------------------------------------- //
    public static final CraftingRecipes BLOCKS = new BlockCraftingRecipes();

    // ------------------------------------------- MATERIALS  ------------------------------------------- //
    public static final CraftingRecipes MATERIALS = new MaterialsFromBlocks();

    // ------------------------------------------- TOOLS  ------------------------------------------- //
    public static final CraftingRecipes AMBER_TOOLS = new AmberTools();
    public static final CraftingRecipes CHRYSOCOLLA_TOOLS = new ChrysocollaTools();
    public static final CraftingRecipes CALCITE_TOOLS = new CalciteTools();
    public static final CraftingRecipes MALACHITE_TOOLS = new MalachiteTools();
    public static final CraftingRecipes GASPEITE_TOOLS = new GaspeiteTools();
    public static final CraftingRecipes ZEKTZERITE_TOOLS = new ZektzeriteTools();
    public static final CraftingRecipes CORDIERITE_TOOLS = new CordieriteTools();
    public static final CraftingRecipes BERYL_TOOLS = new BerylTools();
    public static final CraftingRecipes RUBY_TOOLS = new RubyTools();
    public static final CraftingRecipes SAPPHIRE_TOOLS = new SapphireTools();
    public static final CraftingRecipes ADDITIONAL_REFINERS = new AdditionalRefiners();

    // ------------------------------------------- ARMORS  ------------------------------------------- //
    public static final CraftingRecipes AMBER_ARMORS = new AmberArmors();
    public static final CraftingRecipes CHRYSOCOLLA_ARMORS = new ChrysocollaArmors();
    public static final CraftingRecipes CALCITE_ARMORS = new CalciteArmors();
    public static final CraftingRecipes MALACHITE_ARMORS = new MalachiteArmors();
    public static final CraftingRecipes GASPEITE_ARMORS = new GaspeiteArmors();
    public static final CraftingRecipes ZEKTZERITE_ARMORS = new ZektzeriteArmors();
    public static final CraftingRecipes CORDIERITE_ARMORS = new CordieriteArmors();
    public static final CraftingRecipes BERYL_ARMORS = new BerylArmors();
    public static final CraftingRecipes RUBY_ARMORS = new RubyArmors();
    public static final CraftingRecipes SAPPHIRE_ARMORS = new SapphireArmors();
}
