import java.io.File
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