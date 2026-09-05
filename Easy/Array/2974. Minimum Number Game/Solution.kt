class Solution {
    fun numberGame(nums: IntArray): IntArray {
        
        nums.sort()

        val arr = IntArray(nums.size)

        for(i in 0 until nums.size step 2) {
            arr[i] = nums[i + 1]
            arr[i + 1] = nums[i]
        }

        return arr
    }
}
