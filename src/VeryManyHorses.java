/*
  author: Frank Gomes
  version: 0.1
  lab: 6.4 Worksheet String Convert
  date: 21-02-19
  extra: regex Matcher and Pattern
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javax.xml.bind.DatatypeConverter.parseInt;

public class VeryManyHorses {
    public static void main(String[] args) {
        // Pattern for getting regex matches from Strings
        Pattern p = Pattern.compile("\\d+");
        // Problem 1
        {
            String horses = "35 horses";
            // regex Matcher to find the number of horses in the string
            Matcher m = p.matcher(horses);
            // For every instance of a number (one), execute that mess
            while (m.find())
                // Print the int version of the digit we found in the string, and do the calculation (4 legs per horse) with it
                System.out.println(parseInt(m.group()) + " horses have " + (parseInt(m.group()) * 4) + " legs! Crazy, right?");
        }
        // Problem 2
        {
            String wordy = "AB2CD8EF9G";
            Matcher m2 = p.matcher(wordy);
            String digits = "";
            while (m2.find())
                digits = digits.concat(m2.group());
            System.out.println(digits);
            int sum = 0;
            for (int i = 0; i < digits.length(); i++)
                sum += parseInt(String.valueOf(digits.charAt(i)));
            System.out.println(sum);
        }

        // Problem 3
        {
            String launch = "54321";
            int sum = 0;
            for (int i = 0; i < launch.length(); i++) {
                sum += parseInt(String.valueOf(launch.charAt(i)));
                if (i == 4) {
                    System.out.print("1 Go!");
                    break;
                }
                System.out.print(launch.charAt(i) + "-");
            }
            System.out.print("\n");
            System.out.print(sum + "-Go!");

        }
    }
}
