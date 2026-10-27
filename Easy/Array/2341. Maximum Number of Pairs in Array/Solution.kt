class Solution {
    fun numberOfPairs(nums: IntArray): IntArray {
        
        var pair = 0
        var leftover = 0

        val count = IntArray(101)

        for(num in nums){
            count[num]++
        }

        for(i in 0..100){
            pair += count[i] / 2
            leftover += count[i] % 2
        }

        return intArrayOf(pair, leftover)
    }
}
