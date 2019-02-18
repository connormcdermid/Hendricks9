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
            default:
                System.out.println("That was not a recognized input.");
                break;
        }
        main(null);
    }

    static void one() {

    }
}
