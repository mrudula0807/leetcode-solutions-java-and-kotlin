class Solution {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        
        var word1Index = 0
        var char1Index = 0
        
        var word2Index = 0
        var char2Index = 0

        while(word1Index < word1.size && word2Index < word2.size) {
            
            val char1 = word1[word1Index][char1Index]
            val char2 = word2[word2Index][char2Index]

            if(char1 != char2){
                return false
            }

            char1Index++
            char2Index++

            if(char1Index == word1[word1Index].length){
                word1Index++
                char1Index = 0
            }

            if(char2Index == word2[word2Index].length){
                word2Index++
                char2Index = 0
            }
        }

        return word1Index == word1.size && word2Index == word2.size
    }
}
