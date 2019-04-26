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
