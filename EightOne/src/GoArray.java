import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GoArray {
    public static void main(String[] args) {
        double[] finalGrade = {85.8, 93.7, 76, 88.5, 100, 91.3};
        int totalSum = 0;
        for (int i = 0; i < finalGrade.length; i++)
            totalSum += finalGrade[0];
        System.out.println("Average Grade: " + Math.round(totalSum/finalGrade.length));
    }
}
