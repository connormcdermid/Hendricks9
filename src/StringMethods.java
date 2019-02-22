/**
 * @author Frank Gomes
 * @version 0.1
 * @lab 6.3 Worksheet Strings
 * @date 21-02-19
 * @extra Does a linux login
 **/

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Character.*;
import static javax.xml.bind.DatatypeConverter.parseInt;

public class StringMethods {

    private static Scanner kbd = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Which problem would you like to see?\n 1. Password\n 2. Movie Titles\n 3. Alphabetical Order\n 4. Screen Name\n 5. Name Case Shift\n 6. City Case Shift\n 7. Lowercase Counter\n 8. Last Name\n 9. Number Finder\n 10. Commas, Please");
        String input = kbd.next();
        switch (input) {
            case "1":
                one();
                break;
            case "2":
                two();
                break;
            case "3":
                three();
                break;
            case "4":
                four();
                break;
            case "5":
                five();
                break;
            case "6":
                six();
                break;
            case "7":
                seven();
                break;
            case "8":
                eight();
                break;
            case "9":
                nine();
                break;
            case "10":
                ten();
                break;
            case "exit":
                System.out.println("Goodbye.");
                System.exit(0);
        }
        main(null);
    }

    // Problem 1
    private static void one() {
        // Checks if user entered the correct password (it's progress by the way)
        if (kbd.nextLine().equals("progess")) {
            // Tries to use the local machine's login MOTD (only available on linux machines with neofetch, inxi, and ansiweather)
            try {
                Runtime.getRuntime().exec("bash /etc/update-motd.d/01-custom");
            }
            // If command doesn't work
            catch (IOException e) {
                System.out.println("Sorry, but your computer is too lame to do this portion. (" + e + ")");
            }
        }
        // Run if user doesn't enter proper password
        else {
            System.out.println("Wrong password. Hint: puget has much of it");
        }
    }

    // Problem 2
    private static void two() {
        // Gets movie titles and stores them as name1 and name2 respectively
        System.out.println("Enter a movie title.");
        String name1 = kbd.next();
        System.out.println("Enter another movie title.");
        String name2 = kbd.next();
        // If the first title is longer
        if (name1.length() > name2.length())
            System.out.println(name1);
        // If they're both the same length
        if (name1.length() == name2.length())
            System.out.println("Both are of equal length.");
        // If the second title is longer
        if (name1.length() < name2.length())
            System.out.println(name2);
    }

    // Problem 3
    private static void three() {
        // Gets two words from user
        System.out.println("Input a word.");
        String word1 = kbd.next();
        System.out.println("Input another word.");
        String word2 = kbd.next();
        // Value is 0 if both are the same, <0 if afterwards alphabetically, >0 if before alphabetically
        int order = word1.compareToIgnoreCase(word2);
        // Checks if word2 comes before word1
        if (order < 0)
            System.out.println(word2 + ", " + word1);
        // Checks if both words are the same, regardless of case
        else if (order == 0)
            System.out.println("The words are the same.");
        // Checks if word1 comes before word2
        else
            System.out.println(word1 + ", " + word2);
    }

    // Problem 4
    private static void four() {
        System.out.println("Enter a screen name for AOL. Do not use any spaces.");
        String name = kbd.nextLine();
        for (int i = 0; i < name.length(); i++)
            if (name.charAt(i) == ' ') {
                System.out.println("This name has a space in it.");
                return;
            }
        System.out.println(name + "@aol.com");
    }

    // Problem 5
    private static void five() {
        String person = "Charlie Brown";
        // Prints every character in the String person, but does it in uppercase using toUpperCase
        for (int i = 0; i < person.length(); i++)
            System.out.println(toUpperCase(person.charAt(i)));
        // Gets user's name
        System.out.println("Enter your name.");
        String name = kbd.nextLine();
        // Prints every character in the String person, but does it in lowercase using toLowerCase
        for (int i = 0; i < name.length(); i++)
            System.out.println(toLowerCase(name.charAt(i)));
    }

    // Problem 6
    private static void six() {
        System.out.println("Enter the name of a city.");
        String city = kbd.nextLine();
        for (int i = 0; i < city.length(); i++) {
            if (isUpperCase(city.charAt(i)))
                System.out.println(toLowerCase(city.charAt(i)));
            if (isLowerCase(city.charAt(i)))
                System.out.println(toUpperCase(city.charAt(i)));
            else {
                System.out.println("This city's name contains an unrecognized character.");
                return;
            }
        }
    }

    // Problem 7
    private static void seven() {
        System.out.println("Enter a sentence.");
        String sentence = kbd.nextLine();
        int lowercaseCount = 0;
        for (int i = 0; i < sentence.length(); i++)
            if (isLowerCase(sentence.charAt(i)))
                lowercaseCount++;
        System.out.println("There are " + lowercaseCount + " lowercase characters in that sentence.");
    }

    // Problem 8
    private static void eight() {
        String detective = "Sherlock Holmes";
        // Finds the space and prints everything after it
        System.out.println(detective.substring(detective.lastIndexOf(" ") + 1));
    }

    // Problem 9
    private static void nine() {
        // String to get number from
        String address = "West 103rd Street";
        // Pattern to identify number (\d identifies digits, + allows multi-digit numbers, \\ is to avoid \d becoming an escape sequence
        Pattern p = Pattern.compile("\\d+");
        // Matches the pattern to identify any numbers
        Matcher m = p.matcher(address);
        // Prints those numbers multiplied by 12
        while (m.find())
            System.out.println(parseInt(m.group())*12);
    }

    // Problem 10
    private static void ten() {
        String name = "Ford, Harrison";
        System.out.println(name.substring(name.lastIndexOf(" ") + 1));
        System.out.println(StringUtils.substringBefore(name, ","));
    }
}
