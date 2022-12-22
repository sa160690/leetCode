package `in`.shivamagarwal.problems

/**
 * Given an integer array nums, return the third distinct maximum number in this array.
 * If the third maximum does not exist, return the maximum number.
 */
class ThirdMaximumNumber {
    fun thirdMax(nums: IntArray): Int {
        val sortedSet = nums.sorted().toSortedSet().reversed()
        return if(sortedSet.size >=3) sortedSet.drop(2).first() else sortedSet.maxOrNull()!!
    }
}

fun main() {
    val thirdMaximumNumber = ThirdMaximumNumber()
    println(thirdMaximumNumber.thirdMax(intArrayOf(3,2,1)))

    println(thirdMaximumNumber.thirdMax(intArrayOf(1,2)))

    println(thirdMaximumNumber.thirdMax(intArrayOf(0, 0, 0)))

    println(thirdMaximumNumber.thirdMax(intArrayOf(2,2,3,1)))
}