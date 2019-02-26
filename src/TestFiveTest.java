public class TestFiveTest {
        public static void main (String[] args) {
            stuff( );
            int x = 2, y = 3;
            moreStuff(x, y);
            System.out.println(x + " " + y);
            System.out.print(evenMoreStuff( ));
        }
    //**Method definition
        public static void stuff()
        {
            System.out.print("Howdy! \n");
        }
    //**Method definition
        public static int evenMoreStuff()
        {
            System.out.println("Way!");
            int num = 2000;
            num++;
            return(num);
        }
    //**Method definition
        public static void moreStuff(int a, int b)
        {
            a += 5;
            b++;
            System.out.println(a + " " + b);
        }
    }