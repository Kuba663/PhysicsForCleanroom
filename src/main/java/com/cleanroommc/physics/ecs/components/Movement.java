package com.cleanroommc.physics.ecs.components;

import com.cleanroommc.kirino.ecs.component.scan.CleanComponentSignature;
import org.joml.Vector3f;

@CleanComponentSignature
public class Movement {
    Vector3f linearSpeed;
    Vector3f rotationalSpeed;

    Vector3f force;
    Vector3f torque;
}
