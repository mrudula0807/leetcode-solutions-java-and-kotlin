class Solution {
    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {

        val ans = IntArray(2)
        val n = grid.size
        val freq = IntArray(n * n + 1)

        for(row in grid){
            for(num in row){
                if(freq[num] > 0){
                    ans[0] = num
                } else {
                    freq[num]++
                }
            }
        }

        for(i in 1..(n * n)){
            if(freq[i] == 0){
                ans[1] = i
                break
            }
        }

        return ans
    }
}
