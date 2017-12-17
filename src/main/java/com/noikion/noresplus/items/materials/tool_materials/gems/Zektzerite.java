package com.noikion.noresplus.items.materials.tool_materials.gems;

import com.noikion.noresplus.items.materials.ToolMaterials;

public class Zektzerite extends ToolMaterials {

    public Zektzerite() {
        setName("zektzerite");
        setHarvestLevel(2);
        setMaxUses(1000, 800, 1200, 1250, 1250, 900);
        setEfficiencies(6.0F);
        setDamages(4.8F, 2.5F, 7.7F, 3.3F, 2.8F, 2.0F);
        setAttackSpeeds(-2.5F, -2.5F, -3.0F, -2.0F, -2.0F, -3.0F);
        setEnchantability(35);
    }
}
