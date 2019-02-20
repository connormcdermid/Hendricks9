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
        System.out.println(" 1. Rounding Up\n 2. Age difference\n 3. Square Root Chart\n 4. Powers Chart\n 5. ");
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
                    } /*Handles the exception from opening the URL on the Desktop*/catch (IOException e3) {
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
    static void one() {
        System.out.println("Enter a positive or negative decimal number.");
        double input = kbd.nextDouble();
        System.out.println(Math.round(input));
    }

    // Problem 2
    static void two() {
        System.out.println("Enter an age.");
        int age1 = kbd.nextInt();
        System.out.println("Enter another age.");
        int age2 = kbd.nextInt();
        System.out.println("The difference between these ages is " + abs(age1-age2));
    }

    // Problem 3
    static void three() {
        System.out.println("Num.  Sq. Rt.");
        // Keeps it going until 20 is hit
        for (int i = 1; i <= 20; i++)
            System.out.println(i + "     " + sqrt(i));
        System.out.println("Done!");
    }

    // Problem 4
    static void four() {

    }
}
