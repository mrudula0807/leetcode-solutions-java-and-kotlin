class Solution {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        
        val target = mutableListOf<Int>()

        for(i in 0 until nums.size) {
            target.add(index[i], nums[i])
        }

        return target.toIntArray()
    }
}
