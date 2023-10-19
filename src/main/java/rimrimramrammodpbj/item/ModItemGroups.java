package rimrimramrammodpbj.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import rimrimramrammodpbj.PBJButNot;
import rimrimramrammodpbj.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup GEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PBJButNot.MOD_ID, "gem"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.gem"))
                    .icon(() -> new ItemStack(ModItems.GEM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.GEM);
                        entries.add(ModItems.RED_GEM);
                        entries.add(ModBlocks.GEM_BLOCK);
                    }).build());
    public static void registerItemGroups() {
        PBJButNot.LOGGER.info("Registering Item Groups for " +PBJButNot.MOD_ID);
    }
}
