class Solution {
    fun separateDigits(nums: IntArray): IntArray {
        
        return nums.flatMap {
            it.toString().map { ch ->
                ch.digitToInt()
            }
        }.toIntArray()
    }
}
