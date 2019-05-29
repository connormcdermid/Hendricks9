/*
  author: Frank Gomes
  lab: 8.20 The Case of the Torn Raffle Tickets
  date: 24-05-19
  extra: Beeps when a user is found
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

class TearMeIntoJava {
    public static void main(String[] args) {
        // Puts values from each file into its own array
        String[] firstname = getStringArray(new File("EightTwenty/src/firstname.txt"));
        int[] firstnum = getIntArray(new File("EightTwenty/src/firstnum.txt"));
        String[] lastname = getStringArray(new File("EightTwenty/src/lastname.txt"));
        int[] lastnum = getIntArray(new File("EightTwenty/src/lastnum.txt"));
        // Sorts firstname with firstnum
        Object[] coolObject = sortToArray(firstname, firstnum);
        firstname = (String[])coolObject[0];
        firstnum = (int[])coolObject[1];
        // Sorts lastname with lastnum
        coolObject = sortToArray(lastname, lastnum);
        lastname = (String[])coolObject[0];
        lastnum = (int[])coolObject[1];
        // Randomly picks a winner
        Random rand = new Random();
        int winner = rand.nextInt(100);
        // Checks for winner in firstnum
        for (int i = 0; i < firstnum.length; i++)
            if (firstnum[i] == winner) {
                System.out.println("\u0007\u0007\u0007Winner! Winner! " + firstname[i] + " " + lastname[i] + " is the winner!");
                System.exit(0);
            }
        // Checks for winner in lastnum
        for (int i = 0; i < lastnum.length; i++)
            if (lastnum[i] == winner) {
                System.out.println("\u0007\u0007\u0007Winner! Winner! " + firstname[i] + " " + lastname[i] + " is the winner!");
                System.exit(0);
            }
        System.out.println("No winner found.");
    }

    private static int[] getIntArray(File file) {
        int[] array = new int[25];
        Scanner in;
        // Make the scanner for the file
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File " + file + " not found. Null returned.");
            return null;
        }
        // Counter for the substring of the array
        int count = 0;
        while (in.hasNextInt()) {
            array[count] = in.nextInt();
            count++;
        }
        return array;
    }

    private static String[] getStringArray(File file) {
        String[] array = new String[25];
        Scanner in;
        // Make the scanner for the file
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File " + file + " not found. Null returned.");
            return null;
        }
        // Counter for the substring of the array
        int count = 0;
        while (in.hasNext()) {
            array[count] = in.next();
            count++;
        }
        return array;
    }

    private static Object[] sortToArray(String[] names, int[] nums) {
        // Buffer for sorting with
        String buffer;
        int numBuffer;
        // Boolean to track if sorted
        boolean sorted = false;
        // Sorts names array and nums array to it
        while (!sorted) {
            for (int i = 0; i < names.length - 1; i++)
                if (names[i].compareToIgnoreCase(names[i+1]) > 0) {
                    // Rearranges names
                    buffer = names[i+1];
                    names[i+1] = names[i];
                    names[i] = buffer;
                    // Rearranges nums
                    numBuffer = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = numBuffer;
                } else
                    sorted = true;
        }
        return new Object[]{names, nums};
    }
}
