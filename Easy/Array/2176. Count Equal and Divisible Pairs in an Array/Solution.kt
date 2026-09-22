class Solution {
    fun countPairs(nums: IntArray, k: Int): Int {
        
        var count = 0

        for(i in 0 until nums.size){
            for(j in i + 1 until nums.size){
                if(nums[i] == nums[j] && (i * j) % k == 0){
                    count++
                }
            }
        }

        return count
    }
}
