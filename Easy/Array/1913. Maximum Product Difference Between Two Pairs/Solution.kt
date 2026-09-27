class Solution {
    fun maxProductDifference(nums: IntArray): Int {

        var smallest = Int.MAX_VALUE
        var secondSmallest = Int.MAX_VALUE

        var largest = Int.MIN_VALUE
        var secondLargest = Int.MIN_VALUE

        for(num in nums){
            if(num < smallest){
                secondSmallest = smallest
                smallest = num
            } else if(num < secondSmallest){
                secondSmallest = num
            }

            if(num > largest){
                secondLargest = largest
                largest = num
            } else if(num > secondLargest){
                secondLargest = num
            }
        }

        return ((largest * secondLargest) - (smallest * secondSmallest))
    }
}
