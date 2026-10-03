class Solution {
    fun kthDistinct(arr: Array<String>, k: Int): String {
        
        val counts = arr.groupingBy { it }.eachCount()

        var distinctCount = 0

        for(item in arr){
            if(counts[item] == 1){
                distinctCount++

                if(distinctCount == k)
                    return item
            }
        }

        return ""
    }
}
