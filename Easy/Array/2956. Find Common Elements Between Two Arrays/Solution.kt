class Solution {
    fun findIntersectionValues(nums1: IntArray, nums2: IntArray): IntArray {
        
        val count1 = nums1.count { it in nums2 }
        val count2 = nums2.count { it in nums1 }

        return intArrayOf(count1, count2)
    }
}
