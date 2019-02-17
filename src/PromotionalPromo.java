import java.util.Scanner;

/**
 * @author Frank Gomes
 * @version 0.1
 * @lab MidYear Project
 * @date 17-02-19
 * @extra Cart with multiple items
 **/

public class PromotionalPromo {

    // Global variables are bad but I'm lazy
    public static Scanner kbd = new Scanner(System.in);

    public static void main(String[] args) {
        // Here's those "nested loops" as desired for the logo
        for (int a = 0; a < 2; a++) {
            System.out.print("     .  .      .  .");
            System.out.print("\n");
            for (int c = 0; c < 2; c++)
                System.out.print("    / \\/ \\");
            System.out.print("\n");
            for (int d = 0; d < 2; d++)
                System.out.print("    \\    /");
            System.out.print("\n");
            System.out.print("     \\  /      \\  /");
            System.out.print("\n");
            System.out.print("      \\/        \\/");
            System.out.print("\n");
        }
        // Prints company name
        System.out.println(" ___   ___   ___   __    ___   ____  __   __  \n" +
                "| |_) | |_) / / \\ / /`_ | |_) | |_  ( (` ( (` \n" +
                "|_|   |_| \\ \\_\\_/ \\_\\_/ |_| \\ |_|__ _)_) _)_)\n" +
                "Denville, NJ\n" +
                "2019 collection");
        divider(10);
        // Calls option menu
        menu();
    }

    private static void divider(int length) {
        for (int i = 0; i < length; i++)
            System.out.print("-");
        System.out.print("\n");
    }

    private static void menu() {
        System.out.println("What would you like to do?\n 1. See our employees\n 2. See the catalogue\n 3. ");
        String input = kbd.next();

    }
}
