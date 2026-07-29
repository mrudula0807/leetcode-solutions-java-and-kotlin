class Solution {
    public int minimumOperations(int[] nums) {
        
        int count = 0;

        for(int n: nums){
            int r = n % 3;
            count += Math.min(r, 3 - r);
        }
        
        return count;
    }
}
