object Visualize {
    @Throws(OutOfRangeException::class)
    fun histogram(nums: IntArray) {
        // First is 1 to 10, second is 11 to 20, all the way to tenth being 91-100
        var first = 0; var second = 0; var third = 0; var fourth = 0; var fifth = 0; var sixth = 0; var seventh = 0; var eighth = 0; var ninth = 0; var tenth = 0
        // Adds every value in the array to its corresponding range
        for (i in nums.indices) {
            // If provided number is greater than 100 or less than 0 throws OutOfRangeException
            if (nums[i] < 0 || nums[i] > 100)
                throw OutOfRangeException("Value $i provided was out of range 0..100.")
            if (nums[i] in 0..10)
                first++
            if (nums[i] in 11..20)
                second++
            if (nums[i] in 21..30)
                third++
            if (nums[i] in 31..40)
                fourth++
            if (nums[i] in 41..50)
                fifth++
            if (nums[i] in 51..60)
                sixth++
            if (nums[i] in 61..70)
                seventh++
            if (nums[i] in 71..80)
                eighth++
            if (nums[i] in 81..90)
                ninth++
            if (nums[i] in 91..100)
                tenth++
        }
        // Prints histogram
        for (i in 0 until first)
            print("*")
        println()
        for (i in 0 until second)
            print("*")
        println()
        for (i in 0 until third)
            print("*")
        println()
        for (i in 0 until fourth)
            print("*")
        println()
        for (i in 0 until fifth)
            print("*")
        println()
        for (i in 0 until sixth)
            print("*")
        println()
        for (i in 0 until seventh)
            print("*")
        println()
        for (i in 0 until eighth)
            print("*")
        println()
        for (i in 0 until ninth)
            print("*")
        println()
        for (i in 0 until tenth)
            print("*")
        println()
    }
}

// OutOfRangeException - an exception thrown when the given int is not within range.
internal class OutOfRangeException(message: String): Exception(message)

fun main() {
    Visualize.histogram(intArrayOf(26, 19, 45, 22, 79, 35, 21, 4, 76, 45, 56, 90, 88, 32, 45, 3, 66, 74, 77, 35, 24, 33, 42, 55, 76, 74, 88, 90))
}