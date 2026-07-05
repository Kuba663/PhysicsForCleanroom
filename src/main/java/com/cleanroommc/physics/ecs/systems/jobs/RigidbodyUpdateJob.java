package com.cleanroommc.physics.ecs.systems.jobs;

import com.cleanroommc.kirino.ecs.entity.EntityManager;
import com.cleanroommc.kirino.ecs.entity.EntityQuery;
import com.cleanroommc.kirino.ecs.job.JobDataQuery;
import com.cleanroommc.kirino.ecs.job.ParallelJob;
import com.cleanroommc.kirino.ecs.storage.PrimitiveArray;
import com.cleanroommc.physics.ecs.components.BoxCollider;
import com.cleanroommc.physics.ecs.components.Movement;
import com.cleanroommc.physics.ecs.components.Transform;
import org.jspecify.annotations.NonNull;

public class RigidbodyUpdateJob implements ParallelJob {

    //<editor-fold desc="Vector3f linearSpeed;">
    @JobDataQuery(componentClass = Movement.class, fieldAccessChain = {"linearSpeed", "x"})
    PrimitiveArray linSpeedXArray;
    @JobDataQuery(componentClass = Movement.class, fieldAccessChain = {"linearSpeed", "y"})
    PrimitiveArray linSpeedYArray;
    @JobDataQuery(componentClass = Movement.class, fieldAccessChain = {"linearSpeed", "z"})
    PrimitiveArray linSpeedZArray;
    //</editor-fold>
    //<editor-fold desc="Vector3f angularSpeed;">
    @JobDataQuery(componentClass = Movement.class, fieldAccessChain = {"angularSpeed", "x"})
    PrimitiveArray anSpeedXArray;
    @JobDataQuery(componentClass = Movement.class, fieldAccessChain = {"angularSpeed", "y"})
    PrimitiveArray anSpeedYArray;
    @JobDataQuery(componentClass = Movement.class, fieldAccessChain = {"angularSpeed", "z"})
    PrimitiveArray anSpeedZArray;
    //</editor-fold>
    //<editor-fold desc="Vector3f force;">
    @JobDataQuery(componentClass = Movement.class, fieldAccessChain = {"force", "x"})
    PrimitiveArray forceXArray;
    @JobDataQuery(componentClass = Movement.class, fieldAccessChain = {"force", "y"})
    PrimitiveArray forceYArray;
    @JobDataQuery(componentClass = Movement.class, fieldAccessChain = {"force", "z"})
    PrimitiveArray forceZArray;
    //</editor-fold>
    //<editor-fold desc="Vector3f torque;">
    @JobDataQuery(componentClass = Movement.class, fieldAccessChain = {"torque", "x"})
    PrimitiveArray torqueXArray;
    @JobDataQuery(componentClass = Movement.class, fieldAccessChain = {"torque", "y"})
    PrimitiveArray torqueYArray;
    @JobDataQuery(componentClass = Movement.class, fieldAccessChain = {"torque", "z"})
    PrimitiveArray torqueZArray;
    //</editor-fold>

    //<editor-fold desc="Vector3f position;">
    @JobDataQuery(componentClass = Transform.class, fieldAccessChain = {"position", "x"})
    PrimitiveArray posXArray;
    @JobDataQuery(componentClass = Transform.class, fieldAccessChain = {"position", "y"})
    PrimitiveArray posYArray;
    @JobDataQuery(componentClass = Transform.class, fieldAccessChain = {"position", "z"})
    PrimitiveArray posZArray;
    //</editor-fold>
    //<editor-fold desc="Matrix3f rotation;">
    @JobDataQuery(componentClass = Transform.class, fieldAccessChain = {"rotation", "m00"})
    PrimitiveArray rotationM00;
    @JobDataQuery(componentClass = Transform.class, fieldAccessChain = {"rotation", "m01"})
    PrimitiveArray rotationM01;
    @JobDataQuery(componentClass = Transform.class, fieldAccessChain = {"rotation", "m02"})
    PrimitiveArray rotationM02;
    @JobDataQuery(componentClass = Transform.class, fieldAccessChain = {"rotation", "m10"})
    PrimitiveArray rotationM10;
    @JobDataQuery(componentClass = Transform.class, fieldAccessChain = {"rotation", "m11"})
    PrimitiveArray rotationM11;
    @JobDataQuery(componentClass = Transform.class, fieldAccessChain = {"rotation", "m12"})
    PrimitiveArray rotationM12;
    @JobDataQuery(componentClass = Transform.class, fieldAccessChain = {"rotation", "m20"})
    PrimitiveArray rotationM20;
    @JobDataQuery(componentClass = Transform.class, fieldAccessChain = {"rotation", "m21"})
    PrimitiveArray rotationM21;
    @JobDataQuery(componentClass = Transform.class, fieldAccessChain = {"rotation", "m22"})
    PrimitiveArray rotationM22;
    //</editor-fold>

    //<editor-fold desc="Vector3f startingPoint;">
    @JobDataQuery(componentClass = BoxCollider.class, fieldAccessChain = {"obb", "startingPoint", "x"})
    PrimitiveArray spXArray;
    @JobDataQuery(componentClass = BoxCollider.class, fieldAccessChain = {"obb", "startingPoint", "y"})
    PrimitiveArray spYArray;
    @JobDataQuery(componentClass = BoxCollider.class, fieldAccessChain = {"obb", "startingPoint", "z"})
    PrimitiveArray spZArray;
    //</editor-fold>
    //<editor-fold desc="Vector3f scale;">
    @JobDataQuery(componentClass = BoxCollider.class, fieldAccessChain = {"obb", "scale", "x"})
    PrimitiveArray scXArray;
    @JobDataQuery(componentClass = BoxCollider.class, fieldAccessChain = {"obb", "scale", "y"})
    PrimitiveArray scYArray;
    @JobDataQuery(componentClass = BoxCollider.class, fieldAccessChain = {"obb", "scale", "z"})
    PrimitiveArray scZArray;
    //</editor-fold>
    //<editor-fold desc="Vector3f rotation;">
    @JobDataQuery(componentClass = BoxCollider.class, fieldAccessChain = {"obb", "rotation", "x"})
    PrimitiveArray rotXArray;
    @JobDataQuery(componentClass = BoxCollider.class, fieldAccessChain = {"obb", "rotation", "y"})
    PrimitiveArray rotYArray;
    @JobDataQuery(componentClass = BoxCollider.class, fieldAccessChain = {"obb", "rotation", "z"})
    PrimitiveArray rotZArray;
    //</editor-fold>

    @Override
    public void execute(@NonNull EntityManager entityManager, int index, int entityID, int threadOrdinal) {

    }

    @Override
    public void query(@NonNull EntityQuery entityQuery) {

    }

    @Override
    public int estimateWorkload(int index) {
        return 0;
    }
}
