class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        
        val map = HashMap<Int, Int>()
        var count = 0

        for(num in nums){
            val fq = map.getOrDefault(num, 0)

            count += fq
            map[num] = fq + 1
        }

        return count
    }
}
