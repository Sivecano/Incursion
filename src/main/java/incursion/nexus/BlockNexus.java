package incursion.nexus;
import incursion.Incursion;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class BlockNexus extends Block implements BlockEntityProvider {
    public BlockNexus(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        Incursion.LOGGER.trace("creating block entity in block");
        return new BlockEntityNexus(pos, state);
    }
}
