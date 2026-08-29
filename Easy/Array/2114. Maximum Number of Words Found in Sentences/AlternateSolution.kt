class Solution {
    fun mostWordsFound(sentences: Array<String>): Int {
        return sentences.maxOf {
            it.split(" ").size
        }
    }
}
