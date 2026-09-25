class Solution {
    fun findMissingElements(nums: IntArray): List<Int> {
        
        val min = nums.min()
        val max = nums.max()

        val set = nums.toSet()
        val list = mutableListOf<Int>()

        for(i in min..max){
            if(i !in set){
                list.add(i)
            }
        }

        return list
    }
}
