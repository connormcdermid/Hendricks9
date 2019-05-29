import java.util.Random;

public class WaitINeedToKnowJava {
    public static void main(String[] args) {
        // Array to hold random ints
        int[] randomInts = new int[25];
        // Random object to make random objects
        Random rand = new Random();
        // Makes every int in the array a random number
        // int for evens
        int evens = 0;
        // int for odds
        int odds = 0;
        for (int i: randomInts) {
            randomInts[i] = rand.nextInt();
            if (randomInts[i] % 2 == 0)
                evens++;
            else
                odds++;
        }
        // Array of even numbers
        int[] evenNumbers = new int[evens];
        // Array of odd numbers
        int[] oddNumbers = new int[odds];

    }
}
