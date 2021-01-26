package ladysnake.beem.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BeehiveBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BeehiveBlockEntity.class)
public abstract class BeehiveBlockEntityMixin extends BlockEntity {
    public BeehiveBlockEntityMixin(final BlockEntityType<?> type, final BlockPos pos, final BlockState state) {
        super(type, pos, state);
    }

    @Override
    public double getSquaredRenderDistance() {
        return 65536.0D;
    }
}
