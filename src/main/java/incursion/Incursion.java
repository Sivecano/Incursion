package incursion;

import incursion.nexus.BlockEntityNexus;
import incursion.nexus.BlockNexus;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Incursion implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("incursion");
    public static final Block BLOCK_NEXUS = new BlockNexus(FabricBlockSettings.of(Material.STONE).strength(100.0f));
    public static final BlockEntityType<BlockEntityNexus> BLOCK_ENTITY_NEXUS = Registry.register(
            Registry.BLOCK_ENTITY_TYPE,
            new Identifier("incursion", "nexus_block_entity"),
            FabricBlockEntityTypeBuilder.create(BlockEntityNexus::new, BLOCK_NEXUS).build()
    );
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Hello Fabric world!");
        Registry.register(Registry.BLOCK, new Identifier("incursion", "nexus"), BLOCK_NEXUS);
        Registry.register(Registry.ITEM, new Identifier("incursion", "nexus"),
                new BlockItem(BLOCK_NEXUS, new FabricItemSettings().group(ItemGroup.MISC)));
        IItems.registerItems();
    }
}
