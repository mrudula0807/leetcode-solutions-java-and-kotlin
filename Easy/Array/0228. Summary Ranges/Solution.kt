class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        
        val ranges = mutableListOf<String>()

        var i = 0
        while(i < nums.size){

            val start = nums[i]

            while(i + 1 < nums.size && nums[i + 1] == nums[i] + 1){
                i++
            }

            val end = nums[i]

            if(start == end){
                ranges.add(start.toString())
            } else {
                ranges.add("$start->$end")
            }

            i++
        }

        return ranges
    }
}
