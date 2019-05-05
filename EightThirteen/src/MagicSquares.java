import java.util.Random;

public class MagicSquares {

    public static void main(String[] args) {
        // Provided magic square
        int[][] magicSquare = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}
        };
        // A "magic" square I just made
        int[][] notSoMagicSquare = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        // Generates a square of random values
        Random rand = new Random();
        int[][] randomSquare = {
                {rand.nextInt(51), rand.nextInt(51), rand.nextInt(51), rand.nextInt(51)},
                {rand.nextInt(51), rand.nextInt(51), rand.nextInt(51), rand.nextInt(51)},
                {rand.nextInt(51), rand.nextInt(51), rand.nextInt(51), rand.nextInt(51)},
                {rand.nextInt(51), rand.nextInt(51), rand.nextInt(51), rand.nextInt(51)}
        };
    }

    // Method to check the square is valid
    private static boolean squareCheck(int[][] square) {
        int previousSum = 0;
        // Checks for every row
        for (int i = 0; i < square.length; i++) {
            // The sum of the current row
            int currentSum = 0;
            // Adds every item in the row to currentSum
            for (int i2 = 0; i < square[i].length; i++)
                currentSum += square[i][i2];
            // Skips previousSum check at the first iteration
            if (i == 0) {
                previousSum = currentSum;
                continue;
            }
            // Checks if the previous row had the same sum at the current one
            if (currentSum != previousSum)
                return false;
            else
                previousSum = currentSum;
        }
        // Resets previousSum variable
        previousSum = 0;
        // Checks every column
        for (int j = 0; j < square[0].length; j++) {
            // Sum of the current column
            int currentSum = 0;
            // Adds every item in the column to currentSum
            for (int j2 = 0; j2 < square.length; j2++)
                currentSum += square[j][0];
            // Skips previousSum check at the first iteration
            if (j == 0) {
                previousSum = currentSum;
                continue;
            }
            // Checks if the previous row had the same sum at the current one
            if (currentSum != previousSum)
                return false;
            else
                previousSum = currentSum;
        }
        return true;
    }
}
