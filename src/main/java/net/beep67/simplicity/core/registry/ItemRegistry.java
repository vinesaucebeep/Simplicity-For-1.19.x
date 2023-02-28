package net.beep67.simplicity.core.registry;

import net.beep67.simplicity.Simplicity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Simplicity.MODID);

    public static final RegistryObject<BlockItem> SALT_DUST_BLOCK = ITEMS.register("salt_dust_block", () -> new BlockItem(BlockRegistry.SALT_DUST_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> SALT_ROCK = ITEMS.register("salt_rock", () -> new BlockItem(BlockRegistry.SALT_ROCK.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_SALT_ROCK = ITEMS.register("polished_salt_rock", () -> new BlockItem(BlockRegistry.POLISHED_SALT_ROCK.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> CHISELED_POLISHED_SALT_ROCK = ITEMS.register("chiseled_polished_salt_rock", () -> new BlockItem(BlockRegistry.CHISELED_POLISHED_SALT_ROCK.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_SALT_ROCK_BRICKS = ITEMS.register("polished_salt_rock_bricks", () -> new BlockItem(BlockRegistry.POLISHED_SALT_ROCK_BRICKS.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_SALT_ROCK_TILES = ITEMS.register("polished_salt_rock_tiles", () -> new BlockItem(BlockRegistry.POLISHED_SALT_ROCK_TILES.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> POLISHED_SALT_ROCK_PILLAR = ITEMS.register("polished_salt_rock_pillar", () -> new BlockItem(BlockRegistry.POLISHED_SALT_ROCK_PILLAR.get(), new Item.Properties()));









}
