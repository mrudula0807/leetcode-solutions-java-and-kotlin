class Solution {
    public int maximizeSum(int[] nums, int k) {
        
        int max = 0;

        for(int num : nums){
            max = Math.max(max, num);
        }

        int score = 0;

        for(int i = 0; i < k; i++){
            score += max;
            max++;
        }

        return score;
    }
}
