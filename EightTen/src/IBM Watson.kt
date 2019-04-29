/*
  author: Frank Gomes
  lab: 8.10 Project Sherlock Holmes
  date: 27-04-19
  extra: Does the Fizzbuzz exercise
 */
fun main() {
    // Array of codewords to work with
    val codewords = arrayOf("Nexa2f5", "Z52Bizlm", "Diskapr", "emkem9sD", "LaWYr4Us", "dAStn78L", "mPTuriye", "aaeeiuUu", "IL8Ctmpn")
    // Checks every word in array
    for (i in 0 until codewords.size) {
        // Odd words
        if (i % 2 == 1) {
            print(codewords[i][2]); print(codewords[i][3])
        // Even words
        } else
            print(codewords[i][4])
    }
    fizzbuzz()
}

fun fizzbuzz() {
    for (i in 1..100) {
        when {
            i % 15 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}