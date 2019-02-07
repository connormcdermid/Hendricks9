import java.util.Scanner;

public class TestingTheMovie {
    public static void main(String[] args) {
        // Gets user's name as String name
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter your first name.");
        String name = kbd.next();
        int length = name.length();
        int count = 0;
        while (count <= length) {
            System.out.println(count + 1 + ". " + name.charAt(count));
            ++count;
            if (count > length - 1)
                System.exit(0);
        }
    }
}
