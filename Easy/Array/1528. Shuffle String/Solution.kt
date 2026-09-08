class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        
        val shuffled = CharArray(indices.size)

        for(i in indices.indices){
            shuffled[indices[i]] = s[i]
        }

        return shuffled.concatToString()
    }
}
