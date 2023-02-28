package net.beep67.simplicity.core.registry;

import net.beep67.simplicity.Simplicity;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Simplicity.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab SIMPLICITY;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        SIMPLICITY = event.registerCreativeModeTab(new ResourceLocation(Simplicity.MODID, "assets/simplicity"),
                builder -> builder.icon(() -> new ItemStack(ItemRegistry.SALT_DUST_BLOCK.get()))
                        .title(Component.translatable("creativemodetab.simplicity")));
    }
}