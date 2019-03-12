/*
 author: Frank Gomes
 lab: 6.6 StarWarsName
 date: 28-02-19
 extra: detects a Tejas
 */

import java.util.Scanner;

public class TejasGoAway {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        // Gets first name
        System.out.println("Please enter your first name.");
        String firstName = kbd.nextLine();
        if (firstName.equals("Tejas")) {
            System.out.println("No");
            System.exit(999);
        }
        // Gets last name
        System.out.println("Please enter your last name.");
        String lastName = kbd.nextLine();
        // Gets mothers' maiden name
        System.out.println("Please enter your mother's maiden name.\nActually, don't do that. That's a really bad idea.\nPut in something else, I guess.");
        String maidenName = kbd.nextLine();
        // Gets birth town
        System.out.println("Enter the town you were born in.\nWait, that's probably also a security question. Put in something else?");
        String birthTown = kbd.nextLine();

        // Constructs "Star Wars first name"
        String swFirstName = String.valueOf(lastName.charAt(0)) + String.valueOf(lastName.charAt(1)) + String.valueOf(lastName.charAt(2)) + String.valueOf(firstName.charAt(0)) + String.valueOf(firstName.charAt(1));

        // Constructs "Star Wars last name"
        String swLastName = String.valueOf(maidenName.charAt(0)) + String.valueOf(maidenName.charAt(1)) + String.valueOf(birthTown.charAt(0)) + String.valueOf(birthTown.charAt(1)) + String.valueOf(birthTown.charAt(2));

        // Prints out finalized name
        System.out.println("Your Star Wars name is: " + swFirstName + " " + swLastName);
    }
}
