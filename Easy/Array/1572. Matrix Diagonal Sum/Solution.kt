class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        
        var sum = 0
        val n = mat.size

        for(i in 0 until n){
            sum += mat[i][i]

            val j = n - i - 1
            if(i != j)
                sum += mat[i][j]
        }

        return sum
    }
}
