class Solution {
    fun sumDivisibleByK(nums: IntArray, k: Int): Int {
        
        var sum = 0
        val freq = IntArray(101)

        for(num in nums){
            freq[num]++
        }

        for(i in 1..100){
            val n = freq[i]

            if(n % k == 0){
                sum += (i * n)
            }
        }

        return sum
    }
}
