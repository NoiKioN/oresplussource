package com.noikion.noresplus.items.materials.tool_materials.gems;

import com.noikion.noresplus.items.materials.ToolMaterials;

public class Beryl extends ToolMaterials {

    public Beryl() {
        setName("cordierite");
        setHarvestLevel(3);
        setMaxUses(1500, 1300, 1700, 1750, 1750, 1400);
        setEfficiencies(7.0F);
        setDamages(5.4F, 3.4F, 7.6F, 3.9F, 3.4F, 1.3F);
        setAttackSpeeds(-2.2F, -2.4F, -2.8F, -1.8F, -1.7F, -2.7F);
        setEnchantability(40);
    }
}
