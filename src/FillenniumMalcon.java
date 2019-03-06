/*
 author: Scrolling cursor
 lab: 6.6 Millenium Falcon Project
 date: 28-02-19
 extra: progress bar
 */

import java.util.Random;
import me.tongfei.progressbar.*;

public class FillenniumMalcon {

    private static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Millennium Falcon Launch Simulation");
        System.out.println("System Navigator: " + nameGen("Frank", "Gomes", "progress", "Mount Olive"));
        try (ProgressBar pb = new ProgressBar("Disengaging fuel pumps:", 100)) {
            pb.stepBy(15);
            Sleep(500);
            pb.stepBy(15);
            Sleep(500);
            pb.stepBy(15);
            Sleep(500);
            pb.stepBy(15);
            Sleep(500);
            pb.stepTo(100);
        }
        try (ProgressBar pb2 = new ProgressBar("Pressurizing cabins:   ", 100)) {
            pb2.stepBy(10);
            Sleep(108);
            pb2.stepBy(20);
            Sleep(228);
            pb2.stepBy(20);
            Sleep(300);
            pb2.stepBy(10);
            Sleep(500);
            pb2.stepBy(15);
            Sleep(400);
            pb2.stepBy(5);
            Sleep(100);
            pb2.stepTo(100);
        }
    }

    // Generates the wait in between the progress bar advances
    private static void Sleep(int wait) {
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            // Don't do anything about it
        }
    }

    @SuppressWarnings("SameParameterValue")
    private static String nameGen(String firstName, String lastName, String maidenName, String birthTown) {
        if (firstName.equals("Tejas")) {
            System.out.println("No");
            System.exit(999);
        }
        // Constructs "Star Wars first name"
        // I don't know why the String.valueOf() is needed, but without it it prints numbers instead of letters
        String swFirstName = String.valueOf(lastName.charAt(0)) + String.valueOf(lastName.charAt(1)) + String.valueOf(lastName.charAt(2)) + String.valueOf(firstName.charAt(0)) + String.valueOf(firstName.charAt(1));

        // Constructs "Star Wars last name"
        // Same reasoning for String.valueOf() as used above.
        String swLastName = String.valueOf(maidenName.charAt(0)) + String.valueOf(maidenName.charAt(1)) + String.valueOf(birthTown.charAt(0)) + String.valueOf(birthTown.charAt(1)) + String.valueOf(birthTown.charAt(2));

        // Returns finished name
        return swFirstName + " " + swLastName;
    }


    private static boolean r2d2() {
        // If "system efficiency" (random number from rand.nextInt()) is greater than or equal to 40%, the launch is a go.
        return (rand.nextInt() >= 40);
    }

    private static boolean c3p0() {
        // If "system efficiency" (random number from rand.nextInt()) is greater than or equal to 50%, the launch is a go.
        return (rand.nextInt() >= 50);
    }

    private static boolean han() {
        // If "system efficiency" (random number from rand.nextInt()) is greater than or equal to 30%, the launch is a go.
        return (rand.nextInt() >= 30);
    }

    private static boolean luke() {
        // If "system efficiency" (random number from rand.nextInt()) is greater than or equal to 20%, the launch is a go.
        return (rand.nextInt() >= 20);
    }

    private static boolean chewy() {
        // If "system efficiency" (random number from rand.nextInt()) is greater than or equal to 35%, the launch is a go.
        return (rand.nextInt() >= 35);
    }

    private static boolean leia() {
        // If "system efficiency" (random number from rand.nextInt()) is greater than or equal to 45%, the launch is a go.
        return (rand.nextInt() >= 45);
    }
}
