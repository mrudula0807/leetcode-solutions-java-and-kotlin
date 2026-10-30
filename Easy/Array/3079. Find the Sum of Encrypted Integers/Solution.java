class Solution {
    public int sumOfEncryptedInt(int[] nums) {

        int sum = 0;

        for(int num : nums){

            int temp = num;
            int len = 0;
            int max = Integer.MIN_VALUE;

            while(temp > 0){
                int digit = temp % 10;
                max = Integer.max(max, digit);
                len++;
                temp /= 10;
            }

            int ones = 0;
            for(int i = 0; i < len; i++){
                ones = ones * 10 + 1;
            }
            
            sum += max * ones;
        }

        return sum;
    }
}
