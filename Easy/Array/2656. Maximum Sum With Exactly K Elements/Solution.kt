class Solution {
    fun maximizeSum(nums: IntArray, k: Int): Int {
        
        var max = nums.max()

        var score = 0

        for(i in 1..k){
            score += max
            max++
        }

        return score
    }
}
