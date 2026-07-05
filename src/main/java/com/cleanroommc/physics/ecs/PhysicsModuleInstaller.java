package com.cleanroommc.physics.ecs;

import com.cleanroommc.kirino.engine.resource.ResourceLayout;
import com.cleanroommc.kirino.engine.world.ModuleInstaller;
import com.cleanroommc.kirino.engine.world.context.WorldContext;
import com.cleanroommc.kirino.engine.world.type.Headless;
import org.jspecify.annotations.NonNull;

public final class PhysicsModuleInstaller implements ModuleInstaller<Headless> {

    private boolean init = false;
    private PhysicsWorld world;

    private void prepare(WorldContext<Headless> worldContext) {
        if (init) {
            return;
        }
        init = true;
    }

    @Override
    public void install(@NonNull WorldContext<Headless> context, @NonNull ResourceLayout layout) {

    }
}
