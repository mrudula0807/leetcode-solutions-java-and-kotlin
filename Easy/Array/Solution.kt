class Solution {
    fun buildArray(nums: IntArray): IntArray {
        
        val res = IntArray(nums.size)

        for(i in nums.indices){
            res[i] = nums[nums[i]]
        }

        return res
    }
}
