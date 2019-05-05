/*
  author: Frank Gomes
  lab: 8.12 Worksheet Banners
  date: 30-04-19
  extra: Randomly chooses between Keanu Reeves and Carrie-Ann Moss
 */

import kotlin.random.Random

fun main() {
    // The announcement, school-appropriate
    println("The Matrix, starring whoever we feel like it having")
    // Prints 3 banners
    for (i in 1..3) {
        println("=============" + "\n" +
                "|     O     |" + "\n" +
                "|    /|\\    |" + "\n" +
                "|    /'\\    |" + "\n" +
                "| the matrix|" + "\n" +
                "=============" + "\n")
        when (i) {
            1 -> println("The Matrix has you.")
            2 -> println("Follow the white rabbit.")
            3 -> println("Knock, knock, Neo.")
        }
    }
    // Randomly decides between the two actors
    val randomGenerator = Random
    val actor = if (randomGenerator.nextInt(11) > 5) {
        "Keanu Reeves"
    } else {
        "Carrie-Ann Moss"
    }
    // Prints last name, a comma, and then the first name.
    println(actor.substringAfter(' ') + ", " + actor.substringBefore(' '))
    println("=====================\n" +
            "|  0      O      o  |\n" +
            "| /|\\    /|\\    /|\\ |\n" +
            "| /'\\    /'\\    /|\\ |\n" +
            "|  the matrix again |\n" +
            "=====================\n")
    // Array of names, as specified in the worksheet
    val nameArray = arrayOf("Neo", "Morpheus", "Trinity", "Smith", "Mouse", "Cypher")
    // Sorts array of names
    nameArray.sort()
    println(nameArray.toList())
}