class Solution {
    public int[] findErrorNums(int[] nums) {
        
        Set<Integer> set = new HashSet<>();

        int duplicate = 0;

        int sum = 0;

        for(int num : nums){
            if(!set.add(num)){
                duplicate = num;
            } else { 
                sum += num;
            }
        }

        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;

        return new int[] { duplicate, expectedSum - sum };

    }
}
