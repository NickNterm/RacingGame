// AM 5477
// Ntermaris Nikolas

import java.util.Random;

class RockyRoad extends Road {
    private int uneven;

    // constructor
    public RockyRoad(int length) {
        // call the super class constructor
        super(length);
        // then create a random number for the uneven
        Random rand = new Random();
        uneven = rand.nextInt(3);
    }

    // update the consumption factor
    @Override
    double updateConsumptionFactor(double consumptionFactor) {
        // call the super class to update the consumption factor
        double updatedFactor = super.updateConsumptionFactor(consumptionFactor);
        // then update the factor depending on the uneven
        if (uneven == 2) {
            updatedFactor *= 1.2;
        } else if (uneven == 1) {
            updatedFactor *= 1.1;
        }
        return updatedFactor;
    }

    // override the toString method
    @Override
    public String toString() {
        // get the string from the super class
        String str = super.toString();
        // and just add the uneven in the end
        str += " and rock size " + uneven;
        return str;
    }

    // the type of the road is 2
    @Override
    int getType() {
        return 2;
    }

}
