import java.util.Random;
import java.util.Scanner;

public class WhileIDoIt {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Please enter the name of your favorite pet.");
        String name = kbd.next();
        System.out.println("How many times would you like to see the name appear on screen?");
        Integer printCounter = kbd.nextInt();
        // Checks if the number entered was negative & restarts
        if (printCounter < 0) {
            System.out.println("The number entered was a negative number.");
            System.out.println("This program will now restart.");
            main(null);
        }
        // Asks for direction to print in
        System.out.println("Would you like the names printed horizontally or vertically?");
        String choice = kbd.next();
        // Switch statement to repeat printing of name until printed enough
        int i = 0;
        switch (choice) {
            // Horizontal choices
            case "Horizontally":
                do {
                    System.out.print(name + " ");
                    i++;
                } while (i < printCounter);
                break;
            case "horizontally":
                do {
                    System.out.print(name + " ");
                    i++;
                } while (i < printCounter);
                break;
            case "horizontal":
                do {
                    System.out.print(name + " ");
                    i++;
                } while (i < printCounter);
                break;
            // Vertical choices
            case "Vertically":
                do {
                    System.out.println(name);
                    i++;
                } while (i < printCounter);
                break;
            case "vertically":
                do {
                    System.out.println(name);
                    i++;
                } while (i < printCounter);
                break;
            case "vertical":
                do {
                    System.out.println(name);
                    i++;
                } while (i < printCounter);
                break;
            // In case of unrecognized input
            default:
                System.out.println("That was not a recognized option. The program will now restart.");
                main(null);
        }
        System.exit(0);
    }
}
