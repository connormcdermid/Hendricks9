import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TestFiveTest {
    public static void main (String[] args) {
        String department;
        int security;
        double salary = 0, total = 0;
        File file;
        Scanner reply;
        DecimalFormat decFor = new DecimalFormat("$#,###.00");

        try {
            file = new File("src/work.txt");
            reply = new Scanner(file);

            while (reply.hasNext())
            {
                // You're only able to make changes from here...
                department = reply.next();
                System.out.println("Department: " + department);
                security = reply.nextInt();
                System.out.println("Security #:" + security);
                for (int i = 0; i < 3; i++) {
                    System.out.print("\nPrevious salaries: ");
                    salary = reply.nextDouble();
                    System.out.print(salary);
                    if (reply.hasNextDouble())
                        System.out.print(", ");
                    total += salary;
                    System.out.println("Average salary: " + total/3);
                }
                // ...to here.
            }
            reply.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}