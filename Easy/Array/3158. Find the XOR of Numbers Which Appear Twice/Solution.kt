class Solution {
    fun duplicateNumbersXOR(nums: IntArray): Int {
        
        var res = 0
        val freq = IntArray(51)

        for(num in nums){
            freq[num]++
            if(freq[num] == 2){
                res = res xor num
            }
        }

        return res
    }
}
