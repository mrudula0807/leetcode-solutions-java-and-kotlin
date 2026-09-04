class Solution {
    fun separateDigits(nums: IntArray): IntArray {
        
        val list = mutableListOf<Int>()

        for(num in nums){

            val digits = num.toString().map {
                it.digitToInt()
            }

            list.addAll(digits)
        }

        return list.toIntArray()
    }
}
