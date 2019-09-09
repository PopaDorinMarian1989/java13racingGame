package org.fasttrackit;


import javax.crypto.spec.PSource;

public class HybridCar extends Vehicle {
    @Override
    public double accelerate(double speed, double durationinHours) {
        System.out.println(getName() + " is acceleration with " + speed + "for" + durationinHours + "h");
        double actualSpeed = 2 * speed;
        double distance = actualSpeed * durationinHours;
        setTraveledDistance(getTraveledDistance() + distance);
        System.out.println("Cheater!!!");
        return distance;


    }

//co-variant return type
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new HybridCar();
    }
}
