/*
  author: Frank Gomes
  lab: Monster lab
  date: 26-09-19
  extra: Monsters have different species
 */

import java.util.Scanner;

class Tester {
    public static void main(String[] args) {
        // Get info of Monster One
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter 1st monster's name: ");
        String name = keyboard.next();
        System.out.print("Enter 1st monster's height: ");
        double size=keyboard.nextDouble();
        System.out.print("Enter 1st monster's species: ");
        String species = keyboard.next();
        Monster mOne = new Monster(name, size, species);
        // Get info of Monster Two
        System.out.print("Enter 2nd monster's name: ");
        name = keyboard.next();
        System.out.print("Enter 2nd monster's height: ");
        size = keyboard.nextDouble();
        System.out.print("Enter 2nd monster's name: ");
        species = keyboard.next();
        Monster mTwo = new Monster(name, size, species);
        // Compare the stats of the monsters
        if (mOne.isBigger(mTwo)) // Height
            System.out.println("Monster one is bigger than Monster two.");
        else if (mOne.isSmaller(mTwo)) // Height again
            System.out.println("Monster one is smaller than Monster two.");
        if (mOne.getName().equals(mTwo.getName())) // Name
            System.out.println("Monster one has the same name as Monster two.");
        if (mOne.getSpecies().equals(mTwo.getSpecies())) // Species
            System.out.println("Monster one is the same species as Monster two.");
        keyboard.close();
    }
}