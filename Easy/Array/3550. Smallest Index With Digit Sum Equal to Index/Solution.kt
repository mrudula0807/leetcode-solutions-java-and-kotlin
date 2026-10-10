class Solution {
    fun smallestIndex(nums: IntArray): Int {
        
        for(i in 0 until nums.size) {
            
            var num = nums[i]
            var sum = 0
            while(num > 0){
                sum += num % 10
                num /= 10
            }

            if(sum == i){
                return i
            }
        }

        return -1
    }
}
