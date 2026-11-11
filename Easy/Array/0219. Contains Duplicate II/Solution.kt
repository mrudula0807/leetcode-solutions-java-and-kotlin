class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        
        val map = HashMap<Int, Int>()

        for(i in nums.indices){
            val prevIndex = map[nums[i]]

            if(prevIndex != null && i - prevIndex <= k){
                return true
            }

            map[nums[i]] = i
        }

        return false
    }
}
