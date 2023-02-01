package claustra01.netherfirmacraft.block;

import net.dries007.tfc.common.blocks.rock.Rock;
import net.dries007.tfc.common.blocks.rock.RockCategory;
import net.dries007.tfc.util.registry.RegistryRock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;

import java.util.Locale;
import java.util.function.Supplier;

public enum NetherRock implements RegistryRock {

    NETHERRACK(RockCategory.IGNEOUS_EXTRUSIVE);

    private final String serializedName;
    private final RockCategory category;

    private NetherRock(RockCategory category) {
        this.serializedName = this.name().toLowerCase(Locale.ROOT);
        this.category = category;
    }

    public RockCategory category() {
        return this.category;
    }

    public String getSerializedName() {
        return this.serializedName;
    }

    public Supplier<? extends Block> getBlock(Rock.BlockType type) {
        return null;
    }

    public Supplier<? extends Block> getAnvil() {
        return null;
    }

    public Supplier<? extends SlabBlock> getSlab(Rock.BlockType blockType) {
        return null;
    }

    public Supplier<? extends StairBlock> getStair(Rock.BlockType blockType) {
        return null;
    }

    public Supplier<? extends WallBlock> getWall(Rock.BlockType blockType) {
        return null;
    }
}
