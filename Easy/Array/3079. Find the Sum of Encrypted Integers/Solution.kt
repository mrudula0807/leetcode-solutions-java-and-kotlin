class Solution {
    fun sumOfEncryptedInt(nums: IntArray): Int {
        
        var sum = 0

        for(num in nums){
            
            var temp = num
            var maxDigit = 0
            var len = 0

            while(temp > 0){
                val digit = temp % 10
                maxDigit = maxOf(maxDigit, digit)
                len++
                temp /= 10
            }

            var ones = 0
            for(i in 0 until len){
                ones = ones * 10 + 1
            }

            sum += maxDigit * ones
        }

        return sum
    }
}
