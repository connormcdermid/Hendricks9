import java.util.Arrays;
import java.util.Random;

public class GoArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] randNums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < randNums.length; i++)
            randNums[i] = rand.nextInt(11);
        System.out.println(Arrays.toString(randNums));
        System.out.print("\n[");
        for (int i = 0; i < randNums.length; i++)
            System.out.print(randNums[9-i] + ", ");
        System.out.print("\b\b]");
    }
}
