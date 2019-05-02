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

    val randomGenerator = Random
    val actor: String
    if (randomGenerator.nextInt(11) > 5) {
        actor = "Keanu Reeves"
    } else {
        actor = "Carrie-Ann Moss"
    }
    println(actor.substringAfter(' ') + ", " + actor.substringBefore(' '))
}