class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        
        var count = 0

        for(row in grid){
            count += row.count { it < 0 }
        }

        return count
    }
}
