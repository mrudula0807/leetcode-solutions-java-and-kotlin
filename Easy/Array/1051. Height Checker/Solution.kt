class Solution {
    fun heightChecker(heights: IntArray): Int {
        
        val count = IntArray(101)

        for (height in heights) {
            count[height]++
        }

        var expectedIndex = 0
        var mismatches = 0

        for (height in 1..100) {
            repeat(count[height]) {
                if (heights[expectedIndex] != height) {
                    mismatches++
                }

                expectedIndex++
            }
        }

        return mismatches
    }
}
