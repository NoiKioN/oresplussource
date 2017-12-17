package com.noikion.noresplus.items.materials.tool_materials.gems;

import com.noikion.noresplus.items.materials.ToolMaterials;

public class Amber extends ToolMaterials {

    public Amber() {
        setName("amber");
        setHarvestLevel(1);
        setMaxUses(500, 300, 700, 750, 750, 400);
        setEfficiencies(3.5F);
        setDamages(3.3F, 1.3F, 6.2F, 1.8F, 1.3F, 0.5F);
        setAttackSpeeds(-3.0F, -3.0F, -3.5F, -2.5F, -2.5F, -3.5F);
        setEnchantability(10);
    }
}
