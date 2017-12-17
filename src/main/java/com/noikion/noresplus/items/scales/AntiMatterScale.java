package com.noikion.noresplus.items.scales;

public enum AntiMatterScale {
    ;
	
	private int valueOnScale;

    private static final AntiMatterScale[] ANTI_MATTER_SCALE_VALUES;

    static {
        ANTI_MATTER_SCALE_VALUES = AntiMatterScale.values();
    }

    AntiMatterScale(int valueOnScale) {
        this.valueOnScale = valueOnScale;
    }

    public int getValueOnScale() {
        return valueOnScale;
    }

    public float getValueBetweenOnScale(GemScale value1, GemScale value2) {
        float valueBetween = value1.getValueOnScale() - value2.getValueOnScale();
        if (valueBetween == -1) {
            return valueBetween / 2 + value2.getValueOnScale();
        } else {
            return valueBetween / 2 + value1.getValueOnScale();
        }
    }

    public static AntiMatterScale getAntiMatterScaleForName(String name) {
        if (name == null) {
            return null;
        }

        for (AntiMatterScale antiMatterScale : ANTI_MATTER_SCALE_VALUES) {
            if (name.contains(antiMatterScale.name().toLowerCase())) {
                return antiMatterScale;
            }
        }
        return null;
    }
}
