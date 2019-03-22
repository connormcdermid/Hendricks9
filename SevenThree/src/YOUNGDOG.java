/*
  author: Frank Gomes
  lab: 7.3 Use and Append Sequential Files
  date: 20-03-19
  extra: Prints the time taken for OLDDOG to execute
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static java.lang.Character.isWhitespace;
import static java.lang.System.currentTimeMillis;

// Puts initial information into Dog.txt
class YOUNGDOG {
    public static File dogFile = new File("SevenThree/output/Dog.txt");
    public static void main(String[] args) {
        // File for Dog.txt called dogFile
        PrintWriter pw = null;
        // Try/catch statement to make PrintWriter for Dog.txt
        try {
            pw = new PrintWriter(dogFile);
        } catch (FileNotFoundException e) {
            e.getStackTrace();
            e.getMessage();
        }
        // Prints dog info to Dog.txt
        pw.println("Wally 10\n" +
                "Jessie 9\n" +
                "Skeeter 15\n" +
                "Lucky 7\n" +
                "Corky 5\n" +
                "Sadie 6\n" +
                "Alexis 1");
        // Closes scanner to write changes
        pw.close();
    }
}

// Reads Dog.txt
class OLDDOG
{
    public static void main(String[] args) {
        // Time that execution began
        long startTime = currentTimeMillis();
        Scanner dog = null;
        try {
            dog = new Scanner(YOUNGDOG.dogFile);
        } catch (FileNotFoundException e) {
            e.getStackTrace();
            e.getMessage();
        }
        while (true) {
            // Makes the next line a String called nextLine
            String nextLine = null;
            try {
                nextLine = dog.nextLine();
            } catch (NoSuchElementException e) {
                // In the event the scanner is at the end of the file, when trying to do dog.nextLine(), it will throw
                // a NoSuchElementException. The try/catch breaks the loop at the end of the file.
                break;
            }
            // Keeps printing out each character of nextLine until it reaches the space before the age
            for (int i = 0; i < nextLine.length(); i++) {
                if (isWhitespace(nextLine.charAt(i)))
                    break;
                else
                    System.out.print(nextLine.charAt(i));
            }
            System.out.print(": ");
            // Checks if the age in nextLine is equal or greater than 7
            if ((nextLine.lastIndexOf(" ") + 1) >= 7)
                System.out.print("OLD DOG");
            else
                System.out.print("YOUNG DOG");
            // Prints \n to prevent it all from going on one line
            System.out.print("\n");
        }
        System.out.println("Done in " + (currentTimeMillis() - startTime)/1000 + " seconds.");
    }
}

// Appends new information
class AppendDog {
    public static void main(String[] args) {
        // Declares PrintWriter pw to be assigned in the try/catch loop
        PrintWriter pw = null;
        // Try/catch statement to make PrintWriter for Dog.txt
        try {
            pw = new PrintWriter(new FileOutputStream(new File("SevenThree/output/Dog.txt"), true));
        } catch (FileNotFoundException e) {
            e.getStackTrace();
            e.getMessage();
        }
        // Appends new dog info to Dog.txt
        pw.print("Beatrice 3\n" +
                "Tasha 4\n" +
                "Patty 1\n");
        // Closes scanner to write changes
        pw.close();
    }
}

// For part four, just run OLDDOG again