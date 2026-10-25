class Solution {
    fun findNonMinOrMax(nums: IntArray): Int {
        
        if(nums.size <= 2)
            return -1

        val min = nums.min()
        val max = nums.max()

        for(num in nums){
            if(num != min && num != max){
                return num
            }
        }

        return -1
    }
}
