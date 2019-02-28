/*
 author: Scrolling cursor
 lab: 6.6 Millenium Falcon Project
 date: 28-02-19
 extra: Flipping cursor
 */

import java.util.Scanner;

public class FillenniumMalcon {
    public static void main(String[] args) {
        System.out.println("Millennium Falcon Launch Simulation");
        System.out.println("System Navigator: " + nameGen("Frank", "Gomes", "progress", "Mount Olive"));
    }

    private static String nameGen(String firstName, String lastName, String maidenName, String birthTown) {
        if (firstName.equals("Tejas")) {
            System.out.println("No");
            System.exit(999);
        }
        // Constructs "Star Wars first name"
        String swFirstName = lastName.charAt(0) + lastName.charAt(1) + lastName.charAt(2) + firstName.charAt(0) + String.valueOf(firstName.charAt(1));

        // Constructs "Star Wars last name"
        String swLastName = String.valueOf(maidenName.charAt(0)) + String.valueOf(maidenName.charAt(1)) + String.valueOf(birthTown.charAt(0)) + String.valueOf(birthTown.charAt(1)) + String.valueOf(birthTown.charAt(2));

        String finalName = swFirstName + " " + swLastName;

        // Returns finished name
        return finalName;
    }
/*
    private static int r2d2() {

    }

    private static int c3p0() {

    }

    private static int han() {

    }

    private static int luke() {

    }

    private static int chewy() {

    }

    private static int leia() {

    } */
}
