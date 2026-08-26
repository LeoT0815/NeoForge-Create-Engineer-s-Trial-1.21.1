package net.sheep.create_engineers_trial.worldgen.tree;

import net.sheep.create_engineers_trial.CreateEngineersTrial;
import net.sheep.create_engineers_trial.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower RUBBER_TREE = new TreeGrower(
            CreateEngineersTrial.MOD_ID + ":rubber_tree",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.RUBBER_TREE_KEY),
            Optional.empty()
    );
}