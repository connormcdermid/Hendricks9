import java.util.Scanner

fun main() {
    // Scanners for each file
    val firstNameScanner = Scanner("firstname.txt")
    val firstNumScanner = Scanner("firstnum.txt")
    val lastNameScanner = Scanner("lastname.txt")
    val lastNumScanner = Scanner("lastnum.txt")

    // Makes each array equal to its corresponding value
    val firstNameArray = Array<String>(25){firstNameScanner.nextLine()}
    val firstNumArray = Array(25){firstNumScanner.nextLine().toInt()}
    val lastNameArray = Array<String>(25){lastNameScanner.nextLine()}
    val lastNumArray = Array(25){lastNumScanner.nextLine().toInt()}

    printArray(firstNumArray)

    // Sorts lastNumArray  to the sort of lastNameArray
    // Boolean to track whether or not the array is sorted
    var sorted = false
    while (!sorted) {
        for (i in 0 until (lastNameArray.size - 1)) {
            if (lastNameArray[i][0] < lastNameArray[i+1][0]) {
                val buffer = lastNameArray[i+1]
                lastNameArray[i+1] = lastNameArray[i]
                lastNameArray[i] = buffer
                val intBuffer = lastNumArray[i+1]
                lastNumArray[i+1] = lastNumArray[i]
                lastNumArray[i] = intBuffer
            }
        }
    }

    // Now for the firstName & firstNum
    sorted = false
    while (!sorted) {
        for (i in 0 until (firstNameArray.size - 1)) {
            if (firstNameArray[i][0] < firstNameArray[i+1][0]) {
                val buffer = firstNameArray[i+1]
                firstNameArray[i+1] = firstNameArray[i]
                firstNameArray[i] = buffer
                val intBuffer = firstNumArray[i+1]
                firstNumArray[i+1] = firstNumArray[i]
                firstNumArray[i] = intBuffer
            }
        }
    }

    printArray(firstNumArray)
}

fun printArray(array: Array<Int>) {
    print("[")
    for (i in 0 until array.size)
        print(array[i].toString() + ", ")
    print("\b\b]\n")
}