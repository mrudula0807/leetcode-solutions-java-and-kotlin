class Solution {
    fun sumOfSquares(nums: IntArray): Int {
        
        val n = nums.size
        var sum = 0
        
        for(i in 1..n){
            if(n % i == 0){
                val num = nums[i - 1]
                sum += (num * num)
            }  
        }

        return sum
    }
}
