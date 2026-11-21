class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        
        var max = 0
        var ones = 0

        for(num in nums){                    
            if(num == 1){
                ones++
                max = maxOf(max, ones)
            } else {
                ones = 0
            }
        }

        return max
    }
}
