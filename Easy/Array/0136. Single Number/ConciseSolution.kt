class Solution {
    fun singleNumber(nums: IntArray): Int {
        return nums.fold(0) { a, b -> 
            a xor b
        }
    }
}
