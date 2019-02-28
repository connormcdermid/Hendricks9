import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TestFiveTest {
    public static void main (String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("How many dice do you want to roll?");
        int times = kbd.nextInt();
        for (int i = 0; i < times; i++)
            System.out.println(ThreadLocalRandom.current().nextInt(1, 6 + 1));
    }
}