/*
  author: Frank Gomes
  lab: 8.19 Tic-Tac-Toe
  date: 17-05-19
  extra: Computer that randomly moves
 */

import kotlin.system.exitProcess

// Array for grid
val grid = Array(3) { CharArray(3) }

fun main() {
    // Asks users if they need directions
    println("Show directions?")
    if (readLine()!![0].toLowerCase() == 'y')
        welcome()
    while (true) {
        playerMove()
        if (playerWin()) {
            showBoard()
            println("You win!")
            exitProcess(0)
        }
        computerMove()
        if (computerWin()) {
            showBoard()
            println("Computer wins!")
            exitProcess(0)
        }
    }
}

// Player's move
fun playerMove() {
    // Prints board
    showBoard()
    // Tells user it's their turn
    print("\nYour move.\n:")
    // Takes user's input and checks to see if it's valid
    var input: String
    while (true) {
        input = readLine()!!
        if (input.matches("(\\d)(,)(\\d)".toRegex()) && input[0].toString().toInt() in 1..3 && input[2].toString().toInt() in 1..3)
            break
        print("\nUnrecognized input or out of bounds. Try again.\n:")
    }
    grid[input[0].toString().toInt() - 1][input[2].toString().toInt() - 1] = 'X'
}

// Checks if the player won
fun playerWin(): Boolean {
    // Checks 1st row horizontal
    if (grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2] == 'X')
        return true
    // Checks 2nd row horizontal
    else if (grid[1][0] == 'X' && grid[1][1] == 'X' && grid[1][2] == 'X')
        return true
    // Checks 3rd row horizontal
    else if (grid[2][0] == 'X' && grid[2][1] == 'X' && grid[2][2] == 'X')
        return true
    // Checks top-left to bottom-right diagonal
    else if (grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X')
        return true
    // Checks top-right to bottom-left diagonal
    else if (grid[0][2] == 'X' && grid[1][1] == 'X' && grid[2][0] == 'X')
        return true
    // Checks column 1 vertical
    else if (grid[0][0] == 'X' && grid[1][0] == 'X' && grid[2][0] == 'X')
        return true
    // Checks column 2 vertical
    else if (grid[0][1] == 'X' && grid[1][1] == 'X' && grid[2][1] == 'X')
        return true
    // Checks column 3 vertical
    else if (grid[0][2] == 'X' && grid[1][2] == 'X' && grid[2][2] == 'X')
        return true
    // If none are filled then returns false
    else
        return false
}

// Computer's random moves
fun computerMove() {
    // Random move
    while (true) {
        val randomRow = (0..2).random()
        val randomColumn = (0..2).random()
        // Checks if randomly selected space is empty, and if it is, moves there
        if (grid[randomRow][randomColumn] == '\u0000'){
            grid[randomRow][randomColumn] = 'O'
            // Stops random selection from reoccurring
            break
        }
    }
    return
}

// Checks if the computer won
fun computerWin(): Boolean {
    // Checks 1st row horizontal
    if (grid[0][0] == 'O' && grid[0][1] == 'O' && grid[0][2] == 'O')
        return true
    // Checks 2nd row horizontal
    else if (grid[1][0] == 'O' && grid[1][1] == 'O' && grid[1][2] == 'O')
        return true
    // Checks 3rd row horizontal
    else if (grid[2][0] == 'O' && grid[2][1] == 'O' && grid[2][2] == 'O')
        return true
    // Checks top-left to bottom-right diagonal
    else if (grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O')
        return true
    // Checks top-right to bottom-left diagonal
    else if (grid[0][2] == 'O' && grid[1][1] == 'O' && grid[2][0] == 'O')
        return true
    // Checks column 1 vertical
    else if (grid[0][0] == 'O' && grid[1][0] == 'O' && grid[2][0] == 'O')
        return true
    // Checks column 2 vertical
    else if (grid[0][1] == 'O' && grid[1][1] == 'O' && grid[2][1] == 'O')
        return true
    // Checks column 3 vertical
    else if (grid[0][2] == 'O' && grid[1][2] == 'O' && grid[2][2] == 'O')
        return true
    // If none are filled then returns false
    else
        return false
}

// Prints board
fun showBoard() {
    println(" │1│2│3│\n" +
            "━╀━╀━╀━┥\n" +
            "1│${grid[0][0]}│${grid[0][1]}│${grid[0][2]}│\n" +
            "━╀━╀━╀━┥\n" +
            "2│${grid[1][0]}│${grid[1][1]}│${grid[1][2]}│\n" +
            "━╀━╀━╀━┥\n" +
            "3│${grid[2][0]}│${grid[2][1]}│${grid[2][2]}│\n" +
            "━┵━┵━┵━┙")
}

// Instructions
fun welcome() {
    println("Welcome to Tic-Tac-Toe!\nThe goal is to get three X's in a row. Place your X's on the board by specifying the coordinates of your move.")
}