package incursion;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Incursion implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public static final ItemGroup INCUSRSION_GROUP = FabricItemGroupBuilder.build(
			new Identifier("tutorial", "general"),
			() -> new ItemStack(Blocks.COBBLESTONE));

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}
