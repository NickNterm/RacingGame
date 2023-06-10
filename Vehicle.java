// AM 5477
// Ntermaris Nikolas

// abstract class for vehicles
abstract class Vehicle {
    private String name;
    private int fuel = 10;

    // returns the consumption factor of the vehicle
    public abstract double computeConsumptionFactor(Road road);

    public double race(Road road, int fuel) {
        // (double) fuel
        // You need to cast fuel to double cause then the
        // java does the division with integers and the result is 0
        // so cast fuel to double and then the division is correct
        // realConsPerKm is fuel per km
        double realConsPerKm = (double) fuel / road.getLength();
        // compute the consumption factor depending on the vehicle
        // consumptionFactor is fuel per km so that the speed is 1
        double consumptionFactor = computeConsumptionFactor(road);
        // compute the speed of the vehicle
        double speed = realConsPerKm / consumptionFactor;
        // from the speed get the time
        double time = road.getLength() / speed;
        // update the fuel
        this.fuel -= fuel;
        // return the time
        return time;
    }

    // add 10 fuel
    public void refuel() {
        fuel += 10;
    }

    // to String
    public String toString() {
        return name + " fuel left: " + fuel;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // setter for the name
    public void setName(String name) {
        this.name = name;
    }

    // getter for the fuel
    public int getFuel() {
        return fuel;
    }
}
