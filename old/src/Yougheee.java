/**
 * @author Frank Gomes
 * @version 0.1
 * @lab 4.6: Exiting Early
 * @date 12-01-19
 * @extra Menu with problem options
 **/

import java.util.Scanner;

public class Yougheee {

    public static Scanner kbd = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.println("Enter which problem you would like to see.\n 1. User's name with no A's\n 2. Yougheee!!\n 3. 100 to 1\nEnter 'exit' to quit.");
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
            case "exit":
                kbd.close();
                System.exit(1);
            default:
                System.out.println("That was not a recognized input.");
                break;
        }
    }

    private static void one () {
        // Problem 1
        System.out.println("Please enter your first name.");
        String name = kbd.next();
        System.out.println("Name with no A's:");
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a')
                continue;
            System.out.println(name.charAt(i));
        }
    }

    private static void two() {
        // Problem 2
        System.out.println("Please enter a word.");
        String word = kbd.next();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                System.out.println("Yougheee!!");
                break;
            }
            System.out.println(word.charAt(i));
        }
    }

    private static void three() {
        // Problem 3
        for (int i = 100; i > 0; i--)
            System.out.println(i);
    }
}
