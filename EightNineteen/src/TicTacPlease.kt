fun main() {
    // Array for grid
    val grid = Array(3) { CharArray(3) }
    println("Show directions?")
    if (readLine()!![1].toLowerCase() == 'y')
        welcome()
}

fun welcome() {
    println("Welcome to Tic-Tac-Toe!\nThe goal is to get three X's in a row. Place your X's on the board by specifying the coordinates of your move.")
}