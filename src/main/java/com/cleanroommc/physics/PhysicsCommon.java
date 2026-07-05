package com.cleanroommc.physics;

import it.unimi.dsi.fastutil.PriorityQueue;
import it.unimi.dsi.fastutil.objects.ObjectHeapPriorityQueue;
import net.minecraftforge.fml.common.InjectedModContainer;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.asm.FMLSanityChecker;
import com.cleanroommc.physics.config.PhysicsConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jspecify.annotations.NonNull;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opencl.CL;
import org.lwjgl.opencl.CL10;
import org.lwjgl.opencl.CLCapabilities;
import org.lwjgl.system.MemoryStack;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
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
