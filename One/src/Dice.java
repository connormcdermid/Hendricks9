//  Dice.java

/**
 * Implements a Dice object (a die)
 * 
 * @author andrianoff
 * @version June 25, 2014
 */
class Dice {
    private int sides;

    Dice() {}

	/**
	 * Rolls a die - generates a random number in the range 1 .. 6
	 * @return the face value of the die
     */

	// If no sides are specified, defaults to six
	int roll()
	{
		return this.roll(6);
	}

    int roll(int sides)
    {
        this.sides = sides;
        return (int) (Math.random()*sides) + 1;
    }

    public String toString() {
	    return "Sides: " + sides;
    }
}