import java.util.Scanner;

public class TejasGoAway {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        // Gets first name
        System.out.println("Please enter your first name.");
        String firstName = kbd.nextLine();
        // Gets last name
        System.out.println("Please enter your last name.");
        String lastName = kbd.nextLine();
        // Gets mothers' maiden name
        System.out.println("Please enter your mother's maiden name.\nActually, don't do that. That's a really bad idea.\n Put in something else, I guess.");
        String maidenName = kbd.nextLine();
        // Gets birth town
        System.out.println("Enter the town you were born in.\nWait, that's probably also a security question. Put in something else?");
        String birthTown = kbd.nextLine();

        // Constructs "Star Wars first name"
        String swFirstName = String.valueOf(firstName.charAt(0)) + String.valueOf(firstName.charAt(1)) + String.valueOf(firstName.charAt(2));
    }
}
