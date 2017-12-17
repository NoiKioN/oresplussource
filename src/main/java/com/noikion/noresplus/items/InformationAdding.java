package com.noikion.noresplus.items;

import com.noikion.noresplus.items.scales.AntiMatterScale;
import java.util.List;

import com.noikion.noresplus.items.scales.GemScale;
import com.noikion.noresplus.items.scales.MetalScale;
import com.noikion.noresplus.lists.gem.GemItemNamesListedInTypes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.translation.I18n;

@SuppressWarnings("deprecation")
public class InformationAdding {

    public static void addInfoToMaterialItems(ItemStack stack, List<String> tooltip) {
        final Item[] gems = ItemNameToItem.getRegisteredItemsByNames(GemItemNamesListedInTypes.MATERIALS.getItemNames());
        final Item[] metals = new Item[]{};
        final Item[] antiMatter = new Item[]{};

        if (isInAnyList(stack, gems, metals, antiMatter)) {
            if (isInTheList(gems, stack)) {
                GemScale valueOnGemScale = GemScale.getGemScaleForName(stack.getItem().getRegistryName().toString());

                if (valueOnGemScale != null) {
                    tooltip.add("\u00A7c" + valueOnGemScale.getValueOnScale() + " \u00A7r" + I18n.translateToLocalFormatted("gemscale.tooltip"));
                }
            }
            if (isInTheList(metals, stack)) {
                MetalScale valueOnMetalScale = MetalScale.getMetalScaleForName(stack.getItem().getRegistryName().toString());

                if (valueOnMetalScale != null) {
                    tooltip.add("\u00A7c" + valueOnMetalScale.getValueOnScale() + " \u00A7r" + I18n.translateToLocalFormatted("gemscale.tooltip"));
                }
            }
            if (isInTheList(antiMatter, stack)) {
                AntiMatterScale valueOnAntiMatterScale = AntiMatterScale.getAntiMatterScaleForName(stack.getItem().getRegistryName().toString());

                if (valueOnAntiMatterScale != null) {
                    tooltip.add("\u00A7c" + valueOnAntiMatterScale.getValueOnScale() + " \u00A7r" + I18n.translateToLocalFormatted("gemscale.tooltip"));
                }
            }
        }
    }

    public static void addInfoToRefinerItems(ItemStack stack, List<String> tooltip) {
        final Item[] gemRefiners = ItemNameToItem.getRegisteredItemsByNames(new String[]{"amber_refiner", "chrysocolla_refiner",
            "calcite_refiner", "malachite_refiner", "gaspeite_refiner", "cordierite_refiner", "beryl_refiner"});
        final Item[] additionalRefiners = ItemNameToItem.getRegisteredItemsByNames(new String[]{"wood_refiner", "stone_refiner", "iron_refiner",
            "gold_refiner", "diamond_refiner"});

        if (isInAnyList(stack, gemRefiners, additionalRefiners)) {
            tooltip.add("\u00A77" + I18n.translateToLocalFormatted("refiner.tooltip"));
        }
    }

    private static boolean isInAnyList(ItemStack stack, Item[]... lists) {
        for (Item[] specificList : lists) {
            if (isInTheList(specificList, stack)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isInTheList(Item[] list, ItemStack stack) {
        for (Item listItem : list) {
            if (stack.getItem() == listItem) {
                return true;
            }
        }
        return false;
    }
}
