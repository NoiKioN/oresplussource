package com.noikion.noresplus.items.materials.tool_materials.gems;

import com.noikion.noresplus.items.materials.ToolMaterials;

public class Cordierite extends ToolMaterials {

    public Cordierite() {
        setName("cordierite");
        setHarvestLevel(3);
        setMaxUses(1400, 1200, 1600, 1650, 1650, 1300);
        setEfficiencies(6.5F);
        setDamages(5.1F, 3.1F, 7.4F, 3.6F, 3.1F, 1.2F);
        setAttackSpeeds(-2.3F, -2.5F, -2.9F, -1.9F, -1.8F, -2.8F);
        setEnchantability(35);
    }
}
