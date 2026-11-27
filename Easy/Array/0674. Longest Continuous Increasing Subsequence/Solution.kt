class Solution {
    fun findLengthOfLCIS(nums: IntArray): Int {
        
        var currentLength = 1
        var maxLength = 1

        for(i in 1 until nums.size){

            if(nums[i] > nums[i - 1]){
                currentLength++
            } else {
                currentLength = 1
            }

            maxLength = maxOf(maxLength, currentLength)
        }

        return maxLength
    }
}
