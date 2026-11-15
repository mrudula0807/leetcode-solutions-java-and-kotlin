class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        
        var read = 0
        var write = 0

        while(read < nums.size){
            if(nums[read] != 0){
                if(read != write){
                    nums[write] = nums[read]
                    nums[read] = 0
                }
                write++
            }
            read++
        }
    }
}
