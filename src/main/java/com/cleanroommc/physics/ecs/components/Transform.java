package com.cleanroommc.physics.ecs.components;

import com.cleanroommc.kirino.ecs.component.scan.CleanComponentSignature;
import org.joml.Matrix3f;
import org.joml.Vector3f;

@CleanComponentSignature
public class Transform {
    Vector3f position;
    Matrix3f rotation;
}
