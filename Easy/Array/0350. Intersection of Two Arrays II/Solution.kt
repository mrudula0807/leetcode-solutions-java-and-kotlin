class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        
        val map = HashMap<Int, Int>()

        for(num in nums1){
            map[num] = map.getOrDefault(num, 0) + 1
        }

        val list = mutableListOf<Int>()

        for(num in nums2){
            
            val count = map[num] ?: 0
            if(count > 0){
                list.add(num)
                map[num] = count - 1
            }
        }

        return list.toIntArray()
    }
}
