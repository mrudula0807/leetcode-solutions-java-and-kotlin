class Solution {
    public void moveZeroes(int[] nums) {

        int read = 0;
        int write = 0;

        while(read < nums.length){
            if(nums[read] != 0){
                if(read != write){
                    nums[write] = nums[read];
                    nums[read] = 0;
                }
                write++;
            }
            read++; 
        }        
    }
}
