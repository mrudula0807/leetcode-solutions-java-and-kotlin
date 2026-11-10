class Solution {
    fun majorityElement(nums: IntArray): Int {
        
        var current = 0
        var count = 0

        for(num in nums){

            if(count == 0){
                current = num
            }

            if(current == num){
                count++
            } else {
                count--
            }
        }

        return current
    }
}
