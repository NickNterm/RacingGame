// AM 5477
// Ntermaris Nikolas

import java.util.Scanner;

// inherit from Racer
class HumanRacer extends Racer {

    // constructor
    public HumanRacer(String name, Vehicle vehicle) {
        // call the super class constructor
        super(name, vehicle);
    }

    // override the get fuel from the racer and
    // get the fuel that the user wants to use
    @Override
    public int getFuel(Road road) {
        System.out.println("How much fuel do you want to use? ");
        Scanner scanner = new Scanner(System.in);
        int fuel = super.getVehicle().getFuel();
        // if the user inputs a non integer
        // use all of their fuel
        try {
            fuel = scanner.nextInt();
        } catch(Exception e){
            System.out.println("You must enter an integer. Invalid Input. You will use all of your fuel.");
        }
        // if the user inputs more fuel than what they have
        // use all of their fuel
        if(super.getVehicle().getFuel() < fuel) {
            System.out.println("You don't have enough fuel. You will use all of your fuel.");
            fuel = super.getVehicle().getFuel();
        }

        // if the user inputs 0 fuel or negative fuel
        // use 1 fuel
        if(fuel < 1) {
            System.out.println("You must use at least 1 fuel. You will use 1 fuel.");
            fuel = 1;
        }
        return fuel;
    }

}
