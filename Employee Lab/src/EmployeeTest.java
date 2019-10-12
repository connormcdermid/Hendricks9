/*
  author: Frank Gomes
  lab: Employee Lab
  date: 20-09-19
  extra: Auto-fires employee if given 3 strikes
 */

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Employee john = new Employee("John",54000);
        assertEquals(john.getName(),"John");
    }

    @org.junit.jupiter.api.Test
    void getSalary() {
        Employee john = new Employee("John",54000);
        assertEquals(john.getSalary(),54000);
    }

    @org.junit.jupiter.api.Test
    void raiseSalary() {
        Employee john = new Employee("John",54000);
        john.raiseSalary(15.5);
        assertEquals(62370,john.getSalary());
    }

    @org.junit.jupiter.api.Test
    void fireEmployee() {
        Employee john = new Employee("John",54000);
        john.addStrike();
        john.addStrike();
        john.addStrike();
    }
}