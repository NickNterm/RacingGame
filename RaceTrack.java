// AM 5477
// Ntermaris Nikolas

import java.util.Random;

class RaceTrack {
    private Road[] segments;
    private int runSegment = 0;

    // constructor
    RaceTrack(int length) {
        // create the array for the segments
        segments = new Road[length];
        Random random = new Random();
        // create random segments
        for (int i = 0; i < length; i++) {
            int roadType = random.nextInt(3);
            // switch case to create the random segments
            switch (roadType){
                case 0:
                    segments[i] = new Road(random.nextInt(50) + 50);
                    break;
                case 1:
                    segments[i] = new DirtRoad(random.nextInt(50) + 50);
                    break;
                case 2:
                    segments[i] = new RockyRoad(random.nextInt(50) + 50);
                    break;
                default:
                    break;
            }
        }
    }

    // return the current segment
    // and with the ++ that means that after the call the
    // variable with be incremented by 1
    // This don't check if the runSegment is out of bounds
    // so you have to check it with reachEnd()
    public Road nextSegment() {
        return segments[runSegment++];
    }

    // just a boolean to check if we reached the end
    public boolean reachEnd() {
        return runSegment == segments.length;
    }

    // print the remaining track
    // as the example shows
    void printRemainingTrack() {
        for (int i = runSegment; i < segments.length; i++) {
            System.out.println("(" + segments[i].toString() + ")");
        }
    }

    // testing main
    public static void main(String[] args) {
        new RaceTrack(10).printRemainingTrack();
    }
}
