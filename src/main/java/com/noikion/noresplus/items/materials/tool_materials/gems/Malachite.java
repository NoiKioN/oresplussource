package com.noikion.noresplus.items.materials.tool_materials.gems;

import com.noikion.noresplus.items.materials.ToolMaterials;

public class Malachite extends ToolMaterials {

    public Malachite() {
        setName("malachite");
        setHarvestLevel(1);
        setMaxUses(800, 600, 1000, 1050, 1050, 700);
        setEfficiencies(5.0F);
        setDamages(4.2F, 1.9F, 7.1F, 2.7F, 2.2F, 1.4F);
        setAttackSpeeds(-2.7F, -2.7F, -3.2F, -2.2F, -2.2F, -3.2F);
        setEnchantability(25);
    }
}
