package org.fasttrackit;

import javax.management.PersistentMBean;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // this is a one-line comment
        //AutoVehicle autoVehicle = new AutoVehicle();
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1600;
        Car car = new Car(engine) ;
        car.setName("Dacia");
        car.setFuelLevel(60);
        car.setMileage (8.5);
        car.doorCount = 5;
        car.setMaxSpeed(180);
        car.setFuelType ("Gasoline");
        System.out.println("Car object: " + car.toString());


        System.out.println(car.getName());
        System.out.println(car.getTraveledDistance());
        System.out.println(car.isRunning());
        System.out.println(car.engine);

        Engine engine2 = new Engine();
        engine.manufacturer = "VW";
        engine.capacity = 1600;

        Car car2 = new Car(engine2);
        car2.setName("Golf");
        car.setFuelType("Gasoline");
        car.setMaxSpeed(240);
        car.doorCount =3;
        car.setMileage(9.5);
        car.setFuelLevel(70);
//        car.name = "Skoda";


        // concatenation
//        System.out.println("car2 name: " + car2.name);
//        System.out.println("car1 name: " + car.name);

        car = car2;
        

        Scanner scanner = new Scanner(System.in) ;
        String text = scanner.nextLine() ;
        System.out.println("input from user: " + text);
//        System.out.println("Please enter some text");
//        System.out.println(4 % 2);
//        System.out.println(4 % 3);
//        Scanner scanner1 = new Scanner(System.in);
//        String  newtext = scanner.nextLine();
//        System.out.println("Input from user: " = newtext);

//        System.out.println("Static variables example:");
//        //we should only call static variables from the class itself(Car)
          //
//        car.totalCount = 1;
//        System.out.println("Total count in car : " + car.totalCount);
//        car2.totalCount = 12;
//        System.out.println("Total count in car after setting car2 : " + car.totalCount);
//        System.out.println("Total count in car2: " + car2.totalCount);
//        System.out.println("Total count in Car class: " + Car.totalCount);
        Vehicle hybridCar = new HybridCar();
        hybridCar.setName("Cheater");
        // method implementation from objet's class not from variable class
        hybridCar.accelerate( 60, 1);
        System.out.println("Fuel level: "+ hybridCar.getFuelLevel());
        System.out.println("Traveled distance: " + hybridCar.getTraveledDistance());
        //variable type decides what methods can be invoked
        // type casting
        ((HybridCar) hybridCar).fly();







    }
}
