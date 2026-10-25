class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        
        var left = 0
        var right = nums.size - 1

        while(left < right){

            if(nums[left] % 2 > nums[right] % 2){
                val temp = nums[left]
                nums[left] = nums[right]
                nums[right] = temp
            }

            if(nums[left] % 2 == 0){
                left++
            }
            if(nums[right] % 2 != 0){
                right--
            }
        }

        return nums
    }
}
