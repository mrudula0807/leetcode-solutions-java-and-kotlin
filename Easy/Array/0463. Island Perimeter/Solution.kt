class Solution {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        
        var perimeter = 0

        for(row in grid.indices){
            for(col in grid[row].indices){
                if(grid[row][col] == 0){
                    continue
                }

                perimeter += 4

                if(col > 0 && grid[row][col - 1] == 1){
                    perimeter -= 2
                }
                if(row > 0 && grid[row - 1][col] == 1){
                    perimeter -= 2
                }
            }
        }

        return perimeter
    }
}
