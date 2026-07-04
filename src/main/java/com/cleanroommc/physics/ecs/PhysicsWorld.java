package com.cleanroommc.physics.ecs;

import com.cleanroommc.kirino.ecs.entity.EntityManager;
import com.cleanroommc.kirino.ecs.job.JobScheduler;
import com.cleanroommc.kirino.ecs.world.CleanWorld;

public class PhysicsWorld extends CleanWorld {

    public PhysicsWorld(EntityManager entityManager, JobScheduler jobScheduler) {
        super(entityManager, jobScheduler);
    }

    @Override
    public void update() {
    }
}
