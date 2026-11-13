class Solution {
    fun missingNumber(nums: IntArray): Int {
        
        val n = nums.size

        var res = n

        for(i in nums.indices){
            res = res xor i
            res = res xor nums[i]
        }

        return res
    }
}
