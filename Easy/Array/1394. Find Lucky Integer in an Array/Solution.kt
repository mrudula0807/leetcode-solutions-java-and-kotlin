class Solution {
    fun findLucky(arr: IntArray): Int {
        
        val freq = IntArray(501)

        for(num in arr){
            freq[num]++
        }

        for(i in 500 downTo 1){
            if(i == freq[i]){
                return i
            }
        }

        return -1
    }
}
