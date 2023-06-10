// AM 5477
// Ntermaris Nikolas

class RacingGame {
    // Create the main function
    public static void main(String[] args) {
        // create a track with 10 segments
        RaceTrack raceTrack = new RaceTrack(10);
        // create the participants
        RaceParticipants raceParticipants = new RaceParticipants();
        // if the track is not finished
        while (!raceTrack.reachEnd()) {
            // print the track
            raceTrack.printRemainingTrack();
            // print the participants
            raceParticipants.printTable();
            // get the next segment
            Road runningSegment = raceTrack.nextSegment();
            // run the segment
            raceParticipants.runRoadSegment(runningSegment);
            // refuel everyone
            raceParticipants.refuelAll();
            // and the loop goes on until it reaches the end
        }
        // print the final winner
        System.out.println("The winner is " + raceParticipants.whoWon().toString());
    }
}
