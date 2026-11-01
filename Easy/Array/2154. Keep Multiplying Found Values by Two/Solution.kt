class Solution {
    fun findFinalValue(nums: IntArray, original: Int): Int {
        
        val set = nums.toSet()
        var result = original

        while(result in set){
            result *= 2
        }

        return result
    }
}
