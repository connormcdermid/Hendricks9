import java.util.Scanner;

public class HeckIForgotFiveTwo {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Please enter a number.");
        double num = kbd.nextInt();
        System.out.println("This number squared is " + square(num) + ".");
        System.out.println("This number cubed is " + cube(num) + ".");
    }

    private static double square(double num) {
        double squared = num*num;
        return(squared);
    }

    private static double cube(double num) {
        double cubed = num*num*num;
        return(cubed);
    }
}