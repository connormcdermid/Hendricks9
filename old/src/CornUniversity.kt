/**
 * @author Frank Gomes
 * @version 0.1
 * @lab MidYear Coding OPTION 2
 * @date 11-02-19
 * @extra i wrote it in kotlin
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
    println("Massachusetts Institute of Technology\n2019 Enrollment: 2,024 students\nPercentage of women: 43%\nUndergraduate tuition: $45,278\nFun fact: Professor Anant Agarwal has a nice mustache.")
    anotherCollege()
}

fun harvard() {
    println("Harvard University\n2019 Enrollment: 6,766 students\nPercent of women: %48\nUndergraduate Tuition: $45,278\nFun fact: Harvard was founded before Calculus existed.")
    anotherCollege()
}

fun ccm() {
    println("County College of Morris\n2019 Enrollment: 8,447 students\nPercent of women: %48\nUndergraduate Tuition: $8,200\nFun fact: Students from the Morris County Vocational School can attend CCM for their senior year.")
    anotherCollege()
}