import java.io.FileWriter
import java.io.PrintWriter
import java.util.*
import kotlin.random.Random

/*
  author: Frank Gomes
  lab: 7.4 Trivial Pursuit Lab
  date: 22-03-19
  extra:
 */

fun main() {
    // Array containing all of the questions
    val question0 = arrayOf("What is the name of Barack Obama's dog?", " 1. Spot", " 2. Fido", " 3. Small Obama", " 4. Bo", "4")
    val question1 = arrayOf("How many years was rapper Daniel Hernandez originally sentenced to?", " 1. 40 years", " 2. 47 years", " 3. 25 years", " 4. 69 Years", "2")
    val question2 = arrayOf("What is the capital of Peru?", " 1. Lima", " 2. São Paulo", " 3. Bogota", " 4. Mexico City", "1")
    val question3 = arrayOf("What was the most watched UK TV programme?", " 1. M*A*S*H", " 2. BBC's Sherlock", " 3. The Office", " 4. Eastenders", "4")
    val question4 = arrayOf("What railway linked Moscow and Irkutsk in 1900?", " 1. Shinkansen Line", " 2. Trans-Siberian Railway", " 3. Sakhalin's Railway", " 4. Allegro Line", "2")
    val question5 = arrayOf("What's another common name for the water moccasin?", " 1. Brownmouth", " 2. Sea moccasin", " 3. Shoe Snake", " 4. Cottonmouth", "4")
    val question6 = arrayOf("Leader of terrorist group al-Qaeda, Osama bin Laden, was killed in what year?", " 1. 2004", " 2. 1994", " 3. 2011", " 4. 2013", "3")
    val question7 = arrayOf("Which country is the city Tbilisi located in?", " 1. Georgia", " 2. Romania", " 3. Greece", " 4. Peru", "1")
    val question8 = arrayOf("The games convention PAX West is held where?", " 1. Boston, MA", " 2. Seattle, WA", " 3. San Antonio, TX", " 4. Everett, WA", "2")
    val question9 = arrayOf("Rapper Gunna released which album in 2018?", " 1. Drip Too Hard", " 2. Drip or Drown", " 3. Drip Harder", " 4. Drip or Drown 2", "3")
    val question10 = arrayOf("The original Nintendo 3DS was released in the US in what year?", " 1. 2011", " 2. 2012", " 3. 2010", " 4. 2008", "1")
    val question11 = arrayOf("The city of Warsaw is in what country?", " 1. Romania", " 2. Poland", " 3. Iran", " 4. Uruguay", "2")
    val question12 = arrayOf("The red fox is part of what family?", " 1. Vulpes", " 2. Carnivora", " 3. Canidae", " 4. Canis", "3")
    val question13 = arrayOf("The Arduino microcontroller gets its name from which language?", " 1. Greek", " 2. French", " 3. Afrikaans", " 4. Italian", "4")
    val question14 = arrayOf("Game developer Scott Cawthon is responsible for what game?", " 1. Five Nights at Freddy's", " 2. Undertale", " 3. Tacoma", " 4. ABZU", "1")
    val questionArray = arrayOf(question0, question1, question2, question3, question4, question5, question6, question7, question8, question9, question10, question11, question12, question13, question14)


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
    pw.print(" " + kbd.next() + "\n")

    // Introduces trivia show
    println("Welcome to Generic Uncopyrighted Trivia Game!\nHow was your day?")
    Thread.sleep(2000)
    println("I don't care.")
    print("\nAre you ready?")
    Thread.sleep(1000)
    print(" No?")
    Thread.sleep(1000)
    print(" Too bad.\n")

    // Array to prevent reuse of questions
    var questionUsed = intArrayOf(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)

    // Questions
    for (i in 1..15) {
        var currentQuestion: Int = Random.nextInt(15)
        print("\nQuestion $i: ")
        while (questionUsed[currentQuestion] != 0) {
            currentQuestion = Random.nextInt(15)
        }
        print(questionArray[currentQuestion][0])
        questionUsed[currentQuestion] = 1
        print(questionArray[currentQuestion][1])

    }

    // Closes PrintWriter & FileWriter
    pw.close()
    scoreFile.close()
}
