/*
  author: Frank Gomes
  lab: 8.15 Project Deadly Desert Map
  date: 08-05-19
  extra: Prints hotspots in red
 */

fun main() {
    // Grid of snake sightings
    val grid = arrayOf(
            arrayOf("5", "1", "3", "1", "2", "4", "2", "1"),
            arrayOf("2", "4", "0", "3", "1", "4", "3", "2"),
            arrayOf("6", "1", "5", "2", "1", "5", "4", "1"),
            arrayOf("2", "3", "4", "1", "2", "2", "1", "0"),
            arrayOf("4", "1", "4", "2", "6", "4", "2", "3"),
            arrayOf("1", "3", "3", "3", "4", "1", "5", "2")
    )
    // Prints original grid
    gridPrinter(grid)
    // Prints marked grid
    gridPrinter(hotspotScan(grid))
}

fun hotspotScan (grid: Array<Array<String>>): Array<Array<String>> {
    // Deep copy of grid to modify
    var grid2 = Array(6){Array(8){""}}
    for (i in grid.indices)
        for (j in grid[i].indices)
            grid2[i][j] = grid[i][j]
    // Sum of number at place in grid & any adjacent places for determining whether or not the spot is a hotspot
    for (i in grid.indices) {
        for (j in grid[i].indices) {
            var sum = 0
            // Adds current position to the sum
            sum += grid[i][j].toInt()
            // Checks if the place left of the current position exists, and if it does, adds it
            if (j != 0)
                sum += grid[i][j-1].toInt()
            // Checks if place left of the current position exists, and if it does, adds it
            if (j != grid[i].size - 1)
                sum += grid[i][j+1].toInt()
            // Checks if place above the current position exists, and if it does, adds it
            if (i != 0)
                sum += grid[i-1][j].toInt()
            // Checks if place below the current position exists, and if it does, adds it
            if (i != grid.size - 1)
                sum += grid[i+1][j].toInt()
            // Checks if total sum of the numbers around the current position & the current position"s value is greater than 15, making it a "hotspot"
            if (sum > 15)
                grid2[i][j] = "\u001b[31mD\u001b[0m"
        }
    }
    return grid2
}

// Prints grids
fun gridPrinter (grid: Array<Array<String>>) {
    print("\n________________\n")
    for (i in grid.indices) {
        for (j in grid[i].indices)
            print("${grid[i][j]} ")
        print("\n")
    }
}
