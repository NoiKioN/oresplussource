package com.noikion.noresplus.items.materials.tool_materials.gems;

import com.noikion.noresplus.items.materials.ToolMaterials;

public class Sapphire extends ToolMaterials {

    public Sapphire() {
        setName("sapphire");
        setHarvestLevel(4);
        setMaxUses(3200, 2800, 3600, 3700, 3700, 3000);
        setEfficiencies(7.75F);
        setDamages(5.8F, 3.8F, 8.0F, 4.3F, 3.8F, 1.7F);
        setAttackSpeeds(-2.1F, -2.3F, -2.7F, -1.7F, -1.6F, -2.6F);
        setEnchantability(90);
    }
}
