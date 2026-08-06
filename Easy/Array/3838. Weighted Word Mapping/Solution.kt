class Solution {
    fun mapWordWeights(words: Array<String>, weights: IntArray): String {
        
        val result = StringBuilder()

        for(word in words){

            var sum = 0

            for(ch in word){
                sum += weights[ch - 'a']
            }

            val rem = sum % 26
            result.append('z' - rem)
        }

        return result.toString()
    }
}
