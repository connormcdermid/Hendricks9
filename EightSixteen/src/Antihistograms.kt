object Visualize {
    @Throws(OutOfRangeException::class)
    fun histogram(nums: IntArray) {
        // First is 1 to 10, second is 11 to 20, all the way to tenth being 91-100
        val first = 0; val second = 0; val third = 0; val fourth = 0; val fifth = 0; val sixth = 0; val seventh = 0; val eighth = 0; val ninth = 0; val tenth = 0
        for (i in nums.indices) {
            if (nums[i] < 0 || nums[i] > 100)
                throw OutOfRangeException
            if (0 <= nums[i] <= 10)
                first++
            if (11 <= nums[i] <= 20)
                second++
            if (21 <= nums[i] <= 30)
                third++
            if (31 <= nums[i] <= 40)
                fourth++
            if (41 <= nums[i] <= 50)
                fifth++
            if (51 <= nums[i] <= 60)
                sixth++
            if (61 <= nums[i] <= 70)
                seventh++
            if (71 <= nums[i] <= 80)
                eighth++
            if (81 <= nums[i] <= 90)
                ninth++
            if (91 <= nums[i] <= 100)
                tenth++
        }
    }
}

internal class OutOfRangeException(var id: Int) : Throwable()