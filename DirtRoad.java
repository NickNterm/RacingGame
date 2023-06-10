// AM 5477
// Ntermaris Nikolas

import java.util.Random;

// inherit from Road
class DirtRoad extends Road {
    // extend the road class with a new variable
    private double rainLevel;

    // constructor
    public DirtRoad(int length) {
        // call the super class constructor
        super(length);
        // then create a random number for the rain level
        Random random = new Random();
        rainLevel = random.nextDouble();
    }

    // the type of the road is 1
    @Override
    int getType() {
        return 1;
    }

    @Override
    public String toString() {
        // get the string from the super class
        String str = super.toString();
        // and just add the rain level in the end
        str += " and rain level " + rainLevel;
        return str;
    }

    // update the consumption factor
    @Override
    double updateConsumptionFactor(double consumptionFactor) {
        // call the super class to update the consumption factor
        // depending on the turns
        double updatedFactor = super.updateConsumptionFactor(consumptionFactor);
        // then update the factor depending on the rain level
        if (rainLevel > 0.8) {
            updatedFactor *= 1.2;
        } else if (rainLevel > 0.5) {
            updatedFactor *= 1.1;
        }
        return updatedFactor;
    }
}
