package fr.hugman.universal_ores;

import fr.hugman.universal_ores.UniversalOresBlocks;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;

public class UniversalOres implements ModInitializer {
    public static final String MOD_ID = "universal_ores";

    @Override
    public void onInitialize() {
        Reflection.initialize(UniversalOresBlocks.class);
    }
}