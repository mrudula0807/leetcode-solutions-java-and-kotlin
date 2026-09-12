class Solution {
    fun evenNumberBitwiseORs(nums: IntArray): Int {
        
        var res = 0

        for(num in nums){
            if(num % 2 == 0){
                res = res or num
            }
        }

        return res
    }
}
