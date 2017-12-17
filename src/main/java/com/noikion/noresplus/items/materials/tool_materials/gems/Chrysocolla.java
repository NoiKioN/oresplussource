package com.noikion.noresplus.items.materials.tool_materials.gems;

import com.noikion.noresplus.items.materials.ToolMaterials;

public class Chrysocolla extends ToolMaterials {

    public Chrysocolla() {
        setName("chrysocolla");
        setHarvestLevel(1);
        setMaxUses(600, 400, 800, 850, 850, 500);
        setEfficiencies(4.0F);
        setDamages(3.6F, 1.6F, 6.5F, 2.1F, 1.6F, 0.8F);
        setAttackSpeeds(-2.9F, -2.9F, -3.4F, -2.4F, -2.4F, -3.4F);
        setEnchantability(15);
    }
}
