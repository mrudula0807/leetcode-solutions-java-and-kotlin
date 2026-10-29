class Solution {
    fun maxAdjacentDistance(nums: IntArray): Int {
        
        val n = nums.size
        var maxDiff = 0

        for(i in 0 until n){
            val next = (i + 1) % n
            val diff = abs(nums[i] - nums[next])

            maxDiff = maxOf(maxDiff, diff)
        }

        return maxDiff
    }
}
