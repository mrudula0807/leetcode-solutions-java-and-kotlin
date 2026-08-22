class Solution {
    fun countPairs(nums: List<Int>, target: Int): Int {

        var count = 0
        val n = nums.size
        
        for(i in 0 until n){
            for(j in i + 1 until n){
                if(nums[i] + nums[j] < target) {
                    count++
                }
            }
        }
        return count
    }
}
