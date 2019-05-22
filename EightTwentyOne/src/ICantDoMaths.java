import java.util.Arrays;
import java.util.Random;

public class ICantDoMaths {
    public static void main(String[] args) {
        // Array to hold random ints
        int[] randArray = new int[25];
        // amount of even & odd numbers
        int evens = 0;
        int odds = 0;
        // Random object for making random ints
        Random rand = new Random();
        // Makes all items in the Array random
        for (int i=0; i < randArray.length; i++) {
            randArray[i] = rand.nextInt();
            if (randArray[i] % 2 == 0)
                evens++;
            else
                odds++;
        }
        // Arrays to hold the even and odd numbers from randArray
        int[] evensArray = new int[evens];
        int[] oddsArray = new int[odds];
        // Counter for the place in the array
        int evenCounter = 0;
        int oddCounter = 0;
        // Fills arrays with even or odd ints
        for (int i=0; i < randArray.length; i++) {
            if (randArray[i] % 2 == 0) {
                evensArray[evenCounter] = randArray[i];
                evenCounter++;
            }
            else {
                oddsArray[oddCounter] = randArray[i];
                oddCounter++;
            }
        }

        int[] palindrome = new int[]{
                231,
                456,
                756,
                212,
                456,
                452,
                121,
                313,
                678,
                900
        };
        for(int i = 0; i < palindrome.length;i++){
            int digit1 = palindrome[i] % 10;
            int digit3 = palindrome[i] % 100;
            if(digit1 == digit3){
                System.out.println("The one at " +i+" is a palindrome");
            }
        }
        int[] num = new int[24];
        for(int i = 0;i < num.length; i++){
            double temp = Math.random();
            temp = temp*100;
            int hold = (int)temp;

            num[i] = hold;
        }

        int mean = 0;
        for(int i = 0; i < num.length;i++){
            mean = mean + num[i];
        }

        Arrays.sort(num);

        int median = num[13];

        int crip = num[0];

        for(int i = 0; i < num.length - 1;i++){
            if(crip < num[i]){
                crip = num[i];
            }
        }

        int tayk = num[0];

        for(int i = 0; i < num.length - 1;i++){
            if(tayk > num[i]){
                tayk = num[i];
            }
        }

        String range = crip+","+tayk;

        double sqDiff = 0;
        for (int i = 0; i < num.length; i++)
            sqDiff += (num[i] - mean) *
                    (num[i] - mean);
        sqDiff =  sqDiff / 25;

        double variance = Math.sqrt(sqDiff);

        System.out.println(mean);
        System.out.println(median);
        System.out.println(crip);
        System.out.println(tayk);
        System.out.println(range);
        System.out.println(sqDiff);
        System.out.println(variance);





    }
}
