package org.fasttrackit;

// inheritance (is-a relationship)
public class Car extends AutoVehicle {

    int doorCount;

    // has-a reletionship


    public Car(Engine engine) {
        super(engine);
        System.out.println("Creating a car");
    }
}
