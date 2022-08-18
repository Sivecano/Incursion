package incursion;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class IItems
{
    public static final ItemGroup INCUSRSION_GROUP = FabricItemGroupBuilder.build(new Identifier("incursion", "general"), () -> new ItemStack(Blocks.COBBLESTONE));

    public static final Item CATALYST = new Item(new FabricItemSettings().group(INCUSRSION_GROUP));

    public static void registerItems()
    {
        Registry.register(Registry.ITEM, new Identifier("catalyst", "catalyst"), CATALYST);
    }

}
