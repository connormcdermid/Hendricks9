/*
  author: Frank Gomes
  lab: 8.22 Worksheet After Quiz
  date: 22-05-19
  extra: Sorts the outputted arrays
 */

import java.util.Arrays;
import java.util.Scanner;

public class StopBeingSoNegative {
    public static void main(String[] args) {
        // Int array of 10 values
        int[] userArray = new int[10];
        // Counters for evens, odds, and negative items
        int evens = 0, odds = 0, negatives = 0;
        // Gets user's numbers
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter 10 integers to sort. Press enter after every number. Zeros will not be accepted.");
        for (int i = 0; i < userArray.length; i++) {
            int buffer = kbd.nextInt();
            // Checks if user entered 0
            if (buffer == 0) {
                System.out.println("Zeros will not be accepted. The program will now quit.");
                System.exit(0);
            } else if (buffer < 0) // Checks if int is negative
                negatives++;
            else if (buffer % 2 == 0) // Checks if int is even
                evens++;
            else // Only if int is odd
                odds++;
            userArray[i] = buffer;
        }
        // Arrays for evens, odds, and negatives
        int[] evenArray = new int[evens];
        int[] oddArray = new int[odds];
        int[] negativeArray = new int[negatives];
        // Resets evens, odds, and negatives to 0 to use them as counters
        evens = 0; odds = 0; negatives = 0;
        // Checks every int and puts it in its corresponding array
        for (int i : userArray) {
            if (i < 0) { // Sorts negatives
                negativeArray[negatives] = i;
                negatives++;
            } else if (i % 2 == 0) { // Sorts evens
                evenArray[evens] = i;
                evens++;
            } else { // Sorts odds
                oddArray[odds] = i;
                odds++;
            }
        }
        // Sorts arrays
        Arrays.sort(evenArray);
        Arrays.sort(oddArray);
        Arrays.sort(negativeArray);
        // Prints the different arrays
        System.out.print("Evens: "); printArray(evenArray);
        System.out.print("Odds: "); printArray(oddArray);
        System.out.print("Negatives: "); printArray(negativeArray);
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i : array)
            System.out.print(i + ", ");
        System.out.print("\b\b]\n");
    }
}
