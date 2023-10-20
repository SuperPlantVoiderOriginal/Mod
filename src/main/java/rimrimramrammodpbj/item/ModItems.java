package rimrimramrammodpbj.item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import rimrimramrammodpbj.PBJButNot;

public class ModItems {
    public static final Item GEM = registerItem("gem", new Item(new FabricItemSettings()));
    public static final Item RED_GEM = registerItem("red_gem", new Item(new FabricItemSettings()));
    public static final Item GREEN_GEM = registerItem("green_gem", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(GEM);
        entries.add(RED_GEM);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PBJButNot.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PBJButNot.LOGGER.info("Registering Mod Items for " + PBJButNot.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}