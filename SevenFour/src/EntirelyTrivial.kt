import java.io.FileWriter
import java.io.PrintWriter
import java.util.*

/*
  author: Frank Gomes
  lab: 7.4 Trivial Pursuit Lab
  date: 22-03-19
  extra:
 */

fun main() {
    // Array containing all of the questions
    val question1 = arrayOf("How many years was rapper Daniel Hernandez originally sentenced to?", " 1. 40 years", " 2. 47 years", " 3. 25 years", " 4. 69 Years", "2")
    val question2 = arrayOf("What is the capital of Peru?", " 1. Lima", " 2. São Paulo", " 3. Bogota", " 4. Mexico City", "1")
    val question3 = arrayOf("What was the most watched UK TV programme?", " 1. M*A*S*H", " 2. BBC's Sherlock", " 3. The Office", " 4. Eastenders", "")
    val question4 = arrayOf("What railway linked Moscow and Irkutsk in 1900?", " 1. Shinkansen Line", " 2. Trans-Siberian Railway", " 3. Sakhalin's Railway", " 4. Allegro Line", "2")
    val question5 = arrayOf("What's another common name for the water moccasin?", " 1. Brownmouth", " 2. Sea moccasin", " 3. Shoe Snake", " 4. Cottonmouth", "4")

    // Creates PrintWriter to write to score.txt
    val scoreFile = FileWriter("SevenFour/output/score.txt", true)
    val pw = PrintWriter(scoreFile)
    // Adds a divider to the file to keep run entries separate
    pw.println("---------------------")
    // Creates Scanner to read user input
    val kbd = Scanner(System.`in`)
    // Gets user info
    println("Please enter your first name.")
    pw.print("\nName: " + kbd.next())
    println("Please enter your last name.")
    pw.print(" " + kbd.next())
    // Introduces trivia show
    println("Welcome to Generic Uncopyrighted Trivia Game!\nHow was your day?")
    Thread.sleep(2000)
    println("I don't care.")


    // Closes PrintWriter & FileWriter
    pw.close()
    scoreFile.close()
}