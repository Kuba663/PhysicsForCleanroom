package com.cleanroommc.physics;

import com.cleanroommc.kirino.ecs.component.scan.event.ComponentScanningEvent;
import com.cleanroommc.kirino.ecs.component.scan.event.StructScanningEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public final class PhysicsKirinoEvents {
    @SubscribeEvent
    public void onStructScan(StructScanningEvent ev) {
        ev.register("com.cleanroommc.physics.ecs.structs");
    }

    @SubscribeEvent
    public void onComponentScan(ComponentScanningEvent ev) {
        ev.register("com.cleanroommc.physics.ecs.components");
    }
}
