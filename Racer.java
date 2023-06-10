// AM 5477
// Ntermaris Nikolas

class Racer {
    private String name;
    private Vehicle vehicle;
    private double timedone;

    // constructor
    Racer(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    // return all the fuel that the vehicle has
    public int getFuel(Road road) {
        return vehicle.getFuel();
    }

    // call the race method of the vehicle
    // and update the timedone
    void race(Road road) {
        timedone += vehicle.race(road, getFuel(road));
    }

    // call the refuel method of the vehicle
    void refuel() {
        vehicle.refuel();
    }

    // getter for the time
    public double getTime() {
        return timedone;
    }

    // getter for the vehicle
    public Vehicle getVehicle() {
        return vehicle;
    }
    // return the racer as the example shows
    public String toString() {
        return name + " (" + timedone + ")\n\t" + vehicle.toString();
    }
}
