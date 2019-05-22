/*
  author: Frank Gomes
  lab: 8.18 Project University
  date: 13-04-19
  extra: Color codes student output
 */

fun main() {
    // Array for the students
    // ID #, Name, Credit Hours, GPA, and graduation eligibility
    val students = arrayOf(
            arrayOf("123456", "Smith, Kevin", "144", "3.0", "f"),
            arrayOf("124563", "Jones, Sarah", "134", "2.5", "f"),
            arrayOf("134522", "Kelly, Jonathan", "130", "3.5", "f"),
            arrayOf("143266", "Clift, Edward", "146", "1.5", "f"),
            arrayOf("145667", "Ogden, Beatrice", "133", "4.0", "f"),
            arrayOf("187622", "Walter, Benjamin", "120", "3.0", "f"),
            arrayOf("164522", "Edwards, Steven", "124", "1.8", "f")
    )
    // Temporary buffer for storing the value of the position after the one being compared
    var bubbleBuffer: String
    // While loop that iterates until the array is sorted
    while (true) {
        // A boolean that tracks whether there has been a swap in the iteration of the loop
        var swapped = false
        // Goes through each pair of items in the array and checks if they are in order
        for (i in students.indices) {
            try {
                // If the pair is not in alphabetical order, it swaps them
                if (students[i][2].substringAfter(' ') > students[i+1][2].substringAfter(' ')) {
                    // Swaps around the nameArray
                    for (i2 in 0 until (students[i].size - 1)){
                        bubbleBuffer = students[i+1][i2]
                        students[i+1][i2] = students[i][i2]
                        students[i][i2] = bubbleBuffer
                    }
                    // Sets swapped to true to keep track of swaps
                    swapped = true
                }
            }
            // Catches exception thrown when at the end of the array.
            catch (e: ArrayIndexOutOfBoundsException) {
                break
            }
        }
        // Checks to see if any swaps were made this iteration. If not, then the sort is complete and the loop can break
        if (!swapped)
            break
    }
    // Checks if students meet the GPA and credits requirements, and if not, marks them
    for(i in students.indices) {
        // Checks if the student has enough credits, and if not, marks them
        if (students[i][2].toInt() < 132)
            students[i][4] = "\u001b[31;1mNot enough credit hours\u001b[0m"
        // Checks if the student has a high enough GPA, and if not, marks them
        else if (students[i][3].toDouble() < 2.0)
            students[i][4] = "\u001b[31;1mGPA too low\u001b[0m"
        // If the student meets all the requirements, marks them as such
        else
            students[i][4] = "\u001b[32mClear to graduate\u001b[0m"
    }
    // Goes through each student's array and checks their eligibility status
    for(i in students.indices) {
        println("${students[i][0]}: ${students[i][1]} - ${students[i][4]}")
    }
}