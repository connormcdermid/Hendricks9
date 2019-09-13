/*
  author: Frank Gomes
  lab: Tracking Grades
  date: 12-09-19
  extra: toLetter(), which returns a letter grade
 */

import java.text.DecimalFormat;
import java.util.Scanner;

class Student {
    // Student information
    private final String name;
    private double test1;
    private double test2;
    private double average;

    // DecimalFormat to remove extra zeroes
    private DecimalFormat df = new DecimalFormat("0.##");

    // Constructor
    Student(String studentName) {name = studentName;}

    void inputGrades() {
        // Scanner for user input
        Scanner kbd = new Scanner(System.in);
        // Get test 1 grade
        System.out.println("Enter grade for test 1: ");
        // Test 1 grade
        test1 = kbd.nextDouble();
        // Get test 2 grade
        System.out.println("Enter grade for test 2: ");
        // Test 2 grade
        test2 = kbd.nextDouble();
        // Calculate average and round to two decimal places
        average = Math.round((test1 + test2)/2*100.0)/100.0;
    }

    // Input the grades using arguments instead of prompts
    void inputGrades(double grade1, double grade2) {
        test1 = grade1;
        test2 = grade2;
        average = Math.round((test1 + test2)/2*100.0)/100.0;
    }

    // Print student's name and average
    void printAverage() {System.out.printf("%s's average: %s", name, df.format(average));}

    // Return average as a double
    double getAverage() {return average;}

    // Return average rounded to int
    int toInt() {return (int) Math.round(average);}

    // Return letter grade
    char toLetter() {
        if (average > 88)
            return 'A';
        else if (average > 78)
            return 'B';
        else if (average > 68)
            return 'C';
        else if (average > 58)
            return 'D';
        else
            return 'F';
    }

    // Return student overview and info
    public String toString() {
        return String.format("Name: %s, Test 1: %s, Test 2: %s, Average: %s", name, df.format(test1), df.format(test2), df.format((test1+test2)/2));
    }
}
