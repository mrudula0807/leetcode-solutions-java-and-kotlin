class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        
        var start = 0
        var end = nums.size

        while(start < end){
            if(nums[start] == `val`){
                nums[start] = nums[end - 1]
                end--
            } else {
                start++
            }
        }

        return end
    }
}
