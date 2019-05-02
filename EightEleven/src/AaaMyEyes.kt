fun main() {
    // Array of customer arrays
    val customers = arrayOf(arrayOf("Puget Tummalaprogress","000001","421", "5", "14", "$0.00"),
                            arrayOf("Agranya Ketha", "000002", "420", "5", "3", "$0.00"),
                            arrayOf("Harish Sundar", "000003", "134", "1", "6", "$0.00"),
                            arrayOf("Rahul Chauhan", "000004", "102", "5", "2", "$0.00"),
                            arrayOf("John Wick Fortnite", "000005", "306", "1", "0", "$0.00"),
                            arrayOf("Jack Tramiel", "000064", "128", "5", "6502", "$0.00"),
                            arrayOf("Bil Herd", "000128", "128", "1", "1", "$0.00"),
                            arrayOf("Eyeah Eyeah", "000134", "208", "5", "4", "$0.00"),
                            arrayOf("Mishovy Silenosti", "000280", "211", "1", "1", "$0.00"),
                            arrayOf("Amphibious Reptile", "000291", "202", "5", "4", "$0.00"),
                            arrayOf("Carrot", "000333", "502", "5", "3", "$0.00"))
    // Checks through the array for those who have overdue rentals and calculates late fees
    for (i in 0 until customers.size)
        if (customers[i][4] > customers[i][3])
            if (customers[i][3] == "1") {
                val feesDue = customers[i][4].toInt()*1.49
                customers[i][5] = "$$feesDue"
            } else if (customers[i][3] == "5") {
                val feesDue = customers[i][4].toInt()*0.69
                customers[i][5] = "$$feesDue"
            }
    // Prints users by their identification numbers
    // bubbleSort()
}

fun bubbleSort(coolArray: Array <Array <String>>) {
    // Temporary buffer for storing the value of the position after the one being compared
    var bubbleBuffer: String
    // While loop that iterates until the array is sorted
    // A boolean that tracks whether there has been a swap in the iteration of the loop
    while (true) {
        var swapped = false
        // Goes through each pair of items in the array and checks if they are in order
        for (i in 0 until coolArray.size) {
            try {
                // If the pair is not in the order of i > i + 1, it swaps them
                if (coolArray[2][i] < coolArray[2][i + 1]) {
                    // bubbleBuffer = coolArray[i + 1]
                    coolArray[i + 1] = coolArray[i]
                    // coolArray[i] = bubbleBuffer
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
    // Prints
    // printArray(coolArray)
}