class Solution {
    fun findGCD(nums: IntArray): Int {
        
        var min = nums.min()
        var max = nums.max()

        while(min != 0){
            val rem = max % min
            max = min
            min = rem
        }

        return max
    }
}
