fun main() {
    // Grid of snake sightings
    val grid = arrayOf(
            arrayOf('5', '1', '3', '1', '2', '4', '2', '1'),
            arrayOf('2', '4', '0', '3', '1', '4', '3', '2'),
            arrayOf('6', '1', '5', '2', '1', '5', '4', '1'),
            arrayOf('2', '3', '4', '1', '2', '2', '1', '0'),
            arrayOf('4', '1', '4', '2', '6', '4', '2', '3'),
            arrayOf('1', '3', '3', '3', '4', '1', '5', '2')
    )
    for (i in 1 until grid.size) {
        for (j in grid[i].indices) {
            try {
                if ((grid[i][j-1].toInt() + grid[i][j].toInt() + grid[i-1][j].toInt() + grid[i+1][j].toInt()) > 15)
                    grid[i][j] = 'd'
            } catch (e: ArrayIndexOutOfBoundsException) {
                e.stackTrace
            }
        }
    }
}