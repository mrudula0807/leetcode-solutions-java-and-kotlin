class Solution {
    fun minimumOperations(nums: IntArray): Int {

        return nums.sumOf {
            val r = it % 3
            min(r, 3 - r)
        }
    }
}
