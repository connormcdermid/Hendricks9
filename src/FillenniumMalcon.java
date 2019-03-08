/*
 author: Frank Gomes
 lab: 6.7 Millennium Falcon Project
 date: 28-02-19
 extra: Progress bars
 */

import java.util.Random;
import me.tongfei.progressbar.*;

public class FillenniumMalcon {

    // For generating random numbers in the characters' methods
    private static Random rand = new Random();

    public static void main(String[] args) {
        // Starts counter for amount of seconds taken to execute
        long startTime = System.currentTimeMillis();

        System.out.println("Millennium Falcon Launch Simulation");
        System.out.println("System Navigator: " + nameGen("Frank", "Gomes", "progress", "Mount Olive"));

        // Does first progress bar
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
        // Does second progress bar
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

        // Boolean for each character and whether or not they are ready to launch
        boolean r2d2Ready;
        boolean c3p0Ready;
        boolean hanReady;
        boolean lukeReady;
        boolean chewyReady;
        boolean leiaReady;
        // Amount of times launch has been attempted
        int i = 0;

        System.out.println("       R2D2   C3P0   Han    Luke   Chewy  Leia");

        while (true) {
            // Resets each character's ready variable at the end of the loop
            r2d2Ready = false;
            c3p0Ready = false;
            hanReady = false;
            lukeReady = false;
            chewyReady = false;
            leiaReady = false;

            // Increases the "Run" counter
            ++i;

            System.out.print("\nRun " + i + "  ");
            // Checks is R2D2 is ready to launch
            if (r2d2()) {
                r2d2Ready = true;
                System.out.print("Go     ");
            } else {
                System.out.print("No Go  ");
            }
            // Checks is C3P0 is ready to launch
            if (c3p0()) {
                c3p0Ready = true;
                System.out.print("Go     ");
            } else {
                System.out.print("No Go  ");
            }
            // Checks is Han Solo is ready to launch
            if (han()) {
                hanReady = true;
                System.out.print("Go     ");
            } else {
                System.out.print("No Go  ");
            }
            // Checks is Luke Skywalker is ready to launch
            if (luke()) {
                lukeReady = true;
                System.out.print("Go     ");
            } else {
                System.out.print("No Go  ");
            }
            // Checks is Chewbacca is ready to launch
            if (chewy()) {
                chewyReady = true;
                System.out.print("Go     ");
            } else {
                System.out.print("No Go  ");
            }
            // Checks is Leia is ready to launch
            if (leia()) {
                leiaReady = true;
                System.out.print("Go     ");
            } else {
                System.out.print("No Go  ");
            }

            // Checks if all the characters are ready
            if (r2d2Ready && c3p0Ready && hanReady && lukeReady && chewyReady && leiaReady) {
                System.out.println("\nGo for launch!");
                System.out.println(i + " runs, " + (System.currentTimeMillis() - startTime)/1000 + " seconds.");
                System.exit(0);
            }

            // If there were 20 unsuccessful launch attempts, launch override is initiated.
            if (i == 20)
                break;
        }

        // Launch Override
        System.out.println("\n20 launch attempts failed.");
        System.out.println("Starting force override.");
        try (ProgressBar pb3 = new ProgressBar("Calling Yoda: ", 100)) {
            pb3.stepBy(15);
            Sleep(13);
            pb3.stepBy(20);
            Sleep(278);
            pb3.stepBy(20);
            Sleep(457);
            pb3.stepTo(100);
        }
        System.out.println("\nHe's on vacation. Launch aborted.");
        System.exit(0);
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
        return (rand.nextInt(101) >= 40);
    }

    private static boolean c3p0() {
        // If "system efficiency" (random number from rand.nextInt()) is greater than or equal to 50%, the launch is a go.
        return (rand.nextInt(101) >= 50);
    }

    private static boolean han() {
        // If "system efficiency" (random number from rand.nextInt()) is greater than or equal to 30%, the launch is a go.
        return (rand.nextInt(101) >= 30);
    }

    private static boolean luke() {
        // If "system efficiency" (random number from rand.nextInt()) is greater than or equal to 20%, the launch is a go.
        return (rand.nextInt(101) >= 20);
    }

    private static boolean chewy() {
        // If "system efficiency" (random number from rand.nextInt()) is greater than or equal to 35%, the launch is a go.
        return (rand.nextInt(101) >= 35);
    }

    private static boolean leia() {
        // If "system efficiency" (random number from rand.nextInt()) is greater than or equal to 45%, the launch is a go.
        return (rand.nextInt(101) >= 45);
    }
}