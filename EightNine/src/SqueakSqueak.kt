/*
  author: Frank Gomes
  lab: 8.8 Project Database Sorting
  date: 23-04-19
  extra: Can find multiple people named Oscar
 */

import kotlin.system.exitProcess

fun main() {
    // User menu
    println("Which problem would you like to see?\n 1. Sort String array\n 2. Name sort\n 3. Sort & search\nType \"quit\" to quit.")
    when (readLine()!!) {
        "1" -> one()
        "2" -> two()
        "3" -> three()
        "quit" -> exitProcess(0)
    }
    main()
}

// Prints arrays neatly
fun printArray(array: Array<String>) {
    print("[")
    for (i in 0 until array.size)
        print(array[i] + ", ")
    print("\b\b]\n")
}

// Problem 1
fun one() {
    val stringValues = arrayOf("camel", "ant", "dog", "cat", "horse", "mule", "java", "goose")
    // Prints array
    printArray(stringValues)
    // Sort array
    stringValues.sort()
    // Prints array again
    printArray(stringValues)
}

// Problem 2
fun two() {
    // Initializes array that will hold names of friends
    val nameArray = arrayOf("", "", "", "", "")
    // Asks the user for a friend's name 5 times and stores it in the array
    for (i in 0 until 5) {
        print("\nEnter a friend's name: ")
        nameArray[i] = readLine()!!
    }
    // Sequential search to find the name "Oscar"
    // Counter for instances of "Oscar"
    var oscars = 0
    // Stores position of last "Oscar" found
    var oscarSubscript = -1
    for (i in 0 until 5)
        if (nameArray[i] == "Oscar") {
            oscarSubscript = i
            oscars++
    }
    // Events depending on amounts of Oscars in array
    when (oscars) {
        0 -> println("No Oscars found.")
        1 -> println("1 Oscar found at position $oscarSubscript.")
        else -> println("$oscars Oscars found.")
    }
}

// Problem 3
fun three() {
    // Initializes array with 10 values
    val computerArray = arrayOf("", "", "", "", "", "", "", "", "", "")
    // Asks user for 10 computer terms
    for (i in 0 until 10) {
        print("\nEnter a computer term: ")
        computerArray[i] = readLine()!!
    }
    // Prints array
    printArray(computerArray)
    // Sorts array
    computerArray.sort()
    // Prints array again
    printArray(computerArray)
    // Searches for "mouse"
    println(binarySearch(computerArray, "Mouse"))
}

// Binary search for problem 3
fun binarySearch(array: Array<String>, key: String): String {
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
    return if (lowerbound <= upperbound) {
        "Value matching key $key found in array at subscript $position. Comparisons needed: $comparisonCount"
    } else
        "Value matching key $key not found in array. Comparisons done: $comparisonCount"
}