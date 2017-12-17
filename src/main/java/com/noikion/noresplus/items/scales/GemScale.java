package com.noikion.noresplus.items.scales;

public enum GemScale {
    AMBER(1),
    CHRYSOCOLLA(2),
    CALCITE(3),
    MALACHITE(4),
    GASPEITE(5),
    ZEKTZERITE(6),
    CORDIERITE(7),
    BERYL(8),
    SAPPHIRE(9),
    RUBY(9);

    private final int valueOnScale;

    private static final GemScale[] GEM_SCALE_VALUES;

    static {
        GEM_SCALE_VALUES = GemScale.values();
    }

    GemScale(int valueOnScale) {
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

    public static GemScale getGemScaleForName(String name) {
        if (name == null) {
            return null;
        }

        for (GemScale gemScale : GEM_SCALE_VALUES) {
            if (name.contains(gemScale.name().toLowerCase())) {
                return gemScale;
            }
        }
        return null;
    }
}
