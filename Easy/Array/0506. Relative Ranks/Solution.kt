class Solution {
    fun findRelativeRanks(score: IntArray): Array<String> {
        
        val sorted = score.indices.sortedByDescending { score[it] }
        val answer = Array(score.size) { "" }

        for(i in sorted.indices){
            val index = sorted[i]

            answer[index] = when(i) {
                0 -> "Gold Medal"
                1 -> "Silver Medal"
                2 -> "Bronze Medal"
                else -> (i + 1).toString()
            }
        }

        return answer
    }
}
