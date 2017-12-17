package com.noikion.noresplus.items.materials.tool_materials.gems;

import com.noikion.noresplus.items.materials.ToolMaterials;

public class Calcite extends ToolMaterials {

    public Calcite() {
        setName("calcite");
        setHarvestLevel(1);
        setMaxUses(700, 500, 900, 950, 950, 600);
        setEfficiencies(4.5F);
        setDamages(3.9F, 1.9F, 6.8F, 2.4F, 1.9F, 1.1F);
        setAttackSpeeds(-2.8F, -2.8F, -3.3F, -2.3F, -2.3F, -3.3F);
        setEnchantability(20);
    }
}
