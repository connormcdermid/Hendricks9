/*
  author: Frank Gomes
  lab: 8.11 Project Eyeball Video
  date: 27-04-19
  extra: Prints list of on-time customers
 */

import java.util.Arrays
import java.util.Comparator
import kotlin.system.exitProcess

fun main() {
    val people = arrayOfNulls<Person>(10)
    val customers = arrayOf(
            arrayOf("Tummalaprogress, Puget","000001","421", "5", "14"),
            arrayOf("Ketha, Agranya", "000002", "420", "5", "3"),
            arrayOf("Sundar, Harish", "000003", "134", "1", "6"),
            arrayOf("Chauhan, Rahul", "000004", "102", "5", "2"),
            arrayOf("Wick, John", "000005", "306", "1", "0"),
            arrayOf("Tramiel, Jack", "000064", "128", "5", "6502"),
            arrayOf("Herd, Bil", "000128", "128", "1", "1"),
            arrayOf("Eyeah, Eyeah", "000134", "208", "5", "4"),
            arrayOf("Silenosti, Mishovy", "000280", "211", "1", "1"),
            arrayOf("Reptile, Amphibious", "000291", "202", "5", "4"),
            arrayOf("Shibe, Carrot", "000333", "502", "5", "3"))
    for (i in 0..9) {
        people[i] = Person()
        for (arr in customers) {
            for (j in 0..4) {
                when (j) {
                    0 -> people[i]!!.name = arr[j]
                    1 -> people[i]!!.customerID = Integer.parseInt(arr[j])
                    2 -> people[i]!!.movie = Integer.parseInt(arr[j])
                    3 -> people[i]!!.code = Integer.parseInt(arr[j])
                    4 -> people[i]!!.day = Integer.parseInt(arr[j])
                    else -> {
                        println("An error has occurred.")
                        exitProcess(-1)
                    }
                }
            }
        }
    }

    //Process data:
    var counter = 0
    for (person in people) {
        if (person!!.isLate) {
            counter++
        }
    }
    println("$counter overdue customers.")
    val comp = Comparator.comparingInt<Person> { o -> o.customerID }
    Arrays.sort<Person>(people, comp)
    println("People who are late:")
    for (person in people) {
        if (person!!.isLate) {
            println(person.name)
        }
    }
    println("Customers on time:")
    for (person in people) {
        if (!person!!.isLate) {
            println(person.name)
        }
    }
}

internal class Person {
    var name: String? = null
    var customerID: Int = 0
    var movie: Int = 0
    var code: Int = 0
    var day: Int = 0
    val isLate: Boolean
        get() = day > code
}
