/*
  author: Frank Gomes
  lab: Car lab
  date: 08-09-19
  extra: Throws OutOfGasException if user drives too far without gas
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void addGas() {
        Car camry = new Car(50);
        camry.addGas(200);
        assertEquals(camry.getGasInTank(), 200);
    }

    @Test
    void drive() {
        Car f150 = new Car(1);
        f150.addGas(2);
        f150.drive(1);
        assertEquals(f150.getGasInTank(), 1);
    }

    @Test
    void driveTooFar() {
        Car f150 = new Car(1);
        f150.addGas(2);
        Assertions.assertThrows(Car.OutOfGasException.class, () -> f150.drive(3));
    }

    @Test
    void getGasInTank() {
        Car f150 = new Car(1);
        f150.addGas(40);
        assertEquals(f150.getGasInTank(), 40);
    }
}