class Solution {
    fun maxFrequencyElements(nums: IntArray): Int {
        
        val freq = IntArray(101)
        var max = 0

        for(num in nums){
            freq[num]++
            max = max(max, freq[num])
        }

        var sum = 0

        for(count in freq){
            if(count == max){
                sum += count
            }
        }

        return sum
    }
}
