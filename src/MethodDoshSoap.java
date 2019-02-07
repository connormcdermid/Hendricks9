/**
 * @author Frank Gomes
 * @version 0.1
 * @lab 5.3: Methods Quiz
 * @date 15-01-19
 * @extra N/A
 **/

import java.util.Scanner;

public class MethodDoshSoap {
    public static void main (String[] args) {
        // Scanner to get input from users
        Scanner kbd = new Scanner(System.in);
        // Asks user for length
        System.out.println("Please enter the length of a rectangle.");
        double length = kbd.nextDouble();
        // Asks user for height
        System.out.println("Please enter the height of a rectangle.");
        double height = kbd.nextDouble();
        // Resource leaks are bad
        kbd.close();
        // 75 asterisks
        asterisks();
        // Calculates and displays perimeter
        perimeter(length, height);
        // Asterisks, 75 of them
        asterisks();
        // Calculates and displays area
        area(length, height);
        // Aste75risks
        asterisks();
        // Goodbye
        System.exit(1);
    }

    public static void asterisks () {
        // Loops 75 times to print out an asterisk
        for (int i = 75; i > 0; i--)
            System.out.print("*");
        //
        System.out.println();
    }

    public static void perimeter (double l, double h) {
        System.out.println("The perimeter of the rectangle is " + (l + l + h + h));
    }

    public static void area (double l, double h) {
        System.out.println("The area of the rectangle is " + (l * h));
    }
}