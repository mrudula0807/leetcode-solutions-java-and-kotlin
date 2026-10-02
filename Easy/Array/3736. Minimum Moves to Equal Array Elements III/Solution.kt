class Solution {
    fun minMoves(nums: IntArray): Int {
        return nums.size * nums.max() - nums.sum()
    }
}
