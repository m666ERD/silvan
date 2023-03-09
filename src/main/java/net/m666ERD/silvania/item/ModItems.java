package net.m666ERD.silvania.item;

import net.m666ERD.silvania.Silvania;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Silvania.MOD_ID);

    public static final RegistryObject<Item> MOONSTONE = ITEMS.register("moonstone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SILVANIA_TAB)));
    public static final RegistryObject<Item> POLISHED_MOONSTONE = ITEMS.register("polished_moonstone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SILVANIA_TAB)));
    public static final RegistryObject<Item> HEMP_LEAF = ITEMS.register("hemp_leaf",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SILVANIA_TAB)));
    public static final RegistryObject<Item> DRIED_HEMP_LEAF = ITEMS.register("dried_hemp_leaf",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SILVANIA_TAB)));
    public static final RegistryObject<Item> MOONSTONE_KHOPESH = ITEMS.register("moonstone_khopesh",
            () -> new SwordItem(ModTiers.MOONSTONE, 4, 0f, new Item.Properties().tab(ModCreativeModeTab.SILVANIA_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
