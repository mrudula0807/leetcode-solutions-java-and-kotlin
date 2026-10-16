class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        
        val m = grid.size
        val n = grid[0].size

        var row = m - 1
        var col = 0
        var count = 0

        while(row >= 0 && col < n){
            if(grid[row][col] < 0){
                count += n - col
                row--
            } else {
                col++
            }
        }

        return count
    }
}
