package com.cleanroommc.physics.ecs;

import com.cleanroommc.kirino.engine.FramePhase;
import com.cleanroommc.kirino.engine.FramePhaseTiming;
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

    private void update(WorldContext<Headless> worldContext) {
        world.update();
    }

    @Override
    public void install(@NonNull WorldContext<Headless> context, @NonNull ResourceLayout layout) {
        context.on(FramePhase.PREPARE, FramePhaseTiming.BEFORE, this::prepare);
        context.on(FramePhase.UPDATE, FramePhaseTiming.BEFORE, this::update);

        world = new PhysicsWorld(context.ecs().entityManager, context.ecs().jobScheduler);
    }
}
