/*
  author: Frank Gomes
  lab: 7.2 Reading Sequential Files
  date: 12-03-19
  extra:
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

class one {
    public static void main(String[] args) {
        // Creates File for Course.txt
        File course = new File("SevenOne/output/Course.txt");

        // Try/catch statement for declaring Scanner
        Scanner courseFile = null;
        try {
            courseFile = new Scanner(course);
        } catch (FileNotFoundException e) {
            e.getMessage();
            e.printStackTrace();
            System.exit(1);
        }

        // Stores data in its appropriate variable
        String name = courseFile.nextLine();
        String subject = courseFile.nextLine();
        String grades = courseFile.nextLine();
        String teacher = courseFile.nextLine();

        // Prints it out
        System.out.println("Grade Report:" + "\n" + "Name: " + name + "\n" + "Subject: " + subject + "\n" + "Grade: "+ grades.charAt(0) + "\n" + "Teacher: " + teacher);

        // Closes Scanner
        courseFile.close();
        System.exit(0);
    }
}

class two {
    public static void main(String[] args) {
        // Accesses the Payroll.txt file
        File payrollFile = new File("SevenOne/output/Payroll.txt");
        Scanner payroll = null;
        // Try/catch for Payroll.txt's Scanner
        try {
            payroll = new Scanner(payrollFile);
        } catch (FileNotFoundException e) {
            e.getMessage();
            e.printStackTrace();
            System.exit(2);
        }

        // Loop that prints all the lines of Payroll.txt
        while (true) {
            // Gets the next line of the file as a String
            String line = payroll.nextLine();

            // Checks if the line is empty and goes to the next iteration, to prevent errors when checking charAt(0)
            if (line.isEmpty())
                continue;
            // The gross pay was already generated and written to Payroll.txt in 7.1
            // Stops the loop once the divider at the end of the file is encountered
            if (line.charAt(0) == '-') {
                break;
            }
            System.out.println(line);
        }
        // Closes Scanner
        payroll.close();

        System.exit(0);
    }
}

class three {
    public static void main(String[] args) {
        // Accesses the numbers.txt file
        File numbersFile = new File("SevenOne/output/numbers.txt");
        Scanner numbers = null;

        // Try/catch to make numbers.txt's Scanner
        try {
            numbers = new Scanner(numbersFile);
        } catch (FileNotFoundException e) {
            e.getMessage();
            e.getStackTrace();

        }

        // Variables for determining evens, odds, sum, and average
        int sum = 0, average = 0, totalNumbers = 0;
        int evens = 0, odds = 0;

        while (true) {
            int nextNum = parseInt(numbers.nextLine());
            sum += nextNum;
            if (nextNum % 2 == 0)
                evens++;
            if (nextNum % 2 == 1)
                odds++;
            totalNumbers++;
        }
    }
}
