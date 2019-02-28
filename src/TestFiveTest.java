import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFiveTest {
    public static void main (String[] args) {
        Scanner file = new Scanner(System.in);
        try {
             file = new Scanner(new File("nums.dat"));
        } catch (FileNotFoundException e) {
            System.out.println(e + "eeee");
        }
        System.out.println(file.nextInt());
    }
}