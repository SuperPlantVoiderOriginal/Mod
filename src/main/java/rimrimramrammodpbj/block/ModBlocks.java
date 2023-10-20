package rimrimramrammodpbj.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import rimrimramrammodpbj.PBJButNot;

public class ModBlocks {
    public static final Block GEM_BLOCK = registerBlock("gem_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RED_GEM_BLOCK = registerBlock("red_gem_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GREEN_GEM_ORE = registerBlock("green_gem_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).instrument(Instrument.BASEDRUM).strength(2f), UniformIntProvider.create(2,5)));
    public static final Block GREEN_GEM_BLOCK = registerBlock("green_gem_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PBJButNot.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PBJButNot.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        PBJButNot.LOGGER.info("Registering ModBlocks for" +PBJButNot.MOD_ID);
    }
}
