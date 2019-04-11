
fun main() {
    // Supplied array
    val coolArray = intArrayOf(11,16,22,23,34,46,48,50,75,78)
    // Supplied key value
    val key = 22
    // Checks if each value in the array matches the key, once it finds one it outputs info and exits
    for (i in 0 until coolArray.size)
        if (coolArray[i] == key) {
            println("Key value $key found at place $i, taking " + (i + 1) + " comparisons.")
            System.exit(0)
        }
    // Executed if no match was found
    println("No matches in array for key value $key.")
}

fun binarySearch(array: IntArray, lowerbound: Int, upperbound: Int, key: Int) {
    var lowerbound = lowerbound
    var upperbound = upperbound
    var position: Int
    var comparisonCount = 1 // counting the number of comparisons (optional)
    // To start, find the subscript of the middle position.
    position = (lowerbound + upperbound) / 2
    while (array[position] != key && lowerbound <= upperbound) {
        comparisonCount++
        if (array[position] > key)
        // If the number is > key, decrease position by one.
        {
            upperbound = position - 1
        } else {
            lowerbound = position + 1 // Else, increase position by one.
        }
        position = (lowerbound + upperbound) / 2
    }
}