package com.cleanroommc.physics.ecs.structs;

import com.cleanroommc.kirino.ecs.component.scan.CleanStructSignature;
import org.joml.Vector3f;

@CleanStructSignature
public class OBB {
    Vector3f startingPoint;
    Vector3f scale;
    Vector3f rotation;
}
