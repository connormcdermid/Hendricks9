/**
 * @author Frank Gomes
 * @version 0.1
 * @lab 4.2: Vacation Mileage
 * @date 04-12-2018
 * @extra ding at the end
*/

import java.awt.Toolkit;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Staycation {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner kbd = new Scanner(System.in);
        // DecimalFormat for a nice, round mpg
        DecimalFormat df = new DecimalFormat("##.00");
        // Amount of weeks travelled and miles and gallons for each week
        int weeks = 1;
        double currentMiles;
        double currentGallons;
        // Asks user for miles & gallons of gas, makes that the value of a variable
        System.out.println("Enter the amount of miles you traveled this week.");
        double miles = kbd.nextDouble();
        System.out.println("Enter the amount of gasoline you bought this week.");
        double gallons = kbd.nextDouble();
        // Prints current stats for current week's and vacation's MPG
        System.out.println("Week " + weeks + ": " + miles + " miles, " + gallons + " gallons, " + (miles / gallons) + " mpg");
        System.out.println("Vacation: " + miles + " miles, " + gallons + " gallons, " + (miles / gallons) + " mpg");
        // while loop that keeps getting week inputs until ended
        while (true) {
            System.out.println("Enter the amount of miles you traveled this week (Enter -99 when vacation is over).");
            // Adds amount of miles travelled to current total
            currentMiles = kbd.nextDouble();
            // Checks if the user entered -99, stops asking questions
            if (currentMiles == -99)
                break;
            // If user did travel this week, increases the amount of weeks for the vacation
            ++weeks;
            miles = miles + currentMiles;
            System.out.println("Enter the amount of gasoline you bought this week.");
            // Adds current week's gallons to the total gallons
            currentGallons = kbd.nextDouble();
            gallons = gallons + currentGallons;
            // Prints both current stats and total stats
            System.out.println("Week " + weeks + ": " + currentMiles + " miles, " + currentGallons + " gallons, " + df.format(currentMiles / currentGallons) + " mpg");
            System.out.println("Vacation: " + miles + " miles, " + gallons + " gallons, " + df.format(miles / gallons) + " mpg");
        }
        System.out.println("Vacation over!");
        Toolkit.getDefaultToolkit().beep();
    }
}
