package net.akif.powerful_stick_mod.item;

import net.akif.powerful_stick_mod.PowerfulStickMod;
import net.akif.powerful_stick_mod.block.ModBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PowerfulStickMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItem.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // items
                        pOutput.accept(ModItem.SAPPHIRE.get());
                        pOutput.accept(ModItem.RAW_SAPPHIRE.get());

                        // blocks
                        pOutput.accept(ModBlock.AMOGUS_BLOCK.get());
                        pOutput.accept(ModBlock.BEAUTIFUL_BRICK_BLOCK.get());

                        // Just a potato
                        pOutput.accept(Items.BAKED_POTATO);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
