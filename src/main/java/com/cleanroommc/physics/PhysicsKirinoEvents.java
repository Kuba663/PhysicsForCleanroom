package com.cleanroommc.physics;

import com.cleanroommc.kirino.ecs.component.scan.event.ComponentScanningEvent;
import com.cleanroommc.kirino.ecs.component.scan.event.StructScanningEvent;
import com.google.common.eventbus.Subscribe;

public class PhysicsKirinoEvents {
    @Subscribe
    public void onStructScan(StructScanningEvent ev) {
        ev.register("com.cleanroommc.physics.ecs.structs");
    }

    @Subscribe
    public void onComponentScan(ComponentScanningEvent ev) {
        ev.register("com.cleanroommc.physics.ecs.components");
    }
}
