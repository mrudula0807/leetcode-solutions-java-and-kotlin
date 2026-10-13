class Solution {
    fun diStringMatch(s: String): IntArray {
        
        val n = s.length
        val res = IntArray(n + 1)

        var low = 0
        var high = n

        for(i in 0 until n){
            if(s[i] == 'I'){
                res[i] = low++
            } else {
                res[i] = high--
            }
        }

        res[n] = low

        return res
    }
}
