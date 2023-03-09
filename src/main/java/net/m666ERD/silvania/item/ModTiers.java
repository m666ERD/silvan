package net.m666ERD.silvania.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier MOONSTONE = new ForgeTier(3, 1512, 0f, 4f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            ()-> Ingredient.of(ModItems.MOONSTONE.get()));
}
