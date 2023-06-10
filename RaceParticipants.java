// AM 5477
// Ntermaris Nikolas

import java.util.Scanner;

class RaceParticipants {
    // The array with the racers
    private Racer[] racers = new Racer[4];

    // constructor
    RaceParticipants() {
        // create the computer
        racers[0] = new Racer("Computer 1", new Motorbike());
        racers[1] = new Racer("Computer 2", new Car());
        racers[2] = new Racer("Computer 3", new Jeep());
        // request from the user the type of vehicle he wants
        Scanner scanner = new Scanner(System.in);

        int vehicle = 0;

        // while loop
        while(vehicle == 0){
            // try to get the input
            // if the input is non integer
            // or if the input is not between 1 and 3
            // print the error message
            // else set the vehicle to the input
            try {
                System.out.println("What kind of vehicle do you want? (1: Motorbike, 2: Car, 3: Jeep) ");
                int input = scanner.nextInt();
                if(input < 1 || input > 3) {
                    System.out.println("You must enter a number between 1 and 3. Invalid Input.");
                } else {
                    vehicle = input;
                }
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("You must enter an integer. Invalid Input.");
            }
        }

        // init the car
       switch (vehicle) {
           case 1:
               racers[3] = new HumanRacer("Human", new Motorbike());
               break;
           case 2:
               racers[3] = new HumanRacer("Human", new Car());
               break;
           case 3:
               racers[3] = new HumanRacer("Human", new Jeep());
               break;
           default:
               // there is no way that is going to come in here
               break;
       } 
    }

    // run all the .race method from the racers
    public void runRoadSegment(Road road) {
        for (int i = 0; i < 4; i++) {
            racers[i].race(road);
        }
    }

    // refuel everyone
    public void refuelAll() {
        for (int i = 0; i < 4; i++) {
            racers[i].refuel();
        }
    }

    // then print the racers but sorted
    public void printTable() {
        // sort racers based on time
        Racer[] sorted = racers.clone();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3 - i; j++) {
                if (sorted[j].getTime() > sorted[j + 1].getTime()) {
                    Racer temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(sorted[i].toString());
        }
    }

    // return the winner == the fastest racer
    public Racer whoWon() {
        Racer winner = racers[0];

        for (int i = 1; i < 4; i++) {
            if (racers[i].getTime() < winner.getTime()) {
                winner = racers[i];
            }
        }
        return winner;
    }

}
