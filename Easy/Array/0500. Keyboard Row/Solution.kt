class Solution {
    fun findWords(words: Array<String>): Array<String> {
        
        val keys = listOf("qwertyuiop", "asdfghjkl", "zxcvbnm")

        val list = mutableListOf<String>()

        for(word in words){
            
            val w = word.lowercase()
            val key = keys.first { w[0] in it }

            if(w.all { it in key }){
                list.add(word)
            }
        }

        return list.toTypedArray()
    }
}
