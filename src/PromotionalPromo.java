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
        divider(14);
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

    // Interactive menu for accessing employees, catalogue, and cart
    private static void menu() {
        System.out.println("What would you like to do?\n 1. See our employees\n 2. See the catalogue\n 3. Go to your cart\n 4. Exit");
        // Gets user input
        String input = kbd.next();
        // Selects the appropriate option
        switch (input) {
            case "1":
                divider(10);
                employees();
                break;
            case "2":
                divider(10);

                break;
            case "3":
                divider(10);

                break;
            case "4":
                System.out.println("Goodbye, and thank you for shopping with Progress Fashions.");
                System.exit(0);
            default:
                System.out.println("That was not a recognized input. Please try again.");
                menu();
                break;
        }
    }

    // Displays our esteemed employees
    private static void employees() {
        System.out.println("Employees:");
        System.out.println(" CEO & Founder: Poojit \"Puget\" Tummalapalli");
        System.out.println(" Lead Designer: Marc Campos");
        System.out.println(" Head of Production: Agranya Ketha");
        System.out.println(" Royalties and like nothing else: Harish \"Chris Hart\" Sundar");
        divider(10);
    }
}
