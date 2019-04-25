/*
  author: Frank Gomes
  lab: 8.7 Worksheet Sorting
  date: 22-04-19
  extra:
 */

fun main() {
    // Array to work with
    val coolArray = arrayOf(65,45,34,12,99,54,39,2,88,18)
    // Temporary buffer for storing the value of the position after the one being compared
    var bubbleBuffer: Int
    // While loop that iterates until the array is sorted
    while (true) {
        // A boolean that tracks whether there has been a swap in the iteration of the loop
        var swapped = false
        // Goes through each pair of items in the array and checks if they are in order
        for (i in 0 until coolArray.size) {
            try {
                // If the pair is not in the order of i > i + 1, it swaps them
                if (i < (i + 1)) {
                    bubbleBuffer = coolArray[i + 1]
                    coolArray[i + 1] = coolArray[i]
                    coolArray[i] = bubbleBuffer
                    swapped = true
                }
            } catch (e: ArrayIndexOutOfBoundsException) {
                break
            }
        }
        // Checks to see if any swaps were made this iteration. If not, then the sort is complete and the loop can break
        if (!swapped)
            break
    }
    // Prints
    println(coolArray)
}