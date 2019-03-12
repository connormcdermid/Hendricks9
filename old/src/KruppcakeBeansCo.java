/* import java.util.Scanner;
class KruppcakeBeansCo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Beginning of Logo
        int tri;
        int bl;
        for(tri=0; tri < 6; tri++)
        {
            for(bl = 1; bl < tri+2; bl++)
            {
                System.out.print("$");
            }
            System.out.println("");
        }

        //This is the end of my logo
        //This is where my slogan/name starts
        System.out.println("Cool beans: Creator of fish beans");
        System.out.println("Do you want beans, cause we happen to have a lot!");
        System.out.println("Address - Glades court east, Novi, Michigan, 07930");
        employees();
        description();
        int cost = descriptionresults();
        totalcost(cost);
    }
    //My method for the employees
    public static void employees(){//Employees
        System.out.println("Bean inspector: Ryan K");
        System.out.println("Bean taste tester:  Poojit Tummalapalli");
        System.out.println("Bean loaner:  Mrs. Digiovanna");
        System.out.println("Bean roaster:  Delaney Williams");
        System.out.println("Bean Critic:  Jack");
        System.out.println("Bean letter creator:  Ginger");
        System.out.println("Bean Editor:  Mrs. Evans");
    }// The columns
    public static void description(){ // Method that prints out the list of products and services
        System.out.println("Here is a list of some of our products:");
        System.out.println("Product-");
        System.out.println("One big bean - 200$");
        System.out.println("Description: ");
        System.out.println("This product is just one big bean that we have cultivated and roasted until is the perfect size, texture, and density.");
        System.out.println("Service- ");
        System.out.println("1.Making sure the bean is fitted to match your room: $10");
        System.out.println("2.Airing the bean out before delivery: $21");
        System.out.println("3.Letting the bean roam free range: $33");
        System.out.println("4.Having the bean only watered with applejuice: $57");
        System.out.println("5.Creating a bean that never even needs water: $82");
        System.out.println("6.We will send you a pear instead of a bean, they are basically the same thing: $91");
        System.out.println("Price per Unit: ");
        System.out.println("One Beans: $115");
        System.out.println("Two Beans: $200");
        System.out.println("Three beans: $210");
        System.out.println("Four beans: $250");
        System.out.println("Five beans: $270");
    }
    public static int descriptionresults(){ // Method for choosing
        int chosenservice;

        int price,pricetwo,pricethree,pricefour,pricefive,pricesix;
        price = 0;
        pricetwo = 0;
        pricethree = 0;
        pricefour = 0;
        pricefive = 0;
        pricesix = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a Service: ");
        chosenservice = scanner.nextInt();
        while(true){
            if(chosenservice == 1){
                System.out.println("How Many: ");
                int number = scanner.nextInt();
                price = (number*10);
                System.out.println("Are you done?");
                String done = scanner.next();
                if(done.equals("Yes")|| done.equals("yes")){
                    break;
                }

                else{
                    continue;
                }


            }
            else if(chosenservice == 2){
                System.out.println("How Many: ");
                int number = scanner.nextInt();
                pricetwo = (number*21);
                System.out.println("Are you done?");
                String done = scanner.next();
                if(done.equals("Yes")|| done.equals("yes")){
                    break;
                }
                else{
                    continue;
                }
            }
            else if(chosenservice == 3){
                System.out.println("How Many: ");
                int number = scanner.nextInt();
                pricethree = (number*33);
                System.out.println("Are you done?");
                String done = scanner.next();
                if(done.equals("Yes")|| done.equals("yes")){
                    break;
                }
                else{
                    continue;
                }
            }
            else if(chosenservice == 4){
                System.out.println("How Many: ");
                int number = scanner.nextInt();
                pricefour = (number*57);
                System.out.println("Are you done?");
                String done = scanner.next();
                if(done.equals("Yes")|| done.equals("yes")){
                    break;
                }
                else{
                    continue;
                }
            }
            else if(chosenservice == 5){
                System.out.println("How Many: ");
                int number = scanner.nextInt();
                pricefive = (number*82);
                System.out.println("Are you done?");
                String done = scanner.next();
                if(done.equals("Yes")|| done.equals("yes")){
                    break;
                }
                else{
                    continue;
                }

            }
            else if(chosenservice == 6){
                System.out.println("How Many: ");
                int number = scanner.nextInt();
                pricesix = (number*91);
                System.out.println("Are you done??");
                String done = scanner.next();
                if(done.equals("Yes")|| done.equals("yes")){
                    break;
                }
                else{
                    continue;
                }

            }
        }
        // Prints out the total cost
        int cost;
        cost = price+pricetwo+pricethree+pricefour+pricefive+pricesix;

        return cost;

    }


    public static void totalcost(int cost){
        int costtotal = cost + 100;
        System.out.println("Your total payment is $"+costtotal);
    }
}

*/