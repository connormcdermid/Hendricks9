import kotlin.random.Random

/*
  author: Frank Gomes
  lab: 8.4 Worksheet Orange Sequential Search
  date: 09-04-19
  extra: generates random values for the array each time
 */

fun main() {
    // Array of fruits
    var array = arrayOf("","","","","","","","","","")
    // Key value
    val key = "orange"
    // Amount of matches found
    var foundValues = 0
    // Sets every item to a random fruit
    for (i in 1..10)
        array[i - 1] = randomize()
    // Checks if the item in the array is an orange
    for (i in 1..10)
        if (array[i-1].equals(key))
            foundValues++
    println("Matches found: $foundValues")
}

fun randomize(): String {
    // Array of possible fruits
    val fruits = arrayOf("strawberry","pineapple","orange","pear","blueberry","raspberry","starfruit","pomegranate","dragonfruit","banana","grapefruit","passionfruit")
    return fruits[Random.nextInt(fruits.size - 1)]
}