class Solution {
    fun subarraySum(nums: IntArray): Int {
        val n = nums.size
        val prefix = IntArray(n)

        prefix[0] = nums[0]

        for(i in 1 until n){
            prefix[i] = prefix[i - 1] + nums[i]
        }

        var totalSum = 0

        for(i in 0 until n){
            val start = maxOf(0, i - nums[i])

            var sum = prefix[i]
            
            if(start > 0){
                sum -= prefix[start - 1]
            }

            totalSum += sum
        }

        return totalSum
    }
}
