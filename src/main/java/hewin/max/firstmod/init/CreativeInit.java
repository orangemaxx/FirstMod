package hewin.max.firstmod.init;

import hewin.max.firstmod.FirstMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeInit {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MODID);

    public static final RegistryObject<CreativeModeTab> FIRST_TAB = TABS.register("first_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("tab." + FirstMod.MODID + ".first_tab"))
                    .icon(ItemInit.NORMALDIFFICULTY.get()::getDefaultInstance)
                    .displayItems(((displayParameters, output) -> {
                        output.accept(ItemInit.NORMALDIFFICULTY.get());
                        output.accept(ItemInit.NORMAL_BLOCK_ITEM.get());
                        output.accept(ItemInit.MONEY.get());
                    }))
                    .build());

}
