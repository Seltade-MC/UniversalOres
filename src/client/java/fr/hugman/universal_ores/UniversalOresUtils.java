package fr.hugman.universal_ores;

import com.google.common.collect.ImmutableList;
import fr.hugman.universal_ores.block.NetherOreBlocks;
import fr.hugman.universal_ores.block.OverworldOreBlocks;
import fr.hugman.universal_ores.block.UniversalOresBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Function;

public class UniversalOresUtils {

    public static final BlockMatchTest ANDESITE_RULE = new BlockMatchTest(Blocks.ANDESITE);
    public static final BlockMatchTest DIORITE_RULE = new BlockMatchTest(Blocks.DIORITE);
    public static final BlockMatchTest GRANITE_RULE = new BlockMatchTest(Blocks.GRANITE);
    public static final BlockMatchTest TUFF_RULE = new BlockMatchTest(Blocks.TUFF);
    public static final BlockMatchTest CALCITE_RULE = new BlockMatchTest(Blocks.CALCITE);
    public static final BlockMatchTest BLACKSTONE_RULE = new BlockMatchTest(Blocks.BLACKSTONE);
    public static final BlockMatchTest BASALT_RULE = new BlockMatchTest(Blocks.BASALT);
}