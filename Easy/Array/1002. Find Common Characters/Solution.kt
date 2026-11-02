class Solution {
    fun commonChars(words: Array<String>): List<String> {
        
        val minFreq = IntArray(26)

        for(ch in words[0]){
            minFreq[ch - 'a']++
        }

        for(word in words.drop(1)){
            val currentFreq = IntArray(26)

            for(ch in word){
                currentFreq[ch - 'a']++
            }

            for(i in 0 until 26){
                minFreq[i] = minOf(minFreq[i], currentFreq[i])
            }
        }

        val result = mutableListOf<String>()

        for(i in 0 until 26){
            repeat(minFreq[i]){
                result.add(('a' + i).toString())
            }
        }

        return result
    }
}
