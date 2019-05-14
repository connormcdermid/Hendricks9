/*
  author: Frank Gomes
  lab: 8.16 Project Project FBI Program
  date: 08-05-19
  extra: Allows user to select between the different inspectors
 */

import kotlin.system.exitProcess

fun main() {
    // Array of suspects
    // Name, address, state, age, sex, salary, savings, car, year
    val suspectNames = arrayOf("Bowman", "Walker", "Christian", "Edwards", "Cummings", "Halpern", "Scott", "Rhineheart", "Haley", "Brooks")
    val suspectAddresses = arrayOf("Canaan", "Newark", "Hardwick", "Montgomery", "Trenton", "Liverpool", "Sheridan", "Houston", "Westfield", "Syosset")
    val suspectState = arrayOf("CT", "NJ", "VT", "AL", "NJ", "NY", "WY", "TX", "NJ", "NY")
    val suspectAge = arrayOf(48, 39, 46, 71, 31, 38, 51, 62, 22, 32)
    val suspectSex = arrayOf('M', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M')
    val suspectSalary = arrayOf(18000, 27000, 59000, 78000, 25000, 45000, 19000, 91000, 33000, 40000)
    val suspectSavings = arrayOf(4200, 3600, 1900, 500, 7800, 12000, 400, 53200, 4700, 3900)
    val suspectCar = arrayOf("Saturn" + "Olds" + "Chev" + "Chev" + "Ford" + "Chev" + "Ford" + "Cad" + "Honda" + "Ford")
    val suspectCarYear = arrayOf(2009 + 2006 + 2010 + 2013 + 2009 + 2012 + 2008 + 2017 + 2004 + 2011)
    // Sorts all arrays by name
    // Temporary buffers for storing the value of the position after the one being compared
    var bubbleBuffer: String
    var intBuffer: Int
    var charBuffer: Char
    // While loop that iterates until the array is sorted
    while (true) {
        // A boolean that tracks whether there has been a swap in the iteration of the loop
        var swapped = false
        // Goes through each pair of items in the array and checks if they are in order
        for (i in 0 until 10) {
            try {
                // If the pair is not in alphabetical, it swaps them
                if (suspectNames[i][0] > suspectNames[i + 1][0]) {
                    // Swaps around the suspectNames
                    bubbleBuffer = suspectNames[i + 1]
                    suspectNames[i + 1] = suspectNames[i]
                    suspectNames[i] = bubbleBuffer
                    // Swaps around the suspectAddresses
                    bubbleBuffer = suspectAddresses[i + 1]
                    suspectAddresses[i + 1] = suspectAddresses[i]
                    suspectAddresses[i] = bubbleBuffer
                    // Swaps around the suspectState
                    bubbleBuffer = suspectState[i + 1]
                    suspectState[i + 1] = suspectState[i]
                    suspectState[i] = bubbleBuffer
                    // Swaps around the suspectAge
                    intBuffer = suspectAge[i + 1]
                    suspectAge[i + 1] = suspectAge[i]
                    suspectAge[i] = intBuffer
                    // Swaps around the suspectSex
                    charBuffer = suspectSex[i + 1]
                    suspectSex[i + 1] = suspectSex[i]
                    suspectSex[i] = charBuffer
                    // Swaps around the suspectSalary
                    intBuffer = suspectSalary[i + 1]
                    suspectSalary[i + 1] = suspectSalary[i]
                    suspectSalary[i] = intBuffer
                    // Swaps around the suspectSavings
                    intBuffer = suspectSavings[i + 1]
                    suspectSavings[i + 1] = suspectSavings[i]
                    suspectSavings[i] = intBuffer
                    // Swaps around the suspectCar
                    bubbleBuffer = suspectCar[i + 1]
                    suspectCar[i + 1] = suspectCar[i]
                    suspectCar[i] = bubbleBuffer
                    // Swaps around the suspectCarYear
                    intBuffer = suspectCarYear[i + 1]
                    suspectCarYear[i + 1] = suspectCarYear[i]
                    suspectCarYear[i] = intBuffer
                    // Sets swapped to true to keep track of swaps
                    swapped = true
                }
            } catch (e: ArrayIndexOutOfBoundsException) {
                continue
            }
        }
        // Checks to see if any swaps were made this iteration. If not, then the sort is complete and the loop can break
        if (!swapped)
            break
    }
    inspectorSelect(suspectNames,suspectAddresses,suspectState,suspectAge,suspectSex,suspectSalary,suspectSavings,suspectCar,suspectCarYear)
}

//  Allows user to consult each detective
fun inspectorSelect(suspectNames: Array<String>, suspectAddresses: Array<String>, suspectState: Array<String>, suspectAge: Array<Int>, suspectSex: Array<Char>, suspectSalary: Array<Int>, suspectSavings: Array<Int>, suspectCar: Array<String>, suspectCarYear: Array<Int>) {
    println("Which detective do you want to talk to?\n 1. Inspector Holmes\n 2. Inspector Clouseau\n 3. Inspector Simon\n 4. Pink Panther\n Exit: exit")
    when (readLine()!!) {
        "1" -> {
            println("Holmes: ")
            for (i2 in 0 until 10)
                if (suspectAge[i2] > 30 && suspectCar[i2] == "Ford" && suspectSalary[i2] > 20000 && suspectSex[i2] == 'M')
            println("------------")
        }
        "2" -> {
            println("Clouseau: ")
            for (i2 in suspectNames.indices)
                try {
                    if (suspectSalary[i2] > 15000 && suspectSavings[i2] < 2000 && (suspectCar[i2] == "Chev" || suspectCar[i2] == "Ford" || suspectCar[i2] == "Honda"))
                        println(suspectNames[i2])
                } catch (e: ArrayIndexOutOfBoundsException) {
                    continue
                }
            println("------------")
        }
        "3" -> {
            println("Simon: ")
            for (i2 in suspectNames.indices)
                try {
                    if (suspectSex[i2] == 'F')
                        println("${suspectNames[i2]} ${suspectCar[i2]} ${suspectCarYear[i2]}")
                } catch (e: ArrayIndexOutOfBoundsException) {
                    continue
                }
            println("------------")
        }
        "4" -> {
            println("Pink Panther: ")
            for (i2 in suspectNames.indices)
                try {
                    if (suspectSex[i2] == 'M' && suspectAge[i2] < 35 && suspectCar[i2] == "Ford" && suspectState[i2] == "NJ")
                        println(suspectNames[i2])
                } catch (e: ArrayIndexOutOfBoundsException) {
                    continue
                }
            println("------------")
        }
        "exit" -> exitProcess(0)
    }
    inspectorSelect(suspectNames,suspectAddresses,suspectState,suspectAge,suspectSex,suspectSalary,suspectSavings,suspectCar,suspectCarYear)
}
