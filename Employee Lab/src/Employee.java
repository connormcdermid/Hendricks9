/*
  author: Frank Gomes
  lab: Employee Lab
  date: 20-09-19
  extra: Auto-fires employee if given 3 strikes
 */

public class Employee {
    // Fields
    private final String name;
    private double salary;
    private int strikes = 0;
    // Constructor
    Employee(String name, double salary) {
        this.salary = salary;
        this.name = name;
    }
    // Getters
    String getName() {
        return name;
    }
    double getSalary() {
        return salary;
    }
    // Give him a raise!
    void raiseSalary(double raisePercentage) {
        this.salary += (raisePercentage/100) * this.salary;
    }
    // Auto-fire employees
    void addStrike() {
        strikes++;
        // If employee has 3 strikes, kick him out
        if (strikes == 3)
            System.out.printf("Firing employee %s.", this.name);
    }
}
