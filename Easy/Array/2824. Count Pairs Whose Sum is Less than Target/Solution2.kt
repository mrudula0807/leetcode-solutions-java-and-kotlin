class Solution {
    fun countPairs(nums: List<Int>, target: Int): Int {

        val sorted = nums.sorted()

        var left = 0
        var right = sorted.lastIndex
        var count = 0

        while(left < right){
            if(sorted[left] + sorted[right] < target) {
                count += right - left
                left++
            } else {
                right--
            }
        }

        return count
    }
}
