import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class YOUNGDOG {
    public static File dogFile = new File("SevenThree/output/Dog.txt");
    public static void main(String[] args) {
        // File for Dog.txt called dogFile
        PrintWriter pw = null;
        // Try/catch statement to make PrintWriter for Dog.txt
        try {
            pw = new PrintWriter(dogFile);
        } catch (FileNotFoundException e) {
            e.getStackTrace();
            e.getMessage();
        }
        // Prints dog info to Dog.txt
        pw.println("Wally 10\n" +
                "Jessie 9\n" +
                "Skeeter 15\n" +
                "Lucky 7\n" +
                "Corky 5\n" +
                "Sadie 6\n" +
                "Alexis 1");
    }
}

class OLDDOG {
    public static void main(String[] args) {
        Scanner dog = null;
        try {
            dog = new Scanner(YOUNGDOG.dogFile);
        } catch (FileNotFoundException e) {
            e.getStackTrace();
            e.getMessage();
        }

    }
}