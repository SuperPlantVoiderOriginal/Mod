package rimrimramrammodpbj;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rimrimramrammodpbj.block.ModBlocks;
import rimrimramrammodpbj.item.ModItemGroups;
import rimrimramrammodpbj.item.ModItems;

public class PBJButNot implements ModInitializer {
		public static final String MOD_ID = "pbjbutnot";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}