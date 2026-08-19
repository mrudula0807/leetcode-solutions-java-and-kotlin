class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {

        val allowedChars = BooleanArray(26)

        for(ch in allowed) {
            allowedChars[ch - 'a'] = true
        }

        var count = 0

        for(word in words){

            var isConsistent = true

            for(ch in word){
                if(!allowedChars[ch - 'a']){
                    isConsistent = false
                    break
                }
            }

            if(isConsistent)
                count++

        }

        return count
    }
}
