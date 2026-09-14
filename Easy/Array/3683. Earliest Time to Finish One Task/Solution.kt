class Solution {
    fun earliestTime(tasks: Array<IntArray>): Int {

        var earliestTime = Int.MAX_VALUE

        for(task in tasks){
            earliestTime = minOf(earliestTime, task[0] + task[1])
        }

        return earliestTime
    }
}
