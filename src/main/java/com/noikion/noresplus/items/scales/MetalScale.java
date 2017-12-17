package com.noikion.noresplus.items.scales;

public enum MetalScale {
    ALUMINIUM(1),
    SILVER(3),
    ZINC(4),
    TANTALUM(5),
    COPPER(6),
    TITANIUM(7),
    TUNGSTEN(9),
    SILICON(10);

    private int valueOnScale;

    private static final MetalScale[] METAL_SCALE_VALUES;

    static {
        METAL_SCALE_VALUES = MetalScale.values();
    }

    MetalScale(int valueOnScale) {
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

    public static MetalScale getMetalScaleForName(String name) {
        if (name == null) {
            return null;
        }

        for (MetalScale metalScale : METAL_SCALE_VALUES) {
            if (name.contains(metalScale.name().toLowerCase())) {
                return metalScale;
            }
        }
        return null;
    }
}
