package `in`.shivamagarwal.problems

import kotlin.math.abs

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 */
class SquaresOfASortedArray {
    fun sortedSquares(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var left = 0
        var right = nums.size - 1
        for (i in nums.size - 1 downTo 0) {
            if (abs(nums[left]) < abs(nums[right])) {
                result[i] = (nums[right] * nums[right])
                right--
            } else {
                result[i] = (nums[left] * nums[left])
                left++
            }
        }
        return result
    }
}

fun main() {
    val squaresOfASortedArray = SquaresOfASortedArray()
    squaresOfASortedArray.sortedSquares(intArrayOf(-4,-1,0,3,10)).forEach { print("$it ") }
    println()
    squaresOfASortedArray.sortedSquares(intArrayOf(-7,-3,2,3,11)).forEach { print("$it ") }
}