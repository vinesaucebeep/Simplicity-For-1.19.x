package net.beep67.simplicity;

import com.mojang.logging.LogUtils;
import net.beep67.simplicity.core.registry.BlockRegistry;
import net.beep67.simplicity.core.registry.ItemRegistry;
import net.beep67.simplicity.core.registry.ModCreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Simplicity.MODID)
public class Simplicity {

    public static final String MODID = "simplicity";
    private static final Logger LOGGER = LogUtils.getLogger();
    public Simplicity() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        ItemRegistry.ITEMS.register(modEventBus);
        BlockRegistry.BLOCKS.register(modEventBus);

    }



    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == ModCreativeModeTabs.SIMPLICITY)
            event.accept(ItemRegistry.SALT_DUST_BLOCK);
            event.accept(ItemRegistry.SALT_ROCK);
            event.accept(ItemRegistry.POLISHED_SALT_ROCK);
            event.accept(ItemRegistry.CHISELED_POLISHED_SALT_ROCK);
            event.accept(ItemRegistry.POLISHED_SALT_ROCK_BRICKS);
            event.accept(ItemRegistry.POLISHED_SALT_ROCK_TILES);
            event.accept(ItemRegistry.POLISHED_SALT_ROCK_PILLAR);


    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
