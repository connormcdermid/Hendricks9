import java.lang.Character;
import java.util.Scanner;

public class TestFiveTest {
    public static void main(String[ ] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter your first initial.");
        char input = kbd.next().charAt(0);
        if (Character.isLetter(input)) {
            System.out.println(input + " is a P.I.");
            System.exit(0);
        } else {
            System.out.println("That's not an initial!");
            System.exit(1);
        }
    }
}