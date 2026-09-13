class Solution {
    fun maxProduct(nums: IntArray): Int {

        var first = 0
        var second = 0

        for(num in nums) {
            if(num > first){
                second = first
                first = num
            } else if(num > second) {
                second = num
            }
        }
        
        return (first - 1) * (second - 1)
    }
}
