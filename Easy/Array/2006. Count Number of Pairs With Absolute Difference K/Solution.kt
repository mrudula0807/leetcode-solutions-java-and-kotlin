class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
        
        val freq = HashMap<Int, Int>()
        var count = 0

        for(num in nums){
            count += freq.getOrDefault(num - k, 0)
            count += freq.getOrDefault(num + k, 0)

            freq[num] = freq.getOrDefault(num, 0) + 1
        }
        
        return count
    }
}
