import java.util.concurrent.ThreadLocalRandom;

public class TestFiveTest {
        public static void main (String[] args) {
            int diceroll = 0, rolls = 0;
            while (diceroll != 2) {
                diceroll = ThreadLocalRandom.current().nextInt(0, 6 + 1);
                rolls++;
            }
            System.out.println("It took " + rolls + " roll(s) to get the die to show 2.");
        }
    }