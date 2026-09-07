class Solution {
    fun minimumAverage(nums: IntArray): Double {
        
        nums.sort()

        var minAverage = Double.MAX_VALUE

        var start = 0
        var end = nums.size - 1

        while(start < end){
            val avg = (nums[start] + nums[end]) / 2.0
            minAverage = minOf(minAverage, avg)
            
            start++
            end--
        }

        return minAverage
    }
}
