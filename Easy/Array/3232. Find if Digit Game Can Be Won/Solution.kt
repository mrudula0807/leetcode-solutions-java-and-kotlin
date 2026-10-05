class Solution {
    fun canAliceWin(nums: IntArray): Boolean {
        
        var singleSum = 0
        var doubleSum = 0

        for(num in nums){
            if(num < 10){
                singleSum += num
            } else {
                doubleSum += num
            }
        }

        return singleSum != doubleSum
    }
}
