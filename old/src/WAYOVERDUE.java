/**
 * @author Frank Gomes
 * @version 0.1
 * @lab 5.8: Methods, Part 3 & 4
 * @date 27-01-19
 * @extra Repeated beeping when "eyeah" is entered at selection menu
 **/

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class WAYOVERDUE {
    public static void main (String[] args) {
        // A divider to keep output nice and tidy.
        System.out.println("********************");
        // A scanner for user input.
        Scanner kbd = new Scanner(System.in);
        // Prompts user for problem choice.
        System.out.println("Which problem would you like to see?");
        String input = kbd.next();
        switch (input) {
            case "eyeah":
                // "Repeated" was just a nice way to say "incessant".
                while (true)
                    // "'while' statement cannot complete without throwing an exception"
                    // Good.
                    java.awt.Toolkit.getDefaultToolkit().beep();
            // Allows user to stop program *gracefully*.
            case "exit":
                System.out.println("Goodbye!");
                kbd.close();
                System.exit(0);
            // Problem 1: Favorite number & favorite word
            case "1":
                // Gets favorite word from user.
                System.out.println("Enter your favorite word.");
                String favoriteWord = kbd.next();
                // Gets favorite number from user.
                System.out.println("Enter your favorite number.");
                int favoriteNumber = kbd.nextInt();
                // Calls method that does the output.
                Favorites.main(favoriteWord, favoriteNumber);
                break;
            // Problem 2: 2 Integers 2 Furious
            case "2":
                // Gets the first integer from the user.
                System.out.println("Enter an integer.");
                int int1 = kbd.nextInt();
                // Gets the second integer from the user.
                System.out.println("Enter another integer.");
                int int2 = kbd.nextInt();
                // Calls the method that adds the two integers.
                TwoManyIntegers.add(int1, int2);
                // Calls the method that multiplies the two integers.
                TwoManyIntegers.multiply(int1, int2);
                break;
            // Problem 3: Printing name vertically
            case "3":
                // Gets user's name.
                System.out.println("Enter your name.");
                String name = kbd.next();
                // Passes it to method that prints the name vertically.
                VerticalName.printName(name);
                break;
            // Problem 4: Book dues
            case "4":
                // Gets the amount of days past due the book is.
                System.out.println("How many days past due is this book?");
                int daysPast = kbd.nextInt();
                // Passes it to method that outputs book dues.
                DaysPastDue.bookDues(daysPast);
                break;
            // Problem 5: Positive integers up to a provided integer
            case "5":
                // Gets positive integer from user.
                System.out.println("Enter a positive integer.");
                int x = kbd.nextInt();
                // Checks whether or not the provided integer is positive or not.
                if (x <= 0) {
                    System.out.println("Silly boy, that is not a positive integer");
                    System.out.println("Try again.");
                    break;
                }
                // Passes provided integer to method that does the operation and outputs the result.
                IntegersUpTo.main(x);
                break;
            // Problem 6: Radii(sh) & Area of a Circle
            case "6":
                // Gets the radius from the user.
                System.out.println("Please enter a number from 1 to 10.");
                int radius = kbd.nextInt();
                if (radius > 10 || radius < 1) {
                    System.out.println("Silly boy, that's not within the range of 1 to 10.");
                    System.out.println("Try again.");
                    break;
                }
                System.out.println("Radius: " + radius + ", Area: " + RadiiSH.main(radius));
                break;
            default:
                System.out.println("Silly boy, that's not a recognized option.");
                System.out.println("Try again.");
                break;
        }
        // Goes back to main to let user choose another problem.
        main(null);
    }
}

class Favorites {
    static void main (String favoriteWord, int favoriteNumber) {
        // Prints out favoriteWord favoriteNumber times.
        for (int i = 0; i < favoriteNumber; i++)
            System.out.println(favoriteWord);
    }
}

class TwoManyIntegers {
    static void add (int one, int two) {
        // Adds the integers.
        System.out.println("The sum of these integers is: " + (one + two));
    }

    static void multiply (int one, int two) {
        // Multiplies the integers.
        System.out.println("The product of these integers is: " + (one * two));
    }
}

class VerticalName {
    static void printName (String name) {
        // Prints every character of the name, in consecutive order, by going down a character until end of name.
        for (int i = 0; i < name.length(); i++)
            System.out.println(name.charAt(i));
        System.out.println("Goodbye!");
    }
}

class DaysPastDue {
    static void bookDues (int days) {
        // Sees if the book is over 10 days overdue, and prints "WAY OVERDUE" is that is the case.
        if (days > 10)
            System.out.println("WAY OVERDUE");
        // Prints book dues.
        System.out.println("You owe $" + (days * 0.15) + " in book dues.");
    }
}

class IntegersUpTo {
    static void main (int x) {
        int xPlus = x;
        // Takes the original value, and adds to it every positive integer less than it, decreasing by one every time.
        for (int i = (x - 1); i > 0; i--)
            xPlus += i;
        System.out.println("That integer added with every positive integer before it is " + xPlus + ".");
    }
}

class RadiiSH {
    static double main (int radius) {
        // Calculates area from input radius
        double area = 3.1415926535897 * (radius * radius);
        // DecimalFormat pattern
        DecimalFormat df = new DecimalFormat("#####.0");
        // Rounds the area to the tenth place.
        area = parseDouble(df.format(area));
        return area;
    }
}