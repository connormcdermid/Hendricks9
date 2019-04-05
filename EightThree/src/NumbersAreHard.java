import org.jetbrains.annotations.NotNull;
import java.util.Scanner;

/*
  author: Frank Gomes
  lab: 8.3 Worksheet Working with Numbers
  date: 03-04-19
  extra: method Average can be overloaded to set the output color
 */

public class NumbersAreHard {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner kbd = new Scanner(System.in);
        // Initializes array and gets values for it from user
        int[] num = new int[10];
        System.out.println("Enter 10 integers.");
        for (int i = 0; i < num.length; i++) {
            num[i] = kbd.nextInt();
        }
        kbd.close();
        // Prints put the first & last elements
        System.out.println("First element: " + num[0]);
        System.out.println("First element: " + num[num.length - 1]);
        // Calls Print_It and Average methods, as specified
        Print_It(num);
        Average(num, "green");
    }

    private static void Print_It(@NotNull int[] num) {
        System.out.print("\n[");
        for (int item: num)
            System.out.print(item + ", ");
        System.out.print("\b\b]\n");
    }

    private static void Average(@NotNull int[] num) {
        double sum = 0.0;
        for (int item: num) {
            sum += item;
        }
        double average = sum / num.length;
        System.out.println("Average: " + average);
    }

    private static void Average(@NotNull int[] num, String overload) {
        switch (overload) {
            case "red":
                System.out.println("\u001b[31m");
                break;
            case "blue":
                System.out.println("\u001b[34m");
                break;
            case "green":
                System.out.println("\u001b[32m");
                break;
            case "yellow":
                System.out.println("Yellow is an ugly color. Request ignored.");
                break;
            default:
                System.out.println("That was not a recognized color.");
                break;
        }
        Average(num);
    }
}
