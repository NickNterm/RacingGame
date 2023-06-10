// AM 5477
// Ntermaris Nikolas

class Motorbike extends Vehicle {
    // Create a array with the factors depending on the road type
    // The getType() is the index of the array
    private double[] factors = { 0.05, 0.4, 0.5 };

    Motorbike() {
        // call the super class constructor
        super.setName("Motorbike");
    }

    // Compute the consumption factor of the Motorbike
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
