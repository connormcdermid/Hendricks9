import java.util.Scanner
import kotlin.system.exitProcess

/**
 * @author Frank Gomes
 * @version 0.1
 * @lab MidYear Coding OPTION 2
 * @date 11-02-19
 * @extra
 **/

var kbd = Scanner(System.`in`)

fun main() {
    println("Which college would you like to see?\n 1. MIT\n 2. Harvard\n 3. CCM")
    val input = kbd.nextInt()
    when (input) {
        1 -> mit()
        2 -> harvard()
        3 -> ccm()
        else -> {
            print("That was not a recognized input.")
            main()
        }
    }
}

fun anotherCollege() {
    println("Would you like to see another college?")
    val input= kbd.next()
    when (input) {
        "y", "Y", "yes" -> main()
        "n", "N", "no" -> exitProcess(0)
        else -> {
            println("That was not a recognized input.")
            anotherCollege()
        }
    }
}

fun mit() {
    println("Massachusetts Institute of Technology\n2019 Enrollment: 2,024\nPercentage of women: 43%\nUndergraduate tuition: $45,278\nFun fact: Professor Anant Agarwal has a nice mustache.")
    anotherCollege()
}

fun harvard() {
    println()
    anotherCollege()
}

fun ccm() {
    println()
    anotherCollege()
}