class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        val map = mutableMapOf<Int, Int>()

        for(i in nums.indices){
            val diff = target - nums[i]

            if(diff in map){
                return intArrayOf(map.getValue(diff), i)
            }

            map.put(nums[i], i)
        }

        return intArrayOf()
    }
}
