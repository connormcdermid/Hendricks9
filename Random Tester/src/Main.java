import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(@NotNull String[] args) {
        // Ask user to sort by coder or tester
        System.out.println("Would you like to sort by coder or tester? (c/t) ");
        Scanner kbd = new Scanner(System.in);
        char choice = kbd.next().charAt(0);
        // Scanner to read names from file
        Scanner scan = null;
        // Make the scanner read the file, and if it doesn't exist quit with code 404
        try {
            scan = new Scanner(new File("Random Tester/in/" + args[0]));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(404);
        }
        // List to put all names into
        List<String> people = new java.util.ArrayList<>(Collections.emptyList());
        // Puts all the names into the list
        while (scan.hasNextLine()) {
            people.add(scan.nextLine());
        }
        // Shuffle up the list
        Collections.shuffle(people);
        // Checks if the list has an odd amount of names, if so splits the last three off for a round robin
        if (people.size() % 2 == 1) {
            System.out.println("Group of three:");
            System.out.printf("%s & %s & %s\n", people.get(people.size()-1), people.get(people.size()-2), people.get(people.size()-3));
            // Remove the last three to stop them from being paired again
            people.remove(people.size() - 3);
            people.remove(people.size() - 2);
            people.remove(people.size() - 1);
        }
        // Pairs the last half of the list with the first half of the list
        List<String> half1 = people.subList(0,people.size()/2-1);
        List<String> half2 = people.subList(people.size()/2, people.size()-1);
        // Sort by coder or tester, depending on user's choice
        switch (choice) {
            case 't':
                Collections.sort(half1);
                break;
            case 'c':
                Collections.sort(half2);
                break;
        }
        // Print out pairs
        System.out.println("\nTester | Coder");
        for (int i = 0; i < half1.size(); i++)
            System.out.printf("%s & %s\n", half1.get(i), half2.get(i));
    }
}
