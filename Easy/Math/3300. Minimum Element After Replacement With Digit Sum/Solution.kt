class Solution {
    fun minElement(nums: IntArray): Int {
        
        var res = Int.MAX_VALUE

        for(num in nums){

            var sum = 0
            var n = num

            while(n > 0){
               sum += n % 10
               n /= 10
            }

            res = min(res, sum)
        }

        return res
    }
}
