class Solution {
    fun sumOfUnique(nums: IntArray): Int {
        
        val freq = IntArray(101);

        for(num in nums){
            freq[num]++
        }

        var sum = 0

        for(num in nums){
            if(freq[num] == 1){
                sum += num
            }
        }

        return sum
    }
}
