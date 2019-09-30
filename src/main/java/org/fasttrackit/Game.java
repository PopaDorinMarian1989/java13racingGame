package org.fasttrackit;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Vehicle competitor1;
    private Vehicle competitor2;
    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();


    public void start() throws Exception {
        initializeTracks();
        displayTracks();

        Track selectedTrack = getSelectedTrackFromUser();

        initializeCompetitors();

        boolean winnerNotKnow = true;
        int competitorWithoutFuel = 0;
        while (winnerNotKnow && competitorWithoutFuel < competitors.size()) {
            //for-each or enhance for loop
            for (Vehicle vehicle : competitors) {
                double speed = getAccelerationSpeedFromUser();
                vehicle.accelerate(speed, 1);
                if (selectedTrack.getLenght() <= vehicle.getTraveledDistance()) {
                    winnerNotKnow = false;
                    System.out.println("The winner is: " + vehicle.getName());
                    break;
                }
                if (vehicle.getFuelLevel() <= 0) {
                    competitorWithoutFuel++;
                }

            }
        }


    }

    private double getAccelerationSpeedFromUser() {
        System.out.println("Please enter acceleration speed");
        Scanner scanner = new Scanner(System.in);
        try {
             return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid number");
            return getAccelerationSpeedFromUser();
        }


    }


    private Track getSelectedTrackFromUser() {
        System.out.println("Please select a track.");
        Scanner scanner = new Scanner(System.in);


        try {
            int userChoise = scanner.nextInt();
            return tracks[userChoise - 1];
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
            System.out.println("You have entered an invalid number.");
            //recursion - a method callin itself
            return getSelectedTrackFromUser();
        }


    }

    private void initializeCompetitors() throws Exception {
        int competitorCount = getCompetitorCoutFromUser();

        System.out.println("Today's competisors are");
        for (int i = 0; i < competitorCount; i++) {
            Vehicle competitor = new Vehicle();
            competitor.setName("Copetitor " + i);
            competitor.setMaxSpeed(300);
            competitor.setMileage(ThreadLocalRandom.current().nextDouble(6, 12));
            competitor.setFuelLevel(80);
            System.out.println(competitor);

            competitors.add(competitor);
        }
    }

    private int getCompetitorCoutFromUser() throws Exception {
        System.out.println("Please enter number of players");
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new Exception("You have entered an invalid number");
        } finally {
            System.out.println("Finally block is always executed");
        }
    }

    private void initializeTracks() {
        Track track1 = new Track();
        track1.setName("Monte Carlo");
        track1.setLenght(300);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Monza");
        track2.setLenght(400);

        tracks[1] = track2;
    }

    private void displayTracks() {
        System.out.println("Available tracks");

        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println(tracks[i].getName() + " - Lenght:" + tracks[i].getLenght() + "km.");


            }
        }

    }
}




