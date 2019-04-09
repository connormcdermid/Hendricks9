import kotlin.random.Random
import kotlin.random.nextInt

/*
  author: Frank Gomes
  lab: 8.4 Worksheet Orange Sequential Search
  date: 09-04-19
  extra: generates random values for the array each time
 */

fun main() {
    var array = arrayOf("","","","","","","","","","")
    var key = "orange"
    // Sets every
    for (i in 1..10) {
        array[i - 1] = randomize()
    }

}

fun randomize(): String {
    // Array of possible fruits
    var fruits = arrayOf("strawberry","pineapple","orange","pear","blueberry","raspberry","starfruit","pomegranate","dragonfruit","banana","grapefruit","passionfruit")
    return fruits[Random.nextInt(fruits.size - 1)]
}