/**
 * @author Frank Gomes
 * @version 0.1
 * @lab 5.4: Geometric Shapes
 * @date 20-01-19
 * @extra Allows user to change size of (some) objects
 **/

import java.util.Scanner;

public class ItsNotAGunHarish {

    private static Scanner kbd = new Scanner(System.in);

    public static void main (String[] args) {
        // A divider to keep output neat.
        divider();
        // Prompts user for shape to print, stores answer in input.
        System.out.println("Which shape would you like to see?");
        System.out.println("1. Isosceles Right Triangle (adjustable)\n2. Rectangle (adjustable)\n3. Isosceles Triangle\n4. Open Rectangle (adjustable)\n5. Open Isosceles Triangle\n6. Rectangle Over Square Over Rectangle");
        String input = kbd.next();
        // Acts upon user input.
        switch (input){
            case "1":
                isoscelesRightTriangle();
                break;
            case "2":
                rectangle();
                break;
            case "3":
                isoscelesTriangle();
                break;
            case "4":
                openRectangle();
                break;
            case "5":
                openIsoscelesTriangle();
                break;
            case "6":
                rectangleOverSquare();
                break;
            // Somewhere to get off the ride.
            case "exit":
                kbd.close();
                System.exit(1);
            // Catches any inputs that make no sense.
            default:
                System.out.println("That was not a recognized input.");
                break;
        }
        main(null);
    }

    // Prints a pretty little divider.
    private static void divider() {
        System.out.println("**********************");
    }

    // Prints out the specified character the specified amount of times, then a newline.
    private static void printer (char c, int times) {
        for (int i = 0; i < times; i++)
            System.out.print(c);
        System.out.print("\n");
    }

    // Prints out the specified amount of whitespace.
    private static void whitespace (int times) {
        for (int i = 0; i < times; i++)
            System.out.print(" ");
    }

    // Isosceles right triangle.
    private static void isoscelesRightTriangle() {
        divider();
        // Gets desired girth of shape.
        System.out.println("Enter the size of the triangle.");
        int size = kbd.nextInt();
        // Keeps making new lines until specified size is reached.
        for (int i = 0; i < size; i++)
            // Prints one more character each time to achieve the slope on the side.
            printer('$', (i+1));
    }

    // Closed rectangle.
    private static void rectangle() {
        divider();
        System.out.println("Enter the height of the rectangle.");
        int height = kbd.nextInt();
        System.out.println("Enter the width of the rectangle.");
        int width = kbd.nextInt();
        for (int i = 0; i < height; i++)
            printer('%', width);
    }

    // Closed isosceles triangle.
    private static void isoscelesTriangle() {
        divider();
        whitespace(4);
        printer('#', 1);
        whitespace(3);
        printer('#', 3);
        whitespace(2);
        printer('#', 5);
        whitespace(1);
        printer('#', 7);
        printer('#', 9);
    }

    // Open rectangle.
    private static void openRectangle() {
        // openRectangle sounds like a parody Open Group project. I just found that funny.
        divider();
        System.out.println("Enter the height of the rectangle.");
        int height = kbd.nextInt();
        System.out.println("Enter the width of the rectangle.");
        int width = kbd.nextInt();
        printer('&', width);
        for (int i = 0; i < (height - 2); i++) {
            System.out.print("&");
            whitespace((width - 2));
            System.out.print("&");
            System.out.print("\n");
        }
        printer('&', width);
    }

    private static void openIsoscelesTriangle() {
        divider();
        whitespace(4);
        printer('@', 1);
        whitespace(3);
        System.out.print("@");
        whitespace(1);
        System.out.print("@\n");
        whitespace(2);
        System.out.print("@");
        whitespace(3);
        System.out.print("@\n");
        whitespace(1);
        System.out.print("@");
        whitespace(5);
        System.out.print("@\n");
        printer('@', 9);
    }

    private static void rectangleOverSquare() {
        divider();
        // Top rectangle
        printer('@', 6);
        printer('@', 6);
        // Square & whitespace before square
        whitespace(1);
        printer('@', 4);
        whitespace(1);
        printer('@', 4);
        whitespace(1);
        printer('@', 4);
        whitespace(1);
        printer('@', 4);
        // Bottom rectangle
        printer('@', 6);
        printer('@', 6);
    }
}
