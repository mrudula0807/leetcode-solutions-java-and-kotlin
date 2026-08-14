class Solution {
    fun leftRightDifference(nums: IntArray): IntArray {
        
        val n = nums.size
        val ans = IntArray(n)
        var totalSum = 0

        for(num in nums){
            totalSum += num
        }

        var leftSum = 0

        for(i in nums.indices){
            val rightSum = totalSum - leftSum - nums[i]

            ans[i] = abs(leftSum - rightSum)
            leftSum += nums[i]
        }

        return ans
    }
}
