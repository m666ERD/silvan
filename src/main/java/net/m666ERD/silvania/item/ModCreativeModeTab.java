package net.m666ERD.silvania.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SILVANIA_TAB = new CreativeModeTab("silvaniatab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.POLISHED_MOONSTONE.get());
        }
    };
}
