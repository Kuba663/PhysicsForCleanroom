package com.cleanroommc.physics;

import com.cleanroommc.kirino.KirinoCommonCore;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.versioning.DefaultArtifactVersion;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.MemoryStack;

import java.util.List;
import java.util.Set;

public final class PhysicsEngineModContainer extends DummyModContainer {

    public PhysicsEngineModContainer() {
        super(new ModMetadata());

        ModMetadata meta = this.getMetadata();
        meta.modId = "cleanroom_physics";
        meta.name = "Cleanroom Physics";
        meta.version = "0.0.1";
        meta.description = "Very Experimental Physics Engine for CleanroomMC.";
        meta.authorList = List.of("EΣrie");
        meta.requiredMods = Set.of(
                new DefaultArtifactVersion("kirino_ecs:[epoch-1.a3,)"),
                new DefaultArtifactVersion("kirino_engine:[epoch-1.a4,)")
        );
        meta.dependencies = List.of(
                new DefaultArtifactVersion("kirino_ecs:[epoch-1.a3,)"),
                new DefaultArtifactVersion("kirino_engine:[epoch-1.a4,)")
        );
    }

    @Subscribe
    public void construct(FMLConstructionEvent ev) {
        Configuration.OPENCL_EXPLICIT_INIT.set(true);
        try (MemoryStack stack = MemoryStack.stackPush()) {
            PhysicsOpenCL.initOpenCL(stack);
        }
    }

    @Subscribe
    public void preInit(FMLPreInitializationEvent ev) {

    }

    @Override
    public boolean registerBus(EventBus bus, LoadController controller) {
        KirinoCommonCore.KIRINO_EVENT_BUS.register(new PhysicsKirinoEvents());
        bus.register(this);
        return true;
    }
}
