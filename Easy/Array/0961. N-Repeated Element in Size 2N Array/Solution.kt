class Solution {
    fun repeatedNTimes(nums: IntArray): Int {
        
        val set = mutableSetOf<Int>()

        for(num in nums){
            if(num in set){
                return num
            } else {
                set.add(num)
            }
        }

        return -1
    }
}
