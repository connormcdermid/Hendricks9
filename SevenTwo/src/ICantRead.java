/*
  author: Frank Gomes
  lab: 7.2 Reading Sequential Files
  date: 12-03-19
  extra:
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
    }
}

class two {
    public static void main(String[] args) {
        File payrollFile = new File("SevenOne/output/Payroll.txt");
        try {
            Scanner payroll = new Scanner(payrollFile);
        } catch (FileNotFoundException e) {
            e.getMessage();
            e.printStackTrace();
            System.exit(2);
        }
        while (true) {

        }
    }
}
