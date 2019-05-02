import kotlin.random.Random.Default.nextInt

fun main() {
    // Provided magic square
    val magicSquare = arrayOf(intArrayOf(16, 3, 2, 13), intArrayOf(5, 10, 11, 8), intArrayOf(9, 6, 7, 12), intArrayOf(4, 15, 14, 1))
    // A "magic" square I just made
    val notSoMagicSquare = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 1), intArrayOf(1, 1, 1))
    // Generates a square of random values
    val randomSquare = arrayOf(intArrayOf(nextInt(51), nextInt(51), nextInt(51), nextInt(51)), intArrayOf(nextInt(51), nextInt(51), nextInt(51), nextInt(51)), intArrayOf(nextInt(51), nextInt(51), nextInt(51), nextInt(51)), intArrayOf(nextInt(51), nextInt(51), nextInt(51), nextInt(51)))

}

// Method to check the square is valid
fun squareCheck(square: Array<IntArray>): Boolean {
    var previousSum = 0
    // Checks for every row
    for (i in 0 until square.size) {
        // The sum of the current row
        var currentSum = 0
        // Adds every item in the row to currentSum
        for (i2 in 0 until square[i].size)
            currentSum += square[i][i2]
        // Skips previousSum check at the first iteration
        if (i == 0)
            continue
        // Checks if the previous row had the same sum at the current one
        if (currentSum != previousSum)
            return false

        else
            previousSum = currentSum
    }
    // Checks every column

}