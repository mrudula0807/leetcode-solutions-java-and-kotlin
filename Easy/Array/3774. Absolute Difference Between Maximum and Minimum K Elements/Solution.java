class Solution {
    public int absDifference(int[] nums, int k) {
        
        Arrays.sort(nums);

        int sumLargest = 0;

        for(int i = nums.length - 1; i >= nums.length - k; i--){
            sumLargest += nums[i];
        }

        int sumSmallest = 0;

        for(int i = 0; i < k; i++){
            sumSmallest += nums[i];
        }

        return Math.abs(sumLargest - sumSmallest);
    }
}
