import java.util.Random;

public class Computer {
    // Computer's choice
    private RPSWindow.CHOICES choice;
    // Random object to use and get choices to work with
    private final Random rand = new Random();

    // Object constructor
    public Computer() {
    }

    // Get a choice to use
    public RPSWindow.CHOICES getChoice() {
        // Pick a random number between 0 and 2 (inclusive) and return a specific choice depending on number
        switch (rand.nextInt(3)) {
            case 0:
                choice = RPSWindow.CHOICES.Rock;
                break;
            case 1:
                choice = RPSWindow.CHOICES.Paper;
                break;
            case 2:
                choice = RPSWindow.CHOICES.Scissors;
                break;
        }
        return choice;
    }
}
