class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        
        for(i in nums.indices){
            
            val index = abs(nums[i]) - 1

            if(nums[index] > 0){
                nums[index] = -nums[index]
            }
        }

        val list = mutableListOf<Int>()

        for(i in nums.indices){
            if(nums[i] > 0){
                list.add(i + 1)
            }
        }

        return list
    }
}
