/*
  author: Frank Gomes
  lab: Car Lab II
  date: 20-09-19
  extra: Check miles until next change is needed
 */

class CarTest {
    public static void main(String[] args) {
        // New car
        Car trueno = new Car(2000,4000);
        System.out.println("Miles Driven: " + trueno.checkOdometer());
        System.out.println("Oil Change Needed: " + trueno.oilChangeNeeded());
        System.out.println("Miles Until Next Oil Change: " + trueno.milesUntilOilChange());
        // Test driving
        trueno.drive(4000);
        System.out.println("Miles Driven: " + trueno.checkOdometer());
        System.out.println("Oil Change Needed: " + trueno.oilChangeNeeded());
        System.out.println("Miles Until Next Oil Change: " + trueno.milesUntilOilChange());
    }
}
