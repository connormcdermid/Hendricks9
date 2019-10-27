/*
Name: Frank Gomes
Lab: P4.7
Date: 27-10-19
Extra: Feet to meters
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cool scanner to get user input
        Scanner kbd = new Scanner(System.in);
        // Prompt user for an amount of meters
        System.out.println("Enter a length in meters.");
        // Get user's input in a variable
        double meters = kbd.nextDouble();
        // Print converted lengths
        System.out.printf("Inches: %f  Feet: %f  Miles: %f\n", Conversions.metersToInches(meters), Conversions.metersToFeet(meters), Conversions.metersToMiles(meters));
        // Prompt user for an amount of feet
        System.out.println("Enter a length in feet.");
        double feet = kbd.nextDouble();
        // Print converted length
        System.out.printf("Meters: %f", Conversions.feetToMeters(feet));
        // Close scanner
        kbd.close();
    }
}
