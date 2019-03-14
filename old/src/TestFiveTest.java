import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class TestFiveTest {
    public static void main (String[] args) {
        String attendance = "32 students";
        int students = parseInt(String.valueOf(attendance.charAt(0)) + String.valueOf(attendance.charAt(1)));
        System.out.println(students + " students will prepare " + (students*3) + " exam papers.");
    }
}