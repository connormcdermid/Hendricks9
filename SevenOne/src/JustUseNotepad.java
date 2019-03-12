/*
  author: Frank Gomes
  lab: 7.1 Create Files
  date: 07-03-19
  extra: Asks user if it is okay to overwrite files
 */

import java.io.*;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Character.toLowerCase;

class one {
    public static void main(String[] args) {
        File courseOld = new File("SevenOne/output/Course.txt");
        // Checks if the file Course.txt already exists.
        if (courseOld.exists()) {
            System.out.println("The file 'Course.txt' already exists.");
            if(!overwritePrompt()) {
                System.out.println("The program has encountered an impossible error.\nThe program will now quit.");
                System.exit(2);
            }
        }
        // Deletes the old Course.txt and replaces it with a new one.
        courseOld.delete();
        File courseFile = new File("SevenOne/output/Course.txt");
        // Try-with-resources block to print all the information to courseFile
        try (PrintWriter pw = new PrintWriter(courseFile)) {
            // Prints the desired info to Course.txt
            String name = "Frank Gomes";
            String favouriteCourse = "Lunch";
            String grades = "F, F, and F+";
            String teacher = "Mr. Brophy";
            pw.println(name);
            pw.println(favouriteCourse);
            pw.println(grades);
            pw.println(teacher);
            pw.println("------------------------");
        } catch (FileNotFoundException e) {
            System.out.println("The PrintWriter could not be started. Error: " + e);
        }
    }

    private static boolean overwritePrompt() {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Is it okay to overwrite it? (Y/N)");
        String input = kbd.nextLine();
        switch (toLowerCase(input.charAt(0))) {
            case 'y':
                return true;
            case 'n':
                System.out.println("The program will now exit.");
                System.exit(0);
            default:
                System.out.println("That was not a recognized option.");
                overwritePrompt();
        }

        // A default return statement to make the compiler happy
        return false;
    }
}

class two {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner kbd = new Scanner(System.in);

        // Creates PrintWriter for payroll as pw
        FileWriter fw = null;
        try {
            fw = new FileWriter("SevenOne/output/Payroll.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fw);

        // Amount of employees
        System.out.println("How many employees will you enter?");
        int employees = kbd.nextInt();

        pw.println();
        // Repeats employee info input for each employee
        for (int i = 0; i < employees; i++) {
            // Employee's name
            System.out.println("Enter the employee's first name.");
            String firstName = kbd.next();
            System.out.println("Enter the employee's last name.");
            String lastName = kbd.next();
            pw.println("Employee " + (i+1) + ": " + firstName + " " + lastName);

            // Employee's salary and hours
            System.out.println("How many hours has this employee worked?");
            double hours = kbd.nextInt();
            pw.println("Hours: " + hours);
            System.out.println("What is this worker's hourly wage?");
            double wage = kbd.nextDouble();
            pw.println("Hourly Wage: " + wage);

            // Calculates and prints total week's wages.
            pw.println("Week's Pay: " + (wage * hours));
        }

        // Neat little divider
        pw.println("--------------------");
        pw.close();
    }
}

class three {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        Random rand = new Random();

        // Creates File and PrintWriter for Numbers.txt
        File numbers = new File("SevenOne/output/numbers.txt");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(numbers);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("How many numbers would you like to be generated?");
        int amount = kbd.nextInt();

        for (int i = 0; i < amount; i++)
            pw.println(rand.nextInt(100 + 1));

        pw.close();
    }
}