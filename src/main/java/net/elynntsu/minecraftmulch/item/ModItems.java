package net.elynntsu.minecraftmulch.item;

import net.elynntsu.minecraftmulch.MinecraftMulch;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftMulch.MOD_ID);

    public static final RegistryObject<Item> TREEBARK = ITEMS.register("treebark",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
       ITEMS.register(eventBus);
    }

}
