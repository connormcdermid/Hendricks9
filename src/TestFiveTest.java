public class TestFiveTest {
    public static void main(String[ ] args) {
        Greeting(9);
    }
    public static void Greeting(int N)
    {
        System.out.println("Hello");
        if (N%2 == 0)
        {
            System.out.print("Hi");
            N--;
            System.out.print(N);
        }
        System.out.println("Goodbye");
    }
}