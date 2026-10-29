class Solution {
    public int maxAdjacentDistance(int[] nums) {
        
        int max = 0;
        int n = nums.length;

        for(int i = 1; i < n; i++){
            int diff = Math.abs(nums[i] - nums[i - 1]);
            max = Math.max(max, diff);
        }

        int circleDiff = Math.abs(nums[0] - nums[n - 1]);
        max = Math.max(max, circleDiff);

        return max;
    }
}
