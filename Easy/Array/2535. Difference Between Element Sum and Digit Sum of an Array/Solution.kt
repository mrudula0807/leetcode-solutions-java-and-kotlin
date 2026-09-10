class Solution {
    fun differenceOfSum(nums: IntArray): Int {
        
        val elementSum = nums.sum()

        var digitSum = 0

        for(num in nums) {
            var n = num

            while(n > 0){
                digitSum += n % 10
                n /= 10
            }
        }

        return abs(elementSum - digitSum)
    }
}
