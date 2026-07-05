package com.cleanroommc.physics;

import net.minecraftforge.fml.common.InjectedModContainer;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.asm.FMLSanityChecker;
import com.cleanroommc.physics.config.PhysicsConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

public final class PhysicsCommon {

    private final static PhysicsConfig CONFIG = new PhysicsConfig();
    public static final Logger LOGGER = LogManager.getLogger("Physics");

    public static void injectMod(List<ModContainer> mods) {
        if (!CONFIG.isEnabled())
            return;
        mods.add(new InjectedModContainer(new PhysicsEngineModContainer(), FMLSanityChecker.fmlLocation));
    }
}
