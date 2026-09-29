class Solution {
    fun maximumNumberOfStringPairs(words: Array<String>): Int {
        var count = 0

        for(i in words.indices){
            for(j in i + 1 until words.size){
                
                if(words[i][0] == words[j][1] &&
                    words[i][1] == words[j][0]){
                        count++
                    }
            }
        }

        return count
    }
}
