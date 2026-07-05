package com.cleanroommc.physics.ecs.components;

import com.cleanroommc.kirino.ecs.component.scan.CleanComponentSignature;
import com.cleanroommc.physics.ecs.structs.OBB;
import org.joml.Matrix3f;
import org.joml.Vector3f;

@CleanComponentSignature
public class BoxCollider {
    OBB boundingBox;

    float mass;
    Matrix3f inertiaTensor;
    Vector3f centroid;
}
