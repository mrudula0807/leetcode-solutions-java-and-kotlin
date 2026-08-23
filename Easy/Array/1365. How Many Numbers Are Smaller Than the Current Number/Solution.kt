class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        
        val freq = IntArray(101)

        //count occurences
        for(num in nums) {
            freq[num]++
        }

        // convert freq into how many values are smaller
        for(i in 1..100) {
            freq[i] += freq[i - 1]
        }

        val result = IntArray(nums.size)

        for(i in nums.indices){
            result[i] = if(nums[i] == 0) {
                0
            } else {
                freq[nums[i] - 1]
            }
        }

        return result
    }
}
