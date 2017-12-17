package com.noikion.noresplus.items.materials.tool_materials.gems;

import com.noikion.noresplus.items.materials.ToolMaterials;

public class Ruby extends ToolMaterials {

    public Ruby() {
        setName("sapphire");
        setHarvestLevel(4);
        setMaxUses(1600, 1400, 1800, 1850, 1850, 1500);
        setEfficiencies(7.5F);
        setDamages(5.7F, 3.7F, 7.9F, 4.2F, 3.7F, 1.6F);
        setAttackSpeeds(-2.1F, -2.3F, -2.7F, -1.7F, -1.6F, -2.6F);
        setEnchantability(45);
    }
}
