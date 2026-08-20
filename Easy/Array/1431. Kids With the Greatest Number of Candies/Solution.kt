class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        
        val max = candies.maxOrNull()!!

        return candies.map {
            it + extraCandies >= max
        }
    }
}
