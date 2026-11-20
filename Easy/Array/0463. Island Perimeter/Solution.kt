class Solution {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        
        var perimeter = 0

        for(row in grid.indices){
            for(col in grid[row].indices){
                if(grid[row][col] == 0){
                    continue
                }

                var count = 4
                if(col > 0 && grid[row][col - 1] == 1){
                    count--
                }
                if(row > 0 && grid[row - 1][col] == 1){
                    count--
                }
                if(col < grid[row].size - 1 && grid[row][col + 1] == 1){
                    count--
                }
                if(row < grid.size - 1 && grid[row + 1][col] == 1){
                    count--
                }

                perimeter += count
            }
        }

        return perimeter
    }
}
