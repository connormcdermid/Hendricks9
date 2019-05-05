/*
  author: Frank Gomes
  lab: 8.13 Worksheet Matrices
  date: 02-05-19
  extra: Makes a random square & tests it
 */

import kotlin.random.Random.Default.nextInt

fun main() {
    // Provided magic square
    val magicSquare = arrayOf(
            intArrayOf(16, 3, 2, 13),
            intArrayOf(5, 10, 11, 8),
            intArrayOf(9, 6, 7, 12),
            intArrayOf(4, 15, 14, 1)
    )
    // A "magic" square I just made
    val notSoMagicSquare = arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 1, 1),
            intArrayOf(1, 1, 1)
    )
    // Generates a square of random values
    val randomSquare = arrayOf(
            intArrayOf(nextInt(51), nextInt(51), nextInt(51), nextInt(51)),
            intArrayOf(nextInt(51), nextInt(51), nextInt(51), nextInt(51)),
            intArrayOf(nextInt(51), nextInt(51), nextInt(51), nextInt(51)),
            intArrayOf(nextInt(51), nextInt(51), nextInt(51), nextInt(51))
    )
    println("Square magicSquare: ${squareCheck(magicSquare)}")
    println("Square notSoMagicSquare: ${squareCheck(notSoMagicSquare)}")
    println("Square randomSquare: ${squareCheck(randomSquare)}")
}

// Method to check the square is valid
fun squareCheck(square: Array<IntArray>): Boolean {
    var previousSum = 0
    // Checks for every row
    for (i in square.indices) {
        // The sum of the current row
        var currentSum = 0
        // Adds every item in the row to currentSum
        for (i2 in square[i].indices)
            currentSum += square[i][i2]
        // Skips previousSum check at the first iteration
        if (i == 0) {
            previousSum = currentSum
            continue
        }
        // Checks if the previous row had the same sum at the current one
        if (currentSum != previousSum)
            return false
        else
            previousSum = currentSum
    }
    // Resets previousSum variable for use in column scan
    previousSum = 0
    // Checks every column
    for (i in square[0].indices) {
        // Sum of the current column
        var currentSum = 0
        // Adds every item in the column to currentSum
        for (i2 in square.indices)
            currentSum += square[i][i2]
        // Skips previousSum check at the first iteration
        if (i == 0) {
            previousSum = currentSum
            continue
        }
        // Checks if the previous row had the same sum at the current one
        if (currentSum != previousSum)
            return false
        else
            previousSum = currentSum
    }
    // Checks the diagonals
    var LDiagonal = 0
    var RDiagonal = 0
    var i2 = 0
    // Gets value of top-left to bottom-right diagonal
    for (i in square[0].indices) {
        LDiagonal += square[i][i2]
        i2++
    }
    i2 = 1
    // Gets value of top-right to bottom-left diagonal
    for (i in square[0].indices) {
        RDiagonal += square[i][square.size - i2]
        i2++
    }
    if (RDiagonal != LDiagonal)
        return false
    // Returns true if all checks pass
    return true
}