import java.util.Scanner

class MilesPerHour {
    private var distance = 0.0
    private var hours = 0.0
    private var minutes = 0.0
    private var mph = 0.0

    // If no arguments are supplied, defaults all values to zero
    constructor() {
        setNums(0, 0, 0)
        mph = 0.0
    }

    // Initializes object with provided arguments
    constructor(dist: Int, hrs: Int, mins: Int) {
        // Sets properties of object to the arguments given
        setNums(dist, hrs, mins)
        mph = 0.0
    }

    fun setNums(dist: Int, hrs: Int, mins: Int) {
        // Sets properties of the object
        distance = dist.toDouble()
        hours = hrs.toDouble()
        minutes = mins.toDouble()
    }

    fun calcMPH() {
        // Gets the total amount of time
        val totalHours: Double = hours + (minutes / 60)
        mph = distance / totalHours
    }

    fun print() {
        // Gets MPH to print
        calcMPH()
        print("$distance miles in ")
        // Avoids saying "1 hours"
        when (hours) {
            0.0 -> print("")
            1.0 -> print("1 hour ")
            else -> print("$hours hours ")
        }
        // Avoids extra "and" in the sentence
        if (hours != 0.0 && minutes != 0.0)
            print(" and")
        // No minutes? Don't include it.
        when (minutes) {
            0.0 -> print("")
            1.0 -> print(" 1 minute ")
            else -> print(" $minutes minutes ")
        }
        print("= $mph MPH.\n")
    }

    // Returns the MPH as a String
    override fun toString(): String {
        return "$mph"
    }
}

// Produces output
fun main() {
    val kbd = Scanner(System.`in`)
    while (true) {
        // Gets User information
        println("Enter the distance. Type \"0\" to exit.")
        val distance = kbd.nextInt()
        // Quits if user inputs 0
        if (distance == 0)
            System.exit(0)
        println("Enter the hours taken.")
        val hours = kbd.nextInt()
        println("Enter the minutes taken.")
        val minutes = kbd.nextInt()
        val mph = MilesPerHour(distance,hours,minutes)
        mph.print()
    }
}