class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        
        val rows = matrix.size
        val cols = matrix[0].size

        val res = Array(cols){ IntArray(rows) }

        for(i in 0 until rows){
            for(j in 0 until cols){
                res[j][i] = matrix[i][j]
            }
        }

        return res
    }
}
