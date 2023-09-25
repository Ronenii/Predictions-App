# Predictions

Predictions is a generic simulation framework that allows users to define a world with entities and laws that govern their behavior. The framework is designed to be flexible and extensible, allowing users to create simulations for a variety of purposes.

## System overview

The Predictions framework consists of the following components:

* **World:** The world is a container for entities and laws. It defines the initial state of the simulation, including the number of entities and their properties.
* **Entity:** An entity is a single object in the world. It has a name, a type, and a set of properties.
* **Law:** A law is a set of instructions that govern the behavior of entities. It can change the properties of entities, create new entities, or delete entities.
* **Environment:** The environment is a set of global variables that can be accessed by entities and laws.
* **Termination conditions:** Termination conditions define when the simulation will end.

## Simulation process

The simulation process consists of the following steps:

1. **Initialization:** The world is initialized with the specified number of entities and their properties. The environment is also initialized with the specified values.
2. **Simulation steps:** The simulation runs for a specified number of steps. In each step, the following actions are performed:
    * All laws that are eligible to be executed are executed.
    * The properties of all entities are updated.
3. **Termination:** The simulation terminates if one of the termination conditions is met (By ticks, time or user control).

## Simulation output

At the end of the simulation, users can access the following output:

* **Entity counts and types:** A summary of the number of entities and their types.
* **Entity property averages:** The average value of a property for a given entity type over time.
* **Entity property consistency:** The consistency of a property value for a given entity type over time.

## Additional features

The Predictions framework also supports the following features:

* **Spatial entities:** Entities can be assigned a location in space.
* **Randomized entities and properties:** The properties of entities can be randomly generated at initialization.
* **Error handling:** The framework detects and reports errors that occur during the simulation.
