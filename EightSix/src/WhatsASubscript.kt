

fun main() {
    // Supplied array
    val coolArray = intArrayOf(11,16,22,23,34,46,48,50,75,78)
    // Supplied key value
    val key = 22
    // Calls binarySearch with needed information
    binarySearch(coolArray,key)
}

fun binarySearch(array: IntArray, key: Int) {
    var lowerbound = 0
    var upperbound = array.size - 1
    // Int to keep track of comparisons needed
    var comparisonCount = 1
    // Starts checking at centermost position
    var position = (lowerbound + upperbound) / 2
    // Checks if value at current position equals key and if
    while (array[position] != key && lowerbound <= upperbound) {
        comparisonCount++
        if (array[position] > key)
        // If the number is > key, decrease position by one
        {
            upperbound = position - 1
        }
        // If the number is < key, increases position by one
        else {
            lowerbound = position + 1
        }
        position = (lowerbound + upperbound) / 2
    }
    if (lowerbound <= upperbound) {
        println("Value matching key $key found in array at subscript $position. Comparisons needed: $comparisonCount")
    } else
        println("Value matching key $key not found in array. Comparisons done: $comparisonCount")
}

fun binarySearch(array: IntArray, lowerbound: Int, upperbound: Int, key: Int) {
    var lowerbound = lowerbound
    var upperbound = upperbound
    // Int to keep track of comparisons needed
    var comparisonCount = 1
    // Starts checking at centermost position
    var position = (lowerbound + upperbound) / 2
    // Checks if value at current position equals key and if
    while (array[position] != key && lowerbound <= upperbound) {
        comparisonCount++
        if (array[position] > key)
        // If the number is > key, decrease position by one
        {
            upperbound = position - 1
        }
        // If the number is < key, increases position by one
        else {
            lowerbound = position + 1
        }
        position = (lowerbound + upperbound) / 2
    }
    if (lowerbound <= upperbound) {
        println("Value matching key $key found in array at subscript $position. Comparisons needed: $comparisonCount")
    } else
        println("Value matching key $key not found in given section of array. Comparisons done: $comparisonCount")
}