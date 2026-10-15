class Solution {
    fun uniqueMorseRepresentations(words: Array<String>): Int {

        val code = arrayOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
                           ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
                           ".--","-..-","-.--","--..")

        val set = hashSetOf<String>()

        for(word in words){
            val sb = StringBuilder()

            for(c in word){
                sb.append(code[c - 'a'])
            }

            set.add(sb.toString())
        }

        return set.size
    }
}
