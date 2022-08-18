package incursion.nexus;

import incursion.Incursion;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class BlockEntityNexus extends BlockEntity {
    public BlockEntityNexus(BlockPos pos, BlockState state) {
        super(Incursion.BLOCK_ENTITY_NEXUS, pos, state);
    }
}