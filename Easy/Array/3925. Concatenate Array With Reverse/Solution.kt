class Solution {
    fun concatWithReverse(nums: IntArray): IntArray {

        val len = nums.size
        val res = IntArray(2 * len)

        for(i in nums.indices){
            res[i] = nums[i]
            res[i + len] = nums[len - 1 - i]
        }

        return res
    }
}
