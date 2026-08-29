class Solution {
    fun mostWordsFound(sentences: Array<String>): Int {
        
        var maxCount = 0

        for(sentence in sentences) {

            var count = 1
            
            for(ch in sentence) {
                if(ch == ' ')
                    count++
            }

            maxCount = max(maxCount, count)
        }

        return maxCount
    }
}
