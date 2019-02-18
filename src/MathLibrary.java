/**
 * @author Frank Gomes
 * @version 0.1
 * @lab 6.1 Worksheet Math Methods
 * @date 18-02-19
 * @extra exits vim
 **/

import java.util.Scanner;

public class MathLibrary {

    private static Scanner kbd = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Which problem would you like to see?");
        System.out.println(" 1. Rounding Up\n");
        String input = kbd.next();
        switch (input) {
            case "1":
                one();
                break;
            case ":q":
                System.out.println("Nice try.");
                break;
            case "exit":
                System.out.println("Goodbye.");
                System.exit(0);
            default:
                System.out.println("That was not a recognized input.");
                break;
        }
        main(null);
    }

    static void one() {
        System.out.println("Enter a positive or negative decimal number.");
        double input = kbd.nextDouble();
        System.out.println(Math.round(input));
    }
}
