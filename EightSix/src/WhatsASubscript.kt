/*
  author: Frank Gomes
  lab: 8.6 Binary Search
  date: 09-04-19
  extra: binarySearch method can be overloaded for a upperbound and lowerbound
 */

fun main() {
    // Supplied array
    val coolArray = intArrayOf(11,16,22,23,34,46,48,50,75,78)
    // Supplied key value
    val key = 22
    // Calls binarySearch with needed information
    println(binarySearch(coolArray,key))
}

fun binarySearch(array: IntArray, key: Int): String {
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
        return "Value matching key $key found in array at subscript $position. Comparisons needed: $comparisonCount"
    } else
        return "Value matching key $key not found in array. Comparisons done: $comparisonCount"
}

fun binarySearch(array: IntArray, lowerbounde: Int, upperbounde: Int, key: Int): String {
    var lowerbound = lowerbounde
    var upperbound = upperbounde
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
        return "Value matching key $key found in array at subscript $position. Comparisons needed: $comparisonCount"
    } else
        return "Value matching key $key not found in given section of array. Comparisons done: $comparisonCount"
}