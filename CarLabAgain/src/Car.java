/*
  author: Frank Gomes
  lab: Car Lab II
  date: 20-09-19
  extra: Check miles until next change is needed
 */

class Car {
	
	// Stats of car
	private double odometer;
	private final int oilChange;

	// Constructor
    Car(double milesDriven, int oilChange) {
		this.odometer = milesDriven;
		this.oilChange = oilChange;
	}

	// See how many miles have been driven
    double checkOdometer() {
        return odometer;
    }

    // Drive forward
    void drive(double miles) {
        this.odometer += miles;
    }

    // Check miles until next oil change
    boolean oilChangeNeeded() {
        return odometer >= oilChange;
    }

    double milesUntilOilChange() {
	    double miles = oilChange - odometer;
	    if (miles < 0)
	        return 0;
	    return miles;
    }
}
