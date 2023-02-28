package net.beep67.simplicity.core.registry;

import net.beep67.simplicity.Simplicity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Simplicity.MODID);

    public static final RegistryObject<FallingBlock> SALT_DUST_BLOCK = BLOCKS.register("salt_dust_block", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Block> SALT_ROCK = BLOCKS.register("salt_rock", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT)));
    public static final RegistryObject<Block> POLISHED_SALT_ROCK = BLOCKS.register("polished_salt_rock", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT)));
    public static final RegistryObject<Block> CHISELED_POLISHED_SALT_ROCK = BLOCKS.register("chiseled_polished_salt_rock", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT)));
    public static final RegistryObject<Block> POLISHED_SALT_ROCK_BRICKS = BLOCKS.register("polished_salt_rock_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT)));
    public static final RegistryObject<Block> POLISHED_SALT_ROCK_TILES = BLOCKS.register("polished_salt_rock_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT)));
    public static final RegistryObject<RotatedPillarBlock> POLISHED_SALT_ROCK_PILLAR = BLOCKS.register("polished_salt_rock_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT)));



}
