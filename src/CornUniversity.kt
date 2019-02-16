import java.util.Scanner

/**
 * @author Frank Gomes
 * @version 0.1
 * @lab MidYear Coding OPTION 2
 * @date 11-02-19
 * @extra
 **/


fun main() {
    var kbd = Scanner(System.`in`)
    println("Which college would you like to see?\n 1. MIT\n 2. Harvard\n 3. CCM")
    var input = kbd.nextInt()
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

fun mit() {
    print("Massachusetts Institute of Technology\n2019 Enrollment: 2,024\nPercentage of women: 43%\nUndergraduate tuition: $45,278\nFun fact: Professor Anant Agarwal has a nice mustache.")

}

fun harvard() {

}

fun ccm() {

}