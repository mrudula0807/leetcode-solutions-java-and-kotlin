class Solution {
    fun buildArray(nums: IntArray): IntArray {
        
        val n = nums.size

        //encode old and new values together
        for(i in nums.indices){
            nums[i] += (nums[nums[i]] % n) * n
        }

        //keep only the new values
        for(i in nums.indices){
            nums[i] /= n
        }

        return nums
    }
}
