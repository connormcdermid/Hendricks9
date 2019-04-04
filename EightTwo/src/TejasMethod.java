import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
  author: Frank Gomes
  lab: 8.2 Worksheet Array Method Sum Percentage
  date: 03-04-19
  extra: Outputs the sum in green
 */

public class TejasMethod {
    public static void main(String[] args) {
        // DecimalFormat for rounding to two decimal places, normal rounding up
        DecimalFormat df = new DecimalFormat("#0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        // Scanner for user input
        Scanner kbd = new Scanner(System.in);
        // Asks user how many integers to use, turns that into an int called numbers
        System.out.println("How many numbers do you plan to enter?");
        int numbers = kbd.nextInt();
        // Array with amount of values specified by user
        int[] array = new int[numbers];
        System.out.println("Please enter the " + numbers + " integers.");
        // Gets int from user to set each array value to
        for (int i = 0; i < numbers; i++) {
            array[i] = kbd.nextInt();
        }
        // Double for sum, 0.0 used to prevent integer in floating point operations
        double sum = 0.0;
        // Creates a sum of all the items in the array
        for (int item: array)
            sum += item;
        // Prints out the percentage of the sum for each item in the array
        System.out.println("Statistics: ");
        for (int i = 0; i < numbers; i++) {
            System.out.println(array[i] + " is " + df.format((array[i] / sum)*100) + "% of the sum.");
        }
        System.out.println("Total sum: \u001b[32m" + sum);
    }
}
