class Solution {
    fun targetIndices(nums: IntArray, target: Int): List<Int> {
        
        val smallerThanTarget = nums.count { it < target }
        val targetCount = nums.count { it == target }

        return (smallerThanTarget until smallerThanTarget + targetCount).toList()
    }
}
