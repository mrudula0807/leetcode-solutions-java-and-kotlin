class Solution {
    fun getSneakyNumbers(nums: IntArray): IntArray {
        
        val set = mutableSetOf<Int>()
        val result = IntArray(2)

        var i = 0

        for(num in nums) {
            if(!set.add(num)){
                result[i++] = num
            }
        }

        return result
    }
}
