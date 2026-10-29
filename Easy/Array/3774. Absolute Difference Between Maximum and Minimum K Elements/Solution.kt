class Solution {
    fun absDifference(nums: IntArray, k: Int): Int {
        
        val sorted = nums.sorted()

        val sumSmallest = sorted.take(k).sum()
        val sumLargest = sorted.takeLast(k).sum()

        return abs(sumLargest - sumSmallest)
    }
}
