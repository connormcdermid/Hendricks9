import java.util.Scanner;

class TearMeIntoJava {
    public static void main(String[] args) {
        String[] firstNameArray = new String[25];
        Scanner firstNameScanner = new Scanner("firstname.txt");
        firstNameScanner.nextLine();
        if (!firstNameScanner.hasNextLine())
            System.out.println("end of array");
        for (String i: firstNameArray)
            i = firstNameScanner.nextLine();
        System.out.println(firstNameArray[0]);
    }
}
