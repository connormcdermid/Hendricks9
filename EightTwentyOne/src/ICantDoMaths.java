/*
  author: Frank Gomes
  lab: 8.21 Worksheet Strictly Math
  date: 22-05-19
  extra: Random numbers bound to user-specified number
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ICantDoMaths {

    // Random object for making random ints
    private static Random rand = new Random();

    // Scanner for user input
    private static Scanner kbd = new Scanner(System.in);

    // Main method
    public static void main(String[] args) {
        System.out.println("What problem would you like to see? Type \"0\" to exit.");
        int input = kbd.nextInt();
        switch (input) {
            case 1:
                one();
                break;
            case 2:
                two();
                break;
            case 3:
                three();
                break;
            case 0:
                System.exit(0);
        }
        main(null);
    }

    // Method to print arrays
    private static void printArray(int[] array) {
        System.out.print("[");
        for (int value : array)
            System.out.print(value + ", ");
        System.out.print("\b\b]\n");
    }

    // Problem 1
    private static void one() {
        // Number to bind random values to
        System.out.println("What should random number generation be bound to?");
        int bound = kbd.nextInt();
        // Array to hold random ints
        int[] randArray = new int[25];
        // Amount of even & odd numbers
        int evens = 0;
        int odds = 0;
        // Makes all items in the Array random
        for (int i=0; i < randArray.length; i++) {
            randArray[i] = rand.nextInt(bound);
            if (randArray[i] % 2 == 0)
                evens++;
            else
                odds++;
        }
        // Prints new random array
        System.out.print("Random array: "); printArray(randArray);
        // Arrays to hold the even and odd numbers from randArray
        int[] evensArray = new int[evens];
        int[] oddsArray = new int[odds];
        // Counter for the place in the array
        int evenCounter = 0;
        int oddCounter = 0;
        // Fills arrays with even or odd ints
        for (int value : randArray) {
            if (value % 2 == 0) {
                evensArray[evenCounter] = value;
                evenCounter++;
            } else {
                oddsArray[oddCounter] = value;
                oddCounter++;
            }
        }
        // Prints even & odd arrays
        System.out.print("Even array: "); printArray(evensArray);
        System.out.print("Odd array: "); printArray(oddsArray);
    }

    // Problem 2
    private static void two() {
        // Array of numbers to work with
        String[] numbers = {"420", "212", "508", "164", "767", "909", "376", "286", "386", "486"};
        // Array of reversed numbers
        String[] reversedNumbers = {"", "", "", "", "", "", "", "", "", ""};
        // reverses each number and then checks if
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i] = Character.toString(numbers[i].charAt(2)) + Character.toString(numbers[i].charAt(1)) + Character.toString(numbers[i].charAt(0));
            // Checks if reversed number is equal to original number, declares as palindromic if it is
            if (reversedNumbers[i].equals(numbers[i]))
                System.out.println(numbers[i] + " is palindromic.");
            else
                System.out.println(numbers[i] + " is not palindromic.");
        }
    }

    // Problem 3
    private static void three() {
        // Number to bind random values to
        System.out.println("What should random number generation be bound to?");
        int bound = kbd.nextInt();
        // Array to hold random ints
        int[] randArray = new int[25];
        // Amount of even & odd numbers
        int evens = 0;
        int odds = 0;
        // Makes all items in the Array random
        for (int i=0; i < randArray.length; i++) {
            randArray[i] = rand.nextInt(bound);
            if (randArray[i] % 2 == 0)
                evens++;
            else
                odds++;
        }
        // Prints random numbers
        System.out.print("Random array: "); printArray(randArray);
        // Sorts randArray
        Arrays.sort(randArray);
        // Finds mean
        int sum = 0;
        for (int i : randArray)
            sum += i;
        double mean = sum/randArray.length;
        // Finds median
        int median = randArray[12];
        // Finds range
        int range = randArray[24] - randArray[0];
        // Finds min & max
        int min = randArray[0];
        int max = randArray[24];
        // Finds variance
        int varianceSum = 0;
        for (int i : randArray)
            varianceSum += (i-mean)*(i-mean);
        double variance = varianceSum / (randArray.length - 1);
        // Finds standard deviation
        double stddev = Math.sqrt(variance);
        // Prints it all out
        System.out.println(
                "Mean: " + mean +
                "\nMedian: " + median +
                "\nMaximum: " + max +
                "\nMinimum: " + min +
                "\nRange: " + range +
                "\nVariance: " + variance +
                "\nStandard Deviation: " + stddev);
    }
}
