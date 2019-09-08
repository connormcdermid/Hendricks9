/*
  author: Frank Gomes
  lab: Car lab
  date: 08-09-19
  extra: Throws OutOfGasException if user drives too far without gas
 */

class Car {
    // Contents of the gas tank, by default starts empty
    private double tank = 0.0;
    // The efficiency of the car in miles per gallon
    private int efficiency;
    Car(int mpg) {
        efficiency = mpg;
    }

    // Add more gas to the tank

    void addGas(double gal) {
        tank += gal;
    }
    // Drive and use up gas

    void drive(double miles) throws OutOfGasException {
        double consumed = miles/efficiency;
        // Checks if user uses more gas than is in the tank
        if (consumed > tank) {
            // Sets tank to empty and throws OutOfGasException
            tank = 0.0;
            throw new OutOfGasException();
        }
        // Otherwise, drives like normal
        else
            tank -= consumed;
    }
    // Check the amount of gas in the tank

    double getGasInTank() {
        return tank;
    }
    // Exception to throw if the user is out of gas
    class OutOfGasException extends IllegalStateException {
        public String getMessage() {
            return("Car was driven and ran out of gas on the way.");
        }
    }
}
