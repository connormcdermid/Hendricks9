/**
 * @author Frank Gomes
 * @version 0.1
 * @lab 6.1 Worksheet Math Methods
 * @date 18-02-19
 * @extra exits vim
 **/

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

import static java.lang.Math.*;

public class MathLibrary {

    private static Scanner kbd = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Which problem would you like to see?");
        System.out.println(" 1. Rounding Up\n 2. Age difference\n 3. Square Root Chart\n 4. Powers Chart\n 5. Big & Small Integer\n 6. Costumes and Things\n 7. Bacteria Multiplication\n 8. Right Triangle");
        String input = kbd.next();
        switch (input) {
            case "1":
                one();
                break;
            case "2":
                two();
                break;
            case "3":
                three();
                break;
            case "4":
                four();
                break;
            case "5":
                five();
                break;
            case "6":
                six();
                break;
            case "7":
                seven();
                break;
            // How do i quit vim please help my macbook isnt working !!!!!!!*
            case ":q":
                System.out.println("Nice try.");
                // Bit that opens the website with the joke
                {
                    try {
                        URL url = new URL("https://vim-adventures.com/");
                        URI uri = url.toURI();
                        java.awt.Desktop.getDesktop().browse(uri);
                    } /*Handles the exception from URL generation*/ catch (MalformedURLException e1) {
                        System.out.println("e");
                    } /*Handles the exception from URI convertion*/ catch (URISyntaxException e2) {
                        System.out.println("ee");
                    } /*Handles the exception from opening the URL on the Desktop*/ catch (IOException e3) {
                        System.out.println("eee");
                    }
                }
                break;
            // Exit condition
            case "exit":
                System.out.println("Goodbye.");
                System.exit(0);
            // Error trap
            default:
                System.out.println("That was not a recognized input.");
                break;
        }
        main(null);
    }

    // Problem 1
    private static void one() {
        System.out.println("Enter a positive or negative decimal number.");
        double input = kbd.nextDouble();
        System.out.println(Math.round(input));
    }

    // Problem 2
    private static void two() {
        System.out.println("Enter an age.");
        int age1 = kbd.nextInt();
        System.out.println("Enter another age.");
        int age2 = kbd.nextInt();
        System.out.println("The difference between these ages is " + abs(age1-age2));
    }

    // Problem 3
    private static void three() {
        System.out.println("Num.  Sq. Rt.");
        // Keeps it going until 20 is hit
        for (int i = 1; i <= 20; i++)
            System.out.println(i + "     " + sqrt(i));
        System.out.println("Done!");
    }

    // Problem 4
    private static void four() {
        for (int i = 1; i <= 5; i++)
            System.out.println(i + " " + (i^2) + " " + (i^3));
        System.out.println("Done!");
    }

    // Problem 5
    private static void five() {
        System.out.println("Please enter an integer.");
        int int1 = kbd.nextInt();
        System.out.println("Please enter another integer.");
        int int2 = kbd.nextInt();
        // Checks if int1 is greater than int2 and prints int1
        // Unless it's not, then it prints int2, but if both equal says "equal"
        if (int1 > int2)
            System.out.println(int1);
        else if (int2 > int1)
            System.out.println(int2);
        else if (int1 == int2)
            System.out.println("Both integers are equal.");
        else
            System.out.println("Congratulations. You broke this program.");
    }

    // Problem 6
    private static void six() {
        System.out.println("42\" = " + circleCalculator(42) + " sq. in. fabric, " + circumferenceCalculator(42) + " in. piping.");
        System.out.println("40\" = " + circleCalculator(40) + " sq. in. fabric, " + circumferenceCalculator(40) + " in. piping.");
        System.out.println("38\" = " + circleCalculator(38) + " sq. in. fabric, " + circumferenceCalculator(38) + " in. piping.");
        System.out.println("40\" = " + circleCalculator(36) + " sq. in. fabric, " + circumferenceCalculator(36) + " in. piping.");
    }

    // Calculates the area of the circle based on the provided height of the child, rounds up, and returns the result as a long
    private static long circleCalculator(int height) {
        return (long) ceil(3.14159265358979323*(height^2));
    }

    // Calculates the circumference of the circle based on the provided height of the child, rounds up, and returns the result as a long
    private static long circumferenceCalculator(int height) {
        return (long) ceil(2*3.14159265358979323*height);
    }

    // Problem 7
    private static void seven() {
        for (int i = 0; i <= 24; i++) {
            // Does the equation with i as the current hour
            long toPrint = (long) floor(40 * exp(0.25935*i));
            System.out.println("Hour " + i + ": " + toPrint + " bacteria");
        }
    }
}
