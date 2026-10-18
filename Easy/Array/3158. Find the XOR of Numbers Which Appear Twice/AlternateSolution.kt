class Solution {
    fun duplicateNumbersXOR(nums: IntArray): Int {
        
        var res = 0
        val set = mutableSetOf<Int>()

        for(num in nums){
            if(!set.add(num)){
                res = res xor num
            }
        }

        return res
    }
}
