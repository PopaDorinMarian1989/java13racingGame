package org.fasttrackit;

public class Vehicle{

    String name;
    double mileage;
    double maxSpeed;
    String fuelType;
    double fuelLevel;
    double traveledDistance;
    boolean running;

    public double accelerate (double speed, double durationinHours) {
        System.out.println(name + " is accelerating with" + speed + " km/h for " + durationinHours + " h.");
        double distance = speed * durationinHours;

        System.out.println("Distance : " + distance);

        traveledDistance = traveledDistance + distance;
        // same result as the above statment
//        traveledDistance += distance;
        double usedFuel = distance * mileage / 100;
        System.out.println("Used fuel: + usedfuel");
        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel: " + fuelLevel);


        return distance;
    }
}
