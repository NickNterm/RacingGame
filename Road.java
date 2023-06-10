// AM 5477
// Ntermaris Nikolas

import java.util.Random;

// super class for roads
class Road {
    private int length;
    private boolean hasTurns;

    public Road(int length) {
        // initialize the length
        this.length = length;
        // create a random boolean for the turns
        Random random = new Random();
        hasTurns = random.nextBoolean();
    }

    // just update the consumption factor
    // depending on the turns on the track
    double updateConsumptionFactor(double consumptionFactor) {
        if (hasTurns) {
            consumptionFactor *= 1.1;
        }
        return consumptionFactor;
    }

    // get the type of the road and then return the string
    public String toString() {
        String str = length + " klm of ";
        // switch case to get the type and update the str
        switch (getType()) {
            case 0:
                str += "pave road";
                break;
            case 1:
                str += "dirt road";
                break;
            case 2:
                str += "rocky road";
                break;
            default:
                break;
        };

        if (hasTurns) {
            str += " with turns";
        }
        return str;
    }

    // pave road has type 0
    int getType() {
        return 0;
    }

    // getter for the length
    int getLength() {
        return length;
    }

    // getter for the turns
    boolean getHasTurns() {
        return hasTurns;
    }
}
