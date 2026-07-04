# PhysicsForCleanroom
Very Experimental Physics Engine for CleanroomMC.

## What is this supposed to be:
The point of this project is to create a physics engine or at leat a wrapper for one that will rely on ECS features introduced in the [Kirino](https://github.com/CleanroomMC/Kirino-Engine) subproject.
The engine should be capable of handling at least rigidbodies, constraint resolution and rigidbody-fluid dynamics in it's final state. 
The project also plans to address questionable solutions related to collision detection in the base game and might implement some opt-in gameplay features.

## Why don't just use Velthoric
Velthoric is an already existing mod with it's own architecture, rewriting it to work with Kirino would require an effective rewrite. It also uses JNI which is not the best solution when FFM could be used.
