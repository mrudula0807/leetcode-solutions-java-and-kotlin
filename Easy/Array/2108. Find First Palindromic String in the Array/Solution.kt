class Solution {
    fun firstPalindrome(words: Array<String>): String {
        
        for(word in words){
            if(isPalindrome(word)){
                return word
            }
        }

        return ""
    }

    private fun isPalindrome(s : String) : Boolean {
        var left = 0
        var right = s.length - 1

        while(left < right){
            if(s[left] != s[right]){
                return false
            }

            left++
            right--
        }
        
        return true
    }
}
