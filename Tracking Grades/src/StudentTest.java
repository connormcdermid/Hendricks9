/*
  author: Frank Gomes
  lab: Tracking Grades
  date: 12-09-19
  extra: toLetter(), which returns a letter grade
 */

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void inputGrades() {
        Student john = new Student("John");
        john.inputGrades(65, 78);
        assertEquals(john.getAverage(), 71.5);
    }

    @Test
    void printAverage() {
        // Get command output
        ByteArrayOutputStream bytearray = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(bytearray);
        System.setOut(ps);
        // Create student to get values of
        Student john = new Student("John");
        john.inputGrades(65,78);
        john.printAverage();
        // Flush PrintStream ps and check output stream
        System.out.flush();
        assertEquals(bytearray.toString(), "John's average: 71.5");
    }

    @Test
    void toInt() {
        Student john = new Student("John");
        john.inputGrades(65,78);
        assertEquals(john.toInt(),72);
    }

    @Test
    void toLetter() {
        // Overachiever
        Student sanjay = new Student("Sanjay");
        sanjay.inputGrades(104,98);
        assertEquals(sanjay.toLetter(),'A');
        // A grade
        Student peter = new Student("Peter");
        peter.inputGrades(93,96);
        assertEquals(peter.toLetter(), 'A');
        // B grade
        Student danny = new Student("Danny");
        danny.inputGrades(90,84);
        assertEquals(danny.toLetter(), 'B');
        // C grade
        Student john = new Student("John");
        john.inputGrades(65,78);
        assertEquals(john.toLetter(),'C');
        // D grade
        Student bella = new Student("Bella");
        bella.inputGrades(66.5,65);
        assertEquals(bella.toLetter(), 'D');
        // F grade
        Student eve = new Student("Eve");
        eve.inputGrades(24,35);
        assertEquals(eve.toLetter(), 'F');
    }

    @Test
    void testToString() {
        Student john = new Student("John");
        john.inputGrades(65,78);
        assertEquals(john.toString(), "Name: John, Test 1: 65, Test 2: 78, Average: 71.5");
    }
}