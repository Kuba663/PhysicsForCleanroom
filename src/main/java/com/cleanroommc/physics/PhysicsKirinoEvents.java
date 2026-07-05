package com.cleanroommc.physics;

import com.cleanroommc.kirino.ecs.component.scan.event.ComponentScanningEvent;
import com.cleanroommc.kirino.ecs.component.scan.event.StructScanningEvent;
import com.cleanroommc.kirino.engine.world.event.ModuleInstallerRegistrationEvent;
import com.cleanroommc.kirino.engine.world.type.Headless;
import com.cleanroommc.physics.ecs.PhysicsModuleInstaller;
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

    @SubscribeEvent
    public void installModules(ModuleInstallerRegistrationEvent ev) {
        ev.register(Headless.class, new PhysicsModuleInstaller());
    }
}
