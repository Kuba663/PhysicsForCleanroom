package com.cleanroommc.physics;

import com.google.common.eventbus.EventBus;
import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.versioning.DefaultArtifactVersion;

import java.util.List;
import java.util.Set;

public class PhysicsEngineModContainer extends DummyModContainer {

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

    @Override
    public boolean registerBus(EventBus bus, LoadController controller) {
        return true;
    }
}
