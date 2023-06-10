// AM 5477
// Ntermaris Nikolas

class Car extends Vehicle {
    // Create a array with the factors depending on the road type
    // The getType() is the index of the array
    private double[] factors = { 0.1, 0.35, 0.45 };

    Car() {
        // call the super class constructor
        super.setName("Car");
    }

    // Compute the consumption factor of the car
    @Override
    public double computeConsumptionFactor(Road road) {
        // geting the factor from the array
        double factor = factors[road.getType()];
        // update the factor with the road factor
        factor = road.updateConsumptionFactor(factor);
        // return the factor
        return factor;
    }
}
