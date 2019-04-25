/*
  author: Frank Gomes
  lab: 8.7 Worksheet Sorting
  date: 22-04-19
  extra: Bogo sort for #3 & question menu
 */

fun main() {
    while (true) {
        println("Which problem would you like to see? (1, 2, 3, or quit)")
        when (readLine()!!) {
            "1" -> one()
            "2" -> two()
            "3" -> three()
            "quit" -> System.exit(0)
        }
    }
}

// Methods to print arrays of each type
fun printArray(array: Array<Int>) {
    print("[")
    for (i in 0 until array.size)
        print(array[i].toString() + ", ")
    print("\b\b]\n")
}

fun printArray(array: Array<Double>) {
    print("[")
    for (i in 0 until array.size)
        print(array[i].toString() + ", ")
    print("\b\b]\n")
}

fun printArray(array: Array<Char>) {
    print("[")
    for (i in 0 until array.size)
        print(array[i].toString() + ", ")
    print("\b\b]\n")
}

fun one() {
    // Array to work with
    val coolArray= arrayOf(65,45,34,12,99,54,39,2,88,18)
    // Temporary buffer for storing the value of the position after the one being compared
    var bubbleBuffer: Int
    // While loop that iterates until the array is sorted
    // A boolean that tracks whether there has been a swap in the iteration of the loop
    while (true) {
        var swapped = false
        // Goes through each pair of items in the array and checks if they are in order
        for (i in 0 until coolArray.size) {
            try {
                // If the pair is not in the order of i > i + 1, it swaps them
                if (coolArray[i] < coolArray[i + 1]) {
                    bubbleBuffer = coolArray[i + 1]
                    coolArray[i + 1] = coolArray[i]
                    coolArray[i] = bubbleBuffer
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
    printArray(coolArray)
}

fun two() {
    // Array to work with
    val coolerArray = arrayOf(43.2,13.6,91.4,23.6,72.1)
    for (i in 0 until (coolerArray.size - 1))
        for (i2 in (i + 1) until coolerArray.size)
            // Checks if the current value is in the order of i < (i + 1), and if not, rearranging it into order
            if (coolerArray[i] > coolerArray[i2]) {
                // Swaps around the two numbers
                val temp = coolerArray[i]
                coolerArray[i] = coolerArray[i2]
                coolerArray[i2] = temp
            }
    // Prints
    printArray(coolerArray)
}

fun three() {
    // Array to work with
    val coolestArray = arrayOf('a','g','k','j','t','i','f','s','w','b')
    // Prints array before sort
    printArray(coolestArray)
    // Boolean to track if array is sorted or not
    var sorted = false
    // Checks if array is sorted, and if not, randomizes it
    while (!sorted) {
        for(i in 0 until (coolestArray.size - 1)) {
            if (coolestArray[i] > coolestArray[i + 1]) {
                sorted = false
                break
            }
            else
                sorted = true
        }
        if (sorted)
            break
        // Randomizes array
        coolestArray.random()
    }
    // Prints after sort
    printArray(coolestArray)
}