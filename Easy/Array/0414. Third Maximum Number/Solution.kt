class Solution {
    fun thirdMax(nums: IntArray): Int {

        var first = Long.MIN_VALUE
        var second = Long.MIN_VALUE
        var third = Long.MIN_VALUE

        for(num in nums){

            val n = num.toLong()

            if((first == n) or (second == n) or (third == n)){
                continue
            }

            if(n > first){
                third = second
                second = first
                first = n
            } else if(n > second){
                third = second
                second = n
            } else if(n > third){
                third = n
            }
        }

        return if(third == Long.MIN_VALUE) first.toInt() else third.toInt()
    }
}
