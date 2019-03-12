import java.util.Scanner;

public class TerrifyingMice {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter your mid-year average for Java Programming.");
        double input = kbd.nextDouble();
        if (input >= 65) {
            passing();
        } else {
            failing();
        }
        kbd.close();
        System.exit(0);
    }
    private static void passing () {
        System.out.println("You are passing.");
    }

    private static void failing () {
        System.out.println("Ask Tejas for help!");
    }
}
