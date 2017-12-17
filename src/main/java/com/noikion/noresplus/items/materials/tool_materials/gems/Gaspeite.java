package com.noikion.noresplus.items.materials.tool_materials.gems;

import com.noikion.noresplus.items.materials.ToolMaterials;

public class Gaspeite extends ToolMaterials {

    public Gaspeite() {
        setName("malachite");
        setHarvestLevel(2);
        setMaxUses(900, 700, 1100, 1150, 1150, 800);
        setEfficiencies(5.5F);
        setDamages(4.5F, 2.2F, 7.4F, 3.0F, 2.5F, 1.7F);
        setAttackSpeeds(-2.6F, -2.6F, -3.1F, -2.1F, -2.1F, -3.1F);
        setEnchantability(30);
    }
}
