import kotlin.system.exitProcess

fun main() {
    val nameArray = arrayOf("Barney Fife","Luke Skywalker","Cruella Deville","Sally Smith","Marsha Brady","Gomez Addams","John Adams","Marie Antoinette","Albert Einstein","Mick Jagger","Mickey Mouse")
    val addressArray = arrayOf("10 Warbler Rd.","R2 Death Star Ave.","123 Witchey Way","3862 Street Blvd.","1970 Groovy Street","1 Spooky Circle","3445 Presidential Plaza","2 Rue Morgue","7 Relativity Rd.","100 Rolling Stone Path","2 Disney Lane")
    val cityArray = arrayOf("Mountainville, SC 34765", "Jupiter, MD 44623", "Hollywood, CA 12345", "Springfield, IL 31733", "Arlington, VA 51266", "Tombstone, AZ 63341", "New York, NY 11220", "New Orleans, LA 25993", "Topeka KS 63121", "Seattle, WA 23733", "Orlando, FL 72272")
    println("What would you like to do?\n 1. Sort by last name\n 2. Sort by street name\n 3. Sort by city name\n 4. Sort by zip code")
    when (readLine()!!) {
        "1" -> lastNameSort(nameArray, addressArray, cityArray)
        "2" -> streetNameSort(nameArray, addressArray, cityArray)


        "quit" -> exitProcess(0)
    }
}

fun lastNameSort(nameArray: Array<String>, addressArray: Array<String>, cityArray: Array<String>) {
    // Temporary buffer for storing the value of the position after the one being compared
    var bubbleBuffer: String
    // While loop that iterates until the array is sorted
    while (true) {
        // A boolean that tracks whether there has been a swap in the iteration of the loop
        var swapped = false
        // Goes through each pair of items in the array and checks if they are in order
        for (i in 0 until nameArray.size) {
            try {
                // If the pair is not in alphabetical, it swaps them
                if (nameArray[i].substringAfter(' ') > nameArray[i + 1].substringAfter(' ')) {
                    // Swaps around the nameArray
                    bubbleBuffer = nameArray[i + 1]
                    nameArray[i + 1] = nameArray[i]
                    nameArray[i] = bubbleBuffer
                    // Swaps around the addressArray
                    bubbleBuffer = addressArray[i + 1]
                    addressArray[i + 1] = addressArray[i]
                    addressArray[i] = bubbleBuffer
                    // Swaps around the cityArray
                    bubbleBuffer = cityArray[i + 1]
                    cityArray[i + 1] = cityArray[i]
                    cityArray[i] = bubbleBuffer
                    // Sets swapped to true to keep track of swaps
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
    // Prints array
    for (i in 0 until nameArray.size)
        println(nameArray[i] + "; " + addressArray[i] + "; " + cityArray[i])
}

fun streetNameSort(nameArray: Array<String>, addressArray: Array<String>, cityArray: Array<String>) {
    // Temporary buffer for storing the value of the position after the one being compared
    var bubbleBuffer: String
    // While loop that iterates until the array is sorted
    while (true) {
        // A boolean that tracks whether there has been a swap in the iteration of the loop
        var swapped = false
        // Goes through each pair of items in the array and checks if they are in order
        for (i in 0 until nameArray.size) {
            try {
                // If the pair is not in alphabetical, it swaps them
                if (addressArray[i].substringAfter(' ') > addressArray[i + 1].substringAfter(' ')) {
                    // Swaps around the nameArray
                    bubbleBuffer = nameArray[i + 1]
                    nameArray[i + 1] = nameArray[i]
                    nameArray[i] = bubbleBuffer
                    // Swaps around the addressArray
                    bubbleBuffer = addressArray[i + 1]
                    addressArray[i + 1] = addressArray[i]
                    addressArray[i] = bubbleBuffer
                    // Swaps around the cityArray
                    bubbleBuffer = cityArray[i + 1]
                    cityArray[i + 1] = cityArray[i]
                    cityArray[i] = bubbleBuffer
                    // Sets swapped to true to keep track of swaps
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
    // Prints array
    for (i in 0 until nameArray.size)
        println(nameArray[i] + "; " + addressArray[i] + "; " + cityArray[i])
}

