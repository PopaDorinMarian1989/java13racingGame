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
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1600;
       Car car = new Car(engine) ;
       car.name = "Dacia";
        car.fuelLevel = 60;
        car.mileage = 8.5;
        car.doorCount = 5;
        car.maxSpeed = 180;
        car.fuelType = "Gasoline";


        System.out.println(car.name);
        System.out.println(car.traveledDistance);
        System.out.println(car.running);
        System.out.println(car.engine);

        Engine engine2 = new Engine();
        engine.manufacturer = "VW";
        engine.capacity = 1600;

        Car car2 = new Car(engine2);
        car2.name = "Golf";
        car. fuelType = "Gasoline";
        car.maxSpeed =240;
        car.doorCount =3;
        car.mileage = 9.5;
        car.fuelLevel = 70;
//        car.name = "Skoda";
        car.name = null;

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





    }
}
